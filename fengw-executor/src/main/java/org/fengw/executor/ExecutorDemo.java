package org.fengw.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用<code>java.util.concurrent.ExecutorService</code>实现多线程操作
 *
 * @author 封伟
 */
public class ExecutorDemo {

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(4);
        Future<String> resA = service.submit(getCallable("A"));
        Future<String> resB = service.submit(getCallable("B"));
        Future<String> resC = service.submit(getCallable("C"));
        Future<String> resD = service.submit(getCallable("D"));

        System.out.println(resA.get());
        System.out.println(resB.get());
        System.out.println(resC.get());
        System.out.println(resD.get());
    }

    private static Callable<String> getCallable(final String str) {
        return new Callable<String>() {
            public String call() throws Exception {
                return "Call " + str;
            }
        };
    }
}
