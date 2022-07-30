package com.koreait.jpaitem.embed;

import java.time.LocalDateTime;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Member {

	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "name", nullable = false)
	private String username;

	// 기간
	// @Embedded과 @Embeddable 둘중에 하나만 넣어도 되지만,
	// 헷갈릴 수 있기 때문에 둘 다 넣는것을 권장한다.
	@Embedded
	private Peroid period;
//	private LocalDateTime startDate;
//	private LocalDateTime endDate;

	// 주소
	@Embedded
	private Address address;
//	private String city;
//	private String street;
//	private String zipcode;

	// 회사주소
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(column = @Column(name = "WORK_CITY"), name = "city"),
		@AttributeOverride(column = @Column(name = "WORK_STREET"), name = "street"),
		@AttributeOverride(column = @Column(name = "WORK_ZIPCODE"), name = "zipcode")
	})
	private Address workAddress;
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
//	public LocalDateTime getStartDate() {
//		return startDate;
//	}
//	public void setStartDate(LocalDateTime startDate) {
//		this.startDate = startDate;
//	}
//	public LocalDateTime getEndDate() {
//		return endDate;
//	}
//	public void setEndDate(LocalDateTime endDate) {
//		this.endDate = endDate;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getStreet() {
//		return street;
//	}
//	public void setStreet(String street) {
//		this.street = street;
//	}
//	public String getZipcode() {
//		return zipcode;
//	}
//	public void setZipcode(String zipcode) {
//		this.zipcode = zipcode;
//	}

	public Peroid getPeriod() {
		return period;
	}

	public void setPeriod(Peroid period) {
		this.period = period;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
}
