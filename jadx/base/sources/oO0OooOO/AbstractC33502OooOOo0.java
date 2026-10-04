package oO0OooOO;

import o0o0OO0.C30416Oooo0OO;

/* JADX INFO: renamed from: oO0OooOO.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33502OooOOo0<T> implements InterfaceC33503OooOOoo<T> {
    @Override // oO0OooOO.InterfaceC33503OooOOoo
    public final void OooO00o(InterfaceC33501OooOOo<? super T> interfaceC33501OooOOo) {
        try {
            OooO0o0(interfaceC33501OooOOo);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void OooO0o0(InterfaceC33501OooOOo<? super T> interfaceC33501OooOOo);
}
