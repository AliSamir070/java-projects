package conditions;

public class If {

	public static void main(String[] args) {
		int loop = 0;
		while(true)
		{
			System.out.println("The value: " + loop);
			if(loop == 5)
			{
				break;
			}
			loop++;
			System.out.println("Running");
		}
       int value = 10;
       if(value<10)
       {
    	   System.out.println("it is true");
       }
       else if(value>10)
       {
    	   System.out.println("it is false");
       }
       else {
    	   System.out.println("None of above");
       }
	}

}
