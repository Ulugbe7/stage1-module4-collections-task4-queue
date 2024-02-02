package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(firstQueue.remove());
        deque.add(firstQueue.remove());
        deque.add(secondQueue.remove());
        deque.add(secondQueue.remove());
        while (!(firstQueue.isEmpty()) && !(secondQueue.isEmpty())) {
            firstQueue.add(deque.removeLast());
            deque.add(firstQueue.remove());
            deque.add(firstQueue.remove());
            secondQueue.add(deque.removeLast());
            deque.add(secondQueue.remove());
            deque.add(secondQueue.remove());
        }

        return deque;
    }
}
