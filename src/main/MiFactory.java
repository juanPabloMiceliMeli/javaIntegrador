package main;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class MiFactory {

    public static Object getInstance(String objName) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        InputStream iS = MiFactory.class.getClassLoader().getResourceAsStream("MiFactory.properties");
        Properties prop = new Properties();
        prop.load(iS);
        String className = prop.getProperty(objName);
        return Class.forName(className).getDeclaredConstructor().newInstance();
    }

}
