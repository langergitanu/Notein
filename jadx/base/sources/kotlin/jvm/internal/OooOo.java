package kotlin.jvm.internal;

import oOoo0.InterfaceC34594OooO0OO;
import oOoo0.InterfaceC34603OooOOO;

/* JADX INFO: loaded from: classes10.dex */
public abstract class OooOo extends AbstractC24031OooOoo0 implements InterfaceC34603OooOOO {
    public OooOo() {
    }

    @Override // kotlin.jvm.internal.AbstractC24015OooO0Oo
    public InterfaceC34594OooO0OO computeReflected() {
        return C24035Oooo00o.f80943OooO00o.OooO0oO(this);
    }

    @Override // oOoo0.InterfaceC34603OooOOO
    public Object getDelegate(Object obj) {
        return ((InterfaceC34603OooOOO) getReflected()).getDelegate(obj);
    }

    @Override // oO0O000o.InterfaceC32507OooOO0o
    public Object invoke(Object obj) {
        return get(obj);
    }

    public OooOo(Object obj) {
        super(obj);
    }

    @Override // oOoo0.InterfaceC34602OooOO0o
    public InterfaceC34603OooOOO.OooO00o getGetter() {
        return ((InterfaceC34603OooOOO) getReflected()).getGetter();
    }

    public OooOo(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, i);
    }
}
