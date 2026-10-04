package com.aspose.slides.internal.p234ko;

import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14067j2;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.aspose.slides.internal.ko.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class C5891k4 {

    /* JADX INFO: renamed from: k4 */
    private static boolean[][] f16595k4 = {new boolean[]{true, false, false, true, true, true, true}, new boolean[]{false, true, true, true, true, true, true}, new boolean[]{false, false, true, true, true, true, true}, new boolean[]{false, false, false, true, true, true, true}, new boolean[]{false, false, false, false, true, true, true}, new boolean[]{false, false, false, false, false, true, false}, new boolean[]{false, false, false, false, false, true, true}};

    /* JADX INFO: renamed from: kk */
    private static final HashMap<Class, Class> f16596kk;

    /* JADX INFO: renamed from: x1 */
    private static final HashMap<Class, Class> f16597x1;

    static {
        HashMap<Class, Class> map = new HashMap<>();
        f16597x1 = map;
        f16596kk = new HashMap<>();
        map.put(Byte.TYPE, Byte.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Float.TYPE, Float.class);
        map.put(Double.TYPE, Double.class);
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Character.TYPE, Character.class);
        map.put(Void.TYPE, Void.class);
        for (Map.Entry<Class, Class> entry : map.entrySet()) {
            f16596kk.put(entry.getValue(), entry.getKey());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static Class m23725k4(Class<?> cls) {
        return f16597x1.get(cls);
    }

    /* JADX INFO: renamed from: kk */
    private static byte m23729kk(Class<?> cls) {
        if (cls.equals(Character.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 1;
        }
        if (cls.equals(Short.TYPE)) {
            return (byte) 2;
        }
        if (cls.equals(Integer.TYPE)) {
            return (byte) 3;
        }
        if (cls.equals(Long.TYPE)) {
            return (byte) 4;
        }
        if (cls.equals(Double.TYPE)) {
            return (byte) 5;
        }
        return cls.equals(Float.TYPE) ? (byte) 6 : (byte) -1;
    }

    /* JADX INFO: renamed from: to */
    public static boolean m23731to(Class<?> cls, Class<?> cls2) {
        return C14067j2.m66728k4(cls, m23725k4(cls2));
    }

    /* JADX INFO: renamed from: x1 */
    public static Class m23732x1(Class<?> cls) {
        return f16596kk.get(cls);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23726k4(Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return true;
        }
        if (cls.isPrimitive() && cls2.isAssignableFrom(m23725k4(cls))) {
            return true;
        }
        if (cls2.isPrimitive() && m23731to(cls, cls2)) {
            return true;
        }
        if (cls2.isArray() && AbstractC14092to.class.isAssignableFrom(cls)) {
            return true;
        }
        return (cls.isArray() && AbstractC14092to.class.isAssignableFrom(cls2)) || m23733x1(cls, cls2);
    }

    /* JADX INFO: renamed from: kk */
    public static boolean m23730kk(Class<?> cls, Class<?> cls2) {
        return C14067j2.m66728k4(cls, cls2);
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m23733x1(Class<?> cls, Class<?> cls2) {
        if (!cls2.isPrimitive()) {
            return cls2.equals(cls);
        }
        if (!cls.isPrimitive()) {
            cls = m23732x1(cls);
        }
        if (cls == null) {
            return false;
        }
        byte bM23729kk = m23729kk(cls2);
        byte bM23729kk2 = m23729kk(cls);
        if (bM23729kk == -1 || bM23729kk2 == -1) {
            return false;
        }
        return f16595k4[bM23729kk2][bM23729kk];
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23727k4(Constructor constructor, Object... objArr) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (objArr.length != parameterTypes.length) {
            return false;
        }
        for (int i = 0; i < objArr.length; i++) {
            Object obj = objArr[i];
            if (obj == null) {
                return !parameterTypes[i].isPrimitive();
            }
            if (!m23726k4(obj.getClass(), parameterTypes[i])) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m23728k4(Method method, Class<?>... clsArr) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (clsArr.length != parameterTypes.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (!m23730kk(clsArr[i], parameterTypes[i])) {
                return false;
            }
        }
        return true;
    }
}
