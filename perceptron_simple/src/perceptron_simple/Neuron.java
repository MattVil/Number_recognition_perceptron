package perceptron_simple;

import java.util.ArrayList;

/**
 * 
 * @author matthieu
 *
 */
public class Neuron {

	private boolean state;
	private ArrayList<Synapse> connexion;
	
	public Neuron(boolean state){
		this.state = state;
		connexion = new ArrayList<Synapse>();
	}

	public boolean isState() {
		return state;
	}

	public void setState(boolean state) {
		this.state = state;
	}

	public ArrayList<Synapse> getConnexion() {
		return connexion;
	}

	public void setConnexion(ArrayList<Synapse> connexion) {
		this.connexion = connexion;
	}
}
