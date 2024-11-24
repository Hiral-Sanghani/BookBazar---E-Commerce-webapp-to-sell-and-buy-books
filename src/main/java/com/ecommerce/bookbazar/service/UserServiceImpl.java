package com.ecommerce.bookbazar.service;

import java.util.Optional;
import java.util.List;
import java.util.stream.Collectors;

import com.ecommerce.bookbazar.model.User;
import com.ecommerce.bookbazar.service.dto.UserDTO;
import com.ecommerce.bookbazar.service.dto.UserRegistrationDTO;
import com.ecommerce.bookbazar.service.mapper.UserMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ecommerce.bookbazar.repository.UserDataRepository;


@Service
public class UserServiceImpl implements UserService {

    private UserDataRepository userDataRepository;

    public UserServiceImpl(UserDataRepository userDataRepository) {
        this.userDataRepository = userDataRepository;
    }

    @Override
    public Optional<UserDTO> getUser(Long id) {
        return userDataRepository.findById(id).map(UserMapper::mapToUserDto);
    }

    @Override
    public ResponseEntity createUser(UserRegistrationDTO userRegistrationDTO) {

        System.out.println("User Object == " + userRegistrationDTO.toString());

        User user = UserMapper.mapToUser(userRegistrationDTO);
        user.setPassword(userRegistrationDTO.getPassword());
        System.out.println("user ====>  " + user.toString());
        userDataRepository.save(user);
        return ResponseEntity.ok(HttpStatus.CREATED);
    }


    @Override
    public ResponseEntity<String> deleteUser(Long id) {
        Optional<User> user = userDataRepository.findById(id);
        if (user.isPresent()) {
            userDataRepository.delete(user.get());
            return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("User Not Found", HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public Optional<List<UserDTO>> getAllUser() {
        List<UserDTO> users = userDataRepository.findAll().stream()
                .map(UserMapper::mapToUserDto)
                .collect(Collectors.toList());
        return Optional.of(users);
    }

    @Override
    public String updateUser(Long id, UserDTO user) {
        User updatedUser = userDataRepository.findById(id).get();

        if (user.getFirstName() != null && !updatedUser.getFirstName().equals(user.getFirstName()))
            updatedUser.setFirstName(user.getFirstName());

        if (user.getLastName() != null && !updatedUser.getLastName().equals(user.getLastName()))
            updatedUser.setLastName(user.getLastName());

        if (user.getAddress() != null && !updatedUser.getAddress().equals(user.getAddress()))
            updatedUser.setAddress(user.getAddress());

        if (user.getEmailId() != null && !updatedUser.getEmailId().equals(user.getEmailId()))
            updatedUser.setEmailId(user.getEmailId());

        if (user.getMobileNo() != null && updatedUser.getMobileNo().equals(user.getMobileNo()))
            updatedUser.setMobileNo(user.getMobileNo());

        userDataRepository.save(updatedUser);

        return "Updated Successfully";
    }
}
