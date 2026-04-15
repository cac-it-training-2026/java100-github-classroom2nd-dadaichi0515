/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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

		System.out.println("シトロン　　　" + numstr + "個");
		System.out.println("ショコラ　　　" + numsyk + "個");
		System.out.println("ピスタージュ　" + numpst + "個");

		System.out.println("\n合計個数" + (numstr + numsyk + numpst) + "個");
		System.out.println("合計金額" + (numstr * 250 + numsyk * 280 + numpst * 320) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

	}

}

