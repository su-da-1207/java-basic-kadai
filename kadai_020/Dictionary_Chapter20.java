package kadai_020;

import java.util.HashMap;

class Dictionary_Chapter20 {
	// 英単語の辞書として機能するHashMap宣言
    private HashMap<String, String> dictionary;

    public Dictionary_Chapter20() {
        dictionary = new HashMap<>();
        // 辞書に単語と意味を追加
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    public String getMeaning(String word) {
        return dictionary.get(word);
    }

    public void searchAndPrintMeaning(String[] wordsToSearch) {
        for (String word : wordsToSearch) {
            String meaning = getMeaning(word);
            if (meaning != null) {
                System.out.println(word + "の意味は" + meaning);
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}

