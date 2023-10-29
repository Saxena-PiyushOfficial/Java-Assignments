package UsedStacks;


import Interface.*;
public class GrowableStack implements Stack{
  
	

	private int top;
	private Customer[] cust;
	
	public GrowableStack() {
		top =-1;
		cust=new Customer[stack_size];
	}
    
	@Override
	public void push(Customer c) {
		if(top==cust.length-1) {
			
		Customer[] temparray=new Customer[cust.length*2];
		for(int i=0;i<cust.length;i++) {
			temparray[i] = cust[i];
		}
		cust = temparray;
		cust[++top] = c;
	    }
		else 
			cust[++top]=c;
}
	

	@Override
	public Customer pop() {
		if(top>-1)
			return cust[top--];
		else {
			System.out.println("Stack Underflow");
		}
		return null;
		
			
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
