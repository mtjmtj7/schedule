package cn.mtjmtj7.schedule.Schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class test {

    @Scheduled(cron = "0/2 * * * * ?")
    public void test(){
        System.out.println("aaa" + new Date());
    }
}
