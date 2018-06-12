package zbl.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import zbl.study.model.City;
import zbl.study.service.CityService;

@SpringBootApplication
@RestController
public class ConsumerApplication {
    @Autowired
    CityService cityService;

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        System.out.println("consumer application started !!!");
    }

    @RequestMapping("/consumer.do")
    public String consumer() {
        City city = cityService.getCity();
        return city.getName() + " " + city.getAddress();
    }
}
