package com.java.basicProgramming;

class person{
	int age;
	int id;
	String name;
	
	public void m1(int age, int id, String name){
		System.out.println(age);
		System.out.println(id);
		System.out.println(name);
	}
	public void m1(int age, int id){
		System.out.println(age);
		System.out.println(id);
}

}








public class methodOverloading {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     person p=new person();
     p.m1(21,1,"swarna");
     //p.m1(21,1);
	}

}
