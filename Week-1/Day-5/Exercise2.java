import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(func(n,0));
	}
	public static int func(int n, int sum){
	    if(n == 0) return sum;
	    sum += n%10;
	    return func(n/10, sum);
	}

}

Input - 123   Output - 6
  
