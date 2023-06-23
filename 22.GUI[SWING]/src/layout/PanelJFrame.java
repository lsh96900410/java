package layout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelJFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PanelJFrame frame = new PanelJFrame();
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
	public PanelJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 441, 334);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel northFanel = new JPanel();
		northFanel.setBackground(Color.PINK);
		northFanel.setForeground(Color.WHITE);
		contentPane.add(northFanel, BorderLayout.NORTH);
		
		textField_2 = new JTextField();
		northFanel.add(textField_2);
		textField_2.setColumns(20);
		
		JButton btnNewButton_6 = new JButton("검색");
		northFanel.add(btnNewButton_6);
		
		JPanel sounthPanel = new JPanel();
		sounthPanel.setBackground(Color.CYAN);
		contentPane.add(sounthPanel, BorderLayout.SOUTH);
		
		JButton btnNewButton_2 = new JButton("회원가입");
		sounthPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("로그인");
		sounthPanel.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("회원리스트");
		sounthPanel.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button");
		sounthPanel.add(btnNewButton_5);
		
		JList memberJList = new JList();
		memberJList.setModel(new AbstractListModel() {
			String[] values = new String[] {"김경호", "고소미", "김은희", "신명숙", "최경녀", "김봉화", "이소라"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		contentPane.add(memberJList, BorderLayout.WEST);
		
		JPanel loginPanel = new JPanel();
		loginPanel.setBackground(Color.YELLOW);
		contentPane.add(loginPanel, BorderLayout.CENTER);
		loginPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(40, 81, 57, 18);
		loginPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(40, 144, 57, 15);
		loginPanel.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(109, 76, 145, 30);
		loginPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 141, 145, 30);
		loginPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.setBounds(72, 210, 69, 23);
		loginPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("회원가입");
		btnNewButton_1.setBounds(159, 210, 81, 23);
		loginPanel.add(btnNewButton_1);
	}
}
