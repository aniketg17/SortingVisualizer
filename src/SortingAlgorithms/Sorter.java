package SortingAlgorithms;

import GUI.ArrayVisualization;

public abstract class Sorter {
    private int arraySize;
    public abstract void sort(ArrayVisualization array) throws InterruptedException;
    private String toString;
}