package project;

public class Neuron{
    private double[] weights;
    private double step;
    private double lambda;

    public Neuron(int count, double lambda){
        init(count);
        this.lambda = lambda;
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
}
