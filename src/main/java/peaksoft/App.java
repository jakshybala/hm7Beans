package peaksoft;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat catBean = (Cat) applicationContext.getBean("cat");
        System.out.println(catBean.sayName());

        Cat catBeanTwo = (Cat) applicationContext.getBean("cat");
        System.out.println(catBeanTwo.sayName());

        if (catBean.equals(catBeanTwo)) {
            System.out.printf("%d and %dis equals", catBean, catBeanTwo);
        }
        else
            System.out.println("Beans not equals");

    }
}
