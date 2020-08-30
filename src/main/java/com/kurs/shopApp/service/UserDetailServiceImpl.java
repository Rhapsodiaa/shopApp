package com.kurs.shopApp.service;

import com.kurs.shopApp.repository.UserRepository;
import com.kurs.shopApp.repository.model.UserModel;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    public UserDetailServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel currentUser = userRepository.findByUsername(username);
        UserDetails user = new User(username, currentUser.getPassword(),true,true,true,true, AuthorityUtils.createAuthorityList(currentUser.getRole()));
        return user;
    }
}
