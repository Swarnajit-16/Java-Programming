package Array;



public class evenFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar={1,3,6,4,5,9};
	     int i;
	     System.out.print("Even Values are:");
	     for(i=0;i<ar.length;i++){
	    	 if(ar[i]%2==0){
	    		 System.out.print(ar[i]+",");
	    	 }
	    	 
	     }
	     System.out.println( );
	     
	     System.out.print("Odd Values are:");
	     for(i=0;i<ar.length;i++){
	    	 if(ar[i]%2!=0){
	    		 System.out.print(ar[i]+","  );
	    	 }
	}

}
}
