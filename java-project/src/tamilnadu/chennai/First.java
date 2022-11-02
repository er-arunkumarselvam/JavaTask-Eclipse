package tamilnadu.chennai;

public class First {

	public static void main(String[] args) {
		First first =new First();
		first.displayOne(1);
		//first.displayTwo(0);
		//first.displayThree(3);
		//first.displayFour(25);
	}
		
	void displayOne(int no)
	{
		while(no<=9)
		{
		System.out.print(no+" ");
		no=no+2;
		}
		System.out.print("\n");
	}
	void displayTwo(int no)
	{
		while(no<=8)
		{
		System.out.print(no+" ");
		no=no+2;
		}
		System.out.print("\n");
	}
	void displayThree(int no)
	{
		while(no<=15)
		{
		System.out.print(no+" ");
		no=no+3;
		}
		System.out.print("\n");
	}
	void displayFour(int no)
	{
		while(no>=5)
		{
		System.out.print(no+" ");
		no=no-5;
		}
		System.out.print("\n");
	}

}