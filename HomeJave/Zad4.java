package HomeJave;
// Задана входная строка s, изменить порядок следования слова.

// Слово определяется как последовательность символов,не содержащих пробелов.Слова в s будут разделены по крайней мере 
// одним пробелом.

// Возврат строка слов в обратном порядке, объединенная одним пробелом.

// Примечание это s может содержать начальные или конечные пробелы или несколько пробелов между двумя словами.Возвращаемая 
// строка должна содержать только один пробел, разделяющий слова. Не добавляйте лишних пробелов.
public class Zad4 {
    public static void main(String[] args) {
        String x = "Я люблю море";
        System.out.println(reverseWords(x));
    }
    public static String reverseWords(String s) {
        StringBuilder sd = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end -= 1;
                continue;
            }

            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }

            sd.append(" ");
            sd.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (sd.length() > 0) {
            sd.deleteCharAt(0);
        }
        return sd.toString();
    }
}
