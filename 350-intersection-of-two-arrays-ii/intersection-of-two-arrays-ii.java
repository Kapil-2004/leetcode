class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer , Integer> map = new HashMap<>();
        ArrayList <Integer> ll = new ArrayList<>();
        for(int i=0 ; i<nums1.length ; i++){
            if(map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }
            else{
                map.put(nums1[i] , 1);
            }
        }
        for(int i=0 ; i<nums2.length ; i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0 ){
                map.put(nums2[i] , map.get(nums2[i])-1 );
                ll.add(nums2[i]) ;
            }
        }
        int k = ll.size();
        int []ans = new int [k];
        for(int p=0 ; p<k ; p++){
            ans[p]=ll.get(p);
        }
        return ans;
    }
}