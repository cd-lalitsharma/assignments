import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Question_7 {
    
    public static void main(String[] args) {
        System.out.println("Q. Submit List of tasks to ExecutorService and wait for the completion of all the tasks.");
        ExecutorService executorService=null;
        Future<Integer> future=null;
        List<Callable<Integer>> list = new ArrayList<>();
        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 1;
            }
        });
        
        list.add(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 2;
            }
        });
    
        try {
            executorService= Executors.newSingleThreadExecutor();
            
            List<Future<Integer>> f=executorService.invokeAll(list);
            f.forEach((e)->{
                if(e.isDone()){
                    try {
                        System.out.println(e.get());
                    } catch (InterruptedException e1) {
                        e1.printStackTrace();
                    } catch (ExecutionException e1) {
                        e1.printStackTrace();
                    }
                }
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
    }
}

