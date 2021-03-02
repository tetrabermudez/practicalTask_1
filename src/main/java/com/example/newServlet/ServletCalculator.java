package com.example.newServlet;

import com.example.newServlet.logic.Calculator;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

@WebServlet(urlPatterns = "/calc")
public class ServletCalculator extends HttpServlet {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        JsonObject jsonObject = JsonUtil.requestToJson(request, gson);
        request.setCharacterEncoding("UTF-8");

        double firstNum = jsonObject.get("firstNum").getAsDouble();
        double secondNum = jsonObject.get("secondNum").getAsDouble();
        String operator = jsonObject.get("operator").getAsString();

        HashMap<String, Double> map = new HashMap<>();
        map.put("Result", Calculator.calculate(firstNum, secondNum, operator));

        response.setContentType("application/json;charset=utf-8");
        PrintWriter pw = response.getWriter();

        pw.print(gson.toJson(map));
    }

}
