package com.alena;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private List<Stream> streamList;
    public List<Stream> getSortedStreamListByCount() {
        List<Stream> list = new ArrayList<>(streamList);
        list.sort(new StreamComparator());
        return list;
    }

}
