class Logicalcode{
	public static void main(String[] args){
		int X = 10;
		int Y = 11;
		System.out.println((++X >= Y) && (X < ++Y));
		System.out.println(X);
		System.out.println(Y);
	}
}

