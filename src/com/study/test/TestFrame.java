package com.study.test;
import java.awt.*;
import java.awt.event.*;

public class TestFrame {

	public static void main(String[] args){
		// TODO 自动生成的方法存根
		Frame t = new Frame();
		t.setBackground(Color.blue);
		t.setSize(500, 300);
		t.setResizable(true);
		t.setTitle("caoshwiei.java");
		Panel panel = new Panel();
		panel.add(new TextField(20));
		panel.add(new Button("搜索"));
		t.add(panel);
		
		t.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		t.setVisible(true);
	}

}
