package com.reception_app.reception_backend.dao;

import com.reception_app.reception_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User getByName(String name);

    User findByName(String name);


}
