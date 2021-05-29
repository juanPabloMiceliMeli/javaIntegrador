package main;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Comparator;

public class Main {

    public static <T> void printArray(T[] arr){
        for(T t : arr){
            System.out.println(t);
        }
        System.out.println('\n');
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        int N = 10000;

        Integer[] arr = new Integer[N];
        for(int i = 0; i < N; i++){
            arr[i] = 2*N-i;
        }
        Time timer = new Time();

        Sorter<Integer> sorter = (Sorter<Integer>) MiFactory.getInstance("sorter");
        timer.start();
        sorter.sort(arr, Integer::compareTo);
        timer.stop();
        System.out.println(timer.elapsedTime());
//        printArray(arr);



    }
}
