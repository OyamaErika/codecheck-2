package codecheck;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {
		for (int i = 0, l = args.length; i < l; i++) {
			String strNum = args[i];
			Pattern p = Pattern.compile("^[1-9][0-9]*$");
			Matcher m = p.matcher(strNum);
			int num = Integer.valueOf(strNum).intValue();
			if (m.find() && num < 1001) {
				if (num % 3 == 0 && Integer.toString(num).contains("3")) {
					System.out.println("dumb");
				} else if (num % 3 == 0) {
					System.out.println("idiot");
				}else if (Integer.toString(num).contains("3")) {
					System.out.println("stupid");
				} else {
					System.out.println("smart");
				}
			} else {
				System.out.println("invalid");
			}
		}
	}
}
