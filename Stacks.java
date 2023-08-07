import java.util.*;
public class Main
{
    int top;
     int stack[];
    static int capacity;
    
    Main()
    {
        top=-1;
        capacity=7;
        stack=new int[capacity];
    }
    public boolean empty()
    {
        return top==-1;
    }
    public boolean full()
    {
        return top==capacity-1;
    }
    public void push(int data)
    {
        if(top==capacity-1)
        {
            System.out.println("Stack is full");
        }
        top++;
        stack[top]=data;

    }
    public void display()
    {
        if(top==-1)
        {
            
        }
        for(int i=top;i>-1;i--){
            System.out.print(stack[top--]+" ");
        }
         System.out.println();
    }
    public int pop()
    {
        if(top==-1)
        {
            System.out.println("Stack is Empty");
        }
        return stack[top--];
    }
    public int peek()
    {
        if(top==-1)
        {
            
        }
        return stack[top];
    }
	public static void main(String[] args) {
	    Main ob=new Main();
	    Scanner sc=new Scanner(System.in);
	    for(int i=0;i<capacity;i++)
	    {
	        ob.push(sc.nextInt());
	    }
	    System.out.println("Top most elemnt of stack is retrieve : "+ ob.pop());
	    System.out.println("Top most elemnt of stack : "+ob.peek());
	    ob.display();
	    System.out.println(ob.empty());
	    
		
	}
}
