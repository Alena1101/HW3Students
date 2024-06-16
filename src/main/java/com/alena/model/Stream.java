package com.alena.model;

import java.util.Iterator;
import java.util.List;

public class Stream implements Iterator<StudentGroup>, Comparable<Stream> {


    private final List<StudentGroup> studentGroupList;
    private int index;

    public Stream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroupList.size()-1;
    }

    @Override
    public StudentGroup next() {
        if (!hasNext()) return null;
        index++;
        return studentGroupList.get(index);
    }

    @Override
    public void remove() {
        studentGroupList.remove(index);
    }

    @Override
    public int compareTo(Stream o) {

        return Integer.compare(studentGroupList.size(), o.studentGroupList.size());
    }
}
