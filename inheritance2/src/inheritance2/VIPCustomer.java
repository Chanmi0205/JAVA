package inheritance2;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRadio;
	
	public VIPCustomer( ) {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRadio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public int getAgentID( ) {
		return agentID;
	}

}
