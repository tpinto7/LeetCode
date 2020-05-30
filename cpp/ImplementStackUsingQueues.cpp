#include <queue>
using namespace std;

class MyStack
{
  private:
    queue<int> q;
    queue<int> q2;
    int t;

  public:
    /** Initialize your data structure here. */
    MyStack()
    {
    }

    /** Push element x onto stack. */
    void push(int x)
    {
        q.push(x);
        t = x;
    }
    

    /** Removes the element on top of the stack and returns that element. */
    int pop()
    {
        int to_return = -1;
        if(q.size() == 1){
            to_return = q.front();
            q.pop();
        }
        else{
            while(q.size() > 1){
                q2.push(q.front());
                q.pop();
            }
            to_return = q.front();
            q.pop();
            while(!q2.empty()){
                t = q2.front();
                q.push(q2.front());
                q2.pop();
            }
        }
        return to_return;
    }

    /** Get the top element. */
    int top()
    {
        return t;
    }

    /** Returns whether the stack is empty. */
    bool empty()
    {
        return q.empty();
    }
};
