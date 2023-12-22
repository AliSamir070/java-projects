
public class App {

	public static void main(String[] args) {
		int [] values;
		values = new int[3];
		values[0] = 13;
		values[1] = 11;
		values[2] = 14;
		System.out.println(values[0]);
		System.out.println(values[1]);
		System.out.println(values[2]);
		for(int i = 0 ; i<values.length ; i++)
		{
			System.out.println(values[i]);
		}
		int [] arr = {2,7,5,3};
		for(int i = 0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		String [] fruits;
		fruits = new String[4];
		fruits[0] = "Apple";
		fruits[1] = "Banana";
		fruits[2] = "Pear";
		fruits[3] = "Mango";
		for(String f : fruits)
		{
			System.out.println(f);
		}
		//Multi_dimensional array
		int [][] matrix = {{1,2,3} , {4,5} , {6,7,8,9}};
		System.out.println(matrix[1][1]);
		System.out.println(matrix[0][2]);
		for(int i=0 ; i<matrix.length ; i++)
		{
			for(int j=0 ; j<matrix[i].length ; j++)
			{
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
