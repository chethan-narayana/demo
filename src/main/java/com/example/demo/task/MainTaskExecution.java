package com.example.demo.task;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

public class MainTaskExecution {
    public static void main(String[] args) {
        ProductListGenerator generator = new ProductListGenerator();
        List<Product> productList = generator.generate(10000);
        Task task = new Task(productList,0,productList.size(),0.20);

        System.out.println("Pool Size "+ForkJoinPool.commonPool().getPoolSize());

        ForkJoinPool pool = new ForkJoinPool();
        pool.execute(task);


        do{

            System.out.println("Parallel " + pool.getParallelism());
            System.out.println("Active thread Count " + pool.getActiveThreadCount());
            System.out.println("Queued task Count " + pool.getQueuedTaskCount());
            System.out.println("Steal Count " + pool.getStealCount());
            try{
                TimeUnit.MILLISECONDS.sleep(5);
            }catch (InterruptedException e){
                e.printStackTrace();
            }

        }while(!task.isDone());
        pool.shutdown();
        if(task.isCompletedNormally()){
            System.out.println("process completed normally!!");
        }

        for(int i =0 ;i<productList.size(); i++){
            if(productList.get(i).getPrice() != 12){
                System.out.println("product " + productList.get(i).getName() + " Price "+productList.get(i).getPrice());
            }
        }
        System.out.println("End");
    }
}
