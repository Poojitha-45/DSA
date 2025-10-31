import java.util.*;
public class daily_temperatures {
    public static int[] nextHighTemp(int arr[]){
      int n = arr.length;
      int temp[]  = new int[n];
      Stack<Integer> st = new Stack<>();
      for(int i=n-1;i>=0;i--){
        while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
            st.pop();
        }
        if(!st.isEmpty()){
            temp[i] = st.peek()-i;
        }
        st.push(i);
      }
      return temp;
    }
    public static void main(String args[]){
        int arr[] = {73,74,75,71,69,72,76,73};
        System.out.println(" next high temperatures are : " + Arrays.toString(nextHighTemp(arr)));
    }
}
