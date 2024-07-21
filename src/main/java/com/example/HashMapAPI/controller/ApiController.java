package com.example.HashMapAPI.controller;

import com.example.HashMapAPI.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    // http://localhost:8080/api/entries
    @GetMapping("/entries")
    public ResponseEntity<Map<String, String>> getAllEntries() {
        return ResponseEntity.ok(apiService.getAllEntries());
    }

    //http://localhost:8080/api/entries/1
    @GetMapping("/entries/{id}")
    public ResponseEntity<String> getEntryById(@PathVariable String id) {
        String entry = apiService.getEntryById(id);
        if (entry == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(entry);
    }

    // http://localhost:8080/api/entries?id=3&value=third_entry
    @PostMapping("/entries")
    public ResponseEntity<String> addEntry(@RequestParam String id, @RequestParam String value) {
        apiService.addEntry(id, value);
        return ResponseEntity.ok("Entry added successfully");
    }

    //http://localhost:8080/api/entries/{id}?value={value}
    @PutMapping("/entries/{id}")
    public ResponseEntity<String> updateEntry(@PathVariable String id, @RequestParam String value) {
        apiService.updateEntry(id, value);
        return ResponseEntity.ok("Entry updated successfully");
    }

    // http://localhost:8080/api/entries/1
    @DeleteMapping("/entries/{id}")
    public ResponseEntity<String> deleteEntry(@PathVariable String id) {
        apiService.deleteEntry(id);
        return ResponseEntity.ok("Entry deleted successfully");
    }
}