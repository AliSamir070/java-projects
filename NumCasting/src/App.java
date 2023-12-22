import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		 byte ByteValue = 20;
		 short ShortValue = 55;
		 int IntValue = 878;
		 long LongValue = 233555;
		 float FloatValue = 6.777f;
		 double DoubleValue = 33.2;
		 IntValue = (int)LongValue;
		 System.out.println(IntValue);
		 DoubleValue = IntValue;
		 System.out.println(DoubleValue);
		 IntValue = (int)FloatValue;
		 System.out.println(IntValue);
	}
    	
}
