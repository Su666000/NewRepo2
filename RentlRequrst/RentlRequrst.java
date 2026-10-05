class RentalRequrst {
	private int id;
	private Client client;
	private VideoMaterial videoMateria;
	private String issueData;
	private String plannedReturnData;
	private String actualReturnData;
	private double basePrice;

	public RentalAgreement(){}

	public.id = id;
	public.client = client;
	public.videoMateria = videoMateria;
	public.issueData = issueData;
	public.plannedReturnData = plannedReturnData;
	public.actualReturnData = actualReturnData;
	public.basePrice = basePrice;

}

public double calculatPrice(){return basePrice;} 
public double checkReturnDeadline(){ return true;}
public double closeAgreement(){}

public String toString(){
	return "RentalAgreement{id="+id+", client= "++client.getFullName()+", videoMateria"+videoMateria.getTitle+"}";
	}
}