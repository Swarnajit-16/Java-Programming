package com.java.basicProgramming;


	
	class man{
		int age;
		String name;
	}
	class ram extends man{
		String qualification;
		public void m1(){
			System.out.println("age="+21);
			System.out.println("name="+"swarna");
			System.out.println("qualification="+"btech");
		}
	}

	public class inheritance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ram r = new ram();
    r.m1();
	}

}
