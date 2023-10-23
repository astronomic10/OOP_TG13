package a3InterrupteThreads;

public class MyThread extends Thread{
    public void run(){
        while(!isInterrupted()){
            System.out.println("Thread arbeitet");
        }   
        System.out.println("Thread wurde unterbrochen.");
     }

     public static void main(String[] args){
        MyThread myThread = new MyThread();
        myThread.start();

        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
    
    
        }
        myThread.interrupt();
        }

     }
     

