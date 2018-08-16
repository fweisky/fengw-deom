package org.fengw.dom4j;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * Dom4j的DOM解析方式
 *
 * @author 封伟
 */
public class DomParse {

    public static void main(String[] args) throws Exception {

        InputStream inStream = null;

        try {
            // 演示传参字符串形式的XML解析
            String xml = "<?xml version='1.0' encoding='UTF-8'?>"
                    + "<data><apps>"
                    + "<app><id>1</id><name type=\"rpg\">游戏1</name></app>"
                    + "</apps></data>";
            inStream = new ByteArrayInputStream(xml.getBytes());

            SAXReader reader = new SAXReader();
            Document document = reader.read(inStream);
            Element root = document.getRootElement();
            parseElement(root);
        } catch (Exception e) {
            throw e;
        } finally {
            if (inStream != null) {
                inStream.close();
            }
        }
    }

    /**
     * 解析XML元素
     */
    public static void parseElement(Element node) {
        System.out.println("--------------------");
        System.out.println("节点名称：" + node.getName());
        System.out.println("节点内容：" + node.getTextTrim());

        // 解析属性
        List<Attribute> listAttr = node.attributes();
        for (Attribute attr : listAttr) {
            String name = attr.getName();
            String value = attr.getValue();
            System.out.println("属性名称：" + name + ", 属性值：" + value);
        }

        // 解析节点
        List<Element> listElement = node.elements();
        for (Element e : listElement) {
            parseElement(e);
        }
    }
}
