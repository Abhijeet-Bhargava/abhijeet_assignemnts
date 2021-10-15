package com.yash.Serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ItemSerializeDeserialize {

	public static void main(String[] args) {
		List<ItemsDetails> listOfItems= new ArrayList<ItemsDetails>();
		
		//ItemsDetails id = new ItemsDetails();
		
		Scanner scanner=new Scanner(System.in);
		
		for(int i=1;i<=2;i++) {
			System.out.println("============Item:"+i+"===========");
			
			System.out.print("Enter Item Id: ");
			int itemId=scanner.nextInt();
			
			System.out.print("Enter Item Description : ");
			String itemDesc=scanner.next();
			
			System.out.print("Enter available Item Qty: ");
			int itemQuantity=scanner.nextInt();
			
			System.out.print("Enter Item Price: ");
			double itemPrice=scanner.nextInt();
			
			System.out.print("Enter Item Discount Percentage: ");
			int itemDiscount=scanner.nextInt();
			
			listOfItems.add(new ItemsDetails(itemId, itemDesc, itemQuantity, itemPrice, itemDiscount));
		}
		scanner.close();
		
		//Serialization
		try{
			FileOutputStream foo = new FileOutputStream("D://javainductionio//Item_Details.ser");
			ObjectOutputStream oos = new ObjectOutputStream(foo);
			oos.writeObject(listOfItems);
			oos.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		 System.out.println("Items Details are wriiten using Serialization in "
	                + "Item_Details.ser file");
		
		//Deserialization
	     try {
	    	FileInputStream fis = new FileInputStream("D://javainductionio//Item_Details.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			listOfItems= (List<ItemsDetails>) ois.readObject();
			ois.close();
		} 
	    catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	    System.out.println("Item Details read using deserialization from "
	                + "Item_Details.ser file");
	    
		System.out.println("Item Details");
		for(ItemsDetails dispItems:listOfItems) {
			System.out.println(dispItems.toString());
		}
	}
}