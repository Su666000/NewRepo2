import java.util.ArrayList;
import java.util.List;

public class Main {

	public enum PriceTiriff{
		BASE(100.0),
		STANDARD (150.0)
		PREMIUM(200.0)

		private final double price;

		PriceTiriff(double price){
			this.price = pric;
		}

		public double getPrice(){
			this.price;
		}

	}

	public enum Status{
		AVAILABLE("ДОСТУПНО");
		RENTED("НЕДОСТУПНО");
		EXPECTED("ОЖДАЕТСЯ");

		private final double label;

		Sratus (String label){
			this.label = label;
		}

	}

	public static void main(String[] args){

	System.out.println("Подбор фильмов соответствующих возрасту");

	Category childishs = new Category(1, "Мультфильмы/Мультсериалы", 0);
	Category general = new Category(2, "Семейные/Комедии/Мелодрамы/Мюзиклы/Романтика/Приключения/Биография/Исторический фильм", 0);
	Category detective = new Category(3, "Детектив/Драма/Трагедия/Нуар"16);
	Category horrorActM = new Category(4, "Ужасы/Боевик/Вестерн/Слэшер/Черная комедия/Постапокалипсис/Антиутопия"18);
	Category sciFiFent = new Category(5, "Научна фантастика/Фентези/Мистика"16);
	Category triller = new Category(6, "Триллер/Военный/Психологический триллер"18);

	List<videoMaterial> catalog = new ArrayList<>();
        
        catalog.add(new VideoMaterial(1,2 101, "Шрек", Arrays.asList(general, comedy), "Эндрю Адамсон", 2001, 90, "DVD", Arrays.asList(10, 9, 8), PriceTariff.BASE, Status.AVAILABLE));
        catalog.add(new VideoMaterial(2, 102, "Рататуй", Arrays.asList(general, comedy), "Брэд Бёрд", 2007, 111, "DVD", Arrays.asList(9, 9, 10), PriceTariff.STANDARD, Status.AVAILABLE));
        catalog.add(new VideoMaterial(2, 103, "Один дома", Arrays.asList(general, comedy), "Крис Коламбус", 1990, 103, "DVD", Arrays.asList(8, 9, 8), PriceTariff.BASE, Status.RENTED)); 
        catalog.add(new VideoMaterial(1, 104, "1+1", Arrays.asList(general, comedy), "Оливье Накаш", 2011, 112, "Bluray", Arrays.asList(10, 10, 10, 9), PriceTariff.STANDARD, Status.AVAILABLE));
        

        catalog.add(new VideoMaterial(3,5, 201, "Матрица", Arrays.asList(sciFi, action), "Вачовски", 1999, 136, "DVD", Arrays.asList(9, 8, 10, 9), PriceTariff.STANDARD, Status.AVAILABLE));
        catalog.add(new VideoMaterial(6,5, 202, "Интерстеллар", Arrays.asList(sciFi), "Кристофер Нолан", 2014, 169, "Bluray", Arrays.asList(10, 9, 9), PriceTariff.PREMIUM, Status.EXPECTED)); 
        catalog.add(new VideoMaterial(5,6, 203, "Начало", Arrays.asList(sciFi, action), "Кристофер Нолан", 2010, 148, "Bluray", Arrays.asList(9, 9, 10), PriceTariff.PREMIUM, Status.AVAILABLE));
        catalog.add(new VideoMaterial(4,5,6 204, "Мстители", Arrays.asList(sciFi, action), "Джосс Уидон", 2012, 143, "Bluray", Arrays.asList(8, 7, 8, 9), PriceTariff.PREMIUM, Status.AVAILABLE));
        

        catalog.add(new VideoMaterial(6, 301, "Сияние", Arrays.asList(horror), "Стэнли Кубрик", 1980, 144, "Bluray", Arrays.asList(9, 8, 8), PriceTariff.STANDARD, Status.AVAILABLE));
        catalog.add(new VideoMaterial(4,6 302, "Пила", Arrays.asList(horror), "Джеймс Ван", 2004, 103, "DVD", Arrays.asList(7, 8, 7), PriceTariff.BASE, Status.AVAILABLE));
        catalog.add(new VideoMaterial(6, 303, "Остров проклятых", Arrays.asList(horror, action), "Мартин Скорсезе", 2010, 138, "DVD", Arrays.asList(9, 9, 8, 9), PriceTariff.STANDARD, Status.AVAILABLE));
        catalog.add(new VideoMaterial(4,6, 304, "Астрал", Arrays.asList(horror), "Джеймс Ван", 2010, 103, "Bluray", Arrays.asList(6, 7, 5), PriceTariff.STANDARD, Status.AVAILABLE));
	
	} 
}