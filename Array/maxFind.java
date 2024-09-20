package Array;

public class maxFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] ar={1,3,6,4,1,9};
     int i;
     int a=ar[0];
     for(i=0;i<ar.length;i++){
    	 if(ar[i]>a){
    		 a=ar[i];
    	 }
     }
     System.out.println(a);
	}

}
