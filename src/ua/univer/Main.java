package ua.univer;



public class Main {

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getId()+" = "+ Thread.currentThread().getName());
        MyThread myThread = new MyThread("first");
        myThread.start();

        Thread th = new Thread(new MyInterfaceImpl());
        th.start();
    }
}
