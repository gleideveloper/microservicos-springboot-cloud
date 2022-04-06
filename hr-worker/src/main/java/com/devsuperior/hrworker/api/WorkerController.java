package com.devsuperior.hrworker.api;


import com.devsuperior.hrworker.entities.Worker;
import com.devsuperior.hrworker.service.WorkerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/workers")
public class WorkerController {
    private static final Logger logger = LoggerFactory.getLogger(WorkerController.class);
    @Autowired
    private Environment env;

    @Autowired
    private WorkerService workerService;

    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){
        return workerService.findAll();
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable long id) {
        try {
            Thread.sleep(3000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        logger.info("PORT = " + env.getProperty("local.server.port"));

        Worker worker = workerService.findById(id);
        return ResponseEntity.ok(worker);
    }
}
