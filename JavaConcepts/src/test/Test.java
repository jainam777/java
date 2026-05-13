package test;

public class Test {
	public static void main(String[] args) {
		int[] arr= {7,1,5,3,6,3};
		int x =Test.maxProfit(arr);
		System.out.println("Max Profit:::"+x);
	}
	
	private static int maxProfit(int[] arr) {
		int minPrice=Integer.MAX_VALUE;
		int maxProfit=0;
		for(int price:arr) {
			if(price<minPrice) {
				minPrice=price;
			}else if(maxProfit < price-minPrice) {
				maxProfit= price-minPrice;
			}
		}
		return maxProfit;
	}
	
	
}
