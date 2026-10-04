package oO00o;

import oO0o0OO.C33669o000oOoO;

/* JADX INFO: renamed from: oO00o.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32320OooO0oO<T> implements InterfaceC32313OooO<T> {
    @Override // oO00o.InterfaceC32313OooO
    public final void OooO00o(InterfaceC32321OooO0oo<? super T> interfaceC32321OooO0oo) {
        try {
            OooO0O0(interfaceC32321OooO0oo);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C33669o000oOoO.OooO0O0(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void OooO0O0(InterfaceC32321OooO0oo<? super T> interfaceC32321OooO0oo);
}
