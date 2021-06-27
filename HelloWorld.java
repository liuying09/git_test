package xxx;

public class HelloWorld {
	
	public static void main(String[] args) {
		
		int[][] x = new int[3][3];
		System.out.println("測試用");
		

		private String test = "測試衝突";
		
		
		for( int i = 0 ; i < 3 ; i++){
			for( int j = 0 ; j < 3 ; j++){
			
			x[i][j] = (int)(Math.random() * 31);
			System.out.print(x[i][j] + " ");

			}
			System.out.println();
		}
	}
	
}
