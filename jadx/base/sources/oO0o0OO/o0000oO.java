package oO0o0OO;

import oOo0000O.InterfaceC34415OooO0oo;

/* JADX INFO: loaded from: classes10.dex */
public final class o0000oO extends AbstractC33630OooOooO {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final o0000oO f121366OooOoO0 = new o0000oO();

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final AbstractC33630OooOooO o000OOo0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final void o0OoO0o(InterfaceC34415OooO0oo interfaceC34415OooO0oo, Runnable runnable) {
        o0000O o0000o2 = (o0000O) interfaceC34415OooO0oo.get(o0000O.f121360OooOoO0);
        if (o0000o2 == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        o0000o2.f121361OooOo = true;
    }

    @Override // oO0o0OO.AbstractC33630OooOooO
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
