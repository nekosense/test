public class Main {
	public static void main(String[] args) {
		System.out.println("【数当てゲーム】");
		int ans = new java.util.Random().nextInt(10);
		for (int i = 0; i<5 ;i++ ) {
			System.out.println("【１〜９までの数字を入力してください】");
			int num = new java.util.Scanner(System.in).nextInt();
			if (ans == num) {
				System.out.println("あたり");
				break;
			} else {
				System.out.println("はずれ");
			}
		}
		System.out.println("ゲーム終了");
/*		int selected = new java.util.Scanner(System.in).nextInt();
		switch (selected) {
			case 1:
				System.out.println("検索します");
				break;
			case 2:
				System.out.println("登録します");
				break;
			case 3:
				System.out.println("削除");
				break;
			case 4:
				System.out.println("変更します");
				break;
		}
		int age = 29;
		System.out.println("こんにちわ");
		if (seibetsu == 0) {
			System.out.println("私は男です");
			System.out.println(age + "歳です");
		} else {
			System.out.println("私は女です");
		}
		System.out.println("hello, world!");*/
	}
}
