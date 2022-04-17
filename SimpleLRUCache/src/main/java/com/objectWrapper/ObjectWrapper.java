package com.objectWrapper;

public class ObjectWrapper<T> {
	T t ;
	
	ObjectWrapper(T t){
		this.t = t;
	}
	T get() {
		return t;
	};

}
