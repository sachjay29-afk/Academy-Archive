package finalSummative;
/* @Author: Sachini
 * @Date: 6/13/2025
 * @Program Description
 * High schooler inputs their student number and grade - takes them to welcome page
 * Gives advice based on their grade, then takes them to main menu to choose between Grade Advice, 
 * Volunteer Hour Calculator, and Course Advice
 * Grade Advice: User inputs their courses and grades for the semester and program tells them what to focus on
 * Volunteer Hour Calculator: User inputs amount of volunteer hours completed and program gives necessary feedback
 * Course Advisor: User chooses a field from 1-9 and program gives advice on courses to select
 * Then, they may choose to return to main menu or exit program, leaving a review
 */

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AcademyArchive {
	static int gradeNum=0;
	static Scanner input= new Scanner (System.in);
	static Scanner wordInput = new Scanner (System.in);

	public static void main(String[] args) throws InterruptedException {
		enter();

	}

	private static void enter() throws InterruptedException {//User inputs student number and grade
		int studNum=1;
		try {
			studNum=Integer.parseInt(JOptionPane.showInputDialog("Enter your student number:  "));
		}
		catch (Exception ex) { //error message
			JOptionPane.showConfirmDialog(null, "Please enter a 6-7 digit student number.");
			System.exit(0);
		}
		boolean checkNum=checkStudNum(studNum);
		if (checkNum==false) {
			JOptionPane.showConfirmDialog(null, "Please enter a 6-7 digit student number.");
			System.exit(0);
		}
		try {
			gradeNum=Integer.parseInt(JOptionPane.showInputDialog("Enter your grade (9-12):  "));
			
		}
		catch (Exception ex) { //error message
			JOptionPane.showConfirmDialog(null, "Please enter a grade from 9-12.");
			System.exit(0);
		}
	
		
		boolean checkGrade=checkGradeNum(gradeNum);
		if (checkGrade==false) {
			JOptionPane.showConfirmDialog(null, "Please enter a grade from 9-12.");
			System.exit(0);	
		}
		welcomePage();
		Thread.sleep(1000);
		System.out.println("***Highschool made easy***"
				+ "\nPress any key to enter....");
		String key=input.nextLine();
		gradeHelp(studNum,gradeNum);
		
	}

	private static void gradeHelp(int studNum, int gradeNum) throws InterruptedException {//gives user advice based on their grade
		System.out.println(studNum+"\nGrade: "+gradeNum);
		if (gradeNum==9) {
			String advice9="You've just entered highschool! Make sure to enjoy Grade 9 to the fullest and take this time"
					+ "\nto explore your potential career paths at your leisure. Pick your Grade 10 courses wisely and establish"
					+ "\ngood study habits now! Enjoy Grade 9!\n\n";
			for (int i = 0; i < advice9.length(); i++) {
				System.out.print(advice9.charAt(i));
				Thread.sleep(20);
			}
		}
		if (gradeNum==10) {
			String advice10="You now understand how highschool works! Make sure to establish good study habits now as they will"
					+ "\nbe essential in Grade 11 and 12! Start looking into university requirements and pick the necessary courses!"
					+ "\nEnjoy Grade 10!\n\n";
			for (int i = 0; i < advice10.length(); i++) {
				System.out.print(advice10.charAt(i));
				Thread.sleep(20);
			}
		}
		if (gradeNum==11) {
			String advice11="One more year until graduation! Make sure to focus more on your grades this year as universities might"
					+ "\ntake a look at them if necessary! Make sure to look into university requirements so that you have everything you"
					+ "\nneed for success! Enjoy Grade 11!\n\n";
			for (int i = 0; i < advice11.length(); i++) {
				System.out.print(advice11.charAt(i));
				Thread.sleep(20);
			}
		}
		if (gradeNum==12) {
			String advice12="Last year of highschool! Ensure that you have all of the graduation requirements covered (40 volunteer hours, "
					+ "\n30 credits). Enjoy your last year to the fullest and prepare for university! Make sure that you have everything you"
					+ "\nneed to get into your university course! Enjoy Grade 12!\n\n";
			for (int i = 0; i < advice12.length(); i++) {
				System.out.print(advice12.charAt(i));
				Thread.sleep(20);
			}
		}
		mainMenu();
	}

	private static void mainMenu() throws InterruptedException {//user chooses from three options - takes them to the method
		System.out.println("What would you like to do?"
				+ "\n1. Grade advice"
				+ "\n2. Volunteer hour calculator"
				+ "\n3. Course advice");
		int menuChoice;
		do {
			System.out.println("Please input a number from 1-3: ");
			menuChoice=numInput();
			if (menuChoice<1||menuChoice>3) {
				System.out.println("Number must be from 1-3");
			}
		}
		while (menuChoice<1||menuChoice>3);
		if (menuChoice==1) {
			System.out.println("Loading grade advisor...");
			Thread.sleep(2000);
			gradeAdvisor();
		}
		if (menuChoice==2) {
			System.out.println("Loading volunteer hour calculator...");
			Thread.sleep(2000);
			volunteerCalc();
		}
		if (menuChoice==3) {
			System.out.println("Loading course advice...");
			Thread.sleep(2000);
			courseAdvice();
		}
		
	}

	private static int numInput() {//all number inputs go to this scanner for try catch
		int answer = 0;
		try {
			answer = input.nextInt();
		}
		catch (Exception ex) {
			System.out.println("\nError - Invalid input.");
			System.exit(0);
		}
		return answer;
	}

	private static void courseAdvice() throws InterruptedException {//user selects a field
		System.out.println("Welcome to Course Advisor! ");
		Thread.sleep(1000);
		System.out.println("Picking out courses can seem overwhelming, but Course Advisor"
				+ "\nis equiped to support you!");
		Thread.sleep(1000);
		System.out.println("What field are you going into?"
				+ "\n\n1. Architecture"
				+ "\n2. Business"
				+ "\n3. Engineering"
				+ "\n4. Health Studies"
				+ "\n5. Legal Studies"
				+ "\n6. Mathematics and Computers"
				+ "\n7. Social Science"
				+ "\n8. Science"
				+ "\n9. Transportation");
		int field;
		do {
			field =numInput();
			if (field<1||field>9) {
				System.out.println("Please input one of the options above: ");
			}
		}
		while (field<1||field>9);
		if (field==1) {
			System.out.println("Loading Architecture...");
			Thread.sleep(1000);
			architecture();
		}
		if (field==2) {
			System.out.println("Loading Business...");
			Thread.sleep(1000);
			business();
		}
		if (field==3) {
			System.out.println("Loading Engineering...");
			Thread.sleep(1000);
			engineering();
		}
		if (field==4) {
			System.out.println("Loading Health Studies...");
			Thread.sleep(1000);
			healthStudies();
		}
		
		if (field==5) {
			System.out.println("Loading Legal Studies...");
			Thread.sleep(1000);
			legalStudies();
		}
		if (field==6) {
			System.out.println("Loading Mathematics and Computer...");
			Thread.sleep(1000);
			mathAndComp();
		}
		if (field==7) {
			System.out.println("Loading Social Science...");
			Thread.sleep(1000);
			socialScience();
		}
		if (field==8) {
			System.out.println("Loading Science...");
			Thread.sleep(1000);
			science();
		}
		if (field==9) {
			System.out.println("Loading Transportation...");
			Thread.sleep(1000);
			transportation();
		}
	}

	private static void transportation() throws InterruptedException {//transportation advice
		System.out.println("\n**TRANSPORTATION**");
		Thread.sleep(1000);
		System.out.println("\nPotential Jobs: Pilot, Flight Attendant, Highway Engineer, Forklift "
				+ "\nOperator, Air Traffic Controller, Emergency Response Dispatcher");
		Thread.sleep(1000);
		System.out.println("\nRecommended Courses: "
				+ "\nGrade 12 English (graduation requirement)"
				+ "\nPhysics"
				+ "\nChemistry"
				+ "\nEarth and Space Science"
				+ "\nAdvanced Functions, Calculus and Vectors, Data Management"
				+ "\nTransportation Technology"
				+ "\nConstruction Technology\n");
		Thread.sleep(1000);
		whereNextField();
		
	}

	private static void science() throws InterruptedException {//science advice
		System.out.println("\n**SCIENCE**");
		Thread.sleep(1000);
		System.out.println("\nPotential Jobs: Biologist, Chemist, Forensic Scientist, Research Scientist,"
				+ "\n, Chemical Engineer, Environmental Scientist, Doctor");
		Thread.sleep(1000);
		System.out.println("\nRecommended Courses: "
				+ "\nGrade 12 English (graduation requirement)"
				+ "\nBiology"
				+ "\nChemistry"
				+ "\nPhysics"
				+ "\nEarth and Space Science"
				+ "\nAdvanced Functions, Calculus and Vectors, Data Management\n");
		Thread.sleep(1000);
		whereNextField();
		
	}

	private static void socialScience() throws InterruptedException {//social science advice
		System.out.println("\n**SOCIAL SCIENCE**");
		Thread.sleep(1000);
		System.out.println("\nPotential Jobs: Social Worker, Therapist, Psychologist, Human Resources"
				+ "\nManager, Historian, Anthropologist, Sociologist");
		Thread.sleep(1000);
		System.out.println("\nRecommended Courses: "
				+ "\nGrade 12 English (graduation requirement)"
				+ "\nData Management/Advanced Functions"
				+ "\nPhilosophy"
				+ "\nAnthropology, Psychology, Sociology"
				+ "\nChallenge and Change in Society"
				+ "\nConsider Physical Sciences\n");
		Thread.sleep(1000);
		whereNextField();
		
	}

	private static void mathAndComp() throws InterruptedException {//math and computer advice
		System.out.println("\n**MATH AND COMPUTERS**");
		Thread.sleep(1000);
		System.out.println("\nPotential Jobs: Software Engineer, Data Analyst, Quantitative Analyst"
				+ "\n, Statistician, Math Educator, Financial Analyst, Computer Engineer, Programmer");
		Thread.sleep(1000);
		System.out.println("\nRecommended Courses: "
				+ "\nGrade 12 English (graduation requirement)"
				+ "\nAdvanced Functions, Calculus and Vectors, Data Management"
				+ "\nComputer Science"
				+ "\nPhysics"
				+ "\nChemistry\n");
		Thread.sleep(1000);
		whereNextField();
	}

	private static void legalStudies() throws InterruptedException {//legal studies advice
		System.out.println("\n**LEGAL STUDIES**");
		Thread.sleep(1000);
		System.out.println("\nPotential Jobs: Paralegal, Mediator, Count Clerk, Legal Assistant, Legislative"
				+ "\nAnalyst, Law Professor");
		Thread.sleep(1000);
		System.out.println("\nRecommended Courses: "
				+ "\nGrade 12 English (graduation requirement)"
				+ "\nSocial Sciences"
				+ "\nLaw"
				+ "\nConsider a Math course \n");
		Thread.sleep(1000);
		whereNextField();
		
	}


	private static void healthStudies() throws InterruptedException {//health studies advice
		System.out.println("\n**HEALTH STUDIES**");
		Thread.sleep(1000);
		System.out.println("\nPotential Jobs: Nurse, Health Educator, Dentist, Pharmacist, "
				+ "\nSurgeon, Nutricionist");
		Thread.sleep(1000);
		System.out.println("\nRecommended Courses: "
				+ "\nGrade 12 English (graduation requirement"
				+ "\nBiology"
				+ "\nChemistry"
				+ "\nPhysics"
				+ "\nAdvanced Functions/Calculus and Vectors"
				+ "\nPotentially Social Science\n");
		Thread.sleep(1000);
		whereNextField();
	}

	private static void engineering() throws InterruptedException {//engineering advice
		System.out.println("\n**ENGINEERING**");
		Thread.sleep(1000);
		System.out.println("\nPotential Jobs: Electrical Engineer, Civil Engineer, Chemical "
				+ "\nEngineer, Computer Engineer, Biomedical Engineer");
		Thread.sleep(1000);
		System.out.println("\nRecommended Courses: "
				+ "\nGrade 12 English (graduation requirement"
				+ "\nPhysics"
				+ "\nChemistry"
				+ "\nBiology (for biomed)"
				+ "\nAdvanced Functions/Calculus and Vectors/Data Management"
				+ "\nComputer Science"
				+ "\nConstruction Technology"
				+ "Technological Design\n");
		Thread.sleep(1000);
		whereNextField();
	}

	private static void business() throws InterruptedException {//business advice
		System.out.println("\n**BUSINESS**");
		Thread.sleep(1000);
		System.out.println("\nPotential Jobs: Accountant, Marketing Manager, Business Analyst,"
				+ "\nFinancial Advisor, Human Resources ");
		Thread.sleep(1000);
		System.out.println("Recommended Courses: "
				+ "\nGrade 12 English (graduation requirement"
				+ "\nMinimum 2 Maths (Calculus and Vectors, Advanced Functions, Data Management"
				+ "\nAccounting"
				+ "\nInternational Business Fundamentals"
				+ "\nEntrepreneurship\n");
		Thread.sleep(1000);
		whereNextField();
	}

	private static void architecture() throws InterruptedException {//architecture advice
		System.out.println("\n**ARCHITECTURE**");
		Thread.sleep(1000);
		System.out.println("\nPotential Jobs: Architect, Architectural Designer, Interior"
				+ "\nDesigner, Project Manager");
		Thread.sleep(1000);
		System.out.println("\nRecommended Courses: "
				+ "\nGrade 12 English (graduation requirement)"
				+ "\nCalculus and Vectors/Advanced Functions"
				+ "\nPhysics"
				+ "\nTechnological Design"
				+ "\nConstruction Technology\n");
		Thread.sleep(1000);
		whereNextField();
		
	}

	private static void whereNextField() throws InterruptedException {//shows up after course advisor - gives options
		int choice;
		do {
			System.out.println("1. Return to main menu"
					+ "\n2. Return to Course Advisor"
					+ "\n3. Exit");
			choice=numInput();	
			if (choice>3||choice<1) {
				System.out.println("Please input a valid option: ");
			}
		}
		while (choice>3||choice<1);
		if (choice==1) {
			System.out.println("Returning to main menu...");
			Thread.sleep(2000);
			mainMenu();
		}
		if (choice==2) {
			System.out.println("Returning to Course Advisor...");
			Thread.sleep(2000);
			courseAdvice();
		}
		if (choice==3) {
			exit();
		}
		
	}

	private static void volunteerCalc() throws InterruptedException {//calculators amount of volunteer hours
		System.out.println("Welcome to Volunteer Hour Calculator!");
		Thread.sleep(1000);
		System.out.println("Please keep in mind that as per Ontario standards, high school students require"
				+ "\na minimum of 40 hours to graduate with an OSSD.");
		Thread.sleep(1000);
		int hours;
		do {
			System.out.println("\nHow many hours have you completed so far?: ");
			hours=numInput();
			if (hours<0) {
				System.out.println("Input not valid ");
			}
		}
		while (hours<0);
		
		if (hours==40) {
			System.out.println("Nice! You've completed exactly the amount of hours required!"
					+ "\nDon't let this stop you from volunteering more though! The more "
					+ "\nexperience the better!");
			Thread.sleep(1000);
			whereNextVol();
		}
		if (hours>40) {
			System.out.println("Seems like you have nothing to worry about! You've been busy!"
					+ "\nDon't let this stop you from volunteering more though! The more "
					+ "\nexperience the better!");
			Thread.sleep(1000);
			whereNextVol();
		}
		if (hours<40) {
			int rem=remHours(hours);
			System.out.println("You have "+rem+" hours left to complete!");
			if (gradeNum==9) {
				System.out.println("Not to worry though, you're still in Grade 9 giving you "
						+ "\nplenty of time! Don't leave it until the last minute!");
			}
			if (gradeNum==10) {
				System.out.println("Good news is that you're in grade 10, giving you a good"
						+ "\namount of time to complete your hours! Try to finish ASAP before "
						+ "\nyou get busy!");
			}
			if (gradeNum==11) {
				System.out.println("Try to complete all of your hours ASAP! Don't leave it until"
						+ "\ngrade 12 and your future self will thank you!");
			}
			if (gradeNum==12) {
				System.out.println("Get those hours done ASAP so you can graduate with all 40 hours!!");
			}
			Thread.sleep(1000);
			whereNextVol();
		}
		
	}

	private static int remHours(int hours) {//calculate remaining hours
		
		return 40-hours;
	}

	private static void gradeAdvisor() throws InterruptedException {//user indicates how many courses they have this semester
		System.out.println("Welcome to Grade Advisor!");
		Thread.sleep(1000);
		int courseNum;
		do {
		System.out.println("How many courses do you have this semester?");
		courseNum=numInput();
		if (courseNum>4||courseNum<0) {
			System.out.println("Invalid entry, please re-enter");	
		}
		}
		while (courseNum>4||courseNum<0);
		if (courseNum==1) {
			oneCourse();
		}
		if (courseNum==2) {
			twoCourse();
		}
		if (courseNum==3) {
			threeCourse();
		}
		if (courseNum==4) {
			fourCourse();
		}
		if (courseNum==0) {
			System.out.println("Seems like you don't need Grade Advisor! ");
			whereNextGr();
		}
	}

	private static void fourCourse() throws InterruptedException {//user inputs 4 courses and 4 grades, program gives feedback
		System.out.println("Course #1: ");
		String course1=wordInput.nextLine();
		int grade1;
		do {
			System.out.println("What is your current grade for "+course1+"?");
			grade1=numInput();
			if (grade1<0||grade1>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade1<0||grade1>100);
		
		System.out.println("Course #2: ");
		String course2=wordInput.nextLine();
		int grade2;
		do {
			System.out.println("What is your current grade for "+course2+"?");
			grade2= numInput();
			if (grade2<0||grade2>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade2<0||grade2>100);
		System.out.println("Course #3: ");
		String course3=wordInput.nextLine();
		int grade3;
		do {
			System.out.println("What is your current grade for "+course3+"?");
			grade3= numInput();
			if (grade3<0||grade3>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade3<0||grade3>100);
		System.out.println("Course #4: ");
		String course4=wordInput.nextLine();
		int grade4;
		do {
			System.out.println("What is your current grade for "+course4+"?");
			grade4= numInput();
			if (grade4<0||grade4>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade4<0||grade4>100);
		System.out.println("Processing...");
		Thread.sleep(1000);
		System.out.println(course1+": "+grade1+"\n"
				+course2+": "+grade2+"\n"
				+course3+": "+grade3+"\n"
				+course4+": "+grade4+"\n");
		Thread.sleep(2000);
		if (grade1>50&&grade2>50&&grade3>50&&grade4>50) {
			if (grade1<grade2&&grade1<grade3&&grade1<grade4) {
				System.out.println("Seems like you should focus a bit more on "+course1+".");
			}
			if (grade2<grade1&&grade2<grade3&&grade2<grade4) {
				System.out.println("Seems like you should focus a bit more on "+course2+".");

			}
			if (grade3<grade1&&grade3<grade2&&grade3<grade4) {
				System.out.println("Seems like you should focus a bit more on "+course3+".");

			}
			if (grade4<grade1&&grade4<grade2&&grade4<grade3) {
				System.out.println("Seems like you should focus a bit more on "+course4+".");

			}
			if (grade1==grade2&&grade1<grade3&&grade1<grade4&&grade2<grade3&&grade2<grade4) {
				System.out.println("Seems like you should focus a bit more on "+course1+" and "+course2+"."
						+"\nPrioritize the course that is more important and requires more effort from you.");
			}
			if (grade1==grade3&&grade1<grade2&&grade1<grade4&&grade3<grade2&&grade3<grade4) {
				System.out.println("Seems like you should focus a bit more on "+course1+" and "+course3+"."
						+"\nPrioritize the course that is more important and requires more effort from you.");

			}
			if (grade1==grade4&&grade1<grade2&&grade1<grade3&&grade4<grade2&&grade4<grade3) {
				System.out.println("Seems like you should focus a bit more on "+course1+" and "+course4+"."
						+"\nPrioritize the course that is more important and requires more effort from you.");
			}
			if (grade2==grade3&&grade2<grade1&&grade2<grade4&&grade3<grade1&&grade3<grade4) {
				System.out.println("Seems like you should focus a bit more on "+course2+" and "+course3+"."
						+"\nPrioritize the course that is more important and requires more effort from you.");
			}
			if (grade2==grade4&&grade2<grade1&&grade2<grade3&&grade4<grade1&&grade4<grade3) {
				System.out.println("Seems like you should focus a bit more on "+course2+" and "+course4+"."
						+"\nPrioritize the course that is more important and requires more effort from you.");
			}
			if (grade3==grade4&&grade3<grade1&&grade3<grade2&&grade4<grade1&&grade4<grade2) {
				System.out.println("Seems like you should focus a bit more on "+course3+" and "+course4+"."
						+"\nPrioritize the course that is more important and requires more effort from you.");
			}



			System.out.println("Make sure to put continuous effort into all four so that you stay passing!");
			Thread.sleep(2000);
			whereNextGr();

		}
		if (grade1<50||grade2<50||grade3<50||grade4<50) {
			System.out.println("Focus your energy towards passing your courses."
					+ "\nDon't give up!");
			Thread.sleep(2000);
			whereNextGr();
		}
		
	}

	private static void threeCourse() throws InterruptedException {//user inputs 3 courses and 3 grades, program gives feedback
		System.out.println("Course #1: ");
		String course1=wordInput.nextLine();
		int grade1;
		do {
			System.out.println("What is your current grade for "+course1+"?");
			grade1= numInput();
			if (grade1<0||grade1>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade1<0||grade1>100);
		System.out.println("Course #2: ");
		String course2=wordInput.nextLine();
		int grade2;
		do {
			System.out.println("What is your current grade for "+course2+"?");
			grade2= numInput();
			if (grade2<0||grade2>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade1<0||grade1>100);
		System.out.println("Course #3: ");
		String course3=wordInput.nextLine();
		int grade3;
		do {
			System.out.println("What is your current grade for "+course3+"?");
			grade3= numInput();
			if (grade3<0||grade3>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade1<0||grade1>100);
		System.out.println("Processing...");
		Thread.sleep(1000);
		System.out.println(course1+": "+grade1+"\n"
				+course2+": "+grade2+"\n"
				+course3+": "+grade3+"\n");
		Thread.sleep(2000);
		if (grade1>50&&grade2>50&&grade3>50) {
			if (grade1<grade2&&grade1<grade3) {
				System.out.println("Seems like you should focus a bit more on "+course1+".");
			}
			if (grade2<grade1&&grade2<grade3) {
				System.out.println("Seems like you should focus a bit more on "+course2+".");

			}
			if (grade3<grade1&&grade3<grade2) {
				System.out.println("Seems like you should focus a bit more on "+course3+".");
			}
			if (grade1==grade2&&grade1<grade3&&grade2<grade3) {
				System.out.println("Seems like you should focus a bit more on "+course1+" and "+course2+"."
						+"\nPrioritize the course that is more important and requires more effort from you.");
			}
			if (grade1==grade3&&grade1<grade2&&grade3<grade2) {
				
				System.out.println("Make sure to put continuous effort into all three so that you stay passing!");
				System.out.println("Seems like you should focus a bit more on "+course1+" and "+course3+"."
						+"\nPrioritize the course that is more important and requires more effort from you.");
			}
			if (grade2==grade3&&grade2<grade1&&grade3<grade1) {
				System.out.println("Make sure to put continuous effort into all three so that you stay passing!");
				System.out.println("Seems like you should focus a bit more on "+course2+" and "+course3+"."
						+"\nPrioritize the course that is more important and requires more effort from you.");
			}
			Thread.sleep(2000);
			whereNextGr();
				
		}
		if (grade1<50||grade2<50||grade3<50) {
			System.out.println("Focus your energy towards passing your courses."
					+ "\nDon't give up!");
			Thread.sleep(2000);
			whereNextGr();
		}
		
	}

	private static void twoCourse() throws InterruptedException {//user gives 2 courses and 2 grades, program gives feedback
		System.out.println("Course #1: ");
		String course1=wordInput.nextLine();
		int grade1;
		do {
			System.out.println("What is your current grade for "+course1+"?");
			grade1= numInput();
			if (grade1<0||grade1>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade1<0||grade1>100);
		System.out.println("Course #2: ");
		String course2=wordInput.nextLine();
		int grade2;
		do {
			System.out.println("What is your current grade for "+course2+"?");
			grade2= numInput();
			if (grade2<0||grade2>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade2<0||grade2>100);
		System.out.println("Processing...");
		Thread.sleep(1000);
		System.out.println(course1+": "+grade1+"\n"
				+course2+": "+grade2);
		Thread.sleep(1000);
		if (grade1>50&&grade2>50) {
			if (grade1>grade2) {
				System.out.println("Seems like you should focus a bit more on "+course2+".");
			}
			if (grade1<grade2) {
				System.out.println("Seems like you should focus a bit more on "+course1+".");
			}
			if (grade1==grade2) {
				System.out.println("Since both of your courses have the same grade and you're passing"
						+ "\nin both, shift your focus towards whichever is more difficult/more important."
						+ "\nDon't neglect the other though!");
			}
			System.out.println("Make sure to put continuous effort into both so that you stay passing!");
			Thread.sleep(2000);
			whereNextGr();
				
		}
			
	
		if (grade1<50||grade2<50) {
			System.out.println("Focus your energy towards passing your courses."
					+ "\nDon't give up!");
			Thread.sleep(2000);
			whereNextGr();
		}
		
	}

	private static void whereNextGr() throws InterruptedException {//shows up after grade advice - user chooses where to go
		int choice;
		do {
			System.out.println("1. Return to main menu"
					+ "\n2. Return to Grade Advisor"
					+ "\n3. Exit");
			choice=numInput();	
			if (choice>3||choice<1) {
				System.out.println("Please input a valid option: ");
			}
		}
		while (choice>3||choice<1);
		if (choice==1) {
			System.out.println("Returning to main menu...");
			Thread.sleep(2000);
			mainMenu();
		}
		if (choice==2) {
			System.out.println("Returning to Grade Advisor...");
			Thread.sleep(2000);
			gradeAdvisor();
		}
		if (choice==3) {
			exit();;
		}
		}
		private static void whereNextVol() throws InterruptedException {//shows up after volunteer hour calculator - user chooses where to go
			int choice;
			do {
				System.out.println("1. Return to main menu"
						+ "\n2. Return to Volunteer Hour Calculator"
						+ "\n3. Exit");
				choice=numInput();	
				if (choice>3||choice<1) {
					System.out.println("Please input a valid option: ");
				}
			}
			while (choice>3||choice<1);
			
			if (choice==1) {
				System.out.println("Returning to main menu...");
				Thread.sleep(2000);
				mainMenu();
			}
			if (choice==2) {
				System.out.println("Returning to Volunteer Hour Calculator...");
				Thread.sleep(2000);
				volunteerCalc();
			}
			if (choice==3) {
				exit();
			}
		
	}

	private static void oneCourse() throws InterruptedException {//user inputs 1 course and 1 grade, program gives advice
		System.out.println("What course do you have this semester?: ");
		String course1=wordInput.nextLine();
		int grade1;
		do {
			System.out.println("What is your current grade for "+course1+"?");
			grade1= numInput();
			if (grade1<0||grade1>100) {
				System.out.println("Let's not lie this time!");
			}
		}
		while (grade1<0||grade1>100);
		System.out.println("Processing...");
		Thread.sleep(1000);
		System.out.println(course1+": "+grade1);
		Thread.sleep(1000);
		System.out.println("Since you only have one course this semester, you don't have to "
				+ "\nworry about prioritizing other courses! Work hard in "+course1+"!");
		if (grade1<50) {
			System.out.println("Put in extra effort so you pass as it's important you receive this credit!\n");
		}
		Thread.sleep(2000);
		whereNextGr();
		
	}

	private static void exit() throws InterruptedException {//user chooses to exit and rates experience from 1-5
		System.out.println("Thank you for using Academy Archive!");
		Thread.sleep(1000);
		int rate;
		do {
			System.out.println("Please rate your experience from 1-5: ");
			rate=numInput();
			if (rate<0) {
				System.out.println("Oh...please choose between 1-5");
			}
			if (rate>5) {
				System.out.println("We're flattered! But please choose between 1-5");
			}
		}
		while (rate<0||rate>5);
		System.out.println("See you next time!");
		
		System.exit(0);
		
	}

	private static boolean checkGradeNum(int gradeNum) {//checks if grade inputs are valid, return to enter method
		if (gradeNum!=9&&gradeNum!=10&&gradeNum!=11&&gradeNum!=12) {
			return false;
		}
		else
			return true;

	}

	private static boolean checkStudNum(int studNum) {//checks if student number input is valid, return to enter method
		int count=0;
		while (studNum!=0) {
			studNum/=10;
			count++;
		}
		if (count>7||count<6) {
			return false;
		}
		else
			return true;
	}


	private static void welcomePage() throws InterruptedException {//welcome art
		System.out.println(" ______                      __                                 \r\n"
				+ "/\\  _  \\                    /\\ \\                                \r\n"
				+ "\\ \\ \\L\\ \\    ___     __     \\_\\ \\     __    ___ ___   __  __    \r\n"
				+ " \\ \\  __ \\  /'___\\ /'__`\\   /'_` \\  /'__`\\/' __` __`\\/\\ \\/\\ \\   \r\n"
				+ "  \\ \\ \\/\\ \\/\\ \\__//\\ \\L\\.\\_/\\ \\L\\ \\/\\  __//\\ \\/\\ \\/\\ \\ \\ \\_\\ \\  \r\n"
				+ "   \\ \\_\\ \\_\\ \\____\\ \\__/.\\_\\ \\___,_\\ \\____\\ \\_\\ \\_\\ \\_\\/`____ \\ \r\n"
				+ "    \\/_/\\/_/\\/____/\\/__/\\/_/\\/__,_ /\\/____/\\/_/\\/_/\\/_/`/___/> \\\r\n"
				+ "                                                          /\\___/\r\n"
				+ "                                                          \\/__/ \r\n"
				+ " ______               __                                        \r\n"
				+ "/\\  _  \\             /\\ \\      __                               \r\n"
				+ "\\ \\ \\L\\ \\  _ __   ___\\ \\ \\___ /\\_\\  __  __     __               \r\n"
				+ " \\ \\  __ \\/\\`'__\\/'___\\ \\  _ `\\/\\ \\/\\ \\/\\ \\  /'__`\\             \r\n"
				+ "  \\ \\ \\/\\ \\ \\ \\//\\ \\__/\\ \\ \\ \\ \\ \\ \\ \\ \\_/ |/\\  __/             \r\n"
				+ "   \\ \\_\\ \\_\\ \\_\\\\ \\____\\\\ \\_\\ \\_\\ \\_\\ \\___/ \\ \\____\\            \r\n"
				+ "    \\/_/\\/_/\\/_/ \\/____/ \\/_/\\/_/\\/_/\\/__/   \\/____/            ");
		Thread.sleep(1000);
		System.out.println("Loading....");
		Thread.sleep(3000);


	}

}
