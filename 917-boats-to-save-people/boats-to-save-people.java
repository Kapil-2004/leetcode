class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans=0;
        int sum=0;
        int i=0 ; 
        int j=people.length-1;
        while(i<=j){
            if(people[i] + people[j] <= limit){
                i++;
                j--;
                ans++;
            }
            else{
                j--;
                ans++;
            }
        }
        return ans;
    }
}