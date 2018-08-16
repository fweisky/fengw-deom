package org.fengw.jaxb;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 沈阳市Bean
 *
 * @author 封伟
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="CityShenYang")
@XmlType(propOrder={"name", "peopleCount", "averageSalary", "hasSea"})
public class CityShenYangBean {

    /** 城市名称 */
    @XmlElement(name="name")
    private String name;

    /** 人口总数 */
    @XmlElement(name="peopleCount")
    private Integer peopleCount;

    /** 平均工资 */
    @XmlElement(name="averageSalary")
    private BigDecimal averageSalary;

    /** 是否有海 */
    @XmlElement(name="hasSea")
    private Boolean hasSea;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public BigDecimal getAverageSalary() {
        return averageSalary;
    }

    public void setAverageSalary(BigDecimal averageSalary) {
        this.averageSalary = averageSalary;
    }

    public Boolean getHasSea() {
        return hasSea;
    }

    public void setHasSea(Boolean hasSea) {
        this.hasSea = hasSea;
    }
}
