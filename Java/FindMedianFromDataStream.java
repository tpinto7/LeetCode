class MedianFinder {

    // holds the larger half
    PriorityQueue<Integer> min;
    // holds the smaller half
    PriorityQueue<Integer> max;
    /** initialize your data structure here. */
    public MedianFinder() {
        min = new PriorityQueue<Integer>();
        max = new PriorityQueue<Integer>(10, Collections.reverseOrder());
    }
    
    public void addNum(int num) {
        if(min.size() == 0 && max.size() == 0){
            min.add(num);
        } 
        else{
            if(min.size() > max.size()){
                if(num > min.peek()){
                    max.add(min.poll());
                    min.add(num);
                } else{
                    max.add(num);
                }
            } else if(max.size() > min.size()){
                if(num < max.peek()){
                    min.add(max.poll());
                    max.add(num);
                } else{
                    min.add(num);
                }
            } else{
                if(num > min.peek()){
                    min.add(num);
                }else max.add(num);
                
            }
        }
    }
    
    public double findMedian() {
        if(min.size() == max.size()){
            return (min.peek() + max.peek())/2.0;
        }
        return min.size() > max.size() ? min.peek() : max.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */