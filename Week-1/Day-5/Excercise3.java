import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int x = 5;
	    int y = 3;
		System.out.println(func(x, y));
	}
	public static int func(int x, int y){
	    if(y==0 || y==x) return 1;
	    return func(x-1,y)+func(x-1,y-1);
	}
	
}
Output - 10
