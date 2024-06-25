package com.effectivejava.item10;

import lombok.EqualsAndHashCode;
import lombok.ToString;

@EqualsAndHashCode
@ToString
public class PointLombok {
    int x;
    int y;

    public PointLombok(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        PointRecord pointRecord = new PointRecord(10, 20);
        PointRecord pointRecord2 = new PointRecord(10, 20);

        System.out.println(pointRecord.equals(pointRecord2)); // true
        System.out.println(pointRecord2.equals(pointRecord)); // true

        System.out.println(pointRecord); // PointRecord[x=10, y=20]
        System.out.println(pointRecord.x()); // 10
    }
}
