package lambdaIsFun;

import java.util.ArrayList;

public class LambdaExpressions {

	public static void main(String[] args) {
		    ArrayList<Integer> arrayList = new ArrayList<>();
		    arrayList.add(1);
		    arrayList.add(2);
		    arrayList.add(3);
		    arrayList.add(4);
		    arrayList.add(5);
		    arrayList.add(6);
		    arrayList.add(7);
		    arrayList.add(8);

		    arrayList.forEach(n -> {if (n % 5 == 0) System.out.println(n);});

	}

}
