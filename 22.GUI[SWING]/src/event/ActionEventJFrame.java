package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventJFrame extends JFrame {

	JPanel contentPane;
	private JButton northButton;
	private JButton southButton;
	private JButton westButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ActionEventJFrame frame = new ActionEventJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame. 
	 */
	public ActionEventJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 339, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		northButton = new JButton("이벤트쏘스[NORTH]");
		contentPane.add(northButton, BorderLayout.NORTH);
		
		southButton = new JButton("이벤트쏘스[SOUTH]");
		southButton.setFont(new Font("굴림", Font.PLAIN, 15));
		contentPane.add(southButton, BorderLayout.SOUTH);
		
		westButton = new JButton("이벤트쏘스[WEST]");
		contentPane.add(westButton, BorderLayout.WEST);
		/*******************이벤트쏘스에 이벤트핸들러객체를 등록*********************/
		/* 1.외부클래스*/
		NorthButtonActionEventHandler handler1=
				new NorthButtonActionEventHandler(this);
		northButton.addActionListener(handler1);
		
		/* 2.멤버내부클래스 */
		SouthButtonActionEventHandler handler2 = new SouthButtonActionEventHandler();
		southButton.addActionListener(handler2);
		
		/* 2.anonymous (익명) local inner 클래스 */
		ActionListener handler3= new ActionListener() {
			int buttonClickCount=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				westButton.setText("이벤트쏘스[WEST] "+ ++buttonClickCount);
				int r=(int)(Math.random()*256);
				int g=(int)(Math.random()*256);
				int b=(int)(Math.random()*256);
				contentPane.setBackground(new Color(r, g, b));
			}
		};
		
		
		westButton.addActionListener(handler3);
		
		/****************************************************************************/
		
		
		
		
		
	} // 생성자끝
	/**********************************   member inner class ********************************/
		public class SouthButtonActionEventHandler implements ActionListener{
			int buttonClickCount=0;
			@Override
			public void actionPerformed(ActionEvent e) {
				southButton.setText("이벤트쏘스[SOUTH]" + ++buttonClickCount);
		/*************************** ActionEventJFrame의 멤버접근**************************		
				프레임의 타이틀 변경
				contentPane(프레임의 멤버필드)의 배경색변경
				?????
				*/
			setTitle("button click count :" + buttonClickCount) ;	
				int r=(int)(Math.random()*256);
				int g=(int)(Math.random()*256);
				int b=(int)(Math.random()*256);
				contentPane.setBackground(new Color(r, g, b));
			}
		
		}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
