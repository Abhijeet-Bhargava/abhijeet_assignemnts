package com.yash.Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeMain {

	public static void main(String[] args) {
		Manager manager = new Manager(1001,"Akhil","Verma","23/04/1997","Male",2010);
		
		try{
			FileOutputStream foo = new FileOutputStream("D://javainductionio//managerDetails.ser");
			ObjectOutputStream oos = new ObjectOutputStream(foo);
			oos.writeObject(manager);
			oos.close();
		}
		catch(IOException e) {
			e.getMessage();
		}
	    try {
	    	FileInputStream fis = new FileInputStream("D://javainductionio//managerDetails.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			manager= (Manager) ois.readObject();
			
			System.out.println(manager.toString());
						
			ois.close();
		} 
	    catch (IOException | ClassNotFoundException e) {
			e.getMessage();
	    }
	}
}
