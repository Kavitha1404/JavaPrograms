import java.util.Arrays;

public class practice {

	public static void main(String[] args) {
//	int[]nums= {14,7,8,56,-89,147,2358,-15};
//	System.out.println(findnoofnumbers(nums));
//
//	}
//	static int findnoofnumbers(int[]nums) {
//		int count=0;
//		for(int num:nums) {
//			if(even(num)) {
//				count++;
//			}
//		}
//		return count;
//	}
//	static boolean even(int num) {
//		int noofdigits=digits(num);
//		return num%2==0;
////		if(num%2==0) {
////			return true;
////		}
////		return false;
//		
//	}
//	static int digits(int num) {
//		int count=0;
//		if(num<0) {
//			num=num*-1;
//		}
//		if(num==0) {
//			return 1;
//		}
////		while(num>0) {
////			count++;
////			num/=10;
////			
////		}
////		return count;
//		return (int)Math.log10(count);
		
		
		
		
		
		// Binary search
		
		
		
//		int[] arr= {-2,0,7,9,14,19,21,24,36,45,60};
//		int target=9;
//		
//		int ans=Binarysearch(arr,target);
//		System.out.println(ans);
//		
//	}
//	static int Binarysearch(int[]arr, int target) {
//		int start=0;
//		int end=arr.length;
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(target>arr[mid]) {
//				start=mid+1;
//			}
//			else if(target<arr[mid]){
//				end=mid-1;
//				
//			}
//			else {
//				return mid;
//			}
//			
//		}
//		return -1;
		
		
		
		
		
		
		
		
		
		
		// ceiling
		
		
//		int[] arr= {-2,0,7,9,14,19,21,24,36,45,60};
//		int target=10;
//		
//		int ans=Binarysearch(arr,target);
//		System.out.println(ans);
//		
//	}
//	static int Binarysearch(int[]arr, int target) {
//		int start=0;
//		int end=arr.length;
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(target>arr[mid]) {
//				start=mid+1;
//			}
//			else if(target<arr[mid]){
//				end=mid-1;
//				
//			}
//			else {
//				return mid;
//			}
//			
//		}
//		return start;
		
		
		
		
		
		//floor
		
//		int[] arr= {-2,0,7,9,14,19,21,24,36,45,60};
//		int target=18;
//		
//		int ans=Binarysearch(arr,target);
//		System.out.println(ans);
//		
//	}
//	static int Binarysearch(int[]arr, int target) {
//		int start=0;
//		int end=arr.length-1;
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(target>arr[mid]) {
//				start=mid+1;
//			}
//			else if(target<arr[mid]){
//				end=mid-1;
//				
//			}
//			else {
//				return mid;
//			}
//			
//		}
//		return end;
		
	
	
		
//		char[] arr= {'a','d','f','h'};
//		char target='h';
//		System.out.println(Binarysearch(arr,target));
//	
//		
//	}
//	static char Binarysearch(char[]arr,char target) {
//		int start=0;
//		int end=arr.length-1;
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(target<arr[mid]) {
//				end=mid-1;
//				
//			}
//			else {
//				start=mid+1;
//			}
//			
//			
//		}
//		
//		return arr[start % arr.length];
//		
		
		
		
//		int[]arr= {12,15,18,21,24,26,29,31,34,38,45};
//		int target=18;
//		System.out.println(orderAgnostics(arr,target));
//	}
//	static int orderAgnostics(int[]arr,int target) {
//		int start=0;
//		int end=arr.length-1;
//		boolean isAsc= (arr[start] < arr[end]);
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(isAsc) {
//				if(target>arr[mid]) {
//					start=mid+1;
//				}
//				else if(target<arr[mid]) {
//					end=mid-1;
//				}
//				else {
//					return mid;
//				}
//			}
//				else {
//					if(target>arr[mid]) {
//						start=mid+1;
//					}
//					else if(target<arr[mid]) {
//						end=mid-1;
//					}
//					else {
//						return mid;
//					}
//					
//				}
//			}
//		
//		return -1;
		
//		
		
		
//		int [] arr= {5,7,7,7,8,8,9,14};
//		int target=7;
//		int[] ans=(findfirstlast(arr,target));
//		System.out.println(Arrays.toString(ans));
//		
//	}
//		
//		public static int[] findfirstlast(int []arr,int target) {
//			int [] ans= {-1,-1};
//			int start=firstoccurence(arr,target,true);
//			int end=firstoccurence(arr,target,false);
//			ans[0]=start;
//			ans[1]=end;
//			return ans;
//			
//			
//		}
//		public static int firstoccurence(int[] arr,int target,boolean firstIndex) {
//			int ans=-1;
//			int start=0;
//		int end=arr.length-1;
//			
//			while(start<=end) {
//				int mid=start+(end-start)/2;
//				if(target>arr[mid]) {
//					start=mid+1;
//				}
//				else if(target<arr[mid]) {
//					end=end-1;
//				}
//				else {
//					 ans=mid;
//					if(firstIndex) {
//						end=mid-1;
//					}
//					else {
//						start=mid+1;
//					}
//					
//				}
//			}
//			return ans;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
//	
//	int[] arr= {5,7,7,7,8,8,9,14};
//	int target=7;
//	int []ans=firstandlast(arr,target);
//	System.out.println(Arrays.toString(ans));
//	
//	
//	}
//	static int[] firstandlast(int[] arr,int target) {
//		int [] ans= {-1,-1};
//		int start=firstoccurence(arr,target,true);
//		int end=firstoccurence(arr,target,false);
//		ans[0]=start;
//		ans[1]=end;
//		return ans;
//	}
//	public static int firstoccurence(int[]arr,int target,boolean firstIndex) {
//		int ans=-1;
//		int start=0;
//		int end=arr.length-1;
//		
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(target>arr[mid]) {
//				start=mid+1;
//			}
//			else if(target<arr[mid]) {
//				end=end-1;
//			}
//			else {
//				ans= mid;
//				if(firstIndex) {
//					end=mid-1;
//				}
//				else {
//					start=mid+1;
//				}
//			}
//		}
//		return ans;
		
		
		
		
		
		// Infinite array
		
		
		
		
//	int[] arr= {3,5,7,9,11,14,15,16,18,19,23,25,27,29,32};
//	int target=29;
//	System.out.println(infinite(arr,target));
//		
//	}
//	
//	static int infinite(int[] arr,int target) {
//		int start=0;
//		int end=1;
//		while(target>arr[end]) {
//			int temp=end+1;
//			 end= end+(end-start+1)*2;
//			start=temp;
//		}
//		
//		return Binarysearch(arr,target,start,end);
//		
//	}
//	static int Binarysearch(int [] arr,int target ,int start,int end ) {
//	
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(target>arr[mid]) {
//				start=mid+1;
//			}
//			else if(target<arr[mid]) {
//				end=end-1;
//			}
//			else {
//				return mid;
//			}
//		}
//		
//		return -1;
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//Mountain peak
		
		
		
		
		
	}
			
		
		
	}


