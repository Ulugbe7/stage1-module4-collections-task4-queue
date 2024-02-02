package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> table = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            table.add(i);
        }
        while (!table.isEmpty()) {
            for (int i = 3; i != 0; i--) {
                table.add(table.removeFirst());
            }
            result.add(table.removeFirst());
        }

        return result;
    }
}
