package oO00o0O0;

import java.util.concurrent.atomic.AtomicReference;
import oO0OooOO.InterfaceC33488OooO0OO;
import ooOOo0.EnumC35109OooO0O0;

/* JADX INFO: renamed from: oO00o0O0.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C32344OooO0o0 extends AtomicReference<oO0OOO00.OooO0O0> implements InterfaceC33488OooO0OO, oO0OOO00.OooO0O0 {
    private static final long serialVersionUID = -7545121636549663526L;

    @Override // oO0OooOO.InterfaceC33488OooO0OO
    public final void OooO00o(oO0OOO00.OooO0O0 oooO0O0) {
        EnumC35109OooO0O0.OooO0Oo(this, oooO0O0);
    }

    @Override // oO0OOO00.OooO0O0
    public final void dispose() {
        EnumC35109OooO0O0.OooO00o(this);
    }

    @Override // oO0OooOO.InterfaceC33488OooO0OO
    public final void onComplete() {
        lazySet(EnumC35109OooO0O0.f126092OooOo0o);
    }

    @Override // oO0OooOO.InterfaceC33488OooO0OO
    public final void onError(Throwable th) {
        lazySet(EnumC35109OooO0O0.f126092OooOo0o);
        oO0OOO0O.OooO00o.OooO0O0(new oO00o00O.OooO0OO(th));
    }
}
