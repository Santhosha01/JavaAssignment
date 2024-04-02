package javaassignment12.question4;

public class ActionMovie extends Movie {
	String genre;	
    public ActionMovie(String movieName, String producer, double duration, String releaseDate,String genre) {
		super(movieName, producer, duration, releaseDate);
		this.genre=genre;
	}

	@Override
	void getDetails() {
		System.out.println("Movie Details :  \n\n Movie Name = " + movieName + "\n Producer = " + producer + "\n Duration = "
				+ duration +"\n Genre of the Movie = " + genre + "\n releaseDate=" + releaseDate);
	}
}
