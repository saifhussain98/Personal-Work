package HashMapsRFun;

import java.util.HashMap;

public class GymAccount {

	public static void main(String[] args) {
		
		HashMap<String, String> Account = new HashMap<String, String>();
		Account.put("Fitguy12", "Gym123");
		Account.put("Fitgir45", "DumbbelsRLife");
		Account.put("Swoleninja", "CurlsBeforeGurls321");
		Account.put("Armzkorleone", "BenchKing45");
		Account.put("Bikermike3", "Password123");
		Account.put("Qicksessions", "SwoleGuy12345");
		
		Account.remove("Bikermike3");
		
		System.out.println(Account);
		System.out.println(Account.containsKey("Fitguy12"));
		System.out.println(Account.containsValue("Strongman123"));
		System.out.println(Account.size());
		System.out.println(Account.replace("Swoleninja", "CurlsBeforeGurls"));
		System.out.println(Account);
		System.out.println(Account.keySet());
		System.out.println(Account.values());
		
	}

}
