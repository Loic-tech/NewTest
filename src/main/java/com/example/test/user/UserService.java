package com.example.test.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;


@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public void getFromCSV() {
        String file = "src/WebDevTest.csv";
        BufferedReader reader = null;
        String line = "";

        try{
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null){
                String [] data = line.split(",");

                if(data[0].equals("U")){
                    User user = new User();
                    user.setEmail(data[1]);
                    user.setName(data[2]);
                    userRepository.save(user);
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
