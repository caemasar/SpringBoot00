package idv.caemasar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppSuperiorPackage {
    /* 这里证明SpringBootApplication注解会对其下层类进行扫描，即如果是SameLevel则扫描不到其他同级包
     */

    public static void main(String[] args) {
        SpringApplication.run(AppSuperiorPackage.class, args);
    }
}
