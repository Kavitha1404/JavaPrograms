
public class Binarysearch {

	public static void main(String[] args) {
//		 //ascending order array
//		int [] arr= {2,5,8,12,16,19,25};
//		int target=8;
//		int ans=Binarysearch(arr,target);
//		System.out.println(ans);
//			
//		
//			}
//
//	 static int Binarysearch(int[] arr, int target) {
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
//				return mid;
//			}
//		}
//		return -1;
//	}
//	}
//   
		
		// Descending
//		int [] arr= {98,78,57,27,13,2,0};
//		int target=27;
//		int ans=Binarysearch(arr,target);
//		System.out.println(ans);
//			
//		
//			}
//
//	 static int Binarysearch(int[] arr, int target) {
//		int start=0;
//		int end=arr.length-1;
//		
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(target<arr[mid]) {
//				start=mid+1;
//			}
//			else if(target>arr[mid]) {
//				end=end-1;
//			}
//			else {
//				return mid;
//			}
//		}
//		return -1;
//	}
//	}
		
		
//		int [] arr= {98,78,57,27,13,2,0};
//		int target=27;
//		int ans=orderAgnostics(arr,target);
//		System.out.println(ans);
//		
//	}
//
//	 static int orderAgnostics(int[] arr, int target) {
//		 int start=0;
//		 int end=arr.length-1;
//		boolean isAsc =arr[start]<arr[end];
//		while(start<=end) {
//			int mid=start+(end-start)/2;
//			if(arr[mid]==target) {
//				return mid;
//			}
//			if(isAsc) {
//			if(arr[mid]>target) {
//				end=mid-1;
//			}
//			else if(arr[mid]<target) {
//				start=mid+1;
//			}
//			
//		}
//			else {
//				if(arr[mid]<target) {
//					end=mid-1;
//				}
//				else if(arr[mid]>target) {
//					start=mid+1;
//				}
//			}
//				
//			}
//		
//		
//		return -1;
//	}
//}
		//Ceiling: Smallest number which is Greater than or equal to target
		
//		int arr[]= {12,14,18,23,56,78,89};
//		int target=24;
//		int ans=Binarysearch(arr,target);
//		System.out.println(ans);
//	}
//
//	 static int Binarysearch(int[] arr, int target) {
//		 int start=0;
//		 int end=arr.length-1;
//		 while(start<=end) {
//			 int mid=start+(end-start)/2;
//			 if(target>arr[mid]) {
//				 start=mid+1;
//			 }
//			 else if(target<arr[mid]) {
//				 end=mid-1;
//			 }
//			 else {
//				 return mid;
//			 }
//		 }
//		
//		return start;
//	}
//}

		
		// Floor: Greatest number which is less than or equal to target
		
//		int arr[]= {12,14,18,23,56,78,89};
//		int target=24;
//		int ans=Binarysearch(arr,target);
//		System.out.println(ans);
//	}
//
//	 static int Binarysearch(int[] arr, int target) {
//		 int start=0;
//		 int end=arr.length-1;
//		 while(start<=end) {
//			 int mid=start+(end-start)/2;
//			 if(target>arr[mid]) {
//				 start=mid+1;
//			 }
//			 else if(target<arr[mid]) {
//				 end=mid-1;
//			 }
//			 else {
//				 return mid;
//			 }
//		 }
//		
//		return end;
//	}
//}
		// Find the first and last occurence 
		
				
		
//	}
//	public  int[] searchRange(int[]nums,int target) {
//		int [] ans= {-1,-1};
//		ans[0]=search(nums,target,true);
//		if(ans[0]!=-1) {
//			ans[1]=search(nums,target,false);
//			
//		}
//		
//		return ans;
//		
//	}
//	public  int search(int [] nums,int target,boolean findstartIndex) {
//		int ans=-1;
//		int start=0;
//		 int end=nums.length-1;
//		 while(start<=end) {
//			 int mid=start+(end-start)/2;
//			 if(target>nums[mid]) {
//				 start=mid+1;
//			 }
//			 else if(target<nums[mid]) {
//				 end=mid-1;
//			 }
//			 else {
//				 ans=mid;
//				 if(findstartIndex) {
//						end=mid-1;
//					}
//					else {
//						start=mid+1;
//					}
//			 }
//		 }
//		
//		return ans;
//		
//	}
//}
	

		
		// Infinite array
		
		
//		int [] arr= {3,5,7,9,15,18,25,27,31,35,38,42,49,58,62,64,79,89,140,180,200};
//		int target=2;
//		System.out.println(ans(arr,target));
//	}
//		public static int ans(int[]arr,int target) {
//			int start=0;
//			int end=1;
//			while(target>arr[end]) {
//				int temp=end+1;
//				 end=end+(end-start+1)*2;
//				start=temp;
//			}
//				
//		return  Binarysearch(arr,target,start,end) ;
//			
//		}
//		
//		
//		 static int Binarysearch(int[] arr, int target,int start,int end) {
//				
//				while(start<=end) {
//					int mid=start+(end-start)/2;
//					if(target>arr[mid]) {
//						start=mid+1;
//					}
//					else if(target<arr[mid]) {
//						end=mid-1;
//					}
//					else {
//						return mid;
//					}
//				}
//				return -1;
//		
//	}
//}
		
		
		
		// Mountain Array
//		int [] arr= {1,5,8,9,7,6,2};
//		System.out.println(findIndexofmountainArray(arr));
//		
//	}	
//  public static int findIndexofmountainArray(int [] arr) {
//	  int start=0;
//	  int end = arr.length-1;
//	  while(start<end) {
//		  int mid=start+(end-start)/2;
//		  if(arr[mid]>arr[mid+1]) {
//			  end=mid;
//		  }
//		  else {
//			  start=mid+1;
//		  }
//		  
//		  
//	  }
//	  return start;
//	  
//  }
//		
//		
//		
//	}
		
		
//	int arr[]= {9,10,12,2,4,5,7,8};
//	int target=4;
//	System.out.println(search(arr,target));
//		
//	}
//	static int search(int[]nums,int target) {
//		int pivot=findpivot(nums);
//		if(pivot==-1) {
//			return binarysearch(nums,target,0,nums.length-1);
//		}
//		if(nums[pivot]==target) {
//			return pivot;
//		}
//		if(target>=nums[0]) {
//			return binarysearch(nums,target,0,pivot-1);
//			
//		}
//		
//		return binarysearch(nums,target,pivot+1,nums.length-1);
//	}
//
//	  static int binarysearch(int[] nums, int target, int start, int end) {
//		  while(start<=end) {
//				int mid=start+(end-start)/2;
//				if(target>nums[mid]) {
//					start=mid+1;
//				}
//				else if(target<nums[mid]) {
//					end=end-1;
//				}
//				else {
//					return mid;
//				}
//			}
//			return -1;
//		  
//		
//		
//	}
//	static int findpivot(int[] arr) {
//		 int start=0;
//		 int end=arr.length-1;
//		 while(start<=end) {
//			 int mid=start+(end-start)/2;
//			 if(arr[mid]>arr[mid+1]) {
//				 return mid;
//			 }
//			 if(arr[mid]<arr[mid-1]) {
//				 return mid-1;
//			 }
//			 if(start>arr[mid]) {
//				 end=mid-1;
//			 }
//			 else {
//				 start=mid+1;
//			 }
//		 }
//		
//		return -1;
//	}
//}


	}
}
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
     

