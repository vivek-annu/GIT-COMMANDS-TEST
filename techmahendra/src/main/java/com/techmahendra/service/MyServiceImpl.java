package com.techmahendra.service;

import com.techmahendra.entity.RedeemPoint;
import com.techmahendra.repository.RedeemPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl  implements Myservice{
    @Autowired
    private RedeemPointRepository redeemPointRepository;
    @Override
    public double getPoints(String customerId) {
        return 0;
    }

    @Override
    public void save(String customerId, double newPoints) {
        redeemPointRepository.save(new RedeemPoint(customerId,newPoints)) ;
    }
}
