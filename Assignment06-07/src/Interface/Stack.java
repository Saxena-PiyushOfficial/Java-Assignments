package Interface;
import UsedStacks.*;
public interface Stack {
   int stack_size=5 ;
   void push(Customer c);
   Customer pop() throws UnderflowException;
}
