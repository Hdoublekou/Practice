package Practice;

public class PracticeFour {
	
	public static void main(String []args) {
		
		int []array=new int[] {1, 2, 6, 7, 9, 6, 2, 1};
		
		
		for(int i=0;i<array.length;i++) {

			for(int j=0;j<array.length;j++) {
				
				if(i==j) {
					continue;
					
				}
				if(array[i]==array[j]) {
					
					System.out.println(array[i]);
				}
			}
			
		}
	}

}
