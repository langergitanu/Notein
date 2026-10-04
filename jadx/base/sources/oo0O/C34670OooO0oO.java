package oo0O;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;
import org.json.alipay.C18955b;

/* JADX INFO: renamed from: oo0O.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34670OooO0oO implements InterfaceC34663OooO, InterfaceC34672OooOO0 {
    @Override // oo0O.InterfaceC34663OooO, oo0O.InterfaceC34672OooOO0
    public final boolean OooO00o(Class<?> cls) {
        return true;
    }

    @Override // oo0O.InterfaceC34663OooO
    public final Object OooO0O0(Object obj, Type type) throws IllegalAccessException, InstantiationException {
        if (!obj.getClass().equals(C18955b.class)) {
            return null;
        }
        C18955b c18955b = (C18955b) obj;
        Class superclass = (Class) type;
        Object objNewInstance = superclass.newInstance();
        while (!superclass.equals(Object.class)) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (c18955b.m80653b(name)) {
                        field.setAccessible(true);
                        field.set(objNewInstance, C34669OooO0o0.OooO00o(c18955b.m80651a(name), genericType));
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
        return objNewInstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    @Override // oo0O.InterfaceC34672OooOO0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo80636a(Object obj) throws IllegalAccessException {
        Object objOooO0O0;
        TreeMap treeMap = new TreeMap();
        Class<?> superclass = obj.getClass();
        while (true) {
            Field[] declaredFields = superclass.getDeclaredFields();
            if (superclass.equals(Object.class)) {
                return treeMap;
            }
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    if (field == null || "this$0".equals(field.getName())) {
                        objOooO0O0 = null;
                    } else {
                        boolean zIsAccessible = field.isAccessible();
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 != null) {
                            field.setAccessible(zIsAccessible);
                            objOooO0O0 = C34668OooO0o.OooO0O0(obj2);
                        }
                    }
                    if (objOooO0O0 != null) {
                        treeMap.put(field.getName(), objOooO0O0);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }
}
