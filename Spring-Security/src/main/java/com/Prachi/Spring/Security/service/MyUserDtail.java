package com.Prachi.Spring.Security.service;


import com.Prachi.Spring.Security.Repo.UserRepo;
import com.Prachi.Spring.Security.modal.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDtail implements UserDetailsService {

    @Autowired
    UserRepo repo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users user=repo.findByUserName(username);

        if(user==null){
            System.out.println("User 404");
            throw new UsernameNotFoundException("404 user");
        }
        return user;
    }
}
