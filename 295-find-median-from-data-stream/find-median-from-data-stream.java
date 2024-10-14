class MedianFinder {
    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;
    public MedianFinder() {
        this.max=new PriorityQueue<Integer>(Collections.reverseOrder());
        this.min=new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        if(max.isEmpty() || max.peek() >= num){
            max.add(num);
        }
        else{
            min.add(num);
        }
        if(min.size() - max.size() ==1 ){
            max.add(min.poll());
        }
        else if(max.size() - min.size() >1 ){
            min.add(max.poll());
        }
    }
    
    public double findMedian() {
        if(min.size() != max.size()){
            return (double) max.peek();
        }
        else{
            return (double) (min.peek() + max.peek())/(double)2 ;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */