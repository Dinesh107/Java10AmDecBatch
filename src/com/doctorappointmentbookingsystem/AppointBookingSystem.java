package com.doctorappointmentbookingsystem;

import java.util.ArrayList;

import java.util.Scanner;

public class AppointBookingSystem {
	
	ArrayList<String> doctorName = new ArrayList<String>();
	ArrayList<String> doctorQualification = new ArrayList<String>();
	ArrayList<String> doctorGender = new ArrayList<String>();
	ArrayList<String> doctorPassword = new ArrayList<String>();
	ArrayList<Integer> doctorAge = new ArrayList<Integer>();
	ArrayList<Long> doctorMobileNumber = new ArrayList<Long>();
	ArrayList<String> doctorCity = new ArrayList<String>();
	
	ArrayList<Integer> patientAge = new ArrayList<Integer>();
	ArrayList<String> patientName = new ArrayList<String>();
	ArrayList<String> patientGender = new ArrayList<String>();
	ArrayList<String> patientPassword = new ArrayList<String>();
	ArrayList<String> patientConfirmPassword = new ArrayList<String>();
	ArrayList<Long> patientMobileNumber = new ArrayList<Long>();
	
	ArrayList<Integer> patientAgeBooking = new ArrayList<Integer>();
	ArrayList<String> patientNameBooking = new ArrayList<String>();
	ArrayList<String> patientGenderBooking = new ArrayList<String>();
	ArrayList<Byte> doctorID = new ArrayList<Byte>();
	
	void dataAdd() {   // method for creating default doctor list present in the database
		
		
		doctorName.add("Murugan");
		doctorName.add("Ganesh");
		doctorName.add("Ravi");
		doctorName.add("Iyyapan");
		doctorName.add("sivaji");
		doctorName.add("nishanth");
		doctorName.add("kumar");
		
		doctorQualification.add("MBBS");
		doctorQualification.add("Er, MBBS");
		doctorQualification.add("MBBS, MD");
		doctorQualification.add("MBBS, MD");
		doctorQualification.add("BAMS");
		doctorQualification.add("MBBS, MD, Surgeon");
		doctorQualification.add("BAMS");
		
		doctorAge.add(25);
		doctorAge.add(24);
		doctorAge.add(29);
		doctorAge.add(29);
		doctorAge.add(28);
		doctorAge.add(23);
		doctorAge.add(30);
		
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		doctorMobileNumber.add(123l);
		
		doctorCity.add("Chennai");
		doctorCity.add("Madurai");
		doctorCity.add("Thirchy");
		doctorCity.add("Thuthukudi");
		doctorCity.add("Thanjavur");
		doctorCity.add("Salem");
		doctorCity.add("Coimbatore");
		
	}
	
	void admin() throws Exception {
		
		Scanner sc = new Scanner(System.in);
	
		byte choice;
		
		boolean flag = true;
		
		while(flag) {
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("\t\t  ____________________________________");
			System.out.println("\t\t |                                    |");
			System.out.println("\t\t |           Welcome Admin            |");
			System.out.println("\t\t |____________________________________|");
			
			System.out.println("\n\n1. Doctor List \t2. Registered Patients \t3. Patients With Appointment \n4. Main Menu");
			
			choice = sc.nextByte();
			
			switch(choice) {
			
			case 1: 
				
				for(int i = 0; i<=doctorName.size()-1; i++) {
					
					System.out.println("Name: \t " + doctorName.get(i));
					
				}
			
			   byte menuChoice;
			   
			   System.out.println("\n\n1. Main Menu\t 2. Previous Menu");
			   
			   menuChoice = sc.nextByte();
			   
			   if(menuChoice==1) {
				   
				   flag = false;
				   
			   } else {
				   
				   break;
				   
			   }
			   
			   break;
			   
			case 2:
				
				if(patientName.isEmpty()) {
					
					System.out.println("No Registered Patients Yet");
					
					break;
					
				} else {
					
					for(int i = 0; i<=patientName.size()-1; i++) {
						
						System.out.println(i + 1 + ". " + patientName.get(i));
						
					}
					
					 System.out.println("\n\n1. Main Menu\t 2. Previous Menu");
					   
					   menuChoice = sc.nextByte();
					   
					   if(menuChoice==1) {
						   
						   flag = false;
						   
					   } else {
						   
						   break;
						   
					   }
				}
			
				break;
				
			case 3: 
				
				if(patientNameBooking.isEmpty()) {
					
					
					System.out.println("\n No Appointments Yet");
					
					break;
					
				} else {
				
				for(int i = 0; i<=patientNameBooking.size()-1; i++) {
					
					System.out.println(i + 1 + ". " + patientNameBooking.get(i));
					
				}
				
				 System.out.println("\n\n1. Main Menu\t 2. Previous Menu");
				   
				   menuChoice = sc.nextByte();
				   
				   if(menuChoice==1) {
					   
					   flag = false;
					   
				   } else {
					   
					   break;
					   
				   }
				
				}
				
				break;
				
			case 4: 
				
				flag = false;
				
				break;
				
			default: 
				
				System.out.println("Wrong Choice ");
				
				flag = true;
				   
			}
			
		}
		
	}
	
