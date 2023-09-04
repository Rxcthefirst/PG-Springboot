package com.rxcthefirst.summitshare.repository;

import com.rxcthefirst.summitshare.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
