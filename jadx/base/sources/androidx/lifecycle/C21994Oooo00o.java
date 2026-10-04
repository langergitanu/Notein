package androidx.lifecycle;

import com.huawei.hms.network.embedded.C18115b5;
import com.orion.notein.richeditor.utils.p606io.FilenameUtils;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import oO0o0O0o.C33595OooOOo;

/* JADX INFO: renamed from: androidx.lifecycle.Oooo00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21994Oooo00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final HashMap f65591OooO00o = new HashMap();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final HashMap f65592OooO0O0 = new HashMap();

    public static OooOOO OooO00o(Constructor constructor, InterfaceC21988OooOoo0 interfaceC21988OooOoo0) {
        try {
            Object objNewInstance = constructor.newInstance(interfaceC21988OooOoo0);
            kotlin.jvm.internal.OooOOO0.OooO0o(objNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return (OooOOO) objNewInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int OooO0O0(Class cls) {
        Constructor<?> declaredConstructor;
        boolean zBooleanValue;
        int length;
        int i;
        HashMap map = f65591OooO00o;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r3 = cls.getPackage();
                String name = cls.getCanonicalName();
                String fullPackage = r3 != null ? r3.getName() : "";
                kotlin.jvm.internal.OooOOO0.OooO0o(fullPackage, "fullPackage");
                if (fullPackage.length() != 0) {
                    kotlin.jvm.internal.OooOOO0.OooO0o(name, "name");
                    name = name.substring(fullPackage.length() + 1);
                    kotlin.jvm.internal.OooOOO0.OooO0o(name, "this as java.lang.String).substring(startIndex)");
                }
                kotlin.jvm.internal.OooOOO0.OooO0o(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String strConcat = C33595OooOOo.OooOo0O(name, ".", C18115b5.CONNECTOR).concat("_LifecycleAdapter");
                if (fullPackage.length() != 0) {
                    strConcat = fullPackage + FilenameUtils.EXTENSION_SEPARATOR + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
            HashMap map2 = f65592OooO0O0;
            if (declaredConstructor != null) {
                map2.put(cls, com.facebook.soloader.OooOo.OooO0oO(declaredConstructor));
            } else {
                OooO0OO oooO0OO = OooO0OO.f65506OooO0OO;
                HashMap map3 = oooO0OO.f65508OooO0O0;
                Boolean bool = (Boolean) map3.get(cls);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length2 = declaredMethods.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                map3.put(cls, Boolean.FALSE);
                                zBooleanValue = false;
                                break;
                            }
                            if (((InterfaceC21997Oooo0o) declaredMethods[i3].getAnnotation(InterfaceC21997Oooo0o.class)) != null) {
                                oooO0OO.OooO00o(cls, declaredMethods);
                                zBooleanValue = true;
                                break;
                            }
                            i3++;
                        }
                    } catch (NoClassDefFoundError e2) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
                    }
                }
                if (!zBooleanValue) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && InterfaceC21988OooOoo0.class.isAssignableFrom(superclass)) {
                        kotlin.jvm.internal.OooOOO0.OooO0o(superclass, "superclass");
                        if (OooO0O0(superclass) != 1) {
                            Object obj = map2.get(superclass);
                            kotlin.jvm.internal.OooOOO0.OooO0Oo(obj);
                            arrayList = new ArrayList((Collection) obj);
                            Class<?>[] interfaces = cls.getInterfaces();
                            kotlin.jvm.internal.OooOOO0.OooO0o(interfaces, "klass.interfaces");
                            length = interfaces.length;
                            i = 0;
                            while (true) {
                                if (i < length) {
                                    Class<?> intrface = interfaces[i];
                                    if (intrface != null && InterfaceC21988OooOoo0.class.isAssignableFrom(intrface)) {
                                        kotlin.jvm.internal.OooOOO0.OooO0o(intrface, "intrface");
                                        if (OooO0O0(intrface) == 1) {
                                            break;
                                        }
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                        }
                                        Object obj2 = map2.get(intrface);
                                        kotlin.jvm.internal.OooOOO0.OooO0Oo(obj2);
                                        arrayList.addAll((Collection) obj2);
                                    }
                                    i++;
                                } else if (arrayList != null) {
                                    map2.put(cls, arrayList);
                                }
                            }
                        }
                    } else {
                        Class<?>[] interfaces2 = cls.getInterfaces();
                        kotlin.jvm.internal.OooOOO0.OooO0o(interfaces2, "klass.interfaces");
                        length = interfaces2.length;
                        i = 0;
                        while (true) {
                            if (i < length) {
                            }
                            i++;
                        }
                    }
                }
            }
            i2 = 2;
        }
        map.put(cls, Integer.valueOf(i2));
        return i2;
    }
}
