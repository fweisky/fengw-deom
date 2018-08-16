package org.fengw.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 辽宁省Bean
 *
 * @author 封伟
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ProvinceLiaoNing")
@XmlType(propOrder={"name", "cityShenYang"})
public class ProvinceLiaoNingBean {

    /** 省份名称 */
    @XmlElement(name="name")
    private String name;

    /** 沈阳市 */
    @XmlElement(name="CityShenYang")
    private CityShenYangBean cityShenYang;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityShenYangBean getCityShenYang() {
        return cityShenYang;
    }

    public void setCityShenYang(CityShenYangBean cityShenYang) {
        this.cityShenYang = cityShenYang;
    }
}
