package fundamentals.chapter4.sec1_method;
/*
 * int型の「年」「月」「日」を受け取り「XXXX年XX月XX日」という形式の日付を出力するメソッドを定義してください。
 * mainメソッドからそのメソッドを使用していくつか日付を表示させてください。
 */
class No003 {
	public static void day(int x,int y,int z) {
		System.out.println(x + "年"+ y + "月"+ z + "日");
	}


	public static void main(String[] args) {

		day(2020,9,22);
		day(2017,11,3);
	}
}
