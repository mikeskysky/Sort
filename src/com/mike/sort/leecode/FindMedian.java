package com.mike.sort.leecode;
/**
 * 
 * @author Administrator
 *
 */
public class FindMedian {
	public static void main(String[] args) {
		int[] arr= {3,5,2,3,5,9,1,2,11,12,13};
		int res = 0;
		if(arr.length%2 ==1){
			res = findMedian(arr, (arr.length+1)/2, 0, arr.length-1);
		}else{
			res = findMedian(arr, arr.length/2, 0, arr.length-1);
		}
		System.out.println(res);
	}

	/**
	 * 
	 * @param arr 需要遍历的数组
	 * @param k 需要查找第k的数字
	 * @param low 最低位
	 * @param hight 最高位
	 * @return
	 */
	private static int findMedian(int[] arr, int k, int low, int hight) {
		if(k>hight-low+1)return -1;
		int pos=getPostion(arr,low,hight);
		if(pos - low < k -1){
			return findMedian(arr, k-pos-1, pos+1, hight);
		}else if(pos - low == k-1){
			return arr[pos];
		}else {
			return findMedian(arr, k, low, pos-1);
		}
	}
  
	/**
	 * 快速排序思想查找中位数，随机选取一个数字，返回他的位置k
	 * k之前都是比它小，k之后都是比它大
	 * @param arr
	 * @param low
	 * @param hight
	 * @return
	 */
	private static int getPostion(int[] arr, int left, int right) {
		int temp=arr[left];
		while(left<right)
		{
			while(left<right&&arr[right]>=temp)
			{
				right--;
			}
			arr[left]=arr[right];
			while(left<right&&arr[left]<=temp)
			{
				left++;
			}
			arr[right]=arr[left];
		}
		arr[left]=temp;
		return left;
	}
	
}
