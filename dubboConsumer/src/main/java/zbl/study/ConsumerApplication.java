package zbl.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zbl.study.dubbo.interfaces.UserService;

import javax.inject.Inject;

@SpringBootApplication
@ImportResource({"classpath:comsumer-dubbo.xml"})
@RestController
public class ConsumerApplication {
    @Inject
    UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        System.out.println("consumer application started !!!");
    }

    @RequestMapping("/consumer.do")
    public String consumer() {
        return userService.getUser();
    }
}
