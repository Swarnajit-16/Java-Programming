package FileHandlingLearn;

import java.io.FileWriter;
import java.io.IOException;

public class fileWrite {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
    FileWriter file=new FileWriter("C:\\Users\\2153341\\OneDrive - Cognizant\\Desktop\\suhil.txt");
    
    file.write("java");
    System.out.println("wrote successfully done");
	}

}
