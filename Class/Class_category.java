public class Category {
	private int id;
	private String name;
	private int agelimit;
	private double popularity;

	public Category(){
		public Category (int id, String name, int agelimit, double popularity){
			this.id = id;
			this.name = name;
			this.agelimit = agelimit;
			this.popularity = popularity;
		}
		public boolean chackAge(int clientAge){
			return clientAge >= this.agelimit;
		}
		public void GetMoviesList() {}

		public int getAgeLimit(){
			return Agelimit;public String toString(){
				return "Category{name='"+Name+ "',agelimit='"+Agelimit+"'}";
			}
		}
	}
}