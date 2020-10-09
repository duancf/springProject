package com.duan.demo;

import org.springframework.cglib.core.Local;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/*
线程A输出1 2 3，线程B输出4 5 6， 线程A输出7 8 9
 */
public class ReentrantLock  {
    static class NumberWrapper{
        int val = 1;
    }

    public static void main(String[] args) {
        //初始化可重入锁
        final Lock lock = new java.util.concurrent.locks.ReentrantLock();

        //第一个条件当屏幕上输出到3
        final Condition condition3 = lock.newCondition();

        //第二个条件当屏幕上输出到6
        final  Condition condition6 = lock.newCondition();

        final NumberWrapper num = new NumberWrapper();

        //初始化线程A
        Thread threadA = new Thread(
                new Runnable() {
                    public void run() {
                        //需要先获得锁
                        lock.lock();
                        try{
                            System.out.println("线程A开始输出：");
                            while(num.val <= 3)
                            {
                                System.out.println(num.val);
                                num.val++;
                            }
                            condition3.signal();
                        }
                        finally {
                            lock.unlock();
                        }


                        //输出7 8 9
                        lock.lock();
                        try{
                            //等待输出
                            condition6.await();
                            System.out.println("线程A开始输出：");
                            while(num.val <= 9)
                            {
                                System.out.println(num.val);
                                num.val++;
                            }
                        }
                        catch (InterruptedException ex){
                            System.out.println(ex.getMessage());
                        }
                        finally {
                            lock.unlock();
                        }
                    }
                }
        );

        Thread threadB = new Thread(
                new Runnable() {
                    public void run() {
                        //获得锁
                        lock.lock();
                        try{
                            while(num.val <= 3)
                                condition3.await();

                        }
                        catch (InterruptedException ex){
                            System.out.println(ex.getMessage());
                        }
                        finally {
                            lock.unlock();
                        }

                        try{
                            lock.lock();
                            //等待线程A输出完成，唤醒condition3

                            System.out.println("线程B开始输出：");
                            while(num.val <= 6){
                                System.out.println(num.val);
                                num.val++;
                            }
                            condition6.signal();
                        }
                        finally {
                            lock.unlock();
                        }
                    }
                }
        );


        threadB.start();
        threadA.start();

    }


}
