package com.example.newServlet;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;

public class JsonUtil {

    public static JsonObject requestToJson(HttpServletRequest request, Gson gson) {
        StringBuffer jb = new StringBuffer();
        String line;

        try {
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

        return gson.fromJson(String.valueOf(jb), JsonObject.class);
    }


}
