package oo0O;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.alipay.C18954a;
import org.json.alipay.C18955b;

/* JADX INFO: renamed from: oo0O.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34669OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList f124860OooO00o;

    static {
        ArrayList arrayList = new ArrayList();
        f124860OooO00o = arrayList;
        arrayList.add(new C34674OooOO0o());
        arrayList.add(new C34667OooO0Oo());
        arrayList.add(new C34666OooO0OO());
        arrayList.add(new C34671OooO0oo());
        arrayList.add(new C34673OooOO0O());
        arrayList.add(new C34665OooO0O0());
        arrayList.add(new C34664OooO00o());
        arrayList.add(new C34670OooO0oO());
    }

    public static final <T> T OooO00o(Object obj, Type type) {
        T t;
        for (InterfaceC34663OooO interfaceC34663OooO : f124860OooO00o) {
            Type rawType = type;
            while (!(rawType instanceof Class)) {
                if (!(rawType instanceof ParameterizedType)) {
                    throw new IllegalArgumentException("TODO");
                }
                rawType = ((ParameterizedType) rawType).getRawType();
            }
            if (interfaceC34663OooO.OooO00o((Class) rawType) && (t = (T) interfaceC34663OooO.OooO0O0(obj, type)) != null) {
                return t;
            }
        }
        return null;
    }

    public static final Object OooO0O0(String str, Type type) {
        Object c18955b;
        if (str == null || str.length() == 0) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.startsWith("[") && strTrim.endsWith("]")) {
            c18955b = new C18954a(strTrim);
        } else {
            if (!strTrim.startsWith("{") || !strTrim.endsWith("}")) {
                return OooO00o(strTrim, type);
            }
            c18955b = new C18955b(strTrim);
        }
        return OooO00o(c18955b, type);
    }
}
