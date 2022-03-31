package com.ust1.spring.springcoreadvanced.autowiring.byname;

public class Address {

	private Address address;

	private int hno;
	private String street;
	private String city;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [address=" + address + ", hno=" + hno + ", street=" + street + ", city=" + city + "]";
	}


}
