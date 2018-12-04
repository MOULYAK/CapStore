package com.capstore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Merchant {
	
	@Id
	@GeneratedValue
	private int merchantId;
	private String merchantName;
	
	@Column(unique=true)
	private String emailId;
	private String merchantContact;
	private Address merchantAddress;
	private double rating;
	
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public String getMerchantName() {
		return merchantName;
	}
	public void setMerchantName(String merchantName) {
		this.merchantName = merchantName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getMerchantContact() {
		return merchantContact;
	}
	public void setMerchantContact(String merchantContact) {
		this.merchantContact = merchantContact;
	}
	public Address getMerchantAddress() {
		return merchantAddress;
	}
	public void setMerchantAddress(Address merchantAddress) {
		this.merchantAddress = merchantAddress;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "Merchant [merchantId=" + merchantId + ", merchantName=" + merchantName + ", emailId=" + emailId
				+ ", merchantContact=" + merchantContact + ", merchantAddress=" + merchantAddress + ", rating=" + rating
				+ "]";
	}
	
	public Merchant(int merchantId, String merchantName, String emailId, String merchantContact,
			Address merchantAddress, double rating) {
		super();
		this.merchantId = merchantId;
		this.merchantName = merchantName;
		this.emailId = emailId;
		this.merchantContact = merchantContact;
		this.merchantAddress = merchantAddress;
		this.rating = rating;
	}
	public Merchant() {
		super();
	}
}