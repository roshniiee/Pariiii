package com.entity;

import java.util.Random;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Bank")
public class Customer {
	Random random=new Random();

	public String Name;

	public long PhoneNumber;
	@Id
	public long AccountNumber;

	public float Balance;
	
	public int Pin;

	public long AadharNumber;
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public long getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber() {
		AccountNumber =random.nextInt(1000000000);
	}
	public float getBalance() {
		return Balance;
	}
	public void setBalance(float balance) {
		Balance = balance;
	}
	public int getPin() {
		return Pin;
	}
	public void setPin(int pin) {
		Pin = pin;
	}
	public long getAadharNumber() {
		return AadharNumber;
	}
	public void setAadharNumber(long aadharNumber) {
		AadharNumber = aadharNumber;
	}
	

}
