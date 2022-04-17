package com.main;

import com.lruCache.LRUCache;
import com.lruCache.impl.SimpleLRUCacheImpl;

public class Main {

public static void main(String[] args) {
		
		Employee e1 = new Employee(1,"ABC");
		Employee e2 = new Employee(2,"DEF");
		Employee e3 = new Employee(3,"GHI");
		Employee e4 = new Employee(4,"JKL");
		
		LRUCache<Employee> cache = new SimpleLRUCacheImpl<Employee>(2);
		cache.put(e1);
		cache.put(e2);
		System.out.println(cache);
		cache.put(e3);
		System.out.println(cache);
		cache.put(e4);
		System.out.println(cache);

	}

}
