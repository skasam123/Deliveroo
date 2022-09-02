package Arrays;

public class Stocks {

	public static void main(String[] args) {
		int[] arr = {7,1,5,3,6,4};
		maxProfit(arr);
	}
	
	public static void maxProfit(int[] prices) {
		int minprice = Integer.MAX_VALUE;
		int maxprofit = 0;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minprice)
				minprice = prices[i];
			else if (prices[i] - minprice > maxprofit)
				maxprofit = prices[i] - minprice;
		}
		System.out.println(maxprofit);
	}
}
