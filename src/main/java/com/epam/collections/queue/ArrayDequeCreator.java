package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {

    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> combinedDeck = new ArrayDeque<>();

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()) {
            combinedDeck.offer(firstQueue.poll());
            combinedDeck.offer(firstQueue.poll());
            firstQueue.offer(secondQueue.poll());
            firstQueue.offer(secondQueue.poll());

            combinedDeck.offer(secondQueue.poll());
            combinedDeck.offer(secondQueue.poll());
            secondQueue.offer(firstQueue.poll());
            secondQueue.offer(firstQueue.poll());
        }
        combinedDeck.addAll(firstQueue);
        combinedDeck.addAll(secondQueue);

        return combinedDeck;
    }
}
