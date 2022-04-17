package com.lruCache;

import com.lruCache.element.Cacheble;

public interface LRUCache<E extends Cacheble> {

	Cacheble get(String key);

	void put(Cacheble ele);

}