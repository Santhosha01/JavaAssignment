package Polymorphism.question5;

public class Movie {
	 String movieName;
	 String producer;
	 double duration;
	 String releaseDate;
	private static String language="Tamil";
	private static int noOfDirector=1;

	

	public Movie(String movieName, String producer, double duration, String releaseDate) {
		super();
		this.movieName = movieName;
		this.producer = producer;
		this.duration = duration;
		this.releaseDate = releaseDate;
	}



	public void getDetails() {
		 System.out.println("\nMovie Details :  \n\n Movie Name = " + movieName + "\n Producer = " + producer + "\n Duration = " + duration + "\n Release Date = "
				+ releaseDate +" \n Langugae = "+language+" \n No of Director = "+noOfDirector+"\n");
	}

}

