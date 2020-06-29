/**
 * Read JSON file
 */

package stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ReadJSON {

	public static void jsonCall() throws MalformedURLException {
		//define url name
		String urlName = "https://jsonplaceholder.typicode.com/posts";
		//create object for url
		URL url = new URL(urlName);
		HttpURLConnection conn = null;
		try {
			//http connection
			conn = (HttpURLConnection) url.openConnection();
			//set method
			conn.setRequestMethod("GET");
			//print reason code
			System.out.println("Reason code : " + conn.getResponseCode());
			//define line
			String line = " ";
			//read buffer
			InputStreamReader ir = new InputStreamReader(conn.getInputStream());
			BufferedReader br = new BufferedReader(ir);
			//read json - inputstream reader and print to console
			System.out.println("JSON output: ");
			while (br.readLine() != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
			
	}
			
	public static void main(String[] args) throws MalformedURLException {
		jsonCall();
	}

}
