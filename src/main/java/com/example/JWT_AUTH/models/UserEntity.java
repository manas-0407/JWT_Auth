package com.example.JWT_AUTH.models;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "user_table")
public class UserEntity {

    private String username;

    private String password;

}
