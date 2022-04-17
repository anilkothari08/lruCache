package com.main;

import com.lruCache.element.Cacheble;

public class Employee implements Cacheble{
	private String name;
	private int id;
	
	public Employee(int id, String name) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	@Override
	public String getKey() {
		return name;
	}
}
