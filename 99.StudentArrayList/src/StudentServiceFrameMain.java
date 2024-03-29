


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class StudentServiceFrameMain  extends JFrame{
	/*
	 * 1.Service객체(업무실행객체) 변수선언
	 */
	
	private StudentService studentService;
	
	private JTextField noTF;
	private JTextField gradeTF;
	private JTextField nameTF;
	private JButton claculateTotAvgGradeBtn;
	private JButton calculateRankBtn;
	private JButton findAllStudentsBtn;
	private JButton findByNoStudentBtn;
	private JButton findByGradeStudentsBtn;
	private JButton findByNameStudentsBtn;
	private JButton sortStudentByTotAscBtn;
	private JButton sortByNameStudentsAscBtn;
	public StudentServiceFrameMain() {
		
		super("학생관리 프로그램");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setSize(800, 550);
		getContentPane().setLayout(null);
		
		claculateTotAvgGradeBtn = new JButton("1. 전체학생총점,평균,평점계산");
		claculateTotAvgGradeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("1. 전체학생총점,평균,평점계산");
				studentService.calculate();
				
			}
		});
		claculateTotAvgGradeBtn.setBounds(42, 34, 700, 40);
		getContentPane().add(claculateTotAvgGradeBtn);
		
		calculateRankBtn = new JButton("2. 전체학생 총점으로 석차계산");
		calculateRankBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("2. 전체학생 총점으로 석차계산");
				studentService.calculateRank();
			}
		});
		calculateRankBtn.setBounds(42, 89, 700, 46);
		getContentPane().add(calculateRankBtn);
		
		findAllStudentsBtn = new JButton("3. 전체학생반환");
		findAllStudentsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("3. 전체학생반환출력");
				ArrayList<Student> studentList =
						studentService.getStudentList();
				Student.headerPrint();
				for (Student student : studentList) {
					student.print();
				}
				
			}
		});
		findAllStudentsBtn.setBounds(42, 150, 700, 40);
		getContentPane().add(findAllStudentsBtn);
		
		findByNoStudentBtn = new JButton("4.번호 입력하면 학생한명 반환");
		findByNoStudentBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("4.번호 입력하면 학생한명 반환  ");
				String noStr=noTF.getText();
				if(noStr.equals("")) {
					JOptionPane.showMessageDialog(null, "번호를 입력하세요");
					noTF.requestFocus();
					return;
				}
				int no =Integer.parseInt(noStr);
			Student findStudent=studentService.findByNo(no);
			
			
			Student.headerPrint();
			if(findStudent!=null) {
			findStudent.print();
			}else{
				System.out.println(">> 존재하지않는 번호");
			}
			}
		});
		
		findByNoStudentBtn.setBounds(185, 205, 557, 39);
		getContentPane().add(findByNoStudentBtn);
		
		findByGradeStudentsBtn = new JButton("5. 학점 입력하면 학생들 반환");
		findByGradeStudentsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("5. 학점 입력하면 학생들 반환 ");
				
				String gradeStr=gradeTF.getText();
				ArrayList<Student> studentList
				=studentService.findByGrade(gradeStr.charAt(0));
				Student.headerPrint();
				for (Student student : studentList) {
					student.print();
				}
				
				
			}
		});
		findByGradeStudentsBtn.setBounds(185, 259, 557, 40);
		getContentPane().add(findByGradeStudentsBtn);
		
		findByNameStudentsBtn = new JButton("6.  이름KIM 인 학생들 반환");
		findByNameStudentsBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("6.  이름KIM 인 학생들 반환 ");
				
			}
		});
		findByNameStudentsBtn.setBounds(185, 314, 557, 40);
		getContentPane().add(findByNameStudentsBtn);
		
		sortStudentByTotAscBtn = new JButton("7. 학생총점으로 오름차순정렬");
		sortStudentByTotAscBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("7. 학생총점으로 오름차순정렬");
				
			}
		});
		sortStudentByTotAscBtn.setBounds(42, 369, 700, 40);
		getContentPane().add(sortStudentByTotAscBtn);
		
		sortByNameStudentsAscBtn = new JButton("8. 학생이름순으로 오름차순정렬");
		sortByNameStudentsAscBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("8. 학생이름순으로 오름차순정렬");
			}
		});
		sortByNameStudentsAscBtn.setBounds(42, 424, 700, 41);
		getContentPane().add(sortByNameStudentsAscBtn);
		
		noTF = new JTextField();
		noTF.setFont(new Font("D2Coding", Font.BOLD, 18));
		noTF.setHorizontalAlignment(SwingConstants.CENTER);
		noTF.setBounds(42, 208, 131, 33);
		getContentPane().add(noTF);
		noTF.setColumns(10);
		
		gradeTF = new JTextField();
		gradeTF.setBounds(42, 265, 131, 30);
		getContentPane().add(gradeTF);
		gradeTF.setColumns(10);
		
		nameTF = new JTextField();
		nameTF.setBounds(42, 320, 131, 30);
		getContentPane().add(nameTF);
		nameTF.setColumns(10);
		setVisible(true);
		
		
		/*
		 * 2.Service객체(업무실행객체) 생성
		 */
		studentService = new StudentService();
		
		
		
	}
	public static void main(String[] args) {
		
		new StudentServiceFrameMain();
	}
}