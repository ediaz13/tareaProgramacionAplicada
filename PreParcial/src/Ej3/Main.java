package Ej3;

import javax.swing.*;
import java.util.Random;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<Nodo> stack = new Stack<Nodo>();
        int valorMax = Integer.MIN_VALUE;
        for (int i = 0; i < 10; ++i) {
            Random rand = new Random();
            Nodo nodo = new Nodo(rand.nextInt());
            stack.push(nodo);
        }

        while (!stack.empty()) {
            int val = stack.pop().getValor();

            if (val > valorMax) {
                valorMax = val;
            }
        }


        System.out.println(valorMax);
    }


}
