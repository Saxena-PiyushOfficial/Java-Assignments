package UsedStacks;

public class Customer {
    private int id;
    private String name;
    private String Addr;
	public Customer(int id, String name, String addr) {
	
		this.id = id;
		this.name = name;
		Addr = addr;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", Addr=" + Addr + "]";
	}
	
	
	
}
