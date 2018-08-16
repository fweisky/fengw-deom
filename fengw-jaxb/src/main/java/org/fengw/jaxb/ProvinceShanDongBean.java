package org.fengw.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 山东省Bean
 *
 * @author 封伟
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ProvinceShanDong")
@XmlType(propOrder={"name", "cityQingDao"})
public class ProvinceShanDongBean {

    /** 省份名称 */
    @XmlElement(name="name")
    private String name;

    /** 青岛市 */
    @XmlElement(name="CityQingDao")
    private CityQingDaoBean cityQingDao;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CityQingDaoBean getCityQingDao() {
        return cityQingDao;
    }

    public void setCityQingDao(CityQingDaoBean cityQingDao) {
        this.cityQingDao = cityQingDao;
    }
}
