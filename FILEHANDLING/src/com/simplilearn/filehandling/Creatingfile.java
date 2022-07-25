package com.simplilearn.filehandling;

import java.io.File;

import java.io.IOException;

public class Creatingfile {

	public static void main(String[] args) {
		// Import the File class
		
			

				try {
					File Obj = new File("myfile.txt");
					if (Obj.createNewFile()) {
						System.out.println("File created: "
										+ Obj.getName());
					}
					else {
						System.out.println("File already exists.");
					}
				}
				catch (IOException e) {
					System.out.println("An error has occurred.");
					e.printStackTrace();
				}
			
		

		// TODO Auto-generated method stub

	}

}