/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;


	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Patisserie {
		public static void main(String[] args) throws IOException {
			System.out.println("大変お待たせしました。");
			System.out.println("【ポエール・ネルメ】");
			System.out.println("ただいまより開店です！！");
			System.out.println();
			System.out.println("本日のおすすめ商品です。");
			System.out.println();
			int str = 30;
			int syk = 30;
			int pst = 30;

			System.out.println("シトロン\t　\\250・・・残り" + str + "個");
			System.out.println("ショコラ\t　\\280・・・残り" + syk + "個");
			System.out.println("ピスタージュ　\\320・・・残り" + pst + "個");

			System.out.println("それぞれ何個ずつ買いますか？");

			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("シトロン　　　>");
			String str1 = reader.readLine();
			int numstr = Integer.parseInt(str1);

			System.out.print("ショコラ　　　>");
			String syk1 = reader.readLine();
			int numsyk = Integer.parseInt(syk1);

			System.out.print("ピスタージュ　>");
			String pst1 = reader.readLine();
			int numpst = Integer.parseInt(pst1);

			System.out.println("\nシトロン　　　" + numstr + "個");
			System.out.println("ショコラ　　　" + numsyk + "個");
			System.out.println("ピスタージュ　" + numpst + "個");

			System.out.println("\nをお買い上げですね");
			System.out.println("承りました。");
		}

}
