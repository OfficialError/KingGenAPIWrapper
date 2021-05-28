/**
 * This is a java file created by Error.
 * @author Error.
 * Created on 28.05.2021 (19:50:13)
 */
package vip.gamerhost.kinggenwrapper;

import java.util.ArrayList;

public class Util {
	
	public static String convertToString(ArrayList<String> array) {
		StringBuilder builder = new StringBuilder();
		array.forEach(s -> builder.append(s));
		return builder.toString();
	}
	
}