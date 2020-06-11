package com.techmahendra;

import com.techmahendra.service.Myservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechmahendraApplication {
    Logger log= LoggerFactory.getLogger(TechmahendraApplication.class);

    @Autowired
    private Myservice myService;


    public boolean redeemPoint(String customerId, String amount)
    {

        boolean flag=false;
        if(customerId!=null && !customerId.isEmpty() && amount!=null && !amount.isEmpty()) {
            try {
                Double toRedeem = Double.valueOf(amount);
                double currentPoints = myService.getPoints(customerId);
                double newPoints = currentPoints - toRedeem;
                myService.save(customerId, newPoints);
                  log.info("Points redeemed for customer {}", customerId);
                return true;
            }catch (Exception e){
                log.error("message thread ",e);
                throw  new RuntimeException(e);
            }
        }
        return flag;

    }

    public static void main(String[] args) {
        SpringApplication.run(TechmahendraApplication.class, args);
    }

}
