package com.devsuperior.hroauth.entities;

import lombok.Data;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Data
public class User implements Serializable {

    private Long id;
    private String name;
    private String email;
    private String password;

    Set<Role> roles = new HashSet<>();
}
