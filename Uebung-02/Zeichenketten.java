/**
* @author dkosba2s
*/
public class Zeichenketten {
	public static String grussMitZeit(int stunde, String name) {
		if(stunde < 12) {
			return "Guten Morgen, " + name + "!";
		} else if(stunde >= 18) {
			return "Guten Abend, " + name + "!";
		} else {
			return "Guten Tag, " + name + "!";
		}
	}	
	public static String zitronenEis(int n) {
		String superString = "";
		String z = "Z";
		for(int i = 0; i < n; ++i) {
			superString = superString + "super";
			z = z + "Z";
		}
		return superString + "leckeres " + z + "itroneneis";
	}
}
