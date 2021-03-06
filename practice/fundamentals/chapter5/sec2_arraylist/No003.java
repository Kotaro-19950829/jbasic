package fundamentals.chapter5.sec2_arraylist;

import java.util.ArrayList;

/*
 * ArrayListのコンストラクタ「ArrayList(int initialCapacity) 」を使用して、要素数5の配列を作成してください。
 * 作成したArrayListに、任意の値を6個代入して、拡張for文を使用して1つづつ表示するプログラムを作成してください。
 */
public class No003 {
	public static void main(String[] args) {

			ArrayList<Integer> num = new ArrayList<Integer>(5);

			num.add(52);
			num.add(6);
			num.add(21);
			num.add(46);
			num.add(18);
			num.add(11);

			for(int i : num) {
				System.out.println(i);
		}
	}
}
