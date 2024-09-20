package FileHandlingLearn;

import java.io.File;
import java.io.IOException;

public class createFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     File f=new File("C:\\Users\\2153341\\OneDrive - Cognizant\\Desktop\\suhil.txt");
     try {
		if(f.createNewFile()){
			 System.out.println("file created");
		 }
		 else{
			 System.out.println("doesnot cerated");
		 }
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	}

}
