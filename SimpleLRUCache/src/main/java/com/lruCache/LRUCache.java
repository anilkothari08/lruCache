package com.lruCache;

public interface LRUCache {
	
	Object get(String key);
	
	boolean put(String key, Object object);

}
