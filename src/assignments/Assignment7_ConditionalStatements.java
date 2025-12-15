package assignments;

public class Assignment7_ConditionalStatements {

	public static void main(String[] args) {
	
		String customerName = "John Doe";
		int creditScore = 720;
		double income = 55000.0;
		boolean isEmployed = true;
		double debtToIncomeRatio = 35.0;
		
		if(creditScore>750) {
			System.out.println("The loan is automatically approved for "+customerName);
		}
		else if(creditScore >=650 && creditScore <=750) {
			System.out.println("Additional checks are performed");
			
				if(income>=50000.0) {
				System.out.println("Consider for loan");
					if(isEmployed) {
							if(debtToIncomeRatio <40.0) {
								System.out.println("Loan Approved");
								}
								else {System.out.println("The loan is denied");}//debtToIncomeRatio>40
					 }else if(!isEmployed) {System.out.println("The loan is denied");}//unemployed
							
				}else {System.out.println("The loan is denied");}//income<50000
		}else {System.out.println("The loan is denied");}//creditscore<650
			
	}

}
