package inheritance3;

public class VIPCustomer extends Customer{
	
	private int agentID;
	double saleRadio;
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRadio);
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRadio = 0.1;
		this.agentID = agentID;
	}
	
	public int getAgentID( ) {
		return agentID;
	}

}
