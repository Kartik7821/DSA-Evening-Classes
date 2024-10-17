class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count = 0;
        int count10 = 0;
        for (int i = 0; i < bills.length; i++){
            if (bills[i] == 5){
                count++;
            }
            else if (bills[i] == 10){
                count--;
                count10++;
            }
            else if (bills[i] == 20){
                if (count10 > 0 && count > 0){
                    count--;
                    count10--;
                }
                else{
                    count -= 3;
                }
            }
            if (count < 0){
                return false;
            }
        }
        return true;
    }
}
