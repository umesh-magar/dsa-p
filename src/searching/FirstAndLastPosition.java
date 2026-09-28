package searching;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
      int[] nums={5,7,7,8,8,10};
      int target=7;
      int[] ans=searchRange(nums,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] searchRange(int[] nums, int target){
        int[] ans={1,-1};
        int first=search(nums,target,true);
        int second=search(nums,target,false);
        ans[0]=first;
        ans[1]=second;
        return ans;
    }
    static int search(int[] arr, int target ,boolean findFirstIndex) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                    ans = mid;
                    if (findFirstIndex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
    }
