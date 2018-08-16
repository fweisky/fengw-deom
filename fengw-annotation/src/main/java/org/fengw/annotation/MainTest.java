package org.fengw.annotation;

import java.lang.reflect.Method;

/**
 * 注解的使用
 *
 * @author 封伟
 */
public class MainTest {

    /**
     * 主处理
     *
     * @param args 参数
     */
    public static void main(String[] args) {

        // 通过反射取得注解信息
        Class<MainTest> theClass = MainTest.class;
        Method[] methods = theClass.getMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Annotation.class)) {
                Annotation annotation = method.getAnnotation(Annotation.class);
                // 输出注解信息
                System.out.println(concatString("Method=", method.getName(),
                        ", id=", String.valueOf(annotation.id()),
                        ", description=", annotation.description()));
            }
        }
    }

    /**
     * 以StringBuilder的形式连接字符串
     */
    private static String concatString(String... strings) {

        if (strings == null || strings.length == 0) {
            return null;
        }

        StringBuilder builder = new StringBuilder();

        for (String str : strings) {
            builder.append(str);
        }

        return builder.toString();
    }

    /**
     * 取得名称
     *
     * @param name 名称
     */
    @Annotation(id = 7, description = "hello name")
    public void getName(String name) {
        System.out.println(name);
    }

    /**
     * 取得性别
     *
     * @param sex 性别
     */
    @Annotation(id = 8, description = "hello sex")
    public void getSex(int sex) {

    }
}
