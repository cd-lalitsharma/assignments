import java.util.concurrent.*;

public class Question_6 {
    static  int a=0;
    public static void main(String[] args) {
        
        System.out.println("Q. Return a Future from ExecutorService by using callable and use get(), isDone(), isCancelled() with the Future object to know the status of task submitted.");
        Future<Integer> future=null;
        ExecutorService executorService=null;
        try{
    
            executorService = Executors.newSingleThreadExecutor();
            future = executorService.submit(new Callable<Integer>() {
        
                @Override
                public Integer call() throws Exception {
                    System.out.println("running");
                    return 2;
                }
            });
            
        }catch(Exception e){
            e.printStackTrace();
        }finally {
    
            executorService.shutdown();
        }
        
        
        if (future.isDone()){
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        if (future.isCancelled()){
            try{
                System.out.println("cancelled");
            }catch(Exception e){
                 e.printStackTrace();
            }
        }
    }
}

