class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0,mid = 0;
        int high = 0;
        for(int w :weights){
                low = Math.max(low,w);
                high+=w;
        }
        while(low<=high){
            mid = low+(high-low)/2;
            if(isValid(weights,days,mid))
                high = mid-1;
            else
                low = mid+1;
            
        }
        return low;
    }
    private boolean isValid(int[] weights , int days , int capacity){
            int day= 0,weight = 0;
            for(int i = 0;i<weights.length;i++){
                   weight+=weights[i];
                   if(weight == capacity){
                    weight = 0;
                    day +=1;
                    }
                    if(weight > capacity){
                        weight = weights[i];
                        day+=1;
                    }
            }
            if(weight !=0)
                day+=1;
            return day <=days;
    }
}