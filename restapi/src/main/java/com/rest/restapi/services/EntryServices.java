package com.rest.restapi.services;

import com.rest.restapi.entity.Entry;
import com.rest.restapi.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EntryServices {

    private final EntryRepository entryRepository;

    @Autowired
    public EntryServices(EntryRepository entryRepository) {
        this.entryRepository = entryRepository;
    }

    public Entry saveEntry(Entry entry) {
        return entryRepository.save(entry);
    }
}