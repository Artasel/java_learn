package HomeJave;

// Вам даны два массива целых nums1чисел и nums2,отсортированные в порядке неубывания,и два целых mчисла и n,
// представляющие количество элементов в nums1и nums2соответственно.

// Объединить nums1 и nums2в единый массив, отсортированный в порядке неубывания.

// Окончательный отсортированный массив не должен быть возвращен функцией,а вместо этого должен храниться внутри 
// массиваnums1.Чтобы учесть это,nums1имеет длинуm+n,где первые mэлементы обозначают элементы,которые должны 
// быть объединены, а последние nэлементы имеют значение 0и должны игнорироваться. nums2имеет длину n.

public class Zad3 {
    public static void main(String[] args) {
        int[] arr = new int[0];
        int[] arr2 = new int[1];
        int numer = 0;
        int numer2 = 1;
        merge(arr, numer, arr2, numer2);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int minNum = 999999999;
        int minInd = 0;
        int cout = 0;
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[cout];
            cout += 1;
        }
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i; j < nums1.length; j++) {
                if (nums1[j] < minNum) {
                    minNum = nums1[j];
                    minInd = j;
                }
            }
            int cont = nums1[i];
            nums1[i] = minNum;
            nums1[minInd] = cont;
            minNum = 999999999;
        }
        for (int x : nums1) {
            System.out.print(x + " ");
        }
    }
}

