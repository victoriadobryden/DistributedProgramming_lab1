package ua.univer;

public class MyThread extends Thread{
    private String myName;

    public MyThread(String myName) {
        this.myName = myName;
    }

    public String getMyName() {
        return myName;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId()+" = "+ Thread.currentThread().getName());
    }

    @Override
    public String toString() {
        return "MyThread{" +
                "myName='" + myName + '\'' +
                "} " + super.toString();
    }
}
