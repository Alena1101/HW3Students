package com.alena.utils;

import com.alena.model.Stream;

import java.util.Comparator;

public class StreamComparator implements Comparator<Stream> {
    @Override
    public int compare(Stream o1, Stream o2) {
        return o1.compareTo(o2);
    }
}
