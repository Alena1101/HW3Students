package com.alena.service;

import com.alena.utils.StreamComparator;
import com.alena.model.Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private final List<Stream> streamList = new ArrayList<>();
    public List<Stream> getSortedStreamListByCount() {
        List<Stream> list = new ArrayList<>(streamList);
        list.sort(new StreamComparator());
        return list;
    }

}
