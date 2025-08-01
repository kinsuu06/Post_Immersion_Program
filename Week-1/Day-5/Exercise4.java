public class Main
{
	public static void main(String[] args) {
	    int x = 2;
	    int y = 7;
		System.out.println(func(x, y)); // 139
	}
	public static int func(int x, int y){
	    if(x == y) return x*y;
	    return func(x, (x+y)/2) + func((x+y)/2+1, y);
	}
}
