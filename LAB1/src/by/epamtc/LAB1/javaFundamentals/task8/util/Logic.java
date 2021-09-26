package by.epamtc.LAB1.javaFundamentals.task8.util;

public class Logic {

    public static void printIndexes(int masA[], int masB[]) {
        for (int i = 0; i < masB.length; i++) {
            System.out.println(binarySearch(masA, 0, masA.length - 1, masB[i]));
        }
    }

    static int binarySearch(int[] arr, int l, int r, int sElem) {
        int m = -1;
        if (sElem <= arr[l])
            return l;
        if (sElem >= arr[r])
            return r;
        while (l <= r) {
            m = (l + r) / 2;
            //System.out.println("l="+l+"r="+r+"m="+m);
            if (sElem >= arr[m] && sElem < arr[m + 1])
                return m + 1;
            if (sElem < arr[m])
                r = m - 1;
            if (sElem > arr[m])
                l = m + 1;
        }
        return m;
    }

}
