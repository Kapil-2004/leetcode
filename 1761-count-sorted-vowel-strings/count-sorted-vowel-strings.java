class Solution {
    public int countVowelStrings(int n) {
        int [] arr = new int [5];
        Arrays.fill(arr,1);
        for(int i=1 ; i<n ; i++){
            for(int j=3 ; j>=0 ; j--){
                arr[j]+=arr[j+1];
            }
        }
        int ans=0;
        for(int i=0 ; i<arr.length ; i++){
            ans += arr[i];
        }
        return ans;
    }
}