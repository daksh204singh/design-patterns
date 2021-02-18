package com.daksh.designpatterns.memento;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestMemento extends JFrame {
	
	public static void main(String[] args) {
		new TestMemento();
	}
	
	private JButton saveBut, undoBut; 
	private JTextArea theArticle = new JTextArea(40, 60);
	
	History history = new History();
	Editor editor = new Editor();

	public TestMemento() {
		this.setSize(750, 780);
		this.setTitle("Memento Design Pattern");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.add(new JLabel("Editor"));
		panel1.add(theArticle);
		
		
		saveBut = new JButton("Save");
		saveBut.addActionListener(this::saveActionListener);
		
		undoBut = new JButton("Undo");
		undoBut.setEnabled(false);
		undoBut.addActionListener(this::undoActionListener);
		
		panel1.add(saveBut);
		panel1.add(undoBut);
		
		this.add(panel1);
		this.setVisible(true);
	}
	
	private void saveActionListener(ActionEvent e) {
		String textInArea = theArticle.getText();
		editor.setContent(textInArea);
		history.push(editor.createState());
		undoBut.setEnabled(true);
	}

	private void undoActionListener(ActionEvent e) {
		editor.restore(history.pop());
		theArticle.setText(editor.getContent());
		undoBut.setEnabled(!history.isEmpty());
	}
}
