package com.healthify.version.repositories;

import com.healthify.version.entities.UserProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserProfileRespository extends JpaRepository<UserProfileEntity,Long> {
}
