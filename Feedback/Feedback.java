class Feedback{

private int id;
private Client client;
private VideoMaterial videoMaterial;
private int rating;
private String comment;
private String date;

public Feedback (){}

public Feedback (int id, Client client, VideoMateriL videoMaterial, int rating, String comment, String date){

	this.id = id;
	this.client = client;
	this.videoMaterial = videoMaterial;
	this.rating = rating;
	this.comment = comment;
	this.date = date;

}

public boolean verifyRentalFact() {return true;}
public void recalculateAverageRating(){

}
public String toSting(){
	return "Feedback{id= "+id+", rating= "+rating+", comment= "+comment+"}";
	}
}