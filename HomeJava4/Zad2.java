package HomeJava4;

import java.util.ArrayDeque;

// Учитывая строку path, которая является абсолютным путем (начинающимся с косой '/'черты) к файлу или каталогу в файловой системе в стиле Unix, 
// преобразуйте ее в упрощенный канонический путь.

// В файловой системе в стиле Unix точка '.'относится к текущему каталогу, двойная точка '..'относится к каталогу на уровень выше, а любые 
// несколько последовательных косых черт (т.Е. '//') обрабатываются как одна косая '/'черта. Для этой проблемы любой другой формат периодов, 
// например, '...'обрабатывается как имена файлов / каталогов.

public class Zad2 {
    public static String simplifyPath(String path) {
        ArrayDeque<String> list = new ArrayDeque<>();
        String result = "";
        String[] items = path.split("/");

        for (int i = 1; i < items.length; i++) {
            if (items[i] != "" && !items[i].equals(".")) {
                list.add(items[i]);
                if (items[i].equals("..")) {
                    list.pollLast();
                    list.pollLast();
                }
            }
        }

        while (!list.isEmpty()) {
            if (list.peek() == ".") {
                result += "/";
            } else {
                result += "/" + list.pop();
            }
        }

        if (result.equals("")) {
            return "/";
        }
        return result;
    }

    public static void main(String[] args) {
        String result = "/abc/...";
        System.out.println(simplifyPath(result));
    }
}
