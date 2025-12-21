package assignments;

import java.util.*;

public class Assignment8_CondnStmt_Loops {

	public static void main(String[] args) {
		List<Integer> transactions = new ArrayList<>();
		transactions.add(50000);
		transactions.add(-2000);
		transactions.add(3000);
		transactions.add(-15000);
		transactions.add(-200);
		transactions.add(-300);
		transactions.add(4000);
		transactions.add(-3000);
		
		System.out.println("Transactions List: "+transactions);
		
		int CreditCount=0;
		int DebitCount=0;
		int totalCreditAmount=0;
		int totalDebitAmount=0; 
		int totalBalance=0;
		int suspiciousTransaction=0;
		
		for(int amount:transactions) {
			
		if(amount>0) {
			CreditCount++;
			totalCreditAmount += amount;
					}
		else{
			DebitCount++;
			totalDebitAmount+=amount;
					}
		
		//totalBalance = totalDebitAmount + totalCreditAmount ;
		totalBalance+=amount;
						
		if(amount>10000 || amount<-10000) {
			System.out.println("Suspicious credit/ debit Transaction with Amount :"+amount);
			suspiciousTransaction++;
		}
		}
	
		System.out.println("Total number of credit transactions: "+CreditCount);
		System.out.println("Total number of Debit transactions: "+DebitCount);
		System.out.println("Total amount credited: "+totalCreditAmount);
		System.out.println("Total amount credited: "+totalDebitAmount);
		System.out.println("Total amount remaining at the end in Bank Account: "+totalBalance);
		System.out.println("Total number of suspicious transactions: "+suspiciousTransaction);
		
		
		
	}
}