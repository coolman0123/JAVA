package com.example.factory;

public class ClassLoaderMain {

    public static void main(String[] args) throws Exception {

        Bus b1 = new Bus();
        b1.a();


        //a() 메소드를 가지고 있는 클래스가 있다.
        //이 클래스이름이 아직 무엇인지 모른다.
        //나중에 이 클래스 이름을 알려주겠다.
        //a() 메소드를 실행할 수 있도록 코드를 작성해라.


        //className에 해당하는 클래스 정보를 CLASSPATH에서 읽어들이고,
        //그 정보를 clazz에 참조하도록 하다.
        String className = "com.example.Bus";
        Class<?> clazz = Class.forName(className);

// Java 9 이상에서는 getDeclaredConstructor().newInstance() 사용
        Object o = clazz.getDeclaredConstructor().newInstance();

        if (o instanceof Bus) {
            Bus b = (Bus) o;
            b.a();
        } else {
            System.out.println("Object is not an instance of Bus");
        }
    }

}
