package assignments;

public class Assignment3_EmpGroups {
	

	public static void main(String[] args) {
		
		//create Object for Employees class
		Assignment3_Employees obj = new Assignment3_Employees();
		
		String[] employeeNames=new String[3];
		employeeNames[0]= obj.empName1;
		employeeNames[1]= obj.empName2;
		employeeNames[2]= obj.empName3;
		
		int[] employeeIDs = new int[3];
		
		employeeIDs[0]=obj.empId1;
		employeeIDs[1]=obj.empId2;
		employeeIDs[2]=obj.empId3;
		
		System.out.println("Employee Name: "+employeeNames[0]+" , "+"Employee ID: "+employeeIDs[0]);
		System.out.println("Employee Name: "+employeeNames[1]+" , "+"Employee ID: "+employeeIDs[1]);
		System.out.println("Employee Name: "+employeeNames[2]+" , "+"Employee ID: "+employeeIDs[2]);
	}

}
