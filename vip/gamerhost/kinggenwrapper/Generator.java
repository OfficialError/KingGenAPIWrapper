/**
 * This is a java file created by Error.
 * @author Error.
 * Created on 28.05.2021 (19:45:22)
 */
package vip.gamerhost.kinggenwrapper;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Generator {
	
	public static final String BASE_URL = "https://kinggen.info/", API_ENDPOINT = BASE_URL + "api/v2/";
	
	public static Account generateAccount(String key) throws GeneratorException {
		ArrayList<String> response = Requests.getResponseBody(API_ENDPOINT + "alt?key=" + key);
		try {
			if (!response.isEmpty()) {
				JsonObject obj = new Gson().fromJson(Util.convertToString(response), JsonObject.class);
				if (obj.has("email") && obj.has("password")) return new Account(obj.get("email").getAsString(), obj.get("password").getAsString());
				else throw new GeneratorException(Util.convertToString(response));
			}
		} catch (Exception e) {
			throw new GeneratorException("Error while generating account.", e);
		}
		throw new GeneratorException("Error while generating account.");
	}
	
}