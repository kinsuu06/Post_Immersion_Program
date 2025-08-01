import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(func(n));
	}
	public static int func(int n){
	    if(n <= 1) return 1;
	    else if(n%2 == 0) {
	        return n+func(n/2);
	    }else{
	        return func((n+1)/2)+func((n-1)/2);
	    }
	}
}

Input - 3 , Output - 4
Input - 4 , Output - 7
Input - 5 , Output - 7
Input - 6 , Output - 10
