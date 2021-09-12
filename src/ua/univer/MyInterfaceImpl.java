package ua.univer;

public class MyInterfaceImpl implements Runnable{
    @Override
    public void run() {
        System.out.println("RunAble"+Thread.currentThread().getId()+" = "+ Thread.currentThread().getName());
    }
}
