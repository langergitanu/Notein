package oOO00O0O;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes10.dex */
public final class OooO00o {
    public static ArrayList OooO00o(ClassLoader classLoader) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(classLoader);
        if (Thread.currentThread().getContextClassLoader() != null) {
            arrayList.add(Thread.currentThread().getContextClassLoader());
        }
        arrayList.add(OooO00o.class.getClassLoader());
        return arrayList;
    }

    public static <T> T OooO0O0(Class<T> cls) {
        try {
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e = e;
        }
        try {
            return (T) OooO0OO(cls, OooO00o(cls.getClassLoader()));
        } catch (NoSuchMethodException e2) {
            e = e2;
            throw new RuntimeException(e);
        }
    }

    public static Object OooO0OO(Class cls, ArrayList arrayList) throws NoSuchMethodException, ClassNotFoundException {
        Object objNewInstance;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ClassLoader classLoader = (ClassLoader) it.next();
            try {
                Constructor<?> declaredConstructor = classLoader.loadClass(cls.getName().concat("Impl")).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                objNewInstance = declaredConstructor.newInstance(new Object[0]);
            } catch (ClassNotFoundException unused) {
                Iterator it2 = ServiceLoader.load(cls, classLoader).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        objNewInstance = null;
                        break;
                    }
                    Object next = it2.next();
                    if (next != null) {
                        objNewInstance = next;
                        break;
                    }
                }
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
            if (objNewInstance != null) {
                return objNewInstance;
            }
        }
        throw new ClassNotFoundException("Cannot find implementation for ".concat(cls.getName()));
    }
}
