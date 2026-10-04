package oo0O;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.alipay.C18954a;

/* JADX INFO: renamed from: oo0O.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34664OooO00o implements InterfaceC34663OooO, InterfaceC34672OooOO0 {
    @Override // oo0O.InterfaceC34663OooO, oo0O.InterfaceC34672OooOO0
    public final boolean OooO00o(Class<?> cls) {
        return cls.isArray();
    }

    @Override // oo0O.InterfaceC34663OooO
    public final Object OooO0O0(Object obj, Type type) {
        if (!obj.getClass().equals(C18954a.class)) {
            return null;
        }
        C18954a c18954a = (C18954a) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int iM80646a = c18954a.m80646a();
        Object objNewInstance = Array.newInstance(componentType, iM80646a);
        for (int i = 0; i < iM80646a; i++) {
            Array.set(objNewInstance, i, C34669OooO0o0.OooO00o(c18954a.m80647a(i), componentType));
        }
        return objNewInstance;
    }

    @Override // oo0O.InterfaceC34672OooOO0
    /* JADX INFO: renamed from: a */
    public final Object mo80636a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(C34668OooO0o.OooO0O0(obj2));
        }
        return arrayList;
    }
}
