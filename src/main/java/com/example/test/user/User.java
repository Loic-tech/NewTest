package com.example.test.user;

import com.example.test.group.Group;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Document(value = "user")
@Getter
@Setter
@Data
public class User {

    @Id
    @Indexed(unique = true)
    private String email;

    private String name;


    public User(){

    }
}
