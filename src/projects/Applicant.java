package projects;

public class Applicant {

//Constructors
	Applicant(){
	}
	
	Applicant(String firstName, String lastName, String birthday){
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthday = birthday;
	}
	

//Properties
	private String firstName;
	private String lastName;
	private String birthday;
	private int creditScore;
	private long aveIncome;
	private long lastIncome;
	private long loanAmt;
	private String appNum;
	
	
//Getters n Setters	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public int getCreditScore() {
		return creditScore;
	}
	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	public long getAveIncome() {
		return aveIncome;
	}
	public void setAveIncome(long aveIncome) {
		this.aveIncome = aveIncome;
	}
	public long getLastIncome() {
		return lastIncome;
	}
	public void setLastIncome(long lastIncome) {
		this.lastIncome = lastIncome;
	}
	public long getLoanAmt() {
		return loanAmt;
	}
	public void setLoanAmt(long loanAmt) {
		this.loanAmt = loanAmt;
	}
	public String getAppNum() {
		return appNum;
	}
	public void setAppNum(String appNum) {
		this.appNum = appNum;
	}

//Defined Methods
	public void decision(Applicant a, long b) {
		String index = String.format("%02d", 1); 
		double d = (Math.random()*899)+100;
		int z = (int) Math.round(d);
		
		String appNum = index+a.getFirstName().substring(0,2)+z;
		a.setAppNum(appNum);
		
		if (a.getCreditScore()<600 ) {
			System.out.println("We cannot approve your loan: Credit score below 600.");
		}
		else if (b>a.getLastIncome()*5) {
			System.out.println("We cannot approve your loan: Loan amount is more than 5 times greater than taxable income.");
		}
		else if (a.getAveIncome()<12000) {
			System.out.println("We cannot approve your loan: Average income less than $12,000.");
		}
		else {
			System.out.println("Congratulations, your loan amount is approved!");
		}
	}

//toString()
	@Override
	public String toString() {
		return "Applicant [firstName=" + firstName + ", lastName=" + lastName + ", birthday=" + birthday
				+ ", creditScore=" + creditScore + ", aveIncome=" + aveIncome + ", lastIncome=" + lastIncome
				+ ", loanAmt=" + loanAmt + ", appNum=" + appNum + "]";
	}

}
