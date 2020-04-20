package importantQuestions;
import java.util.*;
public class zeroSumSubArray {

	public static void main(String[] args) {
		int[] a = {2,1,-2,9,4,2};
		boolean found =false;
		
		// o(n^2)
		
		
//		for(int i=0;i<=a.length;i++) {
//			int sum = 0;
//			for(int j=i;j<=a.length;j++) {
//				sum += a[j];
//				if (sum==0) {
//					found=true;
//					break;
//					}
//			}
//			if(found) break;
//		}
		
		// o(nlogn)
		
		
		Set<Integer> set = new HashSet<>();
		int sum=0;
		for(int element :a) {
			set.add(sum);
			sum +=element;
			if(set.contains(sum)) {
				found=true;
				break;
			}
		}
		System.out.println("found "+ found);

	}
	

}
