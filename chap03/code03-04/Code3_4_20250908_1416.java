
public class Code3_4_20250908_1416 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("あなたの運勢を占います");
		int fortune = new java.util.Random().nextInt(4) + 1;
		if (fortune == 1) {
			System.out.println("大吉だよ！");
		} else if (fortune == 2) {
			System.out.println("中吉だよ！");
		} else if (fortune == 3) {
			System.out.println("吉だよ！");
		} else {
			System.out.println("凶だよ！");
		}
	}

}
