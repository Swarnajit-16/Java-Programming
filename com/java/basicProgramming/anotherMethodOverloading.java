package com.java.basicProgramming;

class addition{
	public void add(int a,int b){
		System.out.println(a+b);
	}
	public void add(double a,double b){
		System.out.println(a+b);
	}
}







public class anotherMethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     addition a=new addition();
     a.add(1.0, 1.0);
	}

}
