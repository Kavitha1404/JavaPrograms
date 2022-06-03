import java.util.Arrays;

public class LinearSearch{

	public static void main(String[] args) {
		// return the index; (Searching the target)
		
		
//	 int [] arr= {17,15,85,16,14};
//	 int target=15;
//	int ans=LinearSearch(arr,target);
//	System.out.println(ans);
//
//	
//	
//
//	
//	}
//
//	 static int LinearSearch(int[] arr, int target) {
//		 
//		 if(arr.length==0) {
//			 return -1;
//		 }
//		for(int index=0;index<arr.length;index++) {
//			int element=arr[index];
//			if(element ==target) {
//				return index;
//			}
//			
//		}
//		return -1;
//	}
//}

	 
	 
		// return the element; (Searching the target)
		
	 
	 
//	 int [] arr= {17,15,85,16,14};
//	 int target=15;
//	int ans=LinearSearch(arr,target);
//	System.out.println(ans);
//
//	
//	
//
//	
//	}
//
//	 static int LinearSearch(int[] arr, int target) {
//		 
//		 if(arr.length==0) {
//			 return -1;
//		 }
//		for(int element:arr) {
//			if(element ==target) {
//				return element;
//			}
//			
//		}
//		return -1;
//	}
//
//}
		
		
		// return the true or false; (Searching the target)
		
		
//		 int [] arr= {17,15,85,16,14};
//		 int target=15;
//		boolean ans=LinearSearch(arr,target);
//		System.out.println(ans);
//
//		
//		
//
//		
//		}
//
//		 static boolean LinearSearch(int[] arr, int target) {
//			 
//			 if(arr.length==0) {
//				 return false;
//			 }
//			for(int element:arr) {
//				if(element ==target) {
//					return true;
//				}
//				
//			}
//			return false;
//		}
//	
//	}
//		
		// return the character in the string; (Searching the target)
//		String str="Kunal";
//		char target='u';
//		boolean ans=search(str,target);
//		System.out.println(ans);
//	}
//
//	 static boolean search(String str, char target) {
//		 if(str.length()==0) {
//			 return false;
//		 }
//		 for(int i=0;i<str.length();i++) {
//			 if(target==str.charAt(i)) {
//				 return true;
//			 }
//		 }
//		
//		return false;
//	}
//}
		
		
		
		
 //  using for each loop
		
		
		
		
//		String str="Kunal";
//		char target='u';
//		boolean ans=search(str,target);
//		System.out.println(Arrays.toString(str.toCharArray()));
//		System.out.println(ans);
//	}
//
//	 static boolean search(String str, char target) {
//		 if(str.length()==0) {
//			 return false;
//		 }
//		 for(char ch:str.toCharArray()) {
//			 if(ch==target) {
//				 return true;
//			 }
//		 }
//		
//		return false;
//	}
//}

		
		
		// search In range
//		int [] arr= {17,15,85,16,14};
//		 int target=15;
//		 int start=2;
//		 int end=5;
//		int ans=LinearSearch(arr,target,start,end);
//		System.out.println(ans);
//	
//		
//		
//	
//		
//		}
//	
//		 static int LinearSearch(int[] arr, int target, int start, int end) {
//			 
//			 if(arr.length==0) {
//				 return -1;
//			 }
//			for(int index=start;index<end;index++) {
//				int element=arr[index];
//				if(element ==target) {
//					return index;
//				}
//				
//			}
//			return -1;
//		}
//	}
		
		
		
		
//		// Min and Max;
//		int [] arr= {17,15,85,16,14};
//		int min=arr[0];
//		int Max=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]<min) {
//				min=arr[i];
//			}
//			
//			}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>Max) {
//				Max=arr[i];
//			}
//		}
//		System.out.println("Minimum Value in the array is:"+min);
//		System.out.println("Maximum valuein the array is:"+Max);
//	}
//}
	
		
		// searching in 2D Arrays:
//		int [][]arr= {
//				{14,12,6},
//				{6,5,8},
//				{8,7,4},
//				{9,6}
//		};
//		
//		int target=6;
//		int []ans=search(arr,target);
//		System.out.println(Arrays.toString(ans));
//	}
//
//	 static int []search(int[][] arr, int target) {
//		for(int row=0;row<arr.length;row++) {
//			for(int col=0;col<arr[row].length;col++) {
//				int element=arr[row][col];
//				if(element==target) {
//					return new int[] {row,col};
//				}
//				
//			}
//		}
//		
//		return new int[] {-1,-1};
//	}
//}	
		
		
		
		// Maximum in 2D
//		int [][]arr= {
//				{14,12,6},
//				{6,5,8},
//				{8,7,4},
//				{9,6}
//		};
//		int max=arr[0][0];
//		for(int  row=0;row<arr.length;row++) {
//			for(int col=0;col<arr[row].length;col++){
//				if(arr[row][col]>max) {
//					max=arr[row][col];
//				}
//				
//			}
//		}
//		System.out.println();
//	}	
//}
		
	
		
		// even digit nos in the array		
		
//		 int[] nums = {12,345,2,6,7896};
//       System.out.println(findNumbers(nums));
//
//      // System.out.println(digits2(-345678));
//   }
//   static int findNumbers(int[] nums) {
//       int count = 0;
//       for(int num : nums) {
//           if (even(num)) {
//               count++;
//           }
//       }
//       return count;
//   }
//
//   // function to check whether a number contains even digits or not
//   static boolean even(int num) {
//       int numberOfDigits = digits(num);
//       /*
//       if (numberOfDigits % 2 == 0) {
//           return true;
//       }
//       return false;
//        */
//       return numberOfDigits % 2 == 0;
//   }
//
//   static int digits2(int num) {
//       if (num < 0) {
//           num = num * -1;
//       }
//       return (int)(Math.log10(num)) + 1;
//   }
//
//   // count number of digits in a number
//   static int digits(int num) {
//
//       if (num < 0) {
//           num = num * -1;
//       }
//
//       if (num == 0) {
//           return 1;
//       }
//
//       int count = 0;
//       while (num > 0) {
//           count++;
//           num = num / 10; // num /= 10
//       }
//
//       return count;
//   }
//
//
//}
		
		
//		int []nums= {12,345,2,6,7896};
//		System.out.println(findnumbers(nums));
//		//System.out.println(digits(9684));
//		
//	}
//
//	 static int findnumbers(int[] nums) {
//		int count=0;
//		for(int num: nums) {
//			if(even(num)) {
//				count++;
//			}
//		}
//		
//		return count ;
//	}
//
//	 static boolean even(int num) {
//		int NoOfdigits=digits(num);
////		if(NoOfdigits%2==0) {
////			return true;
////		}
////		return false;
//		return NoOfdigits %2==0;
//	}
//
//	static int digits(int num) {
//		if(num<0) {
//			num=num*-1;	
//		}
//		if(num==0) {
//			return 1;
//		}
//		int count=0;
//		while(num>0) {
//			count++;
//			num/=10;
//		}
//		return count;
//	}
//}
		
		
		
		
		
		// wealth;
		
//		int[] []accounts= {{1,2,3},{3,2,1}};
//		System.out.println(Maxwealth(accounts));
//	}
//
//	static int Maxwealth(int[][] accounts) {
//		int ans=Integer.MIN_VALUE;
//		for(int person =0;person<accounts.length;person++) {
//			int rowsum=0;
//			for(int account=0;account<accounts[person].length;account++) {
//				rowsum+=accounts[person][account];
//			}
//			if(rowsum>ans) {
//				ans=rowsum;
//				
//		}
//			
//		 
//		
//			 
//		 }
//		return ans;
	}
}
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		