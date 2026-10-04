package oo0O;

import java.lang.reflect.Type;

/* JADX INFO: renamed from: oo0O.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34667OooO0Oo implements InterfaceC34663OooO, InterfaceC34672OooOO0 {
    @Override // oo0O.InterfaceC34663OooO, oo0O.InterfaceC34672OooOO0
    public final boolean OooO00o(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }

    @Override // oo0O.InterfaceC34663OooO
    public final Object OooO0O0(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // oo0O.InterfaceC34672OooOO0
    /* JADX INFO: renamed from: a */
    public final Object mo80636a(Object obj) {
        return ((Enum) obj).name();
    }
}
