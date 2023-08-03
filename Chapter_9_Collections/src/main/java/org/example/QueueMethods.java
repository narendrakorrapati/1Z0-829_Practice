package org.example;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueMethods {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(10); //queue.offer(10);
        queue.add(4); //queue.offer(4);

        System.out.println(queue.remove()); //10 //queue.poll();
        System.out.println(queue.element()); //4 //queue.peek();

        System.out.println(queue); //[4]

        Deque<Integer> deque = new LinkedList<>();

        deque.addFirst(10);
        deque.offerFirst(9);

        deque.addLast(8);
        deque.offerLast(7);

        deque.getFirst();
        deque.peekFirst();

        deque.getLast();
        deque.peekLast();

        deque.removeFirst();
        deque.pollFirst();

        deque.removeLast();
        deque.pollLast();

    }
}
