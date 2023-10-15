package kadai_017;

public class KatoExec_Chapter17 {
	
	public static void main(String[] args) {
		//各子クラスのインスタンス化
		KatoTaro_Chapter17     KatoTaro = new KatoTaro_Chapter17();
		KatoIchiro_Chapter17 KatoIchiro = new KatoIchiro_Chapter17();
		KatoHanako_Chapter17 KatoHanako = new KatoHanako_Chapter17();
		
		//setGivenNameメソッドの実行
		KatoTaro.setGivenName();
		KatoIchiro.setGivenName();
		KatoHanako.setGivenName();
		
		//execIntroduceメソッドの実行
		KatoTaro.execIntroduce();
		KatoIchiro.execIntroduce();
		KatoHanako.execIntroduce();
		
	}
	
}
