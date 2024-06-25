package com.effectivejava.item10;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // 1. 자기 자신과 같은 지 확인한다.

        if (!(obj instanceof Point)) return false; // 2. obj가 Point의 인스턴스인지 확인한다.

        Point point = (Point) obj; // obj를 Point로 캐스팅한다.

        return point.x == x && point.y == y; // 3. 핵심적인 필드들을 비교한다.
    }
}
