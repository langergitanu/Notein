package oo0O;

import java.lang.reflect.Type;
import java.util.Date;

/* JADX INFO: renamed from: oo0O.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C34666OooO0OO implements InterfaceC34663OooO, InterfaceC34672OooOO0 {
    @Override // oo0O.InterfaceC34663OooO, oo0O.InterfaceC34672OooOO0
    public final boolean OooO00o(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }

    @Override // oo0O.InterfaceC34663OooO
    public final Object OooO0O0(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    @Override // oo0O.InterfaceC34672OooOO0
    /* JADX INFO: renamed from: a */
    public final Object mo80636a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }
}
