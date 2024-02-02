package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> deque = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            deque.add(i);
        }
        while (!deque.isEmpty()) {
            for (int i = 3; i != 0; i--) {
                deque.add(deque.removeFirst());
            }
            list.add(deque.removeFirst());
        }

        return list;
    }
}
