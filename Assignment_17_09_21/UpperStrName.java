package com.yash.JCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class UpperStrName {

	public static void main(String[] args) {
		
        ArrayList <String> list1 = new ArrayList<String>();
        ArrayList <String> list2 = new ArrayList<String>();
        
        int i=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of strings for an array: ");
        int n = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter the data :");
		for(i=0; i<n; i++) {
			list1.add(scan.next());
		}
	
        for(i=0;i<list1.size();i++) {
        	StringBuilder str = new StringBuilder(list1.get(i));
        	str.setCharAt(2, Character.toUpperCase(str.charAt(2)));
        	list2.add(str.toString());
		}

		Iterator<String> s = list2.iterator();
		System.out.println("List data = ");
		while(s.hasNext()) {
			System.out.print(list2.get(i)+"\t");
		}
		scan.close();

	}

}
