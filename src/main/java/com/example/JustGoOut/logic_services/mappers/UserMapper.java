package com.example.JustGoOut.logic_services.mappers;

import com.example.JustGoOut.domain.User;
import com.example.JustGoOut.persistence.entities.UserEntity;

public class UserMapper {

    //user entity to domain
    public static User toDomain(UserEntity userEntity){
        return new User(
                userEntity.getUserId(),
                userEntity.getUserName(),
                userEntity.getUserEmail(),
                userEntity.getUserProfilePicture()
        );
    }

    //user domain to entity
    public static UserEntity toEntity(User user){
        return new UserEntity(
                user.getUserId(),
                user.getUserName(),
                user.getUserEmail(),
                user.getUserProfilePicture()
        );
    }
}
