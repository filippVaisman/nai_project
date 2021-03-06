package project;

public class Neuron{
    private double[] weights;
    private double step;
    private double lambda;
    private double neuronError;

    public Neuron(int count, double lambda){
        init(count);
        this.lambda = lambda;
        neuronError = 0;
    }

    private void init(int count){
        weights = new double[count];
        for(int i = 0; i < count; i++){
            weights[i] = Math.random() * 2 - 1;
        }
        step = Math.random() * 2 - 1;
    }

    public void show(){
        for(int i = 0; i < weights.length; i++){
            System.out.println((i+1) + ": " + weights[i]);
        }
    }
    private double calculateNet(double[] inputs){
        double net = 0.0;
        for(int i = 0; i < inputs.length; i++){
            net += inputs[i] * weights[i] + step;
        }
        return net;
    }

    private double activate(double net){
        return (1 /(1 + Math.pow(Math.E, ((-1) * lambda * net))));
    }

    public double getOutput(double[] input){
        return activate(calculateNet(input));
    }


    public double[] getWeights() {
        return weights;
    }

    public void setWeights(double[] weights) {
        this.weights = weights;
    }

    public double getStep() {
        return step;
    }

    public void setStep(double step) {
        this.step = step;
    }

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double getNeuronError() {
        return neuronError;
    }

    public void setNeuronError(double neuronError) {
        this.neuronError = neuronError;
    }
}
