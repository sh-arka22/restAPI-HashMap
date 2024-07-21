package com.example.HashMapAPI.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class ApiService {
    public static Map<String, String> data = new HashMap<>();

    public ApiService() {
        data.put("1", "First Entry");
        data.put("2", "Second Entry");
    }

    public Map<String, String> getAllEntries() {
        return data;
    }

    public String getEntryById(String id) {
        return data.get(id);
    }

    public String addEntry(String id, String value) {
        return data.put(id, value);
    }

    public String updateEntry(String id, String value) {
        return data.put(id, value);
    }

    public String deleteEntry(String id) {
        return data.remove(id);
    }
}
