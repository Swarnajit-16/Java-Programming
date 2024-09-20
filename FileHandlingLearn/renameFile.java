package FileHandlingLearn;

import java.io.File;

public class renameFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\Users\\2153341\\OneDrive - Cognizant\\Desktop\\suhil.txt");
		File r=new File("C:\\Users\\2153341\\OneDrive - Cognizant\\Desktop\\sujit.txt");
		if(f.exists()){
			System.out.println(f.renameTo(r));
			System.out.println("renamed done");
		}
	}

}
