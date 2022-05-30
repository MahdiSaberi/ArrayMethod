package com.arraymethod.project;

public interface Pair<T,S> extends Comparable<Pair<T,S>> {
    T getFirst();
    S getSecond();
}
