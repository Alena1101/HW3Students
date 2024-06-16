package com.alena.controller;

import com.alena.model.Teacher;
import com.alena.model.User;

import java.util.List;
// класс User Controller определяет,что все наследники этого интерфейса будут уметь создавать,
// редактировать и возвращать список пользователей типа Т.
public interface UserController<T extends User> {
    void create (String firstName, String lastName, String middleName);
    void edit(Long id, String firstName, String lastName, String middleName);
    List<T> getList ();

}
