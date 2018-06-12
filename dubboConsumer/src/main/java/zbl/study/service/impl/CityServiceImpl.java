package zbl.study.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import zbl.study.model.City;
import zbl.study.service.CityService;

@Component
public class CityServiceImpl implements CityService {
    @Reference(version = "1.1")
    CityService cityService;

    @Override
    public City getCity() {
        return cityService.getCity();
    }
}
