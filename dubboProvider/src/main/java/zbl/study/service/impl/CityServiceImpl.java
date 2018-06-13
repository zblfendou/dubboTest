package zbl.study.service.impl;

import org.springframework.stereotype.Service;
import zbl.study.model.City;
import zbl.study.service.CityService;
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Override
    public City getCity() {
        return new City("shanghai", "沿海地区");
    }
}
