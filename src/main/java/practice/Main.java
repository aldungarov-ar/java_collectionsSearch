package practice;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    /*
    TODO:
     - реализовать методы класса CoolNumbers
     - посчитать время поиска введимого номера в консоль в каждой из структуры данных
     - проанализоровать полученные данные
     */

    public static void main(String[] args) {
        List<String> coolNumbers = CoolNumbers.generateCoolNumbers();
        //Bruteforce
        long start = System.nanoTime();
        boolean search = CoolNumbers.bruteForceSearchInList(coolNumbers, "В999ВА198");
        long time = System.nanoTime() - start;
        System.out.println("Поиск перебором: номер " +
                (!search ? "не " : "") + "найден, поиск занял: " + time + "нс");
        //Sorted
        Collections.sort(coolNumbers);
        start = System.nanoTime();
        search = CoolNumbers.binarySearchInList(coolNumbers, "В999ВА198");
        time = System.nanoTime() - start;
        System.out.println("Бинарный поиск: номер " +
                (!search ? "не " : "") + "найден, поиск занял: " + time + "нс");
        //Hashset
        HashSet<String> coolHash = new HashSet<>(coolNumbers);
        start = System.nanoTime();
        search = CoolNumbers.searchInHashSet(coolHash, "В999ВА198");
        time = System.nanoTime() - start;
        System.out.println("Поиск в HashSet: номер " +
                (!search ? "не " : "") + "найден, поиск занял: " + time + "нс");
        //TreeSet
        TreeSet<String> coolTree = new TreeSet<>(coolNumbers);
        start = System.nanoTime();
        search = CoolNumbers.searchInTreeSet(coolTree, "В999ВА198");
        time = System.nanoTime() - start;
        System.out.println("Поиск в TreeSet: номер " +
                (!search ? "не " : "") + "найден, поиск занял: " + time + "нс");
    }
}
