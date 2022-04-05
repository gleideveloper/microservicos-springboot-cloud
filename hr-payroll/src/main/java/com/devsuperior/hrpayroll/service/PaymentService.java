package com.devsuperior.hrpayroll.service;

import com.devsuperior.hrpayroll.entities.Payment;
import com.devsuperior.hrpayroll.entities.Worker;
import com.devsuperior.hrpayroll.feignclients.WorkedFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkedFeignClient workedFeignClient;

    public Payment getPayment(long workrId, int days){

        Worker worker = workedFeignClient.findById(workrId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
