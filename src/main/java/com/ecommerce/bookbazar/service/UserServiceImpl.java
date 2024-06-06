package com.ecommerce.bookbazar.service;


import java.util.Optional;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.bookbazar.repository.UserDataRepository;

import jakarta.transaction.Transactional;

import com.ecommerce.bookbazar.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDataRepository userDataRepository;

    public UserServiceImpl(UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    @Override
    public Optional<User> getUser(Long id) {
        return userDataRepository.findById(id);
    }

    @Override
    public String createUser(User user) {
        userDataRepository.save(user);
        return "User Created Successfully";
    }

    
    @Override
    public String deleteUser(Long id) {
        userDataRepository.delete(userDataRepository.findById(id).get());
        return "Deleted Successfully";
    }
    
    @Override
    public List<User> getAllUser() {
        return userDataRepository.findAll();
    }
    @Override
    public String updateUser(Long id, User user) {
        User updatedUser = userDataRepository.findById(id).get();
        
        if(user.getFirstname() != null && !updatedUser.getFirstname().equals(user.getFirstname())) 
            updatedUser.setFirstname(user.getFirstname());

        if(user.getLastname() != null && !updatedUser.getLastname().equals(user.getLastname()))
            updatedUser.setLastname(user.getLastname());
        
        if(user.getAddress() != null && !updatedUser.getAddress().equals(user.getAddress()))
            updatedUser.setAddress(user.getAddress());

        if(user.getEmail() != null && !updatedUser.getEmail().equals(user.getEmail()))
            updatedUser.setEmail(user.getEmail());
        
        if(user.getMobile_no() != null && updatedUser.getMobile_no().equals(user.getMobile_no()))
            updatedUser.setMobile_no(user.getMobile_no());
        
        userDataRepository.save(updatedUser);

        return "Updated Successfully";
    }
}
