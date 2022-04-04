package com.devsuperior.hrworker.service;

import com.devsuperior.hrworker.entitier.Worker;
import com.devsuperior.hrworker.repositories.WorkerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkerService {
    @Autowired
    private WorkerRepository workerRep;

    public ResponseEntity<List<Worker>> findAll() {
        return ResponseEntity.ok(workerRep.findAll());
    }

    public Worker findById(long id) {
        return workerRep.findById(id).get();
    }
}
