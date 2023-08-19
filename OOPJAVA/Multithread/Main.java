// package OOPJAVA.Multithread;

class NormalRun{
    public void run(){
        for (int i = 1; i <=5; i++){
            System.out.println(i+ "Hello From Normal Thread");
        }
    }
}

class AnotherThread extends  Thread{
    @Override
    public void run(){//Harus ada di setiap thread dan harus di override
    System.out.println("Hello From Another Thread");
    for (int i = 6;  i <= 10; i++){
        System.out.println(i+ "<---Hello From Another Thread");
        try{Thread.sleep(1000);}catch(Exception e){}
    }
    }
    
}

class Main{
    public static void main(String[] args) {
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        NormalRun normalRun = new NormalRun();
        //normalRun.run();
        System.out.println("Hello From Main Thread");
        for (int i=10; i<=20 ; i++){
            System.out.println(i+"<--- Hello From Main Thread");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }

}
