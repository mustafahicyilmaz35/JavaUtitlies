package com.hicyilmaz.mustafa;

import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		
		System.out.println("Merhaba");
		
		String[] names = {"Mustafa","Ahmet","Ali","ayþe","Mustafa","Ahmet","Ali","ayþe","Mustafa","Ahmet","Ali","ayþe","Mustafa","Ahmet","Ali","ayþe","Mustafa","Ahmet","Ali","ayþe","Mustafa","Ahmet","Ali","ayþe","Mustafa","Ahmet","Ali","ayþe"};
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		
		myArrayList.add(names);
		for(int i = 0; i < names.length; i++) {
			
			System.out.println(myArrayList.get(i));
		}

	}
	
	
}


class ArrayList<T>{
	
	
	private Object[] arr;
	private int length = 14;
	
	
	ArrayList(){
		
		this.arr = new Object[length];
	}
	
	T get(int i) {
		@SuppressWarnings("unchecked")
		T t2 = (T)arr[i];
		T t = t2;
		return t;
		
	}
	
	void set(T[] t, int i) {
		
		this.arr[i] = t[i];
	}
	
	
	void add(T[] t) {
		
		
		if(t.length <= this.length) {
			
			System.arraycopy(t, 0, arr, 0, t.length);
			
		}else {
			
	
			
			int lengthext = this.length *2;
			
			while(lengthext < t.length) {
				
				lengthext = lengthext *2;
				
				if(lengthext >= t.length) {
					break;
				}
			}
			
			
			
			this.arr = new Object[lengthext]; 
			System.arraycopy(t, 0, arr, 0, t.length);
			
		}
		
	}
	
}
