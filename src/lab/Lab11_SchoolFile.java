package lab;

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;

public class Lab11_SchoolFile {

	public static void main(String[] args) {
		
		//CREATING A NEW FILE
			File file = new File("assignment.txt");
			
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
	String data = "Java File Handling Practice";
	
	try {
		FileWriter fileWrite = new FileWriter("assignment.txt");
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
		FileReader fileRead = new FileReader("assignment.txt");
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
