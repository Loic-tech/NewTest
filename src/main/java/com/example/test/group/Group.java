package com.example.test.group;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(value = "group")
@Getter
@Setter
public class Group {

    @Id
    @Indexed(unique = true)
    private String name;

    List<Group> list;
}
