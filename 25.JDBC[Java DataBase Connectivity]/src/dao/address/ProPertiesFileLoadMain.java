package dao.address;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class ProPertiesFileLoadMain {

	public static void main(String[] args) throws Exception{
		/*
			.properties파일을 loading해서 Properties객체[Map]를 만들어준다.
		*/
		
		Properties properties = new Properties();
		/*
		   << 절대경로 >>
		FileInputStream fis =
				new FileInputStream("C:\\2023-05-JAVA-DEVELOPER\\workspaceSE\\25.JDBC[Java DataBase Connectivity]\\src\\application.properties");
		*/ 
		
		/*
			<<클래스경로>>
		*/	
		InputStream fis =ProPertiesFileLoadMain.class.getResourceAsStream("/application.properties");
		properties.load(fis);
		System.out.println(properties);
		
		/*
		 	----------------------
		 	KEY(String)  | value(String)
		 	----------------------
		 	usename		 |  guard
		 	password	 |	1111
			contextPath	 |	/shopping
			shop.title	 |	울트라짱쇼핑몰
		 */
		System.out.println(" Properties size : " +properties.size());
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		String contextPath = properties.getProperty("contextPath");
		String shopTitle = properties.getProperty("shop.title");
		System.out.println(username);
		System.out.println(password);
		System.out.println(contextPath);
		System.out.println(shopTitle);
		
	}

}
