package zbl.study.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import zbl.study.model.City;
import zbl.study.service.CityService;

@Service(version = "1.1")
public class CityServiceImpl implements CityService {
    @Override
    public City getCity() {
        return new City("shanghai", "沿海地区");
    }
}
