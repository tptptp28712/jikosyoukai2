package Ken;

public class Main {
	public static void main(String[] argos){
		// 呼び出し
		Ken.Person person1 = new Ken.Person("鈴木太郎", 20, 1.7, 60);
		    // 使用時
		person1.print();
		 // 呼び出し
		Ken.Person person2 = new Ken.Person("山田花子", 22, 1.5, 40);
		    // 使用時
		person2.print();
		System.out.println("合計"+Person.count+"人です。");
		Person.printCount();
		}
}
