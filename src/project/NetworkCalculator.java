package project;

public class NetworkCalculator {

    private Network network;
    private double outputLayerError;
    private double hiddenLayerError;
    private double[] output;

    public NetworkCalculator(Network network) {
        this.network = network;
        outputLayerError = 0.0d;
        hiddenLayerError = 0.0d;

    }

    public double[] getOutput (double[] input){
        double[] hiddenLayerOutput = new double[network.hiddenLayer.length];
        double[] outerLayerOutput = new double[network.outerLayer.length];
        for(int i = 0; i < network.hiddenLayer.length; i++){
            hiddenLayerOutput[i] = network.hiddenLayer[i].getOutput(input);
        }
        for(int i = 0; i < network.outerLayer.length; i++){
            outerLayerOutput[i] = network.outerLayer[i].getOutput(hiddenLayerOutput);
        }
        return outerLayerOutput;
    }



}
