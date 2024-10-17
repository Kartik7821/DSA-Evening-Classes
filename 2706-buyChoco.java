//2706 Buy Two Chocolates

class Solution {
    public int buyChoco(int[] prices, int money) {
        int a = Math.min(prices[0], prices[1]);
        int b = Math.max(prices[0], prices[1]);

        for (int i = 2; i < prices.length; i++){
            if (prices[i] < b){
                if (prices[i] < a){
                    b = a;
                    a = prices[i];
                }
                else{
                    b = prices[i];
                }
            }
        }


        if (money >= (a+b)){
            return (money-a-b);
        }
        else{
            return (money);
        }
    }
}
