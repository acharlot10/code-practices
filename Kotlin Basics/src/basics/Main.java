package basics;

import java.io.IOException;

class Main {
    public static void main (String[] args) {
        try {
            canThrowAnException();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void canThrowAnException() throws IOException{
        throw new IOException();
    }
}
