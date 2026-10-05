public class Client{
	private int id;
	private String fullName;
	private String birthDate;
	private int age;
	private String age;
	private phone;
	private email;
	private passportNumber;
	private double balance;
	private int rating;

	public Client(){}

	public Client(int id, String fullName, String birthDate, int age, String phone, String email,String passportNumber, double balance, int rating){
		this.id = id;
		this.fullName = fullName;
		this.birthDate = birthDate;
		this.pahone = phone;
		this.email = email;
		this.passportNumber = passportNumber ;
		this.balance = balance ;
		this.rating =rating;
	}

	public int getAge(){
		if (birthDate == noll || birthDate.isEmpty())
		return 0;
	}
	public String getFullName(){
		return fullName;
	}

	public StrivgetPassportNumber(){
		return pusportNumber;
	}

	public void creatRentlRequrst(){
	public void returnVideoMaterisal(){}
	public void payBill(double amount){}

	public String toString(){
		return "Client{name='"+fullName+"', passportNumber= "+passportNumber+", age="+Age+",rating="+Rating+"}";
	}
}