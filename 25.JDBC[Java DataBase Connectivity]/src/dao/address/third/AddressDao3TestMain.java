package dao.address.third;

import java.util.ArrayList;

public class AddressDao3TestMain {

	public static void main(String[] args) throws Exception{
		AddressDao3 addressDao3 = new AddressDao3();
		System.out.println("1.insert");
		
		int rowCount = addressDao3.insert("삼소라","232-6512","서울");
		System.out.println(">>> insert rowCount : "+rowCount);
		Address insertAddress = new Address(0, "오소라", "235-9685", "강원도");
		rowCount = addressDao3.insert(insertAddress);
		
		System.out.println(">>> insert rowCount : "+rowCount);
		
		System.out.println("2.updateByPrimaryKey");
		rowCount = addressDao3.updateByPrimaryKey(10,"수정님","000-0000","수정구");
		System.out.println(">>> update rowCount : " + rowCount);
		Address updateAddress=new Address(1,"변경님","111-1111","변경구");
		rowCount = addressDao3.updateByPrimaryKey(updateAddress);
		System.out.println(">>> update rowCount : " + rowCount);
		
		System.out.println("3.deleteByPrimaryKey");
		rowCount = addressDao3.deleteByPrimaryKey(26);
		System.out.println(">>> delete rowCount : " + rowCount);
		rowCount = addressDao3.deleteByPrimaryKey(25);
		System.out.println(">>> delete rowCount : " + rowCount);
		
		System.out.println("4.findByPrimaryKey");
		Address findAddress1 = addressDao3.findByPrimaryKey(1);
		System.out.println(" >>> " +findAddress1);
		Address findAddress2 = addressDao3.findByPrimaryKey(2);
		System.out.println(" >>> " +findAddress2);
		
		System.out.println("5.findAll");
		ArrayList<Address> addressList = addressDao3.findAll();
		System.out.println(" >>> : " + addressList);
	}

}
