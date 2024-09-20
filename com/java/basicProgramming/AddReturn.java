package com.java.basicProgramming;


public class AddReturn {
	public int sum(int a,int b){
		return a+b ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddReturn add=new AddReturn();
    int y=add.sum(1,8);
    System.out.println(y);
	}

}
