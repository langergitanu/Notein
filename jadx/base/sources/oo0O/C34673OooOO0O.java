package oo0O;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import org.json.alipay.C18954a;

/* JADX INFO: renamed from: oo0O.OooOO0O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34673OooOO0O implements InterfaceC34663OooO {
    @Override // oo0O.InterfaceC34663OooO, oo0O.InterfaceC34672OooOO0
    public final boolean OooO00o(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }

    @Override // oo0O.InterfaceC34663OooO
    public final Object OooO0O0(Object obj, Type type) {
        if (!obj.getClass().equals(C18954a.class)) {
            return null;
        }
        C18954a c18954a = (C18954a) obj;
        HashSet hashSet = new HashSet();
        Class cls = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i = 0; i < c18954a.m80646a(); i++) {
            hashSet.add(C34669OooO0o0.OooO00o(c18954a.m80647a(i), cls));
        }
        return hashSet;
    }
}
