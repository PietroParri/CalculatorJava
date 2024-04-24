package main.java.com.controller;

import main.java.com.service.OperationService;

public class OperationController {
    OperationService _operation = new OperationService();

    public float Sum(String x, String y){
        return _operation.Sum(x, y);
    }
    public float Sub(String x, String y){
        return _operation.Sub(x, y);
    }
    public float Multi(String x, String y){
        return _operation.Multi(x, y);
    }
    public float Div(String x, String y){
        return _operation.Div(x, y);
    }
}
