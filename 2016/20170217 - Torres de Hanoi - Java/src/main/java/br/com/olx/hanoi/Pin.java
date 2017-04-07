package br.com.olx.hanoi;

import java.util.List;
import java.util.Stack;

/**
 * Created by bernardo.carneiro on 2/17/16.
 */
public class Pin {

    private Stack<Disc> discList;

    public Pin(int numberOfDiscs) {
        this.discList = new Stack<Disc>();
        for (int i = numberOfDiscs; i > 0; i--) {
            this.discList.push(new Disc(i));
        }
    }

    public void addDisc(Disc disc) {
        this.discList.push(disc);
    }

    public boolean isEmpty() {
        return this.discList.isEmpty();
    }

    public int getNumberOfDiscs() {
        return discList.size();
    }

    public Disc pop() {
        return discList.pop();
    }

    public void push(Disc disc) {
        discList.push(disc);
    }

    public int size() {
        return discList.size();
    }
}
