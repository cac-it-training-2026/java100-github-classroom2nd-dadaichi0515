/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題8 閉店作業を行う
 *
 * 閉店時間となったため、閉店メッセージを表示し
 * 売上の割合を確認します。
 * 以下の実行例を参考に処理を追記、改変してください。
 * （%の表示は小数第一位切り捨てで行います。）
 *
 * <実行例>
 *
 * ～～～～～～～～～省略～～～～～～～～～～～
 *
 * をお買いあげですね。
 * 承りました。
 *
 * 本日のおすすめ商品です。
 *
 * シトロン      \250 ・・・ 残り25個
 * ショコラ      \280 ・・・ 残り28個
 * ピスターシュ  \320 ・・・ 残り27個
 *
 * 閉店時間となりました。
 * またのお越しをお待ちしております。
 *
 * 売上の割合
 * 売上合計      \2470
 *
 * 内訳
 * シトロン      \1250・・・ 50%
 * ショコラ      \420・・・ 17%
 * ピスターシュ  \800・・・ 32%
 *
 */

package lesson01.challenge08;

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
		double numstr = Double.parseDouble(str1);

		System.out.print("ショコラ　　　>");
		String syk1 = reader.readLine();
		double numsyk = Double.parseDouble(syk1);

		System.out.print("ピスタージュ　>");
		String pst1 = reader.readLine();
		double numpst = Double.parseDouble(pst1);

		System.out.println("\nシトロン　　　" + numstr + "個");
		System.out.println("ショコラ　　　" + numsyk + "個");
		System.out.println("ピスタージュ　" + numpst + "個");

		double goukei = (numstr + numsyk + numpst);

		System.out.println("\n合計個数" + goukei + "個");
		System.out.println("合計金額" + (int) (numstr * 250 + numsyk * 280 + numpst * 320) + "円");

		System.out.println("\nをお買い上げですね。");
		System.out.println("承りました。");

		System.out.println("\n本日のおすすめ商品です。");
		System.out.println("シトロン\t　\\250・・・残り" + (int) (str - numstr) + "個");
		System.out.println("ショコラ\t　\\280・・・残り" + (int) (syk - numsyk) + "個");
		System.out.println("ピスタージュ　\\320・・・残り" + (int) (pst - numpst) + "個");

		System.out.println("\n閉店時間となりました");
		System.out.println("またのお越しをお待ちしております");
		System.out.println("\n売上の割合");
		System.out.println("売上合計　　　\\" + (int) (numstr * 250 + numsyk * 280 + numpst * 320) + "円");

		System.out.println("\n内訳");
		System.out.println("シトロン　　　\\" + (int) (numstr * 250) + "・・・" + (int) (numstr / goukei * 100) + '%');
		System.out.println("ショコラ　　　\\" + (int) (numsyk * 280) + "・・・" + (int) (numsyk / goukei * 100) + '%');
		System.out.println("ピスタージュ　\\" + (int) (numpst * 320) + "・・・" + (int) (numpst / goukei * 100) + '%');

	}

}
