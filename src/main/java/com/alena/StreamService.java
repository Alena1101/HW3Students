package com.alena;

import java.util.ArrayList;
import java.util.List;

public class StreamService {
    private final List<Stream> streamList = List.of(
            new Stream(List.of(
                    new StudentGroup(List.of(
                            new Student(0L, "Pavel", "Ivanov", ""),
                            new Student(115616598L, "Mihail", "Petrov", ""),
                            new Student(565L, "Aleksandra", "Anisimova", ""),
                            new Student(4587565L, "Maksim", "Antonov", "Petrovich"),
                            new Student(45L, "Maksim", "Antonov", "Sergeevich")
                    ))
            )),
            // Тестовые данные
            new Stream(List.of(
                    new StudentGroup(List.of(
                            new Student(0L, "Pavel", "Ivanov", ""),
                            new Student(115616598L, "Mihail", "Petrov", ""),
                            new Student(565L, "Aleksandra", "Anisimova", ""),
                            new Student(4587565L, "Maksim", "Antonov", "Petrovich"),
                            new Student(45L, "Maksim", "Antonov", "Sergeevich")
                    ))
            ))
    );
    public List<Stream> getSortedStreamListByCount() {
        List<Stream> list = new ArrayList<>(streamList);
        list.sort(new StreamComparator());
        return list;
    }

}
