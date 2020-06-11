package com.techmahendra.repository;

import com.techmahendra.entity.RedeemPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedeemPointRepository extends JpaRepository<RedeemPoint, Integer> {
}
