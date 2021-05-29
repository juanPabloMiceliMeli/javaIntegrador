package main;

import java.time.LocalDateTime;
import java.util.Timer;

public class Time {
    private long start;
    private long end;

    public Time() {
    }

    public void start(){
        this.start = System.currentTimeMillis();
    }

    public void stop(){
        this.end = System.currentTimeMillis();
    }

    public long elapsedTime(){
        return this.end - this.start;
    }


}
