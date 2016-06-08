package cor;

import java.io.Serializable;

public class Agent implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6758240614291771593L;
	private String agentId;
	private Address workLocation;
	
	public Agent(String agentId, Address address){
		this.agentId = agentId;
		this.workLocation = address;
	}

	public String getAgentId() {
		return agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public Address getWorkLocation() {
		return workLocation;
	}

	public void setWorkLocation(Address workLocation) {
		this.workLocation = workLocation;
	}

	public boolean isEmpty(){
		try {
			return this.agentId.isEmpty() || this.workLocation.isEmpty();
		} catch (NullPointerException e) {
			return true;
		}
		
	}
	
	@Override
	public String toString() {
		return "Agent id:"+this.agentId + "\nAgent Address:\n"+this.workLocation.toString();
	}
	
}
