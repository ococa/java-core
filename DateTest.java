import java.time.*;
// public 是访问修饰符（access modifier）
// 命名规范 驼峰命名（CamelCase）
// 每个java程序必须有一个main方法，作为程序的启动点，且main必须是静态
public class DateTest {
    public static void main(String[] args)
    {
        System.out.println(LocalDate.now());
//        System.out.println(new Date());
    }
}