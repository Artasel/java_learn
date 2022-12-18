package HomeJave;

/*
Учитывая целочисленный массив numsи целое число val, удалите все вхождения valin nums на месте. Относительный 
порядок элементов может быть изменен.

Поскольку в некоторых языках невозможно изменить длину массива, вместо этого вы должны поместить результат в первую 
часть массива nums. Более формально, если kпосле удаления дубликатов есть элементы, то первые kэлементы numsдолжны 
содержать конечный результат. Не имеет значения, что вы оставляете за пределами первых kэлементов.

Возврат kпосле размещения конечного результата в первыхk слотахnums .

Не выделяйте дополнительное пространство для другого массива. Вы должны сделать это, изменив входной массив на месте с 
помощью O (1) дополнительной памяти.
 */

public class Zad2 {
    public static void main(String[] args) {
        int[] mass = {0,1,2,2,3,0,4,2};  // {0,1,2,2,3,0,4,2}
        int num = 2;
        System.out.println(removeElement(mass, num));
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
    }

    public static int removeElement(int[] nums, int val) {
        int cout = 0;
        Boolean prov = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val && i != cout) {
                nums[cout] = nums[i];
                nums[i] = 0;
                cout += 1;
                prov = false;
            }

            if (nums[i] != val && i == cout && prov == true) {
                cout += 1;
            }
            
            if (nums[i] == val) {
                nums[i] = 0;
            }
        }
        return cout;
    }

}


// for (int x : nums) {
//     System.out.print(x + " ");
// }
// System.out.println();
