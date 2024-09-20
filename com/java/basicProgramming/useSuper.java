package com.java.basicProgramming;
class A{
	public void m1(){
	System.out.println("avgfsyqgfyq");
	}
}
class B extends A{

	public void m1(){
	   
		System.out.println("avg");
		 super.m1();
	}
}







public class useSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    B b =new B();
    b.m1();
    
	}

}
