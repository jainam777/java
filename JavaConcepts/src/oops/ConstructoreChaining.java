package oops;

public class ConstructoreChaining extends ConstructorChainParent {
	private String email;
	
	public ConstructoreChaining(String name, String mobile,String email) {
		super(name, mobile);
		this.email=email;
	}
	

}
