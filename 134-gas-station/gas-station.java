class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas=0;
        int totalcost=0;
        for(int i=0 ; i<gas.length ; i++){
            totalgas += gas[i];
            totalcost += cost[i];
        }
        if(totalcost > totalgas) return -1;
        int st=0;
        int remaincost=0;
        for(int i=0 ; i<gas.length ; i++){
            remaincost += gas[i] - cost[i];
            if(remaincost<0) {
                st=i+1;
                remaincost=0;
            } 
        }
        return st;

    }
}