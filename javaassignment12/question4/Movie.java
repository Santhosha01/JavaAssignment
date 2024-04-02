package javaassignment12.question4;

abstract class Movie {
	 String movieName;
	 String producer;
	 double duration;
	 String releaseDate;

	public Movie(String movieName, String producer, double duration, String releaseDate) {
		super();
		this.movieName = movieName;
		this.producer = producer;
		this.duration = duration;
		this.releaseDate = releaseDate;
	}

	abstract void getDetails();
}
