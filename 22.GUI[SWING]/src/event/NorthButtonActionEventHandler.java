package event;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NorthButtonActionEventHandler implements ActionListener {

	private ActionEventJFrame frame;
	
	
	
	private int buttonClickCount=0;
	public NorthButtonActionEventHandler(ActionEventJFrame frame) {
		this.frame=frame;
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		/*
		System.out.println(" north button click ");
		System.out.println(" 실행쓰레드이름 :  "+Thread.currentThread().getName());
		*/
		
		Object eventSource =e.getSource();
		//System.out.println(eventSource);
		JButton eventSourceButton =(JButton)eventSource;
		eventSourceButton.setText("이벤트쏘스[NORTH] "+ ++buttonClickCount);
		
		/******************* ActionEventJFrame의 멤버접근 ***************************
			프레임의 타이틀변경
			contentPane(프레임의 멤버필드)의 배경색변경
			???
		*/
		frame.setTitle("button click count : "+ buttonClickCount);
		int r =(int)(Math.random()*256);
		int g =(int)(Math.random()*256);
		int b =(int)(Math.random()*256);
		frame.getContentPane().setBackground(new Color(r,g,b));
		/******************************/
		
	}
	
	
	
	
	
	
	
}
  