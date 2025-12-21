package assignments;

import java.util.*;

import com.sun.net.httpserver.Authenticator.Result;

public class Assignment10_EmpDetailsMap {

	public static void main(String[] args) {
		//There are 5 Employee records. Now Calculate the Hike percentage of each Employee and store the 
		//Values in Map  with EmployeeName and HikePercentagevalue  and Print them.
		//Hike  =  ( Base Salary * variable pay % ) + Bonus + Reward ; 
		//Hike % =  Hike / Base Salary 
		
		//  // Employee data
        String[] names = {"Alice Johnson","Bob Smith","Carol Davis","David Brown","Eva Green"};
        double[] baseSalary = {75000, 68000, 82000, 90000, 60000};
        double[] experience = {5.1, 3.2, 7.1, 10.2, 2.4};
        double[] rating = {4.2, 3.8, 4.5, 2.5, 3.5};
        
        Map<String, Double> result = new HashMap<>();
        
        //Loop through each employee
        for(int i=0; i<names.length;i++) {
        
        double variablePayPercent;
        double bonus;
        double reward=0;
        
        
        //Conditions for Hike
        if(rating[i]>=4.0) {
        	variablePayPercent=0.15;
        	bonus=1500;
        }
        	else if(rating[i]>=3 && rating[i] < 4 ) {
        		variablePayPercent=0.10;
            	bonus=1200;
        	}
        	else  {
        		variablePayPercent=0.03;
            	bonus=300;
        	}
        //condition for Experience
        if(experience[i]>=5) {
        	 reward=5000;
        }
        
        //calculate hike and hike percentage
        
        double hike  =  (baseSalary[i] * variablePayPercent ) + bonus + reward;
        double hikePercent = (hike / baseSalary[i])*100;  
         	
      //Output result
       result.put(names[i], hikePercent);
        
        }
      
        //Print Name & Hike Percentage
        System.out.println("Employee Hike Percentage:");
        for(Map.Entry<String,Double> entry : result.entrySet()) {
        	System.out.println(entry.getKey()+ ":"+ String.format("%.2f", entry.getValue()) + "%");
        	
        }
        
	}

}
