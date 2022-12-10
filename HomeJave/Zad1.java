package HomeJave;
/**
 * uchioba
 */
public class Zad1 {
    public static void main(String[] args) {
        String x = "ab";
        String y = "pqrs";
        System.out.println(mergeAlternately(x, y));
    }
        public static String mergeAlternately(String word1, String word2) {
            StringBuilder str = new StringBuilder(word1);
            StringBuilder str2 = new StringBuilder(word2);
            StringBuilder cont2 = new StringBuilder("");
            StringBuilder res = new StringBuilder("");
            Boolean prov = true;
            if (str.length() < str2.length()) {
                StringBuilder cont = str;
                str = str2;
                str2 = cont;
                prov = false;
            }
            if (str.length() != str2.length()) {
                for (int i = str2.length(); i < str.length(); i++) {
                    cont2.append(str.charAt(i));
                }
                for (int i = 0; i < str2.length(); i++) {
                    if (prov) {
                        res.append(str.charAt(i));
                        res.append(str2.charAt(i));
                    }
                    else {
                        res.append(str2.charAt(i));
                        res.append(str.charAt(i));
                    }
                }
            }
            else {
                for (int i = 0; i < str.length(); i++) {
                    res.append(str.charAt(i));
                    res.append(str2.charAt(i));
                }
            }
            return res.append(cont2).toString();
        }
}