package core;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;

public class ReplaceAllSpaceInStringTest {

	void replaceSpace(String str, int trueLength) {
//		try {
//			System.out.println(URLDecoder.decode(str, "UTF-8"));
//		} catch (UnsupportedEncodingException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String newStr = str.replaceAll(" ", "%20");
		System.out.println(newStr);
		System.out.println(newStr.length());
	}
	
	void replaceSpace2(char[] str, int trueLength) {
		int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
			if(str[i] == ' ') spaceCount++;
		}

		index = trueLength + spaceCount * 2;
		if (trueLength < str.length) str[trueLength] = '\0';
		for (i = trueLength - 1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index - 3;
			} else {
				str[index - 1] = str[i];
				index--;
			}
		}
	}
	
	public static void main(String[] args) {
		ReplaceAllSpaceInStringTest allSpaceInStringTest = new ReplaceAllSpaceInStringTest();
		//allSpaceInStringTest.replaceSpace("Tang Van Can", 10);
		char[] str = "Tang Van Can".toCharArray();
		allSpaceInStringTest.replaceSpace2(str, 9);
		for (char c : str) {
			System.out.println(c);
		}
		System.out.println('\0');
	}

}
