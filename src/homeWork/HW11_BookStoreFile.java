package homeWork;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class HW11_BookStoreFile {

	public static void main(String[] args) {
		
		//CREATING A NEW FILE
		File file = new File("log.txt");
		
	try {
		boolean value = file.createNewFile();
		if(value) {
			System.out.println("The new file is created.");
		}
		else {
			System.out.println("The file already exists.");
		}
	}
	catch(Exception e) {
		e.getStackTrace();
	}
	 

	//WRITTING A DATA INTO THE FILE
	String data = "Book order placed at 21-04-2026 12:16 pm";
	
	try {
		FileWriter fileWrite = new FileWriter("log.txt");
		fileWrite.write(data);
		System.out.println();
		System.out.println("Data is written to the file.");
		fileWrite.close();
	}
	catch(Exception e) {
		e.getStackTrace();
	}
	
	//READING THE FILE
		char[] array = new char[100];
		
		try {
			FileReader fileRead = new FileReader("log.txt");
			fileRead.read(array);
			System.out.println();
			System.out.println("Data in the file:");
		    System.out.println(array);
		    System.out.println();
		    fileRead.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	
		//DELETE THE FILE
		try {
			boolean value = file.delete();	
			if (value) {
				System.out.println("The File is deleted.");
			}
			else {
				System.out.println("The File is not deleted.");
			}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	
	}

}
