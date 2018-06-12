package zbl.study.model;

import java.io.Serializable;

public class City implements Serializable {
    private String name;
    private String address;

    public City(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public City() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
