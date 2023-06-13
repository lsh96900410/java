import com.itwill.shop.ShopService;
import com.itwill.shop.admin.Product;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;
import com.itwill.shop.product.ProductService;

public class PackageImprotMain {

	public static void main(String[] args) {
		/*
		 *	<< 자동 import 단축키 >> 
		 	  ctr + shift + o 
		 */
		
		ShopService shopService=new ShopService();
		System.out.println(shopService);
		Member member=new Member();
		System.out.println(member);
		MemberService memberService=new MemberService();
		System.out.println(memberService);
		
		System.out.println("----com.itwill.shop.product.Product,com.itwill.shop.product.ProductService----");
		Product shopProduct=new Product();
		System.out.println(shopProduct);
		ProductService productService=new ProductService();
		System.out.println(productService);
		
		System.out.println("----com.itwill.shop.admin.Product,com.itwill.shop.admin.ProductService----");
		com.itwill.shop.admin.Product adminProduct=new com.itwill.shop.admin.Product();
		System.out.println(adminProduct);
		com.itwill.shop.admin.ProductService adminProductService=new com.itwill.shop.admin.ProductService();
		System.out.println(adminProductService);
	}
	
}
