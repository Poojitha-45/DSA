import java.util.*;
public class triplesum{
    long countTriplets(int n, int sum, long arr[]) {
        long count =0;
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int start = i+1;
            int end =  n-1;
            while(start<end){
                long cur_sum = arr[i]+arr[start]+arr[end];
                if(cur_sum<sum){
                    count = count+(end-start);
                    start++;
                }else{
                    end--;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        triplesum obj = new triplesum();
        long arr[] = {-2, 0, 1, 3};
        System.out.println(obj.countTriplets(4, 2,arr)); // Output- 2
    }
}
