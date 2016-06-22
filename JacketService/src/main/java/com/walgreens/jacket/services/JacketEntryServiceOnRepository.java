package com.walgreens.jacket.services;

import com.walgreens.jacket.models.JacketEntry;
import com.walgreens.repository.Repository;

import java.util.List;

public class JacketEntryServiceOnRepository implements JacketEntryService {
    private Repository repository;

    public JacketEntryServiceOnRepository(Repository jacketRepository) {
        this.repository = jacketRepository;
    }


    @Override
    public List<JacketEntry> getAllEntries() {
	return null;
    }
}

