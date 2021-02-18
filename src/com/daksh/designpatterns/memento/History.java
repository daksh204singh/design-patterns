package com.daksh.designpatterns.memento;

import java.util.Stack;

// Caretaker
public class History {
	private Stack<EditorState> states = new Stack<>();
	
	public void push(EditorState state) {
		states.push(state);
	}
	
	public EditorState pop() {
		return states.pop();
	}
	
	public boolean isEmpty() {
		return states.isEmpty();
	}
}
