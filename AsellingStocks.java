public class AsellingStocks {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(sellingStocks(prices));
    }
    private static int sellingStocks(int prices[]){//TIME COMPLEXITY---O(n)
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(buyingPrice<prices[i]){

                int profit = prices[i]-buyingPrice;
                maxProfit = Math.max(maxProfit, profit);
            }else{
                buyingPrice = prices[i];
            }
        }
        return maxProfit;
    }
}
