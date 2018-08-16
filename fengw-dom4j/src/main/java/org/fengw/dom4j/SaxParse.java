package org.fengw.dom4j;

import java.io.File;
import java.io.FileNotFoundException;

import org.dom4j.Attribute;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.ElementHandler;
import org.dom4j.ElementPath;
import org.dom4j.io.SAXReader;

/**
 * Dom4j的SAX解析方式
 *
 * @author 封伟
 */
public class SaxParse implements ElementHandler {

    /**
     * 构造方法
     */
    public SaxParse(String filePath) throws FileNotFoundException, DocumentException {
        File file = new File(filePath);
        SAXReader reader = new SAXReader();
        reader.setDefaultHandler(this);
        reader.read(file);
    }

    public static void main(String[] args) throws Exception {
        // 演示解析XML文件
        new SaxParse(System.getProperty("user.dir") + "\\fengw-dom4j\\src\\main\\java\\org\\fengw\\dom4j\\Dom4j.xml");
    }

    public void onEnd(ElementPath elementPath) {
        Element elem = elementPath.getCurrent();

        if ("id".equals(elem.getName())) {
            parseElement(elem);
        } else if ("name".equals(elem.getName())) {
            parseElement(elem);
            Attribute arrType = elem.attribute("type");
            System.out.println(arrType.getText());
        }

        elem.detach();
    }

    public void onStart(ElementPath elementPath) {
    }

    private void parseElement(Element root) {
        System.out.println(root.getText());
    }
}
