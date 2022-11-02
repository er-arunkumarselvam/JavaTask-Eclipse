package tamilnadu.chennai;

public class Second {
	public static void main(String[] args) {
	Second object = new Second();
	object.numbers(1);
	object.numbers2(1);
	}
	void numbers(int no)
	{
		while(no<=5)
		{
			System.out.print(1 + " ");
			no=no+1;
		}
		System.out.println("\n");
	}
	void numbers2(int no)
	{
		while(no<=5)
		{
			System.out.print(no+ " ");
			no=no+1;
		}
	}
}
