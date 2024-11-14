package com.Prachi.Spring.Security.Repo;

import com.Prachi.Spring.Security.modal.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
    Users findByUserName(String username);
}
