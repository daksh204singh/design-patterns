package com.daksh.designpatterns.memento;

public class DocumentDemo {
	public static void main(String[] args) {
		var document = new Document();
		var history = new DocumentHistory();
		
		document.setContent("Hello");
	    history.saveMemento(document.createMemento());

	    document.setFontName("Font 1");
	    history.saveMemento(document.createMemento());

	    document.setFontSize(10);

	    System.out.println(document);

	    document.restore(history.retrieveMemento());
	    System.out.println(document);

	    document.restore(history.retrieveMemento());
	    System.out.println(document);
	}
}
