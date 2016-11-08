import java.util.*;

public class StringCalculator {

	/**
	*	Check if string is empty
	* @param str is the String to check if empty
	* @return true if str is empty, else false
	*/
	private boolean isItEmpty(String str) {
		return str == "";
	}

	private String[] splitStringToArray(String str) {

		String[] arrStr = str.split(",");

		return arrStr;
	}

	private int[] strArrToIntArr(String ... arrStr) {

		int[] arrInt = new int[arrStr.length];

		for (int i = 0; i < arrStr.length; i++) {
			arrInt[i] = Integer.parseInt(arrStr[i]);
		}

		return arrInt;
	}

	private int sumArray(int ... arrInt){

		int sumArray = 0;

		for (int i = 0; i < arrInt.length; i++) {
			sumArray += arrInt[i];
		}

		return sumArray;
	}

	public int sum(String str) {
		
		if (isItEmpty(str)) {
			return 0;
		}

		String[] arrStr = splitStringToArray(str);
		System.out.println(arrStr[0]);
		int[] arrInt = strArrToIntArr(arrStr);

		return sumArray(arrInt);
	}
}