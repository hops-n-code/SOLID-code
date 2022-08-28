package com.hops_n_code.dojo.solid.lsp;

import java.util.Collection;
import java.util.Objects;

public class CollectionOperator {
    public Double operate(Collection<Double> collection) {
        return collection.stream()
                .filter(Objects::nonNull)
                .reduce(0d, Double::sum);
    }
}
