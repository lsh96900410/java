package com.itwill.address.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;

public class AddressServiceMainFrame extends JFrame {

	/*****************************************************/
	
	private JPanel contentPane;
	private JTextField nameTextFiled;
	private JTextField phoneTextFiled;
	private JTextField addressTextFiled;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddressServiceMainFrame frame = new AddressServiceMainFrame();
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
	public AddressServiceMainFrame() {
		setBackground(new Color(255, 255, 153));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 401);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JTabbedPane addressTabbePane = new JTabbedPane(JTabbedPane.TOP);
		addressTabbePane.setBackground(new Color(255, 255, 153));
		contentPane.add(addressTabbePane, BorderLayout.CENTER);
		
		JPanel addressInsertPanel = new JPanel();
		addressInsertPanel.setForeground(new Color(0, 0, 0));
		addressInsertPanel.setBackground(new Color(255, 255, 153));
		addressTabbePane.addTab("주소록쓰기", null, addressInsertPanel, null);
		addressTabbePane.setBackgroundAt(0, new Color(153, 204, 255));
		addressInsertPanel.setLayout(null);
		
		JLabel addressNameLabel = new JLabel("이름");
		addressNameLabel.setFont(new Font("HY엽서M", Font.BOLD, 12));
		addressNameLabel.setBounds(75, 97, 57, 15);
		addressInsertPanel.add(addressNameLabel);
		
		JLabel adressPhoneLabel = new JLabel("전화번호");
		adressPhoneLabel.setFont(new Font("HY엽서M", Font.BOLD, 12));
		adressPhoneLabel.setBounds(75, 137, 57, 15);
		addressInsertPanel.add(adressPhoneLabel);
		
		JLabel addressAdressLabel = new JLabel("주소");
		addressAdressLabel.setFont(new Font("HY엽서M", Font.BOLD, 12));
		addressAdressLabel.setBounds(75, 177, 57, 15);
		addressInsertPanel.add(addressAdressLabel);
		
		nameTextFiled = new JTextField();
		nameTextFiled.setFont(new Font("HY엽서M", Font.BOLD, 12));
		nameTextFiled.setBounds(156, 94, 116, 21);
		addressInsertPanel.add(nameTextFiled);
		nameTextFiled.setColumns(10);
		
		phoneTextFiled = new JTextField();
		phoneTextFiled.setFont(new Font("HY엽서M", Font.BOLD, 12));
		phoneTextFiled.setBounds(156, 134, 116, 21);
		addressInsertPanel.add(phoneTextFiled);
		phoneTextFiled.setColumns(10);
		
		addressTextFiled = new JTextField();
		addressTextFiled.setFont(new Font("HY엽서M", Font.BOLD, 12));
		addressTextFiled.setBounds(156, 174, 116, 21);
		addressInsertPanel.add(addressTextFiled);
		addressTextFiled.setColumns(10);
		
		JButton addressWriteButton = new JButton("주소록 쓰기");
		addressWriteButton.setFont(new Font("HY엽서L", Font.BOLD, 11));
		addressWriteButton.setBounds(75, 224, 97, 23);
		addressInsertPanel.add(addressWriteButton);
		
		JPanel addressListPanel = new JPanel();
		addressListPanel.setBackground(new Color(255, 255, 153));
		addressTabbePane.addTab("주소록리스트", null, addressListPanel, null);
		addressTabbePane.setBackgroundAt(1, new Color(255, 255, 255));
		addressListPanel.setLayout(null);
		
		JPanel addressDetailPanel = new JPanel();
		addressDetailPanel.setBackground(new Color(255, 255, 153));
		addressTabbePane.addTab("주소록상세보기", null, addressDetailPanel, null);
		addressTabbePane.setBackgroundAt(2, new Color(204, 204, 153));
		addressDetailPanel.setLayout(null);
	
	
	
	
	}
}
