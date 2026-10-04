package kotlin.jvm.internal;

import oOoo0.InterfaceC34594OooO0OO;
import oOoo0.InterfaceC34605OooOOOO;

/* JADX INFO: renamed from: kotlin.jvm.internal.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC24027OooOoO extends AbstractC24031OooOoo0 implements InterfaceC34605OooOOOO {
    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public final InterfaceC34594OooO0OO computeReflected() {
        return C24035Oooo00o.f80943OooO00o.OooO0oo(this);
    }

    @Override // oO0O000o.InterfaceC32508OooOOOo
    public final Object invoke(Object obj, Object obj2) {
        return ((C24029OooOoOO) this).getGetter().call(obj, obj2);
    }

    @Override // oOoo0.InterfaceC34602OooOO0o
    public final InterfaceC34605OooOOOO.OooO00o getGetter() {
        return ((InterfaceC34605OooOOOO) getReflected()).getGetter();
    }
}
