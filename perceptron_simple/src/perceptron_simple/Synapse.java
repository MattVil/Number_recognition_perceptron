package perceptron_simple;

/**
 * 
 * @author matthieu
 *
 */
public class Synapse {

	private Neuron Xi;
	private Neuron Yj;
	
	private double Wij;
	
	public Synapse(Neuron Xi, Neuron Yj){
		
		this.Xi = Xi;
		this.Yj = Yj;
		
		initWeight();
	}
	
	public void initWeight(){
		Wij = Math.random();
	}

	public Neuron getXi() {
		return Xi;
	}

	public void setXi(Neuron xi) {
		Xi = xi;
	}

	public Neuron getYj() {
		return Yj;
	}

	public void setYj(Neuron yj) {
		Yj = yj;
	}

	public double getWij() {
		return Wij;
	}

	public void setWij(double wij) {
		Wij = wij;
	}
}
