package projects;

import java.util.Scanner;
import projects.Applicant;

public class LoanProgram {

	public static void main(String[] args) {
		
		Scanner str = new Scanner (System.in);
		Scanner num = new Scanner (System.in);
		Scanner lon = new Scanner (System.in);
		
//Create new applicant and collect applicant info
		Applicant person = new Applicant();
		
		System.out.print("Welcome to Claim Loans. To begin your application, please enter your first name: ");
		person.setFirstName(str.nextLine());
		System.out.print("Please enter your last name: ");
		person.setLastName(str.nextLine());
		System.out.print("Please enter your date of birth: ");
		person.setBirthday(str.nextLine());
		System.out.print("Please enter your current credit score: ");
		person.setCreditScore(num.nextInt());
		System.out.print("Please enter your 3-month average income: ");
		person.setAveIncome(lon.nextLong());
		System.out.print("Please enter your reported taxable income for 2017: ");
		person.setLastIncome(lon.nextLong());
		System.out.print("Please enter your requested loan amount: ");
		person.setLoanAmt(lon.nextLong());
		
		person.decision(person, person.getLoanAmt());
	
		System.out.println("Application Number: "+person.getAppNum());
	}
}
