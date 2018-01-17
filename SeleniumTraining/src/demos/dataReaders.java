package demos;

public class dataReaders {
	
	public static void main(String[] args) {
		String[][] arr = utilities.Excel.get("C:\\CodeJava\\Software\\UserLogin.xls");
		
		
		for (String[] row : arr) {
			
			System.out.print("[ ");
			
			for (String element : row) {
				
				System.out.print(element + " ");
			}
			System.out.println("]");
		}
	}

}
