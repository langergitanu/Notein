package oO00o;

import java.util.Objects;
import o00Oo000.C25034OooO00o;
import oO00oOo0.C32430OooO00o;
import oO0o0OO.C33669o000oOoO;
import oOo00ooo.C34583OooO0oO;

/* JADX INFO: renamed from: oO00o.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32316OooO0OO<T> implements InterfaceC32317OooO0Oo<T> {
    @Override // oO00o.InterfaceC32317OooO0Oo
    public final void OooO00o(InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0) {
        try {
            OooO0OO(interfaceC32319OooO0o0);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            C33669o000oOoO.OooO0O0(th);
            C32430OooO00o.OooO00o(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't throw other exceptions due to RS");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public final C34583OooO0oO OooO0O0(AbstractC32318OooO0o abstractC32318OooO0o) {
        int i = AbstractC32314OooO00o.f116231OooOo0o;
        Objects.requireNonNull(abstractC32318OooO0o, "scheduler is null");
        C25034OooO00o.OooO0O0(i, "bufferSize");
        return new C34583OooO0oO(this, abstractC32318OooO0o, i);
    }

    public abstract void OooO0OO(InterfaceC32319OooO0o0<? super T> interfaceC32319OooO0o0);
}
