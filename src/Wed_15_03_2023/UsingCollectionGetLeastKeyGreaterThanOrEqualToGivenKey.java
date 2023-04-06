package Wed_15_03_2023;

import java.util.Map;
import java.util.TreeMap;

public class UsingCollectionGetLeastKeyGreaterThanOrEqualToGivenKey {

	static void getLeastKeyGreaterThanOrEqualToGivenKey() {
		Map<Integer,String> values=new TreeMap<>();
		values.put(10, "sai");
		values.put(20, "prasanna");
		values.put(30, "yamini");
		values.put(40, "shiva");
		values.put(30, "aruna");
		System.out.println(values);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getLeastKeyGreaterThanOrEqualToGivenKey();
	}

}
