package com.stackroute.repository;

import com.stackroute.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
     User findByUserEmailAndPassword(String userEmail, String password);
     User findByUserEmail(String userEmail);
}
