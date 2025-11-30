public class Main{
    public static int buyANDsellStocks(int [] prices){
        int buyingprice = Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=1;i<=prices.length-1;i++){
            if(buyingprice<prices[i]){
                int profit=prices[i]-buyingprice;
                maxprofit=Math.max(profit,maxprofit);
            }else{
                buyingprice=prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[]args){
        int prices[]={7,1,5,3,6,4};
        System.out.println(buyANDsellStocks(prices));
    }
}
