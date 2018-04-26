package jhotel;

public class Demos extends Thread {
    private Thread t;
    private String threadname;
    public Demos (String threadname){
        this.threadname = threadname;
        System.out.println("Initiliazed" + threadname);
    }
    public void run(){
        System.out.println("countdown" + threadname);
        try {
            for(int count = 10; count >0; count --){
                System.out.println(threadname + " "+ count);
                Thread.sleep(500);
            }
        } catch(InterruptedException e){
            System.out.println("Thread" + threadname + "Interrupted");
        }
    }

    public void start(){
        System.out.println(threadname + "Started");
        if (t == null){
            t = new Thread(this,threadname);
            t.start();
        }
    }
}



