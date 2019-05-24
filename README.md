### 简单定时任务 @Scheduled注解的使用
1.编写定时类。
```
@Component
   public class test {
   
       @Scheduled(cron = "0/2 * * * * ?")
       public void test(){
           System.out.println("aaa" + new Date());
       }
   }
```

2.启动。

在启动类中添加注解```@EnableScheduling```
效果如下。![](https://cdn.sinaimg.cn.52ecy.cn/large/005BYqpgly1g3c8saa6otj30f704t0sw.jpg)