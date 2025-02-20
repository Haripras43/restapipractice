package com.springjpapractice.restapipractice.repository;

import com.springjpapractice.restapipractice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
