package com.alena.utils;

import com.alena.model.Student;
import com.alena.model.User;
import com.alena.model.UserGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// Этот класс отвечает за разные виды сортировки у UserGroup,
// таким образом мы вынесли логику сортировки из сервисов.
public class SortHelper<T extends User> {
    public List<T> getSortedList (UserGroup userGroup) {
        List list = new ArrayList<>(userGroup.getList());
        Collections.sort(list);
        return list;
    }
    public List<T> getSortedListByFIO (UserGroup userGroup) {
        List list = new ArrayList<>(userGroup.getList());
        list.sort(new UserComparator<User>());
        return list;
    }
}
