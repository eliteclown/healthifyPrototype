package com.healthify.version.services;

import com.healthify.version.dtos.UserDTO;
import com.healthify.version.dtos.UserProfileDTO;
import com.healthify.version.entities.UserEntity;
import com.healthify.version.entities.UserProfileEntity;
import com.healthify.version.exceptions.UserNotFoundException;
import com.healthify.version.repositories.UserProfileRespository;
import com.healthify.version.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserProfileRespository userProfileRespository;
    private final ModelMapper modelMapper;

    public UserService( UserProfileRespository userProfileRespository, ModelMapper modelMapper) {
        this.userProfileRespository = userProfileRespository;

        this.modelMapper = modelMapper;
    }


    public UserProfileDTO createNewUserProfile(UserProfileDTO inputDTO) {

        UserProfileEntity userProfile = modelMapper.map(inputDTO, UserProfileEntity.class);

        UserProfileEntity savedEntity = userProfileRespository.save(userProfile);
        return modelMapper.map(savedEntity,UserProfileDTO.class);

    }

    public UserProfileDTO updateUserById(Long userId,UserProfileDTO updateDTO) {


        UserProfileEntity userProfile= modelMapper.map(updateDTO,UserProfileEntity.class);
        userProfile.setId(userId);

        UserProfileEntity savedEntity=userProfileRespository.save(userProfile);
        return modelMapper.map(savedEntity,UserProfileDTO.class);


    }

    public UserProfileDTO getUserById(Long userId) {

        UserProfileEntity userProfile = userProfileRespository.findById(userId).orElseThrow(()-> new UserNotFoundException("User Not Found "));

        return modelMapper.map(userProfile,UserProfileDTO.class);

    }
}
