class VideoMaterial {
private int id;
private String title;
private int inventoryNumb;
private Category category;
private String director;
private int year;
private int duration;
private String format;
private double rentalPrice;
private String status;
private List<Integer> rating;

public VideoMaterial(){}

public VideoMaterial(int  id, int inventoryNumb, List<Integer> initialRatings, String title, Category category, String director, int year, int duration, String format, double rentalPrice, String status){

	this.id = id;
	this.title = title;
	this.inventoryNumb = inventoryNumb;
	this.category = category;
	this.director = director;
	this.year = year;
	this.rating = rating;
	this.duration = duration;
	this.format = format;
	this.rentalPrice = rentalPrice;
	this.status = status;
	this.rating = new ArrayList<>(initialRatings);
}



public void addRating (int score){
	if(score >=0 && <=10){
		this.rating.add(score);
	}
}

public int getRating(){
	if (rating.isEmpty()){
		return 0.0;
	}
	double sum = 0;
	for (int score : rating){
		sum += score;
	}
	return sum/rating.size();
}

public Category getCategory(){
	return category;
}

public Category getInventoryNumb(){
	return inventoryNumb;
}

public Category getTitle(){
	return title;
}

public Category getRating(){
	return rating;
}

public void changeStatus (String newStatus){}

public void undateMadiaInfo(){}

public String toString() {
	return "VideoMaterial{id="+id+",title='"+title+"', category"+category.getName()+", rentalPrice"+rentalPrice+"}";
}


}