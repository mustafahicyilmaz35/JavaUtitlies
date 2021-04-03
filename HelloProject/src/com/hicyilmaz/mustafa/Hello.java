package com.hicyilmaz.mustafa;

import java.util.Arrays;

public class Hello {

	public static void main(String[] args) {
		
		
		
		String[] names = {"Mustafa","Ahmet","Ali","ayþe"};
		
		ArrayList<String> myArrayList = new ArrayList<String>();
		
		//myArrayList.Insert(1, "Kemal");
		
		//myArrayList.get(1);
		//System.out.println(myArrayList.get(1));
		
		myArrayList.add(names);
		myArrayList.Insert(2, "Kemal");
		myArrayList.Insert(3, "Nuri");
		for(int i = 0; i < names.length + 2; i++) {
			
			System.out.println(myArrayList.get(i));
		}

		System.out.println(myArrayList.toString());
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
	
	
	void Insert(int i, T t) {
		
		
		
		for(int j = this.length-1; j > i; j--) {
			
			this.arr[j]=this.arr[j-1];
			
		}
		
		
		
		this.arr[i] = t;
		
		
		
		
	}

	@Override
	public String toString() {
		return "ArrayList [arr=" + Arrays.toString(arr) + ", length=" + length + "]";
	}
	
	
	
}
