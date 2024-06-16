package com.alena.model;

import com.alena.utils.UserGroupIterator;

import java.util.Iterator;
import java.util.List;
// TeacherGroup и StudentGroup содержали одинаковые методы, которые были вынесены
// в общий абстрактный класс UserGroup с общим типом Т.
// Также реализация интерфейса Itereble была вынесена в обобщенный класс.
public abstract class UserGroup<T extends User> implements Iterable<User>{
    public abstract void createUser(String firstName, String lastName, String middleName);
    public void editUser(Long userId, String firstName, String lastName, String middleName) {
        for (T user: getList()) {
            if (userId == user.getId()) {
                user.setFirstName(firstName);
                user.setLastName(lastName);
                user.setMiddleName(middleName);
                break;
            }
        }
    }
    public abstract List<T> getList();
    @Override
    public Iterator<User> iterator() {
        return new UserGroupIterator(this);
    }
}
