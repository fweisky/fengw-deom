package org.fengw.jaxb;

import javax.xml.bind.JAXBException;

/**
 * JAXB示例
 *
 * @author 封伟
 */
public class MainTest {

    public static void main(String[] args) throws JAXBException {
        StringBuilder xml = new StringBuilder();
        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        xml.append("<CountryChina>");
        xml.append("    <name>中国</name>");
        xml.append("    <ProvinceLiaoNing>");
        xml.append("        <name>辽宁省</name>");
        xml.append("        <CityShenYang>");
        xml.append("            <name>沈阳市</name>");
        xml.append("            <peopleCount>7777</peopleCount>");
        xml.append("            <averageSalary>6666.66</averageSalary>");
        xml.append("            <hasSea>false</hasSea>");
        xml.append("        </CityShenYang>");
        xml.append("    </ProvinceLiaoNing>");
        xml.append("    <ProvinceShanDong>");
        xml.append("        <name>山东省</name>");
        xml.append("        <CityQingDao>");
        xml.append("            <name>青岛市</name>");
        xml.append("            <peopleCount>1111</peopleCount>");
        xml.append("            <averageSalary>2222.22</averageSalary>");
        xml.append("            <hasSea>true</hasSea>");
        xml.append("        </CityQingDao>");
        xml.append("    </ProvinceShanDong>");
        xml.append("</CountryChina>");

        // XML转换成Bean
        CountryChinaBean china = JAXBUtils.convertToBean(xml.toString(), CountryChinaBean.class);
        ProvinceLiaoNingBean liaoNing = china.getProvinceLiaoNing();
        ProvinceShanDongBean shanDong = china.getProvinceShanDong();
        CityShenYangBean shenYang = liaoNing.getCityShenYang();
        CityQingDaoBean qingDao = shanDong.getCityQingDao();

        System.out.println(china.getName());
        System.out.println("----------------------------------");
        System.out.println(liaoNing.getName());
        System.out.println(shenYang.getName());
        System.out.println(String.format("%s  %s  %s", shenYang.getPeopleCount(), shenYang.getAverageSalary(), shenYang.getHasSea()));
        System.out.println("----------------------------------");
        System.out.println(shanDong.getName());
        System.out.println(qingDao.getName());
        System.out.println(String.format("%s  %s  %s", qingDao.getPeopleCount(), qingDao.getAverageSalary(), qingDao.getHasSea()));
        System.out.println("----------------------------------");

        // Bean转换成XML
        String outXml = JAXBUtils.convertToXml(china, "UTF-8");
        System.out.println(outXml);
    }
}
