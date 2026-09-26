package searching;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        int[] arr={44,43,22,11,10,9,8,7,6,5,2};
        int target=2;
        int ans=orderAgnosticBs(arr, target);
        System.out.println(ans);
    }
    static int orderAgnosticBs(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<=arr[end];
        while(start<=end){
            int mid=start+(end-start)/2;
            if (target == arr[mid]) {
                return mid;
            }
            if(isAsc){
                if(target>arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else {
                if(target>arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
