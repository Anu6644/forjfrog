package Maven;
import java.util.*;
public class basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HI, this is my maven project";
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b = sc.nextInt();
		add obj = new add();
		int c=obj.add(a,b);
		System.out.println(c);
	}

}
