package com.example.test2.logic;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class ServerLogic {


    public String publishToken() {

        String id = UUID.randomUUID().toString();
        //put your uuid

        try {
            return FirebaseAuth.getInstance().createCustomToken(id);
        } catch (FirebaseAuthException e) {
            throw new RuntimeException("다시 시도해주세요.");
        }
    }
}
