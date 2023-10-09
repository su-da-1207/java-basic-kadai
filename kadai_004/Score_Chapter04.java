package kadai_004;

public class Score_Chapter04 {
	public static void main(String args[]) {
		
		
		char[] nameArray = {'A','B','C','D','E','F','G','H','I','J'};
		int[] scoreArray = {10,20,30,40,50,60,70,80,90,100};
		
		int scoreSum = 0;
		
		for(int i = 0; i < nameArray.length; i++) {
			System.out.println(nameArray[i] + "さんの点数は" + scoreArray[i] + "点");
		
			scoreSum += scoreArray[i];
		}
		
		int avg = scoreSum / scoreArray.length;
		System.out.println("テストの平均点は" + avg + "点");
	}

}
