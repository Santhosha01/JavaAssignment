package javaassignment12.question5;

public class TextDocument extends Document{

	@Override
	void open() {
		System.out.println("TextDocument is Opening");
	}

	@Override
	void close() {
		System.out.println("TextDocument is closing");
	}

}
