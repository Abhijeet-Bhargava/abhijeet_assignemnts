/*1. Count number of files in a given folder.
	 Ask end user to enter folder path on console and count number of files in that folder.
*/
package com.yash.files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class countNFiles {

	public static void RecursiveFileCount(File filePath) throws IOException {
		int count=0;
		File[] files = filePath.listFiles();
		for (File file : files){
			if(file.isFile()) {
				count++;
			}
			if(file.isDirectory()) {
				RecursiveFileCount(file);
			}
		}
		System.out.println("Number of files in "+filePath+" :" + count);
	}
	public static void main(String[] args) throws IOException {
		Scanner p = new Scanner(System.in);  
	    System.out.println("Enter path: ");
	    String inputPath = p.nextLine();   
	    p.close();
		File files = new File(inputPath);
		RecursiveFileCount(files);
	}
}