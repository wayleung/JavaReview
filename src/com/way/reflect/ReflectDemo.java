package com.way.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Auther: Way Leung wayleung13@163.com
 * @Date: 9/5/2018 10:32
 * @Description:
 */
public class ReflectDemo {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> studentClass = Class.forName("com.way.reflect.Student");
        Constructor<?>[] declaredConstructors = studentClass.getDeclaredConstructors();
        for (Constructor constructor:declaredConstructors) {
            System.out.println(constructor);


        }
        System.out.println("***********************************");

        Object student;
        Constructor<?> publicConstructor = studentClass.getDeclaredConstructor();
        student = publicConstructor.newInstance();
        System.out.println(student);

        System.out.println("***********************************");

        Constructor<?> privateConstructor = studentClass.getDeclaredConstructor(int.class,String.class);
        //暴力访问(忽略掉访问修饰符)
        privateConstructor.setAccessible(true);
        student = privateConstructor.newInstance(1,"way");
        System.out.println(student);
        System.out.println("***********************************");

        Constructor<?> protectedConstructor = studentClass.getDeclaredConstructor(int.class,String.class,char.class,String.class);
        //暴力访问(忽略掉访问修饰符) 同一个包下可以不用
        //protectedConstructor.setAccessible(true);
        student = protectedConstructor.newInstance(1,"way",'M',"123456");
        System.out.println(student);

        System.out.println("***********************************");

        Constructor<?> defaultConstructor = studentClass.getDeclaredConstructor(int.class,String.class,char.class);
        //暴力访问(忽略掉访问修饰符) 同一个包下可以不用
        //defaultConstructor.setAccessible(true);
        student = defaultConstructor.newInstance(1,"way",'M');
        System.out.println(student);

        System.out.println("***********************************");


        Field[] declaredFields = studentClass.getDeclaredFields();

        for (Field field:declaredFields
             ) {
            System.out.println(field);
        }


        System.out.println("***********************************");

        Field id = studentClass.getDeclaredField("id");

        //暴力访问(忽略掉访问修饰符)
        id.setAccessible(true);
        //对对象属性赋值
        id.set(student,6666);

        Student stu = (Student) student;
        //验证
        System.out.println(stu.getId());


        System.out.println("***********************************");



        Field name = studentClass.getDeclaredField("name");

        //暴力访问(忽略掉访问修饰符)  同一个包下可以不用
        //name.setAccessible(true);
        //对对象属性赋值
        name.set(student,"wway");

        Student stu1 = (Student) student;
        //验证
        System.out.println(stu1.getName());


        System.out.println("***********************************");



        Field gender = studentClass.getDeclaredField("gender");

        //暴力访问(忽略掉访问修饰符)  同一个包下可以不用
        //name.setAccessible(true);
        //对对象属性赋值
        gender.set(student,'F');

        Student stu2 = (Student) student;
        //验证
        System.out.println(stu2.getGender());


        System.out.println("***********************************");



        Field phone = studentClass.getDeclaredField("phone");

        //暴力访问(忽略掉访问修饰符)  同一个包下可以不用
        //name.setAccessible(true);
        //对对象属性赋值
        phone.set(student,"88888888");

        Student stu3 = (Student) student;
        //验证
        System.out.println(stu3.getPhone());


        System.out.println("***********************************");


        Method[] declaredMethods = studentClass.getDeclaredMethods();
        for (Method method:declaredMethods
             ) {
            System.out.println(method);
        }

        System.out.println("***********************************");

        Method method4 = studentClass.getDeclaredMethod("method4", String.class);
        method4.setAccessible(true);
        //调用某对象的方法
        Object wayway = method4.invoke(student,"wayway");
        System.out.println(wayway);



        System.out.println("***********************************");

        Method method2 = studentClass.getDeclaredMethod("method2", String.class);
        //method2.setAccessible(true);
        //调用某对象的方法
        Object wayway2 = method2.invoke(student,"wayway2");
        System.out.println(wayway2);

        System.out.println("***********************************");

        Method method3 = studentClass.getDeclaredMethod("method3",int.class, String.class);
        //method3.setAccessible(true);
        //调用某对象的方法
        Object wayway3 = method3.invoke(student,333,"wayway3");
        System.out.println(wayway3);

        System.out.println("***********************************");

        Method method1 = studentClass.getDeclaredMethod("method1",int.class, String.class);
        method1.setAccessible(true);
        //调用某对象的方法
        Object wayway1 = method1.invoke(student,111,"wayway");
        System.out.println(wayway1);
    }


}
