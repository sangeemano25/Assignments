package assignments;

public class Assignment6_Arrays_Datatypes_Operators {

	public static void main(String[] args) {
		/*
		  Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and
		  marks [75, 80, 82] Add 10 marks to each students using assignment operators
		  and store it into another array, after adding 10 marks identify the average
		  marks of all students
		 */
		
		String[] studentNames = {"Suresh","Mahesh","Naresh"};
		int[] marks = {75, 80, 82};
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Marks of "+studentNames[i]+" before adding: "+marks[i]);
		}
		
		int[] updatedMark = new int[marks.length];
		int total=0;
		
		for(int j=0; j<marks.length; j++) {
			updatedMark[j] = marks[j]+10;
			//updatedMark[j]+=10;
			total += updatedMark[j];
			
		}
		System.out.println("*******************************************************************");
		for(int k=0;k<marks.length;k++) {
			System.out.println("Marks of "+studentNames[k]+" after adding additional 10 : "+updatedMark[k]);
		}
		
		System.out.println("*******************************************************************");
		int average = total/3;
		System.out.println("Average marks of all students: " +average);

	}

}
