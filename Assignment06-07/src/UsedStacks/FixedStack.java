package UsedStacks;

import UsedStacks.UnderflowException;
import Interface.*;
public class FixedStack implements Stack {
  
	

	private int top;
	private Customer[] cust;
	int count=0;
	public FixedStack() {
		top =-1;
		cust=new Customer[stack_size];
	}
    
	@Override
	public void push(Customer c) {
		if(top==cust.length-1) {
			System.out.println("Stack Overflow");
	}
		else {
			cust[++top]=c;
	
		}
	}

	@Override
	public Customer pop() throws UnderflowException {
		if(top>-1)
			return cust[top--];
		else 
			throw new UnderflowException("stack is  underflow");
		
		
		
			
	}
	@Override
	public String toString() {
		if(top>=0) {
	for(int i=0;i<=top;i++)
			        System.out.println(cust[i]+" ");
	}
		return null;
	}
	
}
