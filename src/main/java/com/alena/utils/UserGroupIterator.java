package com.alena.utils;

import com.alena.model.Student;
import com.alena.model.StudentGroup;
import com.alena.model.User;
import com.alena.model.UserGroup;

import java.util.Iterator;
import java.util.List;
// Чтобы не реализовывать точно такой же iterator для TeacherGroup,
// интерфейс StudentGroupIterator был переделан в UserGroupIterator,
// который теперь общий для студентов и учителей.
public class UserGroupIterator implements Iterator<User> {
    private int index;
    private final List<User> userList;

    public UserGroupIterator(UserGroup userGroup) {
        this.index = 0;
        this.userList = userGroup.getList();
    }

    @Override
    public boolean hasNext() {
        return index< userList.size()-1;
    }

    @Override
    public User next() {
        if (!hasNext()) return null;
        index++;
        return userList.get(index);
    }

    @Override
    public void remove() {
        userList.remove(index);
    }
}
