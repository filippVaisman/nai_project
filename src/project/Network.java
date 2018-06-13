package project;

import sun.nio.ch.Net;

public class Network {
    protected Neuron[] hiddenLayer;
    protected Neuron[] outerLayer;
    NetworkCalculator calculator;

    private TrainingSet[] trainingSets;

    private double lambda;
    private int hiddenInputs;


    public Network(int hiddenLayerCount, int outerLayerCount, double lambda, int hiddenInputs) {
        this.hiddenLayer = new Neuron[hiddenLayerCount];
        this.outerLayer = new Neuron[outerLayerCount];
        this.lambda = lambda;
        calculator = new NetworkCalculator(this);
        initNetwork();
    }

    private void getInputData() {
        //read from file input data
    }

    private void initNetwork(){
        for(int i = 0; i < hiddenLayer.length; i++){
            hiddenLayer[i] = new Neuron(hiddenInputs, lambda);
        }
        for(int i = 0; i < outerLayer.length; i++){
            outerLayer[i] = new Neuron(hiddenLayer.length, lambda);
        }
    }



    private void initTrainingSets(){
        //Read data here and int training set array.
    }


    public double[] getOutput(double[] input){
        return calculator.getOutput(input);
    }

    public TrainingSet[] getTrainingSets() {
        return trainingSets;
    }
}

