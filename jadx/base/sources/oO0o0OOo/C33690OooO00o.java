package oO0o0OOo;

import java.util.concurrent.CancellationException;
import o0Oo00oO.C28035OooO00o;
import oO0o0OO.C33634Oooo000;

/* JADX INFO: renamed from: oO0o0OOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public class C33690OooO00o<E> extends C33700OooOO0O<E> implements InterfaceC33691OooO0O0<E> {
    @Override // oO0o0OO.o0ooOOo
    public final boolean Oooo0o0(Throwable th) {
        C33634Oooo000.OooO00o(th, this.f121272OooOoO0);
        return true;
    }

    @Override // oO0o0OO.o0ooOOo
    public final void o000oOoO(Throwable th) {
        if (th != null) {
            cancellationExceptionOooO00o = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionOooO00o == null) {
                cancellationExceptionOooO00o = C28035OooO00o.OooO00o(getClass().getSimpleName().concat(" was cancelled"), th);
            }
        }
        this.f121482OooOoO.cancel(cancellationExceptionOooO00o);
    }
}
