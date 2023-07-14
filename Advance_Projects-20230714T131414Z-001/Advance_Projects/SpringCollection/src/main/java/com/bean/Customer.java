package com.bean;

import java.util.List;

public class Customer {
	
	private List<Object> lists;

	public List<Object> getLists() {
		return lists;
	}

	public void setLists(List<Object> lists) {
		this.lists = lists;
	}

	@Override
	public String toString() {
		return "Customer [lists=" + lists + "]";
	}
	

}
