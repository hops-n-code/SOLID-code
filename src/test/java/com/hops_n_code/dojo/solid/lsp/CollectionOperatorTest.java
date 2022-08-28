package com.hops_n_code.dojo.solid.lsp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CollectionOperatorTest {

    private CollectionOperator collectionOperator;

    @BeforeEach
    void setUp() {
        collectionOperator = new CollectionOperator();
    }

    @Test
    void operateOnList() {
        assertThat(collectionOperator.operate(new ArrayList<>(List.of(1d, 2d, 3d))))
                .isEqualTo(6d);
    }

    @Test
    void operateOnQueue() {
        assertThat(collectionOperator.operate(new PriorityQueue<>(List.of(1d, 2d, 3d))))
                .isEqualTo(6d);
    }

    @Test
    void operateOnSet() {
        assertThat(collectionOperator.operate(new HashSet<>(List.of(1d, 2d, 3d))))
                .isEqualTo(6d);
    }
}
