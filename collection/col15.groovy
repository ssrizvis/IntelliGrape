class Stack
{
  List l=[];
  int top=-1
  void push(String x)
  {
    top++;
    l[top]=x;
    println x+" pushed"
  }
  void pop()
  {
    println l[top]+" popped"
    l=l.dropRight(1)
    top--
  }
  void top()
  {
     println l.last()
  }
}
Stack obj=new Stack();
obj.push("Shahzad")
obj.push("Rizvi")
obj.push("Syed");
obj.pop();
obj.top();
