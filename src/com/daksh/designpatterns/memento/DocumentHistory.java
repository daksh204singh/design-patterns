package com.daksh.designpatterns.memento;

import java.util.Stack;

public class DocumentHistory {
	private Stack<DocumentMemento> states = new Stack<>();
	
	public void saveMemento(DocumentMemento state) {
		states.push(state);
	}

	public DocumentMemento retrieveMemento() {
		return states.pop();
	}
}
