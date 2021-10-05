package N13;

public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[] = {0,1,2,3,4,5};
		
		try {
			for (int i = 0; i <= array.length; i++)
				System.out.println(array[i]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Fuera de límite " + e.getMessage());
		}
	}

}
