package HomeJave;

// Фраза-это палиндром если после преобразования всех прописных букв в строчные и удаления всех не 
// алфавитно-цифровых 
// символов он читает одинаково вперед и назад. Буквенно-цифровые символы включают буквы и цифры.

// Задана строка s, возвращает true если это палиндром, или false в противном случае.

public class Zad5 {
    public static void main(String[] args) {
        // String x = "A man, a plan, a canal: Panama";
        // System.out.println(isPalindrome(x));
        // System.out.println();
        String y = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(y));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left  = 0;
        int right = s.length() - 1;
        char one = 'в';
        char two = 'в';
        Boolean prov = true;
        while (left  <= s.length()) {
            while (left < s.length()) {
                if (Character.isLetterOrDigit(s.charAt(left))) {
                    one = s.charAt(left);
                    left += 1;
                    break;
                }
                left += 1;
            }

            while (right > 0) {
                if (Character.isLetterOrDigit(s.charAt(right))) {
                    two = s.charAt(right);
                    right -= 1;
                    break;
                }
                right -= 1;
            }
            if (one != two) {  
                prov = false;
                break;
            }
            if (left == right - 1) {
                break;
            }

        }
        return prov;
    }
}
