package importantQuestions;

public class largestSumSubarray {

	public static void main(String[] args) {
		int a[]= {-1,2,5,3,-6,-2,4,3,-9};
		int n= a.length;
		int maxsum=Integer.MIN_VALUE;
		int currentsum=0;
		for(int i=0;i<n;i++) {
			currentsum +=a[i];
		
		if(currentsum>maxsum) {
			maxsum=currentsum;
		}
		if(currentsum<0) {
			currentsum=0;
		}
		}
     System.out.println(maxsum);
	}

}
