package searching;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr={12,13,15,22,33,44,55,66};
        int target=20;
        int ans=ceiling(arr,target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
}
