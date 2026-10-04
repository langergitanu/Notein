package oO0OooOO;

import o0o0OO0.C30416Oooo0OO;

/* JADX INFO: renamed from: oO0OooOO.OooOOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33498OooOOO0<T> implements InterfaceC33497OooOOO<T> {
    @Override // oO0OooOO.InterfaceC33497OooOOO
    public final void OooO0O0(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO) {
        try {
            OooO0OO(interfaceC33499OooOOOO);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            oO0OOO0O.OooO00o.OooO0O0(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void OooO0OO(InterfaceC33499OooOOOO<? super T> interfaceC33499OooOOOO);
}
