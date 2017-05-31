package perceptron_simple;

import java.util.ArrayList;

/**
 * 
 * @author matthieu
 *
 */
public class InputLayor {

	private ArrayList<Neuron> layor;
	
	public InputLayor(){
		layor = new ArrayList<Neuron>();
	}

	public ArrayList<Neuron> getLayor() {
		return layor;
	}

	public void setLayor(ArrayList<Neuron> layor) {
		this.layor = layor;
	}
}
