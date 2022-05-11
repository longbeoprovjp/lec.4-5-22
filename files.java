import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class files {

	public static void main(String[] args) {
		
			FileInputStream inputStream= null;
			FileOutputStream outStream = null;
			PrintWriter outFS = null;
			Scanner inFS = null;
			int Value1;
			int Value2;
			
			int i =10;
			String st1 = "hi";
			double d = 3.123456;
			
			System.out.printf(" %s $%3.2f %d \n", st1 , d, i);
			System.out.printf(" %s $%3.4f %10d \n", st1 , d, i);
			//
			try {
				inputStream = new FileInputStream("inputFile.txt");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
			inFS = new Scanner(inputStream);//open the file
			
			Value1 = inFS.nextInt();
			Value2 = inFS.nextInt();
			System.out.println("num1: " + Value1);
			System.out.println("num2: " + Value2);
			inFS.close(); // close the file
			try {
				inputStream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			//
			try {
				outStream = new FileOutputStream("myoutfile.txt"); //this line will overwrite
			//	outStream = new FileOutputStream("myoutfile.txt", true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			outFS = new PrintWriter(outStream);
			outFS.println(Value1 + Value2);
			outFS.close();
	}

}
