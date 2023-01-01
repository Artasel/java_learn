package HomeJava5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Дан список paths информации о каталоге,включая путь к каталогу,и все файлы с содержимым в этом каталоге,возвращают 
// все дубликаты файлов в файловой системе с точки зрения их путей. Вы можете вернуть ответ в любой заказ.

// Группа повторяющихся файлов состоит по крайней мере из двух файлов с одинаковым содержимым.

// Единственная строка информации о каталоге во входном списке имеет следующий формат:

// "root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
// Это означает,что есть n Файлы(f1.txt,f2.txt...fn.txt)с содержанием(f1_content,f2_content...fn_content)
// соответственно в каталоге"root/d1/d2/.../dm".Обратите внимание,что n>=1 и m>=0. Если m=0 это означает,что 
// каталог является только корневым каталогом.

// Вывод представляет собой список групп повторяющихся путей к файлам.Для каждой группы он содержит все пути к файлам 
// с одинаковым содержимым. Путь к файлу - это строка, имеющая следующий формат:

// "directory_path/file_name.txt"

public class Zad2 {

    public static List<List<String>> findDuplicate(String[] paths) {
        // content - paths
        Map<String, List<String>> map = new HashMap<>();
        for (var path : paths) {
            String[] info = path.split(" ");
            String dir = info[0];
            for (int i = 1; i < info.length; i++) {
                String file = info[i];
                int start = file.indexOf('(');
                int end = file.length();
                String content = file.substring(start + 1, end);
 
                map.putIfAbsent(content, new ArrayList<>());
                map.get(content).add(dir + "/" + file.substring(0, start));
            }
        }
 
        List<List<String>> ans = new ArrayList<>();
        for (var e : map.entrySet()) {
            if (e.getValue().size() > 1) {
                ans.add(e.getValue());
            }
        }
        return ans;
    }

    // public static List<List<String>> findDuplicate(String[] paths) {
    //     List<String> ans = new ArrayList<>();
    //     List<String> ans2 = new ArrayList<>();
    //     List<List<String>> result = new ArrayList<>();
    //     HashMap<String, String> map = new HashMap<>();

    //     for (int i = 0; i < paths.length; i++) {
    //         String[] items = paths[i].split("[()]");
    //         String name = "";

    //         String[] items2 = items[0].split(" ");
    //         name = items2[0];
    //         String cont = name + "/" + items2[1];
    //         cont = "\"" + cont + "\"";
    //         if (!map.containsKey(items[1])) {
    //             map.put(items[1], cont);
    //         } else {
    //             String container = map.get(items[1]);
    //             container += "," + cont;      
    //             map.put(items[1], container);
    //         }

    //         if (items.length > 2) {
    //             if (!items[2].contains("root")) {
    //                 String[] items3 = items[2].split(" ");
    //                 name += "/" + items3[1];
    //                 name = "\"" + name + "\"";
    //             }
    //             if (!map.containsKey(items[3])) {
    //                 map.put(items[3], name);
    //             } else {
    //                 String container = map.get(items[3]);
    //                 container += "," + name;     
    //                 map.put(items[3], container);
    //             }
    //         }
    //     }

    //     int cout = 0;
    //     for (String str : map.values()) {
    //         if (cout == 0) {
    //             ans.add(str);
    //             result.add(ans);
    //         } else {
    //             ans2.add(str);
    //             result.add(ans2);
    //         }
    //         cout++;
    //     }
    //     return result;
    // }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        List<List<String>> list2 = new ArrayList<>();
        list.add("root/a 1.txt(abcd) 2.txt(efgh)");
        list.add("root/c 3.txt(abcd)");
        list.add("root/c/d 4.txt(efgh)");

        int cout = 0;
        String[] arr = new String[list.size()];
        for (String word : list) {
            arr[cout] = word;
            cout++;
        }

        list2.addAll(findDuplicate(arr));

        System.out.println(list2);
    }



    @Override
    public String toString() {
        return "Zad2 []";
    }
}
