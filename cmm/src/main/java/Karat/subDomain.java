package Karat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class subDomain {
	public static void main(String[] argv) {

		String[] cpdomains = { "900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org" };
		subdomainVisits(cpdomains);
	}


	public static List<String> subdomainVisits(String[] cpdomains) {
		HashMap<String, Integer> hm = new HashMap();
		for (String str : cpdomains) {
			String[] space = str.split("\\s+");
			int num = Integer.valueOf(space[0]);
			String[] dot = space[1].split("\\.");
			String cumu = "";
			for (int i = dot.length - 1; i >= 0; --i) {
				if (i == dot.length - 1) {
					cumu = dot[i] + cumu;
				} else {
					cumu = dot[i] + "." + cumu;
				}
				hm.put(cumu, hm.getOrDefault(cumu, 0) + num);
			}
		}
		List<String> ret = new ArrayList();
		for (String i : hm.keySet()) {
			ret.add("" + (hm.get(i)) + " " + i);
		}
		return ret;

	}
}
