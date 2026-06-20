package chapter9;

import java.util.Date;

public class stopwatch {
    Date d=new Date();
        private long start_time;
        private long end_time;

        public stopwatch(){
            start_time =System.currentTimeMillis();
}
        
    public long getStart_time() {
        return start_time;
    }

    public long getEnd_time() {
        return end_time;
    }
    public void start(){
         start_time =System.currentTimeMillis();
    }
    
      public void stop(){
        end_time =System.currentTimeMillis();
    }
      public long getElapsedTime(){
      return (end_time-start_time);
      }
      
}
