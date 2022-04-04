package com.devsuperior.hrworker.api;


import com.devsuperior.hrworker.entitier.Worker;
import com.devsuperior.hrworker.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return workerService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable long id){
        Worker worker = workerService.findById(id);
        return ResponseEntity.ok(worker);
    }
}
