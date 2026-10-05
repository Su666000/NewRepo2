class FineCheck{
private int id;
private RentalAgreement rentalAgreement;
private String reason;
private int overdueDays;
private double fineAmount;
private String paymentStatus;

public FineCheck(){}
public FinrCheck(int id, RentalAgreement rentalAgreement, String reason, int overdueDays, double fineAmount,String paymentStatus){

this.id =id;
this.rentalAgreement = rentalAgreement;
this.reason = reason;
this.overdueDays = overdueDays;
this.fineAmount = fineAmount;
this.paymentStatus = paymentStatus;

}

public double calculateFine() {return fineAmount;}
public void lowerClientRating(){}
public void markPaod(){}

public String toString(){
	return "FineCheck{id="+id+",reason='"+reason+"', fineAmount"+fineAmount+"}";

	}
}