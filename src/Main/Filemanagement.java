package Main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;





public class Filemanagement {
	
	  static String fileName;
	  static String content;
	  static String yn;
	  static Scanner sc= new Scanner(System.in);
	  static int choice;
	  static String url;
	  
	 
	
	public static void main(String[] args) {
		
		Filemanagement f=new Filemanagement();
		
		
		System.out.println("Enter the outer folder of the project i.e if the \"simplilearn-project\" folder is in D:\\ enter as D:\\\n");
		System.out.println("Example: D:\\ or E:\\ \n");
		  //url.insert(0,sc.next());
		url=sc.next();
	
		do {
		
			choice=f.Mainpage();
		
			switch(choice){    


			
			case 1:  
				
				//CALL CREATE FILE METHOD
				System.out.println("\nEnter the File name to be created\n");
				fileName=sc.next();
				f.create(fileName);
				//f.mainrun();
	    
			 break;  
			
			case 2:   
				
				//CALL SEARCH FILE METHOD
				System.out.println("\nEnter the File name to Search\n");
				fileName=sc.next();
			    f.search(fileName);
			   // f.Mainpage();
			    //f.mainrun();
			    
			 break; 
			 
			 
			case 3:  
				
				//CALL DELETE FILE METHOD
				f.viewfile();
				System.out.println("\nEnter the File name you want to Delete\n");
				fileName=sc.next();
			    f.delete(fileName);
				//f.Mainpage();
			    //f.mainrun(); 
			    
			 break; 
			 
			case 4:  
				
				//CALL MAIN MENU METHOD
				//f.Mainpage();
				 //f.mainrun(); 
			    
			 break; 
			   
			    
			default:   
				
				
				System.out.println("Application Closed");
				
				
			}
		
		}while(choice!=5);
		
	
	
		}
		
		//Method to Create new Text File
		public void create(String filename) {
		
		try {
			
			 File file= new File(url+"\\simplilearn-project"+"\\src\\Files\\"+filename);
			if(file.createNewFile()) {
				
				System.out.println("\n"+filename+".txt "+"File Created Successfully\n");
			}
		} catch (IOException e) {
			
			System.out.println("\nFile Creation Error\n");
		}
		}
	
		//Method to Delete Text File
		public void delete(String filename) {
			

				File delfile=new File(url+"\\simplilearn-project"+"\\src\\Files\\"+filename);
			
				if(delfile.delete()) {
					
				System.out.println("\nFile Deleted Successfully\n");

			}
				
				else {
					
					System.out.println("\nFile not found\n");
				}
		}
		
		//Method to search Text Files
		public void search(String filenames) {
			String fn;
			String fn1;
			int ff=0;
			int fnf=0;
			
			File list1=new File(url+"\\simplilearn-project"+"\\src\\Files");
			
			File[] filelist1=list1.listFiles();
			
			for (int i = 0; i < filelist1.length; i++) {
		
				fn1=filelist1[i].toString();
				fn=url+"\\"+"\\src\\Files\\"+filenames;
			
				
			 if(fn1.equals(fn)) {
				 
				 ff=1;
				 fnf=0;
				 System.out.println("\n"+filelist1[i].getName()+" File Found in list");
				 break;
			 }
			 
			 	fnf=1;
			 	ff=0;
			 
			}
				
				if(fnf==1) {
					System.out.println("File not found in list");
				}  
			
		}		
		
		
			
				
				//Method to list down the Text Files
				public void viewfile() {
					
					
					
					File list=new File(url+"\\simplilearn-project"+"\\src\\Files");
					
					File[] filelist=list.listFiles();
					
					for (int i = 0; i < filelist.length; i++) {
						  if (filelist[i].isFile()) {
							  
						    System.out.println(filelist[i].getName());
						  }
						 
					}
					 System.out.println("Select the file from the list\n");
					}
				
				public int Mainpage() {
					
					
					System.out.println("                                                          LOCKERS PRIVATE LIMITED                          "+"\n");
					System.out.println("\n");
					System.out.println("**********************************************************");
					System.out.println("MAIN MENU");
					System.out.println("**********************************************************");
					System.out.println("Please select a option below\n");
					System.out.println("1. Create File\n");
					System.out.println("2. Search for File\n");
					System.out.println("3. Delete file\n");
					System.out.println("4. Main Menu\n");
					System.out.println("5.Exit\n");
					//GET CHOICE FROM USER
					choice=sc.nextInt();
					return choice;
					
					}
		
	}

