package com.java.basicProgramming;
class math{
	int a;
	int b;
	int c;
	math(int a,int b){
		this.a=a;
		this.b=b;
	}
	public void m1(){
		System.out.println(a+b);
		
	}
	math(int a,int b,int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public void m2(){
		System.out.println(a+b+c);
		
	}
}








public class constructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 math m=new math(2,5);
 math m1=new math(2,5,3);
 m.m1();
 m1.m2();
 
	}

}
