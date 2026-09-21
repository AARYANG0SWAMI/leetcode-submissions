class Solution {
    public int subtractProductAndSum(int n) {
        int num,mul =1 ,add =0;
        while(n>0){
            num = n%10;
            mul *= num;
            add += num;
            n /= 10;
        }
        return mul-add;
    }
}