package kadai_014;

public class Car_Chapter14 {
	//フィールド
	private int  gear = 1;   //1速から5速のギアを表す
	private int speed = 10;  //ギアチェンジ後の速度を表す
	
	//メソッド
	public void gearChange( int afterGear ) {
		//ギアの値により速度を変える
		if( 1 <= afterGear && afterGear <= 5 ) {
			this.gear = afterGear;
		} else {
			this.gear = 1;
		}
		
		int[] gearSpeeds = { 10, 20, 30, 40, 50 };
        this.speed = gearSpeeds[ gear - 1 ];
        }
			
	public void run() {
		//ギアチャンジ後の速度を表示する
        System.out.println( "ギア1から" + gear + "に切り替えました" );
        System.out.println( "速度は時速" + speed + "kmです" );
    }
}
