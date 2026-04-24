/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題6  在庫を減らす
 *
 * [問題5]までの表示を行った後で
 * 3種のマカロンそれぞれの在庫を減らす処理を追記し
 * 以下の実行例と同じものを最後に表示してください。
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り22個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り24個
 *
 */

package lesson01.challenge06;

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

		System.out.println("\nそれぞれ何個ずつ買いますか？");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("\nシトロン　　　>");
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

		System.out.println("\n合計個数" + (numstr + numsyk + numpst) + "個");
		System.out.println("合計金額" + (numstr * 250 + numsyk * 280 + numpst * 320) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

	}

}
