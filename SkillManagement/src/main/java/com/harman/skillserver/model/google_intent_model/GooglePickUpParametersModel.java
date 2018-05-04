package com.harman.skillserver.model.google_intent_model;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;

public class GooglePickUpParametersModel {
	@SerializedName("ShoppingList")
	List <String> shoppingList = new ArrayList();
	@SerializedName("given_name")
	String given_name ;
	@SerializedName("address")
	String address;
	@SerializedName("action_type")
	String action_type;
	
	public List<String> getShoppingList() {
		return shoppingList;
	}
	public void setShoppingList(List<String> shoppingList) {
		this.shoppingList = shoppingList;
	}
	public String getGiven_name() {
		return given_name;
	}
	public void setGiven_name(String given_name) {
		this.given_name = given_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAction_type() {
		return action_type;
	}
	public void setAction_type(String action_type) {
		this.action_type = action_type;
	}
	@Override
	public String toString() {
		return "GooglePickUpParametersModel [shoppingList=" + shoppingList + ", given_name=" + given_name + ", address="
				+ address + ", action_type=" + action_type + "]";
	}
	

	
}
