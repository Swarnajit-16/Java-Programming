package FileHandlingLearn;

import java.io.File;

public class fileInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 File f=new File("C:\\Users\\2153341\\OneDrive - Cognizant\\Desktop\\suhil.txt");
     if(f.exists()){
    	 System.out.println("name:"+f.getName());
    	 System.out.println("name:"+f.getAbsolutePath());
    	 System.out.println("name:"+f.canRead());
    	 System.out.println("name:"+f.canWrite());
    	 
    	 }
     else {
    	 System.out.println("does not exits");
     }
	}

}
