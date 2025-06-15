package task.codejava;

//import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to Write the data in File:");
		String data = sc.nextLine();
		FileWriter f1 = new FileWriter("C:\\Users\\LENOVO\\Desktop\\JAVA\\wite.txt");
		//BufferedWriter br = new BufferedWriter(f1);
		
		f1.write(data);
		f1.close();
		sc.close();
	
	}

}



