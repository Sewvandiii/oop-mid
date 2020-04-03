package WeCode;

import java.util.Scanner;

public class Operator extends User implements Calculations {
	String empNo;
	String jobTitle;
	
	public Operator() {
		super();
		empNo="";
		jobTitle="";
	}
	
	public Operator(String employeeNumber, String jobTitle, User user) {
		// TODO Auto-generated constructor stub
	 	super(user);
        this.empNo = empNo;
        this.jobTitle = jobTitle;
	}

	public String getEmpNo() {
		return empNo;
	}
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	
	@Override
	public void calculateRevenue(Artist artist) {
		// TODO Auto-generated method stub
		  Scanner scanner = new Scanner(System.in);
	      
		  try {
		  double calculateRevenue = 0;
	      
	      System.out.print("Enter number of downloads :");
	      int noOfDownloads = scanner.nextInt();
		
	      double totalRate = 0;
	      for(int i = 0; i < artist.getSongList().length; i++) {
	    	  totalRate += Double.parseDouble(artist.getSongList()[i][1]);
	      }
	      
	      double averageRate = (double) totalRate / artist.getSongList().length;
          calculateRevenue = averageRate * noOfDownloads;
          
          System.out.println("Artist" + artist.getUname());
          System.out.println("Album revenue is LKR " + calculateRevenue);
				  
			} catch (NumberFormatException e) {
				System.out.println("Number exception format");
		        e.printStackTrace();
		        
		    } catch (ArithmeticException e) {
		        System.out.println("Arithmetic exception");
		        e.printStackTrace();
		        
		    }
			      
			}
	@Override
	public void printDetails() {
		// TODO Auto-generated method stub
		 System.out.println("Operator name is " + super.getUname());
	     System.out.println("Operator email is " + super.getUemail());
	     System.out.println("Operator employee Number " + this.getEmpNo());
	     System.out.println("Operator designation is " + this.getJobTitle());
		
	     
	}
	
	

}
