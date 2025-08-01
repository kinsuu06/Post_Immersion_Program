public class Main
{
	 public static void main(String[] args) {
        int n = 4;
        String result = f(n);
        System.out.println(result);  
    }

    public static String f(int n) {
        if (n == 1) {
            return "1";
        }
        String prev = f(n - 1);
        return prev + n + prev;
        
    }

}
