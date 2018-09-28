package com.poramin.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class TeatHandler implements RequestHandler<Map<String, String>, String> {

    @Override
    public String handleRequest(Map<String, String> input, Context context) {
        return "Hello AWS";
    }

}
