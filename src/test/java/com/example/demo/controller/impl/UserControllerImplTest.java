package com.example.demo.controller.impl;

import com.example.demo.domain.entity.User;
import org.junit.Test;

public class UserControllerImplTest {

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
        User user = new User();
        user.setUsername("cbg");
        user.setPassword("123456");
    }

    @Test
    public void selectByPrimaryKey() {
    }

    @Test
    public void selectAll() {
    }

    @Test
    public void updateByPrimaryKey() {
    }
}