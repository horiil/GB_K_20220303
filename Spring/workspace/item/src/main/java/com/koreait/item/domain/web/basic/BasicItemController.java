package com.koreait.item.domain.web.basic;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.koreait.item.domain.item.Item;
import com.koreait.item.domain.item.ItemRepository;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/basic/items")
//@RequiredArgsConstructor	//lombok 미사용시 주석
/*
 * @RequiredArgsConstructor : 
 * final이 붙은 멤버변수만 사용해서 생성자를 자동으로 만들어준다.
 */
public class BasicItemController {
	
	private final ItemRepository itemRepository;
	
	//@Autowired
	/*
	 * 생성자가 딱 1개만 있으면 스프링이 
	 * 해당 생성자에게 @Autowired로 의존관계를 주입해준다.
	 */
	public BasicItemController(ItemRepository itemRepository) {
		this.itemRepository = itemRepository;
	}	//lombok 사용시 주석

	
	
	@GetMapping
	public String items(Model model) {
		List<Item> items = itemRepository.findAll();
		model.addAttribute("items", items);
		return "basic/items";
	}
	
	
	@GetMapping("/add")
	public String addForm(Model model) {
		return "basic/addForm";
	}
	
	//@PostMapping("/add")
	// 상품 등록에서 입력한 값을 파라미터 값으로 받아옴
	public String saveV1( @RequestParam String itemName, @RequestParam int price, @RequestParam Integer quantity, Model model) {
		
		Item item = new Item();
		item.setItemName(itemName);
		item.setPrice(price);
		item.setQuantity(quantity);
		
		itemRepository.save(item);
		
		model.addAttribute("item", item);
		
		// 상세 페이지로 이동
		return "basic/item";
	}
	
	//@PostMapping("/add")
	// 상품 등록에서 입력한 값을 파라미터 값으로 받아옴
	// () 안의 item은 객체 선언이다 . (생략가능)
	public String saveV2(@ModelAttribute("item")Item item, Model model ) {
		
//		@ModelAttribute 가 해준다.
//		Item item = new Item();
//		item.setItemName(itemName);
//		item.setPrice(price);
//		item.setQuantity(quantity);
		
		itemRepository.save(item);
		
		// model.addAttribute("item", item);		// 이것마저도 @ModelAttribute가 해주기 떄문에 생략이 가능하다
		
		// 상세 페이지로 이동
		return "basic/item";
	}
	
	//redirect 방식으로 상품 상세로 가도록 return
	//@PostMapping("/add")
	public String saveV3(@ModelAttribute("item")Item item) {
		itemRepository.save(item);
		return "redirect:/basic/items/" + item.getId();
	}
	
	
	// 기존 url정보 : http://localhost:9090/basic/items/4
	// 원하는 url정보 : http://localhost:9090/basic/items/4?status=true
	@PostMapping("/add")
	public String saveV4(@ModelAttribute("item")Item item, RedirectAttributes redirectAttributes) {
		Item savedItem = itemRepository.save(item);
		
		redirectAttributes.addAttribute("itemId", savedItem.getId());		//"itemId는 path에 담겨짐,  savedItem으
		redirectAttributes.addAttribute("status", true);
		
		return "redirect:/basic/items/{itemId}";
	}
	
	

	
	@GetMapping("/{itemId}")
	public String item(@PathVariable long itemId  ,Model model) {
		Item item = itemRepository.findById(itemId);
		model.addAttribute("item",item);
		return "basic/item";
	}
	
	// editForm() 매개변수값 받아와서
	// item 정보를 찾아서 
	// model.add
	@GetMapping("/{itemId}/edit")
	public String editForm(@PathVariable Long itemId, Model model) {
		Item item = itemRepository.findById(itemId);
		model.addAttribute("item", item);
		return "basic/editForm";
	}
	
	@PostMapping("/{itemId}/edit")
	// @ModelAttribute 통째로 값을 받아옴
	public String edit(@PathVariable Long itemId, @ModelAttribute Item item) {
		itemRepository.update(itemId, item);
		
		return "redirect:/basic/items/{itemId}";
	}
	
	/*
	 * 테스트용 데이터 추가
	 */
	@PostConstruct
	public void init() {
//		System.out.println("초기화 메서드");
		itemRepository.save(new Item("testA", 1000, 10));
		itemRepository.save(new Item("testB", 2000, 20));
		itemRepository.save(new Item("testC", 3000, 30));
	}
	
	/*
	 * 종료 메서드
	 */
//	@PreDestroy
//	public void destroy() {
//		System.out.println("종료 메서드 호출");
//	}
	
	
	
	
}
















