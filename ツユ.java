/*
	Grade Generator Per Student
	By @404Mine
*/

import java.io.*;

public class jack {
	
	  public static void main(String[] args)throws IOException {
	  	
	  	BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	  	
	  	int nos = 0;
	  	
	  	System.out.println("Enter Number of Students: ");
	  	nos = Integer.parseInt(br.readLine());
	  	
	  	String[] names = new String[nos];
	  	String[] period = {"Prelim","Midterm","Semi-Final","Final"};
	  	
	  	for(int i = 0; i < names.length; i++){      //To Get Names for Array
	  	    System.out.print("Enter Name " + (i+1) + " : ");
	  	    names[i] = br.readLine();
	  	    System.out.println(" ");
	  	    System.out.println(names[i]);           //To Test
	  	}
	  	
	  	int i = 0, indx = 0;            //Variable for loop
	  	double prlm = 0, mdtrm = 0, smfnl = 0, fnl = 0;     //Value holders for grades
	  	double ttl;         //Variable for total of grades
	  	
	  	while(indx < names.length){     //To Input Grades Per Student
	  	    System.out.println(names[i]);     //To Print Name
	  	    System.out.println(" ");
	  	    
	  	    switch (i){
	  	        default:
	  	            System.out.println(period[0] + " : ");
	  	            prlm = Double.parseDouble(br.readLine());
	  	            System.out.println(period[1] + " : ");
	  	            mdtrm = Double.parseDouble(br.readLine());
	  	            System.out.println(period[2] + " : ");
	  	            smfnl = Double.parseDouble(br.readLine());
	  	            System.out.println(period[3] + " : ");
	  	            fnl = Double.parseDouble(br.readLine());
	  	            
	  	            System.out.println("Grades: " + prlm + " " + mdtrm + " " + smfnl + " " + fnl);       //To Test
	  	            
	  	            ttl = (prlm + mdtrm + smfnl + fnl) / period.length; //Formula
	  	            
	  	            System.out.println("GWA: " + ttl);  //To Test
	  	            if(ttl > 85){
	  	                System.out.println("Passed!");
	  	            }
	  	            
	  	            break;
	  	            
	  	    }
	  	    
	  	    i++;
	  	    indx++;
	  	}
	  
	  }
}
