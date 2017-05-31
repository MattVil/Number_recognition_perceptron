package perceptron_simple;

import java.util.ArrayList;

/**
 * 
 * @author matthieu
 *
 */
public class OutputLayor {

	private ArrayList<Neuron> layor;
	private double teta;
	
	public OutputLayor(double teta){
		this.teta = teta;
		layor = new ArrayList<Neuron>();
	}
	
	public void calculOutputLayor(int number_of_neuron){
		for (int i = 0; i < number_of_neuron; i++) {
			double potential = 0;
			/*sum the weight of each connexion*/
			for (int j = 0; j < layor.size(); j++) {
				if(layor.get(i).getState() == 1)
					potential += layor.get(i).getConnexion().get(j).getWij();
			}
			
			/*switch the state according to the potetial*/
			if(potential >= teta)
				layor.get(i).setState(1);
			else
				layor.get(i).setState(0);
		}
	}

	public ArrayList<Neuron> getLayor() {
		return layor;
	}

	public void setLayor(ArrayList<Neuron> layor) {
		this.layor = layor;
	}

	public double getTeta() {
		return teta;
	}

	public void setTeta(double teta) {
		this.teta = teta;
	}
}
