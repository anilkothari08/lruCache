package com.lruCache.impl;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.lruCache.LRUCache;
import com.main.Employee;

public class SimpleLRUCacheImplTest{
	
	@Test
	void testPutAndGet(){
		Employee e1 = new Employee(1,"ABC");
		Employee e2 = new Employee(2,"DEF");
		Employee e3 = new Employee(3,"GHI");
		Employee e4 = new Employee(4,"JKL");
		
		int size = 3;
		LRUCache<Employee> cache = new SimpleLRUCacheImpl<Employee>(size);
		cache.put(e1);
		cache.put(e2);
		cache.put(e3);
		cache.put(e4);
		assertEquals(cache.size(), size);
		cache.put(e3);
		cache.put(e2);
		cache.put(e1);
		assertEquals(cache.size(), size);
		assertEquals(cache.get(e4.getKey()),null);
		cache.put(e1);
		cache.put(e1);
		cache.put(e2);
		cache.put(e2);
		cache.put(e3);
		cache.put(e3);
		cache.put(e4);
		cache.put(e4);
		assertEquals(cache.get(e1.getKey()),null);
		assertNotEquals(cache.get(e2.getKey()),null);
		assertNotEquals(cache.get(e3.getKey()),null);
		assertNotEquals(cache.get(e4.getKey()),null);
		
	}
	
}
