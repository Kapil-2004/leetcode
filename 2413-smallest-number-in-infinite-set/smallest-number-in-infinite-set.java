class SmallestInfiniteSet {

    boolean [] arr;
    int i ;

    public SmallestInfiniteSet() {
        arr = new boolean[1001];
        Arrays.fill(arr , true);
        i=1 ;
    }
    
    public int popSmallest() {
        while(!arr[i]){
            i++;
        }
        arr[i]=false;
        return i;
    }
    
    public void addBack(int num) {
        if(arr[num]) return;
        arr[num]=true;
        if(num < i){
            i=num;
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */