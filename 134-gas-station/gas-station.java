class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost=0;
        int totalgas=0;
        for(int i=0 ; i<gas.length ; i++){
            totalcost += cost[i];
            totalgas += gas[i];
        }
        if(totalgas < totalcost) return -1;

        int st=0;
        int remain=0;
        for(int i=0 ; i<gas.length ; i++){
            remain += gas[i] - cost[i];
            if(remain<0){
                remain=0;
                st = i+1;
            }
        }
        return st;
    }
}