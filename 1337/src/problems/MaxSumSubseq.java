package problems;
// 1 2 3 -4 -1 2 9 8 -5 -2 1 8
public class MaxSumSubseq {
	public static void main(String args[]){
		int[] list = {-1 ,2 ,3 ,-4 ,-1 ,2, 9 ,8 ,-5 ,-2,1,8};
		System.out.println(subseqWithMaxSum(list));
	}

	static int subseqWithMaxSum(int[] list){
		int maxSum=0;
		int sum=0;
		int n=list.length;
		for(int i=0;i<n;i++){
			sum=0;
			for(int j=i;j<n;j++){
				sum=sum+list[j];
				if(sum>maxSum){
					maxSum=sum;
				}			
			}
		}
		return maxSum;
	}

}
