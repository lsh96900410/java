import java.util.Arrays;
public class myinfo {

	public static void main(String[] args) {
		 int arr[] = {4,23,33,15,17,19};
	        Arrays.sort(arr);
	        
	        for (int i : arr) {
	            System.out.print("["+i+"]");
	        }
	       
	        String arr1[] = {"apple","orange","banana","pear","peach","melon"};
	        Arrays.sort(arr1);
	        
	        for (String i : arr1) {
	            System.out.print("["+i+"]");
	        }
	}

}
