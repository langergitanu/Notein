package oO0OooOO;

import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o0OO.C32358OooOOO0;

/* JADX INFO: renamed from: oO0OooOO.OooO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33485OooO<T> implements InterfaceC33496OooOO0o<T> {
    public static C32358OooOOO0 OooO0O0(Object obj) {
        o00Oo0.OooO00o(obj, "item is null");
        return new C32358OooOOO0(obj);
    }

    @Override // oO0OooOO.InterfaceC33496OooOO0o
    public final void OooO00o(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O) {
        o00Oo0.OooO00o(interfaceC33495OooOO0O, "observer is null");
        try {
            OooO0OO(interfaceC33495OooOO0O);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C30416Oooo0OO.OooO00o(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void OooO0OO(InterfaceC33495OooOO0O<? super T> interfaceC33495OooOO0O);
}
