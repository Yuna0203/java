public class Main {
	public static void main(String[] args) {
		//表示
		System.out.println("すがわら");
		System.out.println("31歳です");
		System.out.println("お酒が好きです");
		System.out.println("31+31の計算をします");
		//計算
		System.out.println(31+31);
		//代入
		int x;
		x = 6;
		System.out.println(x*x*3.14);
		//代入省略化
		int age = 20;
		System.out.println("私の年齢は" + age);
		//再度代入　上書きされる
		age = 31;
		System.out.println("…いや、本当の年齢は" + age);
		//定数にして上書きできないようにする
		final double PI = 3.14;
		//式
		int a = 20;
	  int b = a + 5;
	  System.out.println(a);
	  System.out.println(b);
	  //エスケープシーケンス
	  System.out.println("私の好きな記号は二重引用符（¥"）です");
	  //+1される
	  int a = 100;
	  System.out.println(++a);
	}
}
a