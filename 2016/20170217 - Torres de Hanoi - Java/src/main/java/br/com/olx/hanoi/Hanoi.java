package br.com.olx.hanoi;
public class Hanoi {

//    private int numberDiscs = 2;
    private Pin pinA;
    private Pin pinB;
    private Pin pinC;

    public Hanoi(int numberDiscs) {

//        this.numberDiscs = numberDiscs;
        pinA = new Pin(numberDiscs);
        pinB = new Pin(0);
        pinC = new Pin(0);

    }

    public static void main(String[] args) {


    }

    public void moveFromTo(Pin from, Pin to){
        to.push(from.pop());

    }


    public Pin getPinA() {
        return pinA;
    }

    public Pin getPinB() {
        return pinB;
    }

    public Pin getPinC() {
        return pinC;
    }
}