class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList <Integer> ll = new ArrayList<>();
        int i=0 ; 
        int j=0 ;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j]){
                i++;
            }
            else if(nums1[i]>nums2[j]){
                j++;
            }
            else{
                ll.add(nums1[i]);
                i++;
                j++;
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