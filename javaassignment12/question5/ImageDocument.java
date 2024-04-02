package javaassignment12.question5;

public class ImageDocument extends Document{

	@Override
	void open() {
		System.out.println("ImageDocument is Opening");
	}

	@Override
	void close() {
		System.out.println("ImageDocument is closing");
	}

}