	void patient() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		while(flag) {
			
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("\t\t  ________________________________________");
			System.out.println("\t\t |                                        |");
			System.out.println("\t\t |         Welcome To Patient Page        |");
			System.out.println("\t\t |________________________________________|");
			System.out.println(" ");
			
			System.out.println("1. Login \t 2. Registration\n");
			
			byte ch = sc.nextByte();
			
			switch(ch) {
			
			case 1: 
				
				if(patientMobileNumber.isEmpty()) {
					
					System.out.println("Please, First register yourself and then Login.....!");
					
				} else {
					
					patientLogin();
					
					flag = false;
					
				}
				
				break;
				
			case 2:
				
				 patientRegistration();
				
				flag = false;
				
				break;
				
			default :
					
			    System.out.println("You entered wrong choice. Enter your choice again....!");	
			    
			    flag = true;
			
			    break;
			}
			
				
		}
		
		
	}
	
	
	void doctor() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		
		boolean flag = true;
		
		while(flag) {
			
			new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			
			System.out.println("\t\t  _______________________________________");
			System.out.println("\t\t |                                       |");
			System.out.println("\t\t |         Welcome To Doctor Page        |");
			System.out.println("\t\t |_______________________________________|");
			System.out.println(" ");
			
			System.out.println("1. Login \t 2. Registration\n");
			
			choice = sc.nextInt();
			
			switch(choice) {
			
			case 1:
				
				if(doctorMobileNumber.isEmpty()) {
					
					System.out.println("Please Register First...!");
					
					flag = false;
					
					break;
					
				} else {
					
					doctorLogin();
					
					flag = false;
					
				}
			
			 break;
			 
			case 2: 
				
				doctorRegistration();
				
				flag = false;
				
				break;
				
				
				default :
					
					System.out.println("You have Entered wrong choice, please correct choice..!");
					
					flag = true;
				
			}
			
		}
		
		
	}
	
	void patientLogin() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		boolean flag = true;
		
		long mobileNumber;
		
		byte choice;
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		System.out.println("\t\t  ______________________");
		System.out.println("\t\t |                      |");
		System.out.println("\t\t |         Login        |");
		System.out.println("\t\t |______________________|");
		
		System.out.println("Enter your username(mobilenumber)");
		
	    mobileNumber = sc.nextLong();
	    
	    System.out.println("Enter Your Password");
	    
	    String password = sc.next();
	    
	    boolean flag2 = false;
		
	    int j;
	    
	    for(j=0; j<=patientMobileNumber.size()-1; j++) {
	    	
	    	if(patientMobileNumber.get(j).equals(mobileNumber)&&(patientPassword.get(j)).equals(password)) {
	    		
	    		flag2=true;
	    		
	    		break;
	    		
	    	}
	    	
	    }
	    
	    if(flag2==true) {
	    	
	    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	    	
	    	System.out.println("\t\t  ______________________________");
			System.out.println("\t\t |                              |");
			System.out.println("\t\t |         Book Appointment     |");
			System.out.println("\t\t |______________________________|");
			
			
			System.out.println("\n Welcome " + patientName.get(j) + "to book appointment, choose your doctor...");
			
			for(int i = 0; i<=doctorName.size()-1; i++) {
			
				System.out.println((i+1) + ". " + doctorName.get(i));
				
			}
			
		  choice = sc.nextByte();
			
		  doctorID.add(choice);
		  
		  while(flag) {
			  
			  new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			  
			    System.out.println("\t\t  ______________________________");
				System.out.println("\t\t |                              |");
				System.out.println("\t\t |         Book Appointment     |");
				System.out.println("\t\t |______________________________|");
				
				if(choice<=doctorName.size() && choice>0) {
					
					System.out.println("\n\nName: " + doctorName.get(choice-1) + "\nAge: \t " + doctorAge.get(choice-1));
					
					System.out.println("\n Enter Your name: \t");
					
					sc.nextLine();
					
					patientNameBooking.add(sc.nextLine());
					
					System.out.println(" Enter Your Age: \t");
					
					patientAgeBooking.add(sc.nextInt());
					
					System.out.println("Enter your Gender: \t");
					
					patientGenderBooking.add(sc.next());
					
					System.out.println("\n Booking Successfull...");
					
					flag=false;
					
					break;
					
				} else {
					
					System.out.println("\n enter correct input....");
					
					flag = true;
					
				}
			  
		  }
	    	
	    } else {
	    	
	    	System.out.println("Login unsuccessfull");
	    	
	    	flag = false;
	    	
	    }
	    
	}
	
	void patientRegistration() throws Exception {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		Long mobileNumber;
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		System.out.println("\n");
		
		System.out.println("\t\t | Welcome To Patient Registration Page! |");
		
		System.out.println("\n");
		
		System.out.println("Please enter your name:- ");
		
		patientName.add(sc.nextLine());
		
		System.out.println("enter your age: ");
		
		patientAge.add(sc.nextInt());
		
		System.out.println("Please enter your mobile number");
		
		mobileNumber = sc.nextLong();
		
		Long mno;
		
		boolean flag = true, flag1 = true;
		
		if(patientMobileNumber.isEmpty()) {
			
			patientMobileNumber.add(mobileNumber);
			
			System.out.println("Enter Password");
			
			patientPassword.add(sc.next());
			
			System.out.println("Registration is successfull..");
			
			flag1 = false;
			
		} else {
			
			for(i=0; i<=patientMobileNumber.size()-1; i++) {
				
				mno = patientMobileNumber.get(i);
				
				if(mno==mobileNumber) {
					
					
					flag1 = false;
					
					break;
				}
				
			}
			
			if(flag1==true) {
				
				
				patientMobileNumber.add(mobileNumber);
				
				System.out.println("Enter Password");
				
				patientPassword.add(sc.next());
				
				System.out.println("Registration is Successfull!");
				
			}
			
			else {
				
				System.out.println("same mobile number is not allowed");
				
			}
			
		}
		
		
	}
	
	
	void doctorRegistration() throws Exception {
		
	    Scanner sc = new Scanner(System.in);
		
		int i = 0;
		
		Long mobileNumber;
		
		boolean flag = true, flag1 = true;
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		System.out.println("\n");
		
		System.out.println("\t\t | Welcome To Doctor Registration Page! |");
		
		System.out.println("\n");
		
		System.out.println("Please enter your name: ");
		doctorName.add(sc.nextLine());
		
		System.out.println("enter your mobilenumber");
		mobileNumber = (sc.nextLong());
		
		Long mno;
		
		if(doctorMobileNumber.isEmpty()) {
			
			doctorMobileNumber.add(mobileNumber);
			
			System.out.println("Enter Your Password");
			
			doctorPassword.add(sc.next());
			
			System.out.println("Registration is success");
			
			flag1=false;
		
		} else {
			
			for(i = 0; i<=doctorMobileNumber.size()-1; i++) {
				
				mno = doctorMobileNumber.get(i);
				
				if(mno==mobileNumber) {
					
					flag1=false;
					
					break;
					
				}
				
			}
			
			if(flag1==true) {
				
				doctorMobileNumber.add(mobileNumber);
				
				System.out.println("Enter age: ");
				doctorAge.add(sc.nextInt());
				
				System.out.println("Enter City: ");
				doctorCity.add(sc.next());
				
				System.out.println("Enter password");
				doctorPassword.add(sc.next());
				
				System.out.println("Registration is success");
				
				System.out.println("Details: Name: " + doctorName + "number: " + doctorMobileNumber);
				
				
			} else {
				
				System.out.println("same mobile number is not allowed\n");
				
				
			}
			
		}
		
	}
	
	void doctorLogin() throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		
		Long mobileNumber;
		
		new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		
		System.out.println("\t\t  _____________________________________________");
		System.out.println("\t\t |                                             |");
		System.out.println("\t\t |         Welcome to Doctor Login Page        |");
		System.out.println("\t\t |_____________________________________________|");
		
		System.out.println("Enter Your Username(Mobile number)");
		
		mobileNumber = sc.nextLong();
		
		System.out.println("Enter Your Password");
		
		String password = sc.nextLine();
		
		int i = 0;
		
		byte choice;
		
		boolean flag = false;
		
		boolean flag3 = true;
		
		for(i=0; i<=doctorMobileNumber.size()-1; i++) {
			
			if((doctorMobileNumber.get(i)).equals(mobileNumber)&&(doctorPassword.get(i)).equals(password)) {
				
				flag = true;
				
				break;
				
			}
			
		}
		
		if(flag==true) {
			
			while(flag3) {
				
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				
				System.out.println("\t\t------------------------------------------------------------");
				System.out.println("\t\t| Welcome " + doctorName.get(i)+ " |");
				System.out.println("\n\n1. Appointments. \n2.Logout");
				
				choice = sc.nextByte();
				
				byte j = 0;
				
				switch(choice) {
				
				case 1:
					
					if(doctorID.isEmpty()!=true) {   // true 
						
						while(j<=doctorID.size()-1) {
							
							if((i+1) == doctorID.get(j)) {
								
								System.out.println("patient name: " + patientNameBooking.get(j));
								
								j++;
								
							}
							
						}
						
					} else {
						
						System.out.println("No Appointments yet....!");
						
						flag3=true;
						
					}
					
					break;
					
				case 2:
					
					flag3 = false;
				
				    break;	
				}
				
				
			}
			
			
		} else {
			
			System.out.println("Login Unsuccessfull....!");
			
		}
		
	}
		
}
