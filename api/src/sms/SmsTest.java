package sms;

import java.util.HashMap;

import org.json.simple.JSONObject;

import net.nurigo.java_sdk.api.Message;
import net.nurigo.java_sdk.exceptions.CoolsmsException;

public class SmsTest {
	public static void main(String[] args) {
		String api_key = "";
		String api_secret = "";
		Message coolsms = new Message(api_key, api_secret);
		
		// 4 params(to, from, type, text) are mandatory. must be filled
		HashMap<String, String> params = new HashMap<String, String>();
		params.put("to", "01076666677");
		params.put("from", "01047099813");
		params.put("type", "SMS");
		
		String result = "";
		for(int i = 0; i < 6; i++) {
			result += 1 + (int)(Math.random() * 45) + " ";
		}
		
		params.put("text", "로또 당첨되면 반은 내꺼^_^"
				+ result);
		params.put("app_version", "text app 1.2"); // application name and version

		try {
			JSONObject obj = (JSONObject) coolsms.send(params);
			System.out.println(obj.toString());
		} catch (CoolsmsException e) { 
			System.out.println(e.getMessage());
			System.out.println(e.getCode());
		}
		
	}
}
