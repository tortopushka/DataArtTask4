package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Calculator {
    /**
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        Integer number1=0;
        int size= firstNumber.size()-1;
        while(0<=size){
            int t=firstNumber.get(size);
            number1= number1*10+ t;
            size--;
        }
        Integer number2=0;
        size= secondNumber.size()-1;
        while(0<=size){
            int t=secondNumber.get(size);
            number2= number2*10+ t;
            size--;
        }
        return number1+number2;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List <T> newList=new <T> ArrayList();
        int size= list.size();
        int i=0;
        while(i<size){
            newList.add(list.get(i));
            i=i+2;
        }
       return newList;
    }

    /**
     *
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        List<T> newList=new ArrayList();
        int size= list.size();
        if (size>0){
            newList.add(list.get(0));
            newList.add(list.get(size-1));
        }
        return newList;
    }
}
