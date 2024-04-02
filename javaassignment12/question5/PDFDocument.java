package javaassignment12.question5;

public class PDFDocument extends Document{

	@Override
	void open() {
		System.out.println("PDFDocument is Opening");
	}

	@Override
	void close() {
		System.out.println("PDFDocument is closing");
	}

}
