package assignments;

import java.util.*;

public class Assignment4_Collections {

	public static void main(String[] args) {
		
		
		//STUDENT DETAILS TESTCASE--->Row → (Column:Value)
		 Map<String, Map<String,String>> studentDetails = new LinkedHashMap<>();
		 
		 //(Column:Value)
		 Map<String,String> stud1 = new LinkedHashMap<>();
		 stud1.put("Name","John Doe");
		 stud1.put("Age", "Twenty");
		 stud1.put("Gender", "Male");
		 stud1.put("Roll Number", "SBA12345");
		 stud1.put("Grade", "A++");
		 stud1.put("Major", "Computer Science");
		 stud1.put("GPA", "A3.8");
		 stud1.put("Email", "john@example.com");
		 stud1.put("PAN Number", "SDF6543210");
		 stud1.put("Address", "123 Elm St");
		 
		 Map<String,String> stud2 = new LinkedHashMap<>();
		 stud2.put("Name","Jane Smith");
		 stud2.put("Age", "Twenty One");
		 stud2.put("Gender", "Female");
		 stud2.put("Roll Number", "SBA12346");
		 stud2.put("Grade", "B+");
		 stud2.put("Major", "Mathematics");
		 stud2.put("GPA", "A3.5");
		 stud2.put("Email", "jane@example.com");
		 stud2.put("PAN Number", "REW6543211");
		 stud2.put("Address", "456 Oak St");
		 
		 Map<String,String> stud3 = new LinkedHashMap<>();
		 stud3.put("Name","Mike Brown");
		 stud3.put("Age", "Twenty Two");
		 stud3.put("Gender", "Male");
		 stud3.put("Roll Number", "SBA12347");
		 stud3.put("Grade", "A+");
		 stud3.put("Major", "Physics");
		 stud3.put("GPA", "A3.9");
		 stud3.put("Email", "mike@example.com");
		 stud3.put("PAN Number", "TYR6543212");
		 stud3.put("Address", "789 Pine St");
		 
		 
		 studentDetails.put("Row1", stud1);
		 studentDetails.put("Row2", stud2);
		 studentDetails.put("Row3", stud3);
		 
		 System.out.println("Student Details: "+studentDetails);
		 		
		 //Employee DETAILS TESTCASE--->Row → (Column:Value)
		 Map<String, Map<String,String>> employeeDetails = new LinkedHashMap<>();
		 
		 //Column : Value
		 Map<String,String> emp1=new LinkedHashMap<>();
		 
		 emp1.put("Employee ID", "E001");
		 emp1.put("Name", "Alice Green");
		 emp1.put("Age", "Thirty");
	        emp1.put("Gender", "Female");
	        emp1.put("Department", "Engineering");
	        emp1.put("Position", "Software Engineer");
	        emp1.put("Salary", "75K Pounds");
	        emp1.put("Email", "alice@example.com");
	        emp1.put("PAN Number", "SDF6543210");

	        Map<String, String> emp2 = new LinkedHashMap<>();
	        emp2.put("Employee ID", "E002");
	        emp2.put("Name", "Bob Johnson");
	        emp2.put("Age", "Thirty Five");
	        emp2.put("Gender", "Male");
	        emp2.put("Department", "Marketing");
	        emp2.put("Position", "Marketing Manager");
	        emp2.put("Salary", "85K Pounds");
	        emp2.put("Email", "bob@example.com");
	        emp2.put("PAN Number", "REW6543211");

	        Map<String, String> emp3 = new LinkedHashMap<>();
	        emp3.put("Employee ID", "E003");
	        emp3.put("Name", "Carol White");
	        emp3.put("Age", "Twenty Eight");
	        emp3.put("Gender", "Female");
	        emp3.put("Department", "Sales");
	        emp3.put("Position", "Sales Executive");
	        emp3.put("Salary", "65K Pounds");
	        emp3.put("Email", "carol@example.com");
	        emp3.put("PAN Number", "TYR6543212");
	        
	        employeeDetails.put("Employee1",emp1);
	        employeeDetails.put("Employee2",emp2);
	        employeeDetails.put("Employee3",emp3);
	        
	        System.out.println("Employee Details: "+employeeDetails);
	        //PRODUCT DETAILS TESTCASE--->Row → (Column:Value)
	        
	        //List<Map<String,String>> productDetails= new ArrayList<>(); ==>if written with List & Map combined->
	        //productDetails.add(prod1);--just for reference
	        Map<String,Map<String,String>> productDetails = new LinkedHashMap<>();
	        
	      //Column : Value
	        Map<String, String> prod1= new LinkedHashMap<>();
	        prod1.put("Product ID", "P001");
	        prod1.put("Name", "Laptop");
	        prod1.put("Category", "Electronics");
	        prod1.put("Price", "12K Pounds");
	        prod1.put("Stock Quantity", "Not Available");
	        prod1.put("Supplier", "Tech Supplies");
	        prod1.put("Warranty", "2 years");
	        prod1.put("Rating", "4.5 Stars");
	        prod1.put("Manufacturing Date", "Aug 2023");
	        prod1.put("Expiry Date", "Aug 2028");

	        Map<String, String> prod2 = new LinkedHashMap<>();
	        prod2.put("Product ID", "P002");
	        prod2.put("Name", "Desk Chair");
	        prod2.put("Category", "Furniture");
	        prod2.put("Price", "150K Pounds");
	        prod2.put("Stock Quantity", "Two");
	        prod2.put("Supplier", "Office Depot");
	        prod2.put("Warranty", "1 year");
	        prod2.put("Rating", "4 Stars");
	        prod2.put("Manufacturing Date", "Sep 2024");
	        prod2.put("Expiry Date", "N/A");

	        Map<String, String> prod3 = new LinkedHashMap<>();
	        prod3.put("Product ID", "P003");
	        prod3.put("Name", "Coffee Maker");
	        prod3.put("Category", "Kitchen");
	        prod3.put("Price", "75 Pounds");
	        prod3.put("Stock Quantity", "Two Hundred");
	        prod3.put("Supplier", "KitchenWorld");
	        prod3.put("Warranty", "6 months");
	        prod3.put("Rating", "4.2 Stars");
	        prod3.put("Manufacturing Date", "Jan 2025");
	        prod3.put("Expiry Date", "Jan 2027");
	        
	        productDetails.put("Row1", prod1);
	        productDetails.put("Row2", prod2);
	        productDetails.put("Row3", prod3);
	        
	        System.out.println("Product Details: "+productDetails);
	        
	        //All Excel Data/each row/column & value
	        Map<String, Map<String, Map<String,String>>> allExcelData = new HashMap<>();
	        allExcelData.put("Student Data",studentDetails);
	        allExcelData.put("Employee Data",employeeDetails);
	        allExcelData.put("Product Data",productDetails);
	        
	        System.out.println("Product Details>>supplier Name: "+allExcelData.get("Product Data").get("Row2").get("Supplier"));
	        
	        
	       
	}

}
