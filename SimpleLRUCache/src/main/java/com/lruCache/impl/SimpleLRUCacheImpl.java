package com.lruCache.impl;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import com.lruCache.LRUCache;
import com.lruCache.element.Cacheble;

public class SimpleLRUCacheImpl<E extends Cacheble> implements LRUCache<E>{

	private int capacity;
	
	private int size;

	public SimpleLRUCacheImpl(int capacity) {
		this.capacity = capacity;
		map = new HashMap<String, Cacheble>(capacity);
		queue = new LinkedList<Cacheble>();
	}

	private Map<String, Cacheble> map;
	private Deque<Cacheble> queue;

	@Override
	public Cacheble get(String key) {
		return map.get(key);
	}

	@Override
	public void put(Cacheble ele) {
		String key = ele.getKey();
		if (map.containsKey(key)) {
			queue.remove(ele);
			queue.addFirst(ele);
			map.replace(key, ele);
		} else if (queue.size() == capacity) {
			removeLastElement();
			putNewObject(key, ele);
		} else {
			putNewObject(key, ele);
		}
	}
	
	public int size() {
		return size;
	}

	private void putNewObject(String key, Cacheble ele) {
		queue.addFirst(ele);
		map.put(key, ele);
		++size;
	}

	private void removeLastElement() {
		if (queue.isEmpty()) {
			return;
		}
		Cacheble ele = queue.removeLast();
		--size;
		map.remove(ele.getKey());
	}

	@Override
	public String toString() {
		return "SimpleLRUCacheImpl [{queue=" + queue + "}]";
	}


}
