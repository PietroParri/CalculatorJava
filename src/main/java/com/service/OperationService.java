package main.java.com.service;

public class OperationService {
    public float Sum(String x, String y){
        return Float.parseFloat(x) + Float.parseFloat(y);
    }

    public float Sub(String x, String y){
        return Float.parseFloat(x) - Float.parseFloat(y);
    }

    public float Multi(String x, String y){
        return Float.parseFloat(x) * Float.parseFloat(y);
    }

    public float Div(String x, String y){
        return Float.parseFloat(x) / Float.parseFloat(y);
    }
}
