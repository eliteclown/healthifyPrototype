package com.healthify.version.repositories;

import com.healthify.version.entities.MealLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealLogRepository extends JpaRepository<MealLogEntity,Long> {
}
