package javaassignment12.question5;

public class MainMethod {

	public static void main(String[] args) {
		Document d=new PDFDocument();
		d.open();
		d.read();
		d.close();
		System.out.println();
		d=new TextDocument();
		d.open();
		d.read();
	    d.close();
	    System.out.println();
	    d=new ImageDocument();
	    d.open();
	    d.close();
	}

}
