package AlgI;

public class binarySearch {

	public static void main(String[] args) {
		int[] nums = {-1,0,3,5,9,12};
		int target = 9;
		int index= search(nums,target);
		
		System.out.println(target+" exists in nums and its index is "+index);
		
		
	}

	public static int search(int[] nums,int target) {
		int start=0, end=0, len=0,mid=0, result=0;
		
		len = nums.length;
		end = len-1;
		mid = (start+end)/2;
		while(start<=end) {
			if(nums[mid]<target) {
				start = mid+1;
			}else if(nums[mid]==target) {
				result =mid;
				break;
			}else {
				end = mid-1;
			}
			mid =(start+end)/2;
		}
		
		if(start>end) {
			result =0;
		}
		
		
		
		return result;
	}
}
