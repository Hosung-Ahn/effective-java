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
}
