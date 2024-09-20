package com.java.basicProgramming;


class Show{
	public static String m1(String a){
	return a;	
	}
	public static int m1(int b){
		return b;	
		}
}







public class MethodCallForStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String y=Show.m1("Orehhhhh") ;
     System.out.println(y);
     
     int l=Show.m1(100) ;
     System.out.println(l);
	}

}
