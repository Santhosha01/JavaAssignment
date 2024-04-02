package javaassignment12.question5;

abstract class Document {
    abstract void open();
    abstract void close();
    public void read() {
    	System.out.println("Reading the Document");
    }
}
