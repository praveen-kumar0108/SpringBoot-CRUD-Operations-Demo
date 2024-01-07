package com.myprojects.application.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myprojects.application.Entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
