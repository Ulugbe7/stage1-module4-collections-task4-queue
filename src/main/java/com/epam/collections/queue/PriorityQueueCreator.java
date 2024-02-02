package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {

        List<String> mergedList = new ArrayList<>(firstList);
        mergedList.addAll(secondList);

        var queue = new PriorityQueue<String>(Collections.reverseOrder());
        queue.addAll(mergedList);

        return queue;
    }
}
