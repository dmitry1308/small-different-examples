package shchepin.examples.thread;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();

        System.out.println("Старт запуска: "+ new Date());
        long start    = System.currentTimeMillis();
        Thread.sleep(3000);
        long finish    = System.currentTimeMillis();
        long deltaSec = (finish - start)/1000;
        System.out.printf("Время запуска: %d сек\n", deltaSec);


        System.out.println("Финиш запуска: "+ new Date());
    }
}
