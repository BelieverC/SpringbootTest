package com.hc.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

//定时任务注解
@Component
public class TaskTest {

    private static final SimpleDateFormat sf = new SimpleDateFormat("HH:mm:ss");

    //两种设置时间的方式
    //@Scheduled(fixedRate = 3000)
    //@Scheduled(cron = "5-50 * * * * ? ")
    public void reportTime(){
        System.out.println("现在时间："+sf.format(new Date()));
    }

}
