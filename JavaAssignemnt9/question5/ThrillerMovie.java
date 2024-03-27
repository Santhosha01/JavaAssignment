package Polymorphism.question5;

public class ThrillerMovie extends Movie{

   String genre;
   public ThrillerMovie(String movieName, String producer, double duration, String releaseDate,String genre) {
		super(movieName, producer, duration, releaseDate);
		this.genre=genre;
	}
   public void getDetails() {
		 System.out.println("\nMovie Details :  \n\n Movie Name = " + movieName + "\n Producer = " + producer + "\n Duration = " + duration + "\n Release Date = "
				+ releaseDate + "\n Genre = " + genre);
	}
}
