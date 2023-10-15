package kadai_017;

public class KatoExec_Chapter17 {
	
	public static void main(String[] args) {
		//各子クラスのインスタンス化
		KatoTaro_Chapter17     KatoTaro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 KatoIchiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 KatoHanako = new KatoHanako_Chapter17();
		
		KatoTaro.familyName= "加藤";
		KatoIchiro.familyName = "加藤";
		KatoHanako.familyName = "加藤";
		
		KatoTaro.address = "東京都中野区〇✕";
		KatoIchiro.address = "東京都中野区〇✕";
		KatoHanako.address = "東京都中野区〇✕";
		
		//setGivenNameメソッドの実行
		KatoTaro.setGivenName("太郎");
		KatoIchiro.setGivenName("一郎");
		KatoHanako.setGivenName("花子");
		
		//execIntroduceメソッドの実行
		KatoTaro.execIntroduce();
		KatoIchiro.execIntroduce();
		KatoHanako.execIntroduce();
		
	}
	
}
