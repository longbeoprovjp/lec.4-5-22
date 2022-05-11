
public class fact {
	
    public static int fact(int n) {
			if (n==1) {
				return 1;
			}
			else {
				return n*fact(n-1);
			}
		}
    public static int fib(int n) {
		if ((n==1)||(n==2)) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
    public static int bs(int num,int l, int h) {
    	int m = (l+h)/2;
		if (num>m) {
			return ;
		}
		else if(l>h) {
			
		}
    }
	public static void main(String[] args) {
		int num = 10;
		int [] n = {1,4,6,13,45,57,80,96,100,150};
		int low = n[0];
		int high = n[9];
		System.out.println(fact(4));
	//	System.out.print(fact(0)); //bruh this is just wrong
		System.out.println(fib(4));
		System.out.println(bs(num,low,high));
	}

}
