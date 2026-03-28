package problems.array;

//You are given an array arr, replace every element in that array with the greatest element among the elements to its right, and replace the last element with -1.
public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {
        int[] arr = {2, 34, 5, 3, 1, 2, 2};
        int[] result = replaceElements(arr);

        for (int j : result) {
            System.out.print(j + " ");
        }
    }

    public static int[] replaceElements(int[] arr) {
        int currentMax = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = currentMax;
            currentMax = Math.max(currentMax, temp);
        }
        return arr;
    }
}
