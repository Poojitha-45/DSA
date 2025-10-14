import java.util.*;
public class target_arr {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        int start = 0;
        long sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            while (sum > target && start < i) {
                sum -= arr[start];
                start++;
            }
            if (sum == target) {
                al.add(start + 1);
                al.add(i + 1);
                return al;
            }
        }
        al.add(-1);
        return al;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        System.out.println(subarraySum(arr, target));
    }
}

