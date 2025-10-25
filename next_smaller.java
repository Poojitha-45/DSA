import java.util.*;

public class next_smaller {
    public static int[] nextsmallelement(int arr[]) {
        int n = arr.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String args[]) {
        int arr[] = {4, 8, 5, 2, 25};
        int ans[] = nextsmallelement(arr);
        System.out.println(Arrays.toString(ans));
    }
}
