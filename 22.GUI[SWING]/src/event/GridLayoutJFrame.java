package event;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GridLayoutJFrame extends JFrame {

	private JPanel contentPane;
	private JButton b1;
	private JButton b2;
	private JButton b3;
	private JButton bplus;
	private JButton b4;
	private JButton b5;
	private JButton b6;
	private JButton bminus;
	private JButton b7;
	private JButton b8;
	private JButton b9;
	private JButton bmultiple;
	private JButton b0;
	private JButton bresult;
	private JButton bclear;
	private JButton bdivide;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutJFrame frame = new GridLayoutJFrame();
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
	public GridLayoutJFrame() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 291, 355);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(210, 30, 116));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 4, 3, 3));

		b1 = new JButton("1");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b1.getText());
			}
		});

		contentPane.add(b1);

		b2 = new JButton("2");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b2.getText());
			}
		});

		contentPane.add(b2);

		b3 = new JButton("3");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("3");
			}
		});

		contentPane.add(b3);

		bplus = new JButton("+");
		bplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(bplus.getText());
			}
		});

		contentPane.add(bplus);

		b4 = new JButton("4");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b4.getText());
			}
		});

		contentPane.add(b4);

		b5 = new JButton("5");
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b5.getText());
			}
		});

		contentPane.add(b5);

		b6 = new JButton("6");
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b6.getText());
			}
		});

		contentPane.add(b6);

		bminus = new JButton("-");
		bminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("-");
			}
		});

		contentPane.add(bminus);

		b7 = new JButton("7");
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b7.getText());
			}
		});

		contentPane.add(b7);

		b8 = new JButton("8");
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b8.getText());
			}
		});

		contentPane.add(b8);

		b9 = new JButton("9");
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b9.getText());
			}
		});

		contentPane.add(b9);

		bmultiple = new JButton("x");
		bmultiple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("x");
			}
		});

		contentPane.add(bmultiple);

		b0 = new JButton("0");
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle(b0.getText());
			}
		});

		contentPane.add(b0);

		bresult = new JButton("=");
		bresult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("=");
			}
		});

		contentPane.add(bresult);

		bclear = new JButton("c");
		bclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("c");
			}
		});

		contentPane.add(bclear);

		bdivide = new JButton("/");
		bdivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTitle("/");
			}
		});

		contentPane.add(bdivide);
	}

}
