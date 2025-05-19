package com.rest.restapi.controller;

import com.rest.restapi.entity.Entry;
import com.rest.restapi.services.EntryServices;
//import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



@RestController
@RequestMapping("/journal")
public class MyControllerv2 {

 @Autowired
 public  EntryServices entryServices;
    private Map<String, Entry> Entries = new HashMap<>();


    @GetMapping
    public List<Entry> getAll() {
        return null;
    }


    @PostMapping
    public boolean createEntry(@RequestBody Entry  entry) {
      entryServices.saveEntry(entry);
        return true;

    }

    @GetMapping("id/{myId}")
    public Entry getEntryById(@PathVariable Long myId) {
        return null;
    }

    @DeleteMapping("id/{myId}")
    public Entry deleteEntryById(@PathVariable Long myId) {
        return null;
    }

    @PutMapping("/id/{id}")
    public Entry updateEntryById(@PathVariable Long id, @RequestBody Entry myEntry) {
        return null;
}
}