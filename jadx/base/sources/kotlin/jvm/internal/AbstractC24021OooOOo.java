package kotlin.jvm.internal;

import oOoo0.InterfaceC34594OooO0OO;
import oOoo0.InterfaceC34600OooOO0;
import oOoo0.InterfaceC34603OooOOO;

/* JADX INFO: renamed from: kotlin.jvm.internal.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC24021OooOOo extends OooOo00 implements InterfaceC34600OooOO0 {
    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final InterfaceC34594OooO0OO computeReflected() {
        return C24035Oooo00o.f80943OooO00o.OooO0o0(this);
    }

    @Override // oOoo0.InterfaceC34603OooOOO
    public final Object getDelegate(Object obj) {
        return ((InterfaceC34600OooOO0) getReflected()).getDelegate(obj);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // oOoo0.InterfaceC34599OooO0oo, oOoo0.InterfaceC34591OooO
    public final InterfaceC34600OooOO0.OooO00o OooO0o0() {
        return ((InterfaceC34600OooOO0) getReflected()).OooO0o0();
    }

    @Override // oOoo0.InterfaceC34602OooOO0o
    public final InterfaceC34603OooOOO.OooO00o getGetter() {
        return ((InterfaceC34600OooOO0) getReflected()).getGetter();
    }
}
