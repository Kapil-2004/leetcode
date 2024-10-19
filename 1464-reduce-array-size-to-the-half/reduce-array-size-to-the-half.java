class Solution {
    public int minSetSize(int[] arr) {
        int n = arr.length;
        HashMap <Integer , Integer> map = new HashMap<>() ;
        for(int i=0 ; i<n ; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i] , map.get(arr[i])+1);
            }
            else{
                map.put(arr[i] , 1);
            }
        }

        PriorityQueue <Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int a : map.values()) {
            pq.add(a);
        }

        int m=0;
        int ans=0;
        while(m < n/2){
            m += pq.poll();
            ans++;
        }
        return ans;
    }
}