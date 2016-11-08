import java.util.*;

public class StringCalculator {

	private boolean isItEmpty(String str) {
		return str == "";
	}

	public int sum(String str) {
		
		if (isItEmpty(str)) {
			return 0;
		}
		
		return Integer.parseInt(str);
	}

}