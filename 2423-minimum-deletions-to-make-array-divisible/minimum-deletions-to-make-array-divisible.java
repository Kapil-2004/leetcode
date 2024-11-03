class Solution {
    public int minOperations(int[] nums, int[] arr) {
        int g = arr[0];
        int temp;
        for(int a : arr){
            while(a>0){
                temp = g%a;
                g=a;
                a=temp;
            }
        }
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i : nums){
            pq.add(i);
        }
        int ans=0;
        while(!pq.isEmpty()){
            if(g%pq.poll()==0) return ans;
            ans++;
        }
        return -1;
    }
}