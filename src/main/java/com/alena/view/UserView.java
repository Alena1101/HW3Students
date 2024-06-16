package com.alena.view;

import com.alena.model.User;

import java.util.List;

public interface UserView <T extends User> {
    void sendOnConsole(List<T> list);
}
