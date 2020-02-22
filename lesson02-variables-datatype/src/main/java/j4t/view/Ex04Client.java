package j4t.view;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex04Client {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Ex03Device.android();
		Ex03Device test= new Ex03Device();
		callIphoneReflection(test);
	}

	public static void callIphoneReflection(Ex03Device test) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class cls= test.getClass();
		Method method = cls.getDeclaredMethod("iphone");
		method.setAccessible(true);
		method.invoke(test);
	}
}
