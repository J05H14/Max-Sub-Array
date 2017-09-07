package maxA;

public class Lab03_JoshuaLazaro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {13, -3, -25, 20, -3, -16, -23, 18}; 
		String result = divAndCon(arr).toString();
		
		System.out.println(result);
	}
	
	public int[] bruteForce(int arr[]){
		int sum = 0;
		
		
		for(int i = 0; i < arr.length; i++){
			for(int j = i + 1; j < arr.length - 1; j++){
				
			}
		}
		
		return arr;
		
	}
	
	public static MaxSubArray crossSum(int[] arr, int low, int mid, int high){
		int sum = 0;
		Integer leftSum = Integer.MIN_VALUE;
		int maxLeftIndex = 0;
		
		for(int i = mid; i > low; i--){
			sum += arr[i];
			if(sum > leftSum){
				leftSum = sum;
				maxLeftIndex = i;
			}
		}
		
		Integer rightSum = Integer.MIN_VALUE;
		int maxRightIndex = 0;
		sum = 0;
		
		for(int i = mid + 1; i < high; i++){
			sum += arr[i];
			if(sum > rightSum){
				rightSum = sum;
				maxRightIndex = i;
			}
		}
		
		return new MaxSubArray(maxLeftIndex, maxRightIndex, leftSum + rightSum);
	}
	
	public static MaxSubArray divAndCon(int arr[]){
		
		return divAndCon(arr, 0, arr.length - 1);
		
	}
	public static MaxSubArray divAndCon(int arr[], int low, int high){
		if(high == low){
			return new MaxSubArray(low, high, arr[low]);
		}
		else{
			int mid = (low + high) / 2;
			
			MaxSubArray leftMax = divAndCon(arr, low, mid);
			MaxSubArray rightMax = divAndCon(arr, mid + 1, high);
			MaxSubArray crossMax = crossSum(arr, low, mid, high);
			
			if(leftMax.getSum() >= rightMax.getSum() && leftMax.getSum() >+ crossMax.getSum()){
				return new MaxSubArray(leftMax.getLow(),leftMax.getHigh(), leftMax.getSum());
			}
			else if(rightMax.getSum() >= leftMax.getSum() && rightMax.getSum() >= crossMax.getSum()){
				return new MaxSubArray(rightMax.getLow(), rightMax.getHigh(), rightMax.getSum());
			}
			else{
				return new MaxSubArray(crossMax.getLow(), crossMax.getHigh(), crossMax.getSum());
			}
		}
	}

}
