package Decorator;

import java.io.BufferedReader;
import Decorator.*;

public class Test{
    public static void main(String[] args) {
        Icecream vanilla = new Vanilla();
        System.out.println("simple vanilla cost: " + vanilla.cost());
    }
}