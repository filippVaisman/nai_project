package project;

public class Network {
    protected Neuron[] hiddenLayer;
    protected Neuron[] outerLayer;
    private double[][] inputs = {
            {0, 1, 6, 15, 12, 1, 0, 0, 0, 7, 16, 6, 6, 10, 0, 0, 0, 8, 16, 2, 0, 11, 2, 0, 0, 5, 16, 3, 0, 5, 7, 0, 0, 7, 13, 3, 0, 8, 7, 0, 0, 4, 12, 0, 1, 13, 5, 0, 0, 0, 14, 9, 15, 9, 0, 0, 0, 0, 6, 14, 7, 1, 0, 0}
    };
    private double lambda;
    private int hiddenInputs;


    public Network(int hiddenLayerCount, int outerLayerCount, double lambda, int hiddenInputs) {
        this.hiddenLayer = new Neuron[hiddenLayerCount];
        this.outerLayer = new Neuron[outerLayerCount];
        this.lambda = lambda;
    }

    private void getInputData() {
        //read from file input data
    }

    private void initNetwork() {
    }
}

