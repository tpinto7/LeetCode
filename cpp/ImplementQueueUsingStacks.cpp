class MyQueue {
    stack<int> first, second;
public:
    /** Initialize your data structure here. */
    MyQueue() {
        
    }
    
    void push(int x){
       first.push(x);
    }
    
    // front 
    int pop(){
        if(first.size() < 1) return -1;
        int int_to_return = -1;
        while(!first.empty()){
            second.push(first.top());
            first.pop();
        }
        
        int_to_return = second.top();
        second.pop();
        
        while(!second.empty()){
            first.push(second.top());
            second.pop();
        }
        
        return int_to_return;
    }
    
    int peek(){
       if(first.size() < 1) return -1;
        int int_to_return = -1;
        while(!first.empty()){
            second.push(first.top());
            first.pop();
        }
        
        int_to_return = second.top();
        
        while(!second.empty()){
            first.push(second.top());
            second.pop();
        }
        
        return int_to_return;
    }
    
    bool empty(){
        return first.empty();
    }
    
};

           