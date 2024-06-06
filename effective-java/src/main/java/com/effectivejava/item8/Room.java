package com.effectivejava.item8;

import java.lang.ref.Cleaner;

// cleaner 를 안정망으로 사용하는 AutoCloseable 클래스
public class Room implements AutoCloseable{
    private static final Cleaner cleaner = Cleaner.create();

    // 청소가 필요한 자원으로 절대 Room 을 참조해서는 안된다.
    private static class State implements Runnable {
        int numJunkPiles; // 방 안의 쓰레기 수

        State(int numJunkPiles) {
            this.numJunkPiles = numJunkPiles;
        }

        // close 메서드나 cleaner 가 호출한다.
        @Override
        public void run() {
            System.out.println("Cleaning room");
            numJunkPiles = 0;
        }
    }

    // 방의 상태. cleanable 과 공유한다.
    private final State state;

    // cleanable 객체. 수거 대상이 되면 방을 청소한다.
    private final Cleaner.Cleanable cleanable;

    public Room(int numJunkPiles) {
        state = new State(numJunkPiles);
        cleanable = cleaner.register(this, state);
    }

    @Override
    public void close() throws Exception {
        cleanable.clean();
    }

    public static void main(String[] args) {
        try (Room room = new Room(7)) {
            System.out.println("Goodbye");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("===============");

        Room room = new Room(99);
        System.out.println("Peace out  ");
    }
}

