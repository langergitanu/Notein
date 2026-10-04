package oo0O;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.json.alipay.C18954a;
import org.json.alipay.C18955b;

/* JADX INFO: renamed from: oo0O.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34668OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final ArrayList f124859OooO00o;

    static {
        ArrayList arrayList = new ArrayList();
        f124859OooO00o = arrayList;
        arrayList.add(new C34674OooOO0o());
        arrayList.add(new C34667OooO0Oo());
        arrayList.add(new C34666OooO0OO());
        arrayList.add(new C34671OooO0oo());
        arrayList.add(new C34665OooO0O0());
        arrayList.add(new C34664OooO00o());
        arrayList.add(new C34670OooO0oO());
    }

    public static String OooO00o(Object obj) {
        if (obj == null) {
            return null;
        }
        Object objOooO0O0 = OooO0O0(obj);
        if (o00OO.OooO00o.OooO00o(objOooO0O0.getClass())) {
            return C18955b.m80650c(objOooO0O0.toString());
        }
        if (Collection.class.isAssignableFrom(objOooO0O0.getClass())) {
            return new C18954a((Collection) objOooO0O0).toString();
        }
        if (Map.class.isAssignableFrom(objOooO0O0.getClass())) {
            return new C18955b((Map) objOooO0O0).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + objOooO0O0.getClass());
    }

    public static Object OooO0O0(Object obj) {
        Object objMo80636a;
        if (obj == null) {
            return null;
        }
        for (InterfaceC34672OooOO0 interfaceC34672OooOO0 : f124859OooO00o) {
            if (interfaceC34672OooOO0.OooO00o(obj.getClass()) && (objMo80636a = interfaceC34672OooOO0.mo80636a(obj)) != null) {
                return objMo80636a;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
