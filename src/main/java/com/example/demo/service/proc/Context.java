package com.example.demo.service.proc;

import java.util.HashMap;
import java.util.Map;

public class Context {

    private Map<String, Object> contextItems = new HashMap<>();


    public <T> T getItem(String key) {
        if (contextItems != null && contextItems.keySet().contains(key)) {
            T t = (T)contextItems.get(key);
            return t;
        }
        return null;
    }

    public void setItem(String key, Object value) {
        contextItems.put(key, value);
    }
}
