package com.healthify.version.controllers;

import com.healthify.version.dtos.UserDTO;
import com.healthify.version.dtos.UserProfileDTO;
import com.healthify.version.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/users")
public class UserController {

    private  final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // creates new user profile
    @PostMapping("/create/profile")
    public ResponseEntity<UserProfileDTO> createNewUserProfile(UserProfileDTO inputDTO){
        UserProfileDTO userProfile = userService.createNewUserProfile(inputDTO);
        return ResponseEntity.ok(userProfile);
    }

    //allows user to update his profile
    @PutMapping("/update/{userId}/profile")
    public ResponseEntity<UserProfileDTO> updateUserById(@PathVariable Long userId, UserProfileDTO updateDTO){
        UserProfileDTO userDTO = userService.updateUserById(userId,updateDTO);
        return ResponseEntity.ok(userDTO);
    }

    //get the user details
    @GetMapping("/profile/{userId}")
    public ResponseEntity<UserProfileDTO> getUSerById(@PathVariable Long userId){
        UserProfileDTO userDTO = userService.getUserById(userId);
        return ResponseEntity.ok(userDTO);
    }


}
