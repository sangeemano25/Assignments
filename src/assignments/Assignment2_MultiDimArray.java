package assignments;

public class Assignment2_MultiDimArray {

	
	 
	
	public static void main(String[] args) {
		 /**String[][][] multiArray = {
				{//Semester 1
					{"Mathematics I","Physics","Chemistry","Computer Programming","Engineering Drawing","Basic Electrical Eng."},
					{"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"}
				},
				{//Semester 2
					{"Mathematics II","Mechanics","EnvironmentalSci.","Basic Electronics","Engineering Physics","Engineering Graphics"},
					{"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"}
				},
				{//Semester 3
					{"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog"},
					{"Pass(88)","Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"}
				},
				{//Semester 4
					{"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Software Engineering"},
					{"Pass(91)","Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"}
				},
				{//Semester 5
					{"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"},
					{"Pass(86)","Pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"}
				}
				
		};  */
		
		String[][][] multiArray= new String[5][2][6]; //[Semester Count][each Sem group-2...Subj,Marks][each group-6 subjects]
		
		//Semester 1 
		//Subjects
		multiArray[0][0][0]="Mathematics I";
		multiArray[0][0][1]="Physics";
		multiArray[0][0][2]="Chemistry";
		multiArray[0][0][3]="Computer Programming";
		multiArray[0][0][4]="Engineering Drawing";
		multiArray[0][0][5]="Basic Electrical Eng.";
		
		//Marks
		multiArray[0][1][0]="Pass(78)";
		multiArray[0][1][1]="Pass(85)";
		multiArray[0][1][2]="Fail(21)";
		multiArray[0][1][3]="Pass(74)";
		multiArray[0][1][4]="Pass(88)";
		multiArray[0][1][5]="Pass(79)";
		
		//Semester2
		//Subjects
		multiArray[1][0][0]="Mathematics II";
		multiArray[1][0][1]="Mechanics";
		multiArray[1][0][2]="Environmental Sci.";
		multiArray[1][0][3]="Basic Electronics";
		multiArray[1][0][4]="Engineering Physics";
		multiArray[1][0][5]="Engineering Graphics";
		
		//Marks
		multiArray[1][1][0]="Pass(82)";
		multiArray[1][1][1]="Pass(77)";
		multiArray[1][1][2]="Pass(93)";
		multiArray[1][1][3]="Fail(19)";
		multiArray[1][1][4]="Fail(24)";
		multiArray[1][1][5]="Pass(90)";
		
		
		//Semester3
		//Subjects
		multiArray[2][0][0]="Data Structures";
		multiArray[2][0][1]="Discrete Mathematics";
		multiArray[2][0][2]="Digital Electronics";
		multiArray[2][0][3]="Operating Systems";
		multiArray[2][0][4]="Signals and Systems";
		multiArray[2][0][5]="Object-Oriented Prog.";
		
		//Marks
		multiArray[2][1][0]="Pass(88)";
		multiArray[2][1][1]="Pass(81)";
		multiArray[2][1][2]="Pass(76)";
		multiArray[2][1][3]="Fail(32)";
		multiArray[2][1][4]="Pass(85)";
		multiArray[2][1][5]="Pass(78)";
		
		//Semester4
		//Subjects
		multiArray[3][0][0]="Algorithms";
		multiArray[3][0][1]="Computer Networks";
		multiArray[3][0][2]="Database Systems";
		multiArray[3][0][3]="Microprocessors";
		multiArray[3][0][4]="Communication Eng.";
		multiArray[3][0][5]="Software Engineering";
				
		//Marks
		multiArray[3][1][0]="Pass(91)";
		multiArray[3][1][1]="Pass(73)";
		multiArray[3][1][2]="Fail(19)";
		multiArray[3][1][3]="Pass(80)";
		multiArray[3][1][4]="Pass(76)";
		multiArray[3][1][5]="Pass(87)";
		
		//Semester5
		//Subjects
		multiArray[4][0][0]="Probability & Stats";
		multiArray[4][0][1]="Machine Learning";
		multiArray[4][0][2]="Compiler Design";
		multiArray[4][0][3]="Theory of Computation";
		multiArray[4][0][4]="Embedded Systems";
		multiArray[4][0][5]="Computer Graphics";
				
		//Marks
		multiArray[4][1][0]="Pass(86)";
		multiArray[4][1][1]="Pass(88)";
		multiArray[4][1][2]="Pass(84)";
		multiArray[4][1][3]="Pass(95)";
		multiArray[4][1][4]="Pass(73)";
		multiArray[4][1][5]="Pass(90)";
		
		System.out.println("Print Semester 2 Subject 4 name:"+multiArray[1][0][3]);
		System.out.println("Print Semester 2 Subject 5 name:"+multiArray[1][0][4]);
		System.out.println("Print the Status/Marks of Semester 4 Subject 3 :"+multiArray[3][1][2]);
		System.out.println("Print the Status/Marks of Semester 4 Subject 6 :"+multiArray[3][1][5]);
	}

}
