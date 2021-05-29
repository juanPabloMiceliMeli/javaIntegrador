package main;

import java.util.Comparator;

public class BubbleSortSorterImple <T> implements Sorter<T>{

    @Override
    public void sort(T[] arr, Comparator<T> c) {
        System.out.println("Ahi te va Bubble");

        int N = arr.length;
        for(int i = 0; i < N; i++){
            for(int j=0; j<N-1-i;j++){
                if(c.compare(arr[j], arr[j+1]) > 0){
                    T aux = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }
}
