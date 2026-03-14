package com.example.JustGoOut.persistence.repos;

import com.example.JustGoOut.persistence.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity, Long> {

}
