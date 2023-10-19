package kadai_020;

public class DictionaryExec_Chapter20 {
	 
		public static void main(String[] args) {
		  	
			// 辞書クラスのインスタンス生成
	        Dictionary_Chapter20 dictionary = new Dictionary_Chapter20();

	        // 調べる英単語を配列にセット
	        String[] wordsToSearch = {"apple","banana","grape","orange"};

	        // 辞書を調べる
	        dictionary.searchAndPrintMeaning(wordsToSearch);
		}
		
}
	
