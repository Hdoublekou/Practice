package Practice;

public class PracticeThree {

	//配列 {1, 2, 6, 7, 9, 6, 2, 1} の最⼤値、最⼩値、和、平均値を求める。

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 6, 7, 9, 6, 2, 1 };

		float sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];

			}
		}
		int min = Integer.MAX_VALUE;
		for (int j = 0; j < array.length; j++) {
			if (array[j] < min) {
				min = array[j];
			}
		}
		for (int z=0;z<array.length;z++) {
			
			sum= sum +array[z];
			
		}
		float avg =sum/ array.length;
		
		System.out.println("平均值="+avg);
		System.out.println("最大值="+max);
		System.out.println("最小值="+min);	}

}
