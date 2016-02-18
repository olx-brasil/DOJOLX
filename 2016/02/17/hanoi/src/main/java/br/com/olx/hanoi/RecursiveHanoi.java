package br.com.olx.hanoi;

public class RecursiveHanoi {

    public static final int numberOfDisks = 2;


    public static void main(String[] args) {

        moveFromTo(numberOfDisks, 'A', 'B', 'C');
    }

    public static void moveFromTo(int topDisk, char from, char aux, char to) {

        if (topDisk == 1) {

            logMessage(topDisk, from, to);


        } else {

            moveFromTo(topDisk - 1, from, to, aux);
            logMessage(topDisk, from, to);
            moveFromTo(topDisk - 1, aux, from, to);

        }
    }

    private static void logMessage(int topDisc, int from, int to){

        System.out.println(String.format("Disco %d de %c para %c.", topDisc, from, to));

    }

}


