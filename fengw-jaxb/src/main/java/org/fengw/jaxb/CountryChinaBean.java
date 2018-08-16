package org.fengw.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 中国Bean
 *
 * @author 封伟
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="CountryChina")
@XmlType(propOrder={"name", "provinceLiaoNing", "provinceShanDong"})
public class CountryChinaBean {

    /** 国家名称 */
    @XmlElement(name="name")
    private String name;

    /** 辽宁省 */
    @XmlElement(name="ProvinceLiaoNing")
    private ProvinceLiaoNingBean provinceLiaoNing;

    /** 山东省 */
    @XmlElement(name="ProvinceShanDong")
    private ProvinceShanDongBean provinceShanDong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProvinceLiaoNingBean getProvinceLiaoNing() {
        return provinceLiaoNing;
    }

    public void setProvinceLiaoNing(ProvinceLiaoNingBean provinceLiaoNing) {
        this.provinceLiaoNing = provinceLiaoNing;
    }

    public ProvinceShanDongBean getProvinceShanDong() {
        return provinceShanDong;
    }

    public void setProvinceShanDong(ProvinceShanDongBean provinceShanDong) {
        this.provinceShanDong = provinceShanDong;
    }
}
