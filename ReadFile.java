package task.codejava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		
		
		/*
		//METHOD-1
		//Read the file using buffer and file Reader
		try {
			FileReader f1 = new FileReader("C:\\Program Files\\Java\\file.txt");
			BufferedReader br = new BufferedReader(f1);
		
			String line;
			
			//Read the line from the bufferedreader and store it in the var(line) then check the file is empty or not
			while((line = br.readLine()) != null) {
				System.out.print(line);	
			}
			br.close();
		
		}catch (IOException e){
			e.printStackTrace();
		}*/
		
		
		//METHOD-2 using Scanner
		
		FileReader f1 = new FileReader("C:\\Program Files\\Java\\file.txt");
		Scanner sc = new Scanner(f1);//pass the file  as a parameter
		
		//using loop and check the sc file contain next line 
		/*while(sc.hasNextLine()) { 
			System.out.println(sc.nextLine());//read the line using nextLine()
		} */
		
		//Method-3 without loop
		
		sc.useDelimiter("//z");//match the line
		System.out.println(sc.next());//read data from the file
		
	}
}
		


