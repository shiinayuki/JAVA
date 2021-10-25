/*1? ???????(????????????????????)
* */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class BinarySearch1{
    public static List<Integer> binarySearch(int[] source, int target) {
        ArrayList<Integer> resultList = new ArrayList<>();
        Arrays.sort(source);
        System.out.println(Arrays.toString(source));
        int start = 0;
        int end = source.length - 1;
        int mid;
        while (start < end) {
            mid = (start + end) / 2;
            System.out.println(mid);
            if (source[mid] > target) {
                end = mid;
            } else {
                if (source[mid] < target) {
                    start = mid;
                } else {
                    while (source[mid - 1] == source[mid]) {
                        mid = mid - 1;
                    }
                    resultList.add(mid);
                    while (source[mid] == source[mid + 1]) {
                        resultList.add(mid + 1);
                        mid = mid + 1;

                    }
                    return resultList;
                }
            }
        }
        return resultList;
    }
    public static void main(String[] args) {
        int[] array = {5,6,3,3,3,7,8,1,2,9,3};
        List<Integer> result = BinarySearch1.binarySearch(array,3);
        System.out.println("??????" + result);
    }
}
