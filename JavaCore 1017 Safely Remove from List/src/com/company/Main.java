package com.company;

/*

1017 Safely Remove from List
Create a list of integers.
Enter 20 integers from the keyboard.
Create a method to safely extract numbers from a list:
int safeGetElement (ArrayList <Integer> list, int index, int defaultValue)
The method should return a list item (list) at its index (index).
If an exception occurs during the process of receiving the element, it must be caught and the method should return defaultValue.

Requirements:
1. The program should read 20 numbers from the keyboard.
2. The program should display data on the screen.
3. The safeGetElement method should return the list item by index if no exceptions have occurred inside the method.
4. The safeGetElement method should return defaultValue if there are no exceptions inside the method. The exception is to catch.
5. The safeGetElement method must not throw exceptions.

 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i=0; i<20; i++) {
        int x = Integer.parseInt(reader.readLine());
        list.add(x);
    }
    System.out.println(safeGetElement(list, 5, 1));
    System.out.println(safeGetElement(list, 20, 7));
    System.out.println(safeGetElement(list, -5, 9));
    }
    public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
        try {
            return list.get(index);
        }
        catch (Exception e) {
            return defaultValue;
        }
    }
}


















