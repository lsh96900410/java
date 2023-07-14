package statement;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Types;

public class PreparedStatementMain {

	public static void main(String[] args) throws Exception {
		/************** 데이타베이스 접속정보 *************/
		String driverClass ="oracle.jdbc.OracleDriver";
		String url="jdbc:oracle:thin:@182.237.126.19:1521:xe";
		String user="jdeveloper20";
		String password="jdeveloper20";
		/*************************************************/
		
		
		
		
		/******************* select sql ***************************
		 
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();
		int sal1=1000;
		int sal2=4000;
		String job1="SALESMAN";
		String job2="CLERK";
		
		String selectSql1="select empno,ename,job,sal,hiredate from emp"
				+ " where sal>="+ sal1 +"and sal<="+sal2+" and job='"+job1+"' or job='"+job2+"'";
		System.out.println(">> select empno,ename,job,sal,hiredate from emp where sal>=1000 and sal<=4000 and job='SALESMAN' or job='CLERK'");
		ResultSet rs=stmt.executeQuery(selectSql1);
		while(rs.next()) {
			System.out.println(rs.getInt("EMPNO")+"\t"+
						 	   rs.getString("ename")+"\t"+
						 	   rs.getInt("sal")+"\t"+
						 	   rs.getString("JOB"));
		}
		rs.close();
		System.out.println( " ----------- ");
		
		sal1 = 2000;
		sal2 = 5000;
		job1 = "MANAGER";
		job2 = "ANAYLST";
		
		selectSql1=
				 "select empno,ename,job,sal,hiredate from emp"
			    +" where sal>="+ sal1 +"and sal<="+sal2+" and job = '"+job1+"' or job = '"+job2+"'";
		
		rs=stmt.executeQuery(selectSql1);
		while(rs.next()) {
			System.out.println(rs.getInt("EMPNO")+"\t"+
						 	   rs.getString("ename")+"\t"+
						 	   rs.getInt("sal")+"\t"+
						 	   rs.getString("JOB"));
		}
		rs.close();
		****/
	/************************** select sql [prepared Statement] *****************************/
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		
		
		
		
		
		
		/*************** select ********************/
		System.out.println("%%%%%%%%%%%%%%%%%%%% [select] %%%%%%%%%%%%%%%%%%%%");
		// Stirng selectSQl = select empno,ename,job,sal,hiredate from emp where sal>=1000 and sal<=4000 and job ='SALESMAN' or job = 'CLERK' ;
		String selectSql="select empno,ename,job,sal,hiredate from emp where sal>= ? and sal<=? and job=? or job=?";
		PreparedStatement pstmt = con.prepareStatement(selectSql); // 괄호안에 sql 들어감
		
		int sal1=1000;
		int sal2=4000;
		String job1="SALESMAN";
		String job2="CLERK";
		
		pstmt.setInt(1, sal1);
		pstmt.setInt(2, sal2);
		pstmt.setString(3, job1);
		pstmt.setString(4, job2);
		ResultSet rs =pstmt.executeQuery(); //실행할때 sql 안넣음
		while(rs.next()) {
			System.out.println(rs.getInt("EMPNO")+"\t"+
						 	   rs.getString("ename")+"\t"+
						 	   rs.getInt("sal")+"\t"+
						 	   rs.getString("JOB"));
		}
		rs.close();
		System.out.println("-----------");
	sal1=2000;
	sal2=5000;
	job1="MANAGER";
	job2="ANALYST";
	pstmt.setInt(1, sal1);
	pstmt.setInt(2, sal2);
	pstmt.setString(3, job1);
	pstmt.setString(4, job2);
	
	rs =pstmt.executeQuery(); 
	while(rs.next()) {
		System.out.println(rs.getInt("EMPNO")+"\t"+
					 	   rs.getString("ename")+"\t"+
					 	   rs.getInt("sal")+"\t"+
					 	   rs.getString("JOB"));
	}
	rs.close();
	pstmt.close();
	
	System.out.println("%%%%%%%%%%%%%%%%%%%% [delete] %%%%%%%%%%%%%%%%%%%%");
	// String deleteSql = delete from emp where empno=9001;	
	String deleteSql = "delete from emp where empno=?";
	PreparedStatement pstmt0 = con.prepareStatement(deleteSql);
	pstmt0.setInt(1, 9001);
	int rowCount0 = pstmt0.executeUpdate();
	System.out.println(" >> PreparedStatement 9001번 삭제 --> " + rowCount0) ;
	
	pstmt0.setInt(1, 9002);
	rowCount0 = pstmt0.executeUpdate();
	System.out.println(" >> PreparedStatement 9002번 삭제 --> " + rowCount0) ;
	
	pstmt0.setInt(1, 9003);
	rowCount0 = pstmt0.executeUpdate();
	System.out.println(" >> PreparedStatement 9003번 삭제 --> " + rowCount0) ;
	
	pstmt0.setInt(1, 9004);
	rowCount0 = pstmt0.executeUpdate();
	System.out.println(" >> PreparedStatement 9004번 삭제 --> " + rowCount0) ;
	
	pstmt0.close();
	
	System.out.println("%%%%%%%%%%%%%%%%%%%% [insert] %%%%%%%%%%%%%%%%%%%%");
	/************************* 9001 insert ******************************/
	// String insertSql = insert into emp values(9001,'JUNG','MANAGER',7369,to_date('2000/01/01','YYYY/MM/DD'),3000.34,30,40);
	String insertSql1="insert into emp values(?,?,?,?,to_date(?,?),?,?,?)";
	PreparedStatement pstmt1 = con.prepareStatement(insertSql1);
	
	pstmt1.setInt(1,9001);
	pstmt1.setString(2,"JUNG");
	pstmt1.setString(3,"MANAGER");
	pstmt1.setInt(4,7369);
	pstmt1.setString(5,"2000/01/01");
	pstmt1.setString(6,"YYYY/MM/DD");
	pstmt1.setDouble(7,3000.34);
	pstmt1.setInt(8,30);
	pstmt1.setInt(9,40);
	
	int rowCount=pstmt1.executeUpdate();
	System.out.println(">>> PreparedStatement 9001 --> " + rowCount + "행 insert " );
	pstmt1.close();
	
	/********************* 9002 insert *******************************/
	// String insertSql2 ="insert into emp values(9002,'KIM','CLERK',7369,sysdate,6000.34,80,40)";
	String insertSql2 ="insert into emp values(?,?,?,?,sysdate,?,?,?)";
	PreparedStatement pstmt2 = con.prepareStatement(insertSql2); // sql문의 인자 개수가 다르기때문에 재생성
	
	pstmt2.setInt(1,9002);
	pstmt2.setString(2,"KIM");
	pstmt2.setString(3,"CLERK");
	pstmt2.setInt(4,7369);
	pstmt2.setDouble(5,6000.34);
	pstmt2.setInt(6,80);
	pstmt2.setInt(7,40);
	
	int rowCount2 =pstmt2.executeUpdate();
	System.out.println(">>> PreparedStatement 9002--> "+rowCount2 + "행 insert");
	pstmt2.close();
	
	/********************* 9003 insert *******************************/
	// String insertSql3 ="insert into emp values(9003,'DIM','SALESMAN',7369,날짜데이타,8000.99,70,40)";
	String insertSql3 ="insert into emp values(?,?,?,?,?,?,?,?)";
	PreparedStatement pstmt3 = con.prepareStatement(insertSql3); // sql문의 인자 개수가 다르기때문에 재생성
	
	pstmt3.setInt(1,9003);
	pstmt3.setString(2,"DIM");
	pstmt3.setString(3,"SALESMAN");
	pstmt3.setInt(4,7369);
	pstmt3.setDate(5,new Date(System.currentTimeMillis()));
	pstmt3.setDouble(6,8000.99);
	pstmt3.setInt(7,70);
	pstmt3.setInt(8,40);
	
	int rowCount3 =pstmt3.executeUpdate();
	System.out.println(">>> PreparedStatement 9003--> "+rowCount3 + "행 insert");
	pstmt3.close();
	
	/********************* 9004 insert *******************************/
	// String insertSql4 ="insert into emp values(9004,null,null,null,null,null,null,null)";
	String insertSql4 ="insert into emp values(?,?,?,?,?,?,?,?)";
	PreparedStatement pstmt4 = con.prepareStatement(insertSql4); // sql문의 인자 개수가 다르기때문에 재생성
	
	pstmt4.setInt(1,9004);
	pstmt4.setNull(2, Types.VARCHAR);
	pstmt4.setNull(3, Types.VARCHAR);
	pstmt4.setNull(4, Types.INTEGER);
	pstmt4.setNull(5, Types.DATE);
	pstmt4.setNull(6, Types.DOUBLE);
	pstmt4.setNull(7, Types.INTEGER);
	pstmt4.setNull(8, Types.INTEGER);
	
	int rowCount4 =pstmt4.executeUpdate();
	System.out.println(">>> PreparedStatement 9004--> "+rowCount4 + "행 insert");
	pstmt4.close();
	
	System.out.println("%%%%%%%%%%%%%%%%%%%% [update] %%%%%%%%%%%%%%%%%%%%");
	
	// String updateSql="update emp set sal=sal*1.3 where empno >= 7369 and empno <= 7600";
	String updateSql="update emp set sal=sal*? where empno >= ? and empno <= ? ";
	PreparedStatement pstmt5 = con.prepareStatement(updateSql);
	pstmt5.setDouble(1, 0.8);
	pstmt5.setInt(2,7000);
	pstmt5.setInt(3,8000);
	int rowCount5 = pstmt5.executeUpdate();
	System.out.println(">>> PreparedStatement update : " + rowCount5 +"행 업데이트");
	
	pstmt5.close();
	con.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
