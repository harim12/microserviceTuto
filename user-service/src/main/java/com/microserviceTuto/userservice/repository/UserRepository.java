package com.microserviceTuto.userservice.repository;

import com.microserviceTuto.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User findUserByUserId(Long userId);
}
