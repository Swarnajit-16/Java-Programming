package Array;

public class smallFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] ar={2,7,8,5,3,9,4,1};
    int i;
    int a=ar[0];
    for(i=0;i<ar.length;i++){
    	if(ar[i]<a){
    		a=ar[i];
    	}
    	
    }
    System.out.println(a);
	}

}
