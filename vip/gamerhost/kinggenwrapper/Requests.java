package vip.gamerhost.kinggenwrapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

import javax.net.ssl.HttpsURLConnection;

public class Requests {
	
	public static ArrayList<String> getResponseBody(String url) {
		ArrayList<String> response = new ArrayList<>();
		try {
			HttpsURLConnection connection = (HttpsURLConnection) new URL(url).openConnection();
			connection.addRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64; rv:25.0) Gecko/20100101 Firefox/25.0");
			connection.connect();
			response.add(connection.getResponseMessage());
			BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			for (String s; (s = in.readLine()) != null;) response.add(s);
			connection.disconnect();
		} catch (Exception ignored) {}
		return response;
	}
	
}