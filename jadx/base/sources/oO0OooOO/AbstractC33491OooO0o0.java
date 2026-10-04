package oO0OooOO;

import java.util.concurrent.atomic.AtomicReference;
import o0Oo0oOo.o00Oo0;
import o0o0OO0.C30416Oooo0OO;
import oO00o00o.InterfaceC32331OooO0OO;
import oO00o0o.C32374OooO0Oo;
import oO0OOOOo.C32979OooOOoo;

/* JADX INFO: renamed from: oO0OooOO.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC33491OooO0o0<T> implements oOO00OOO.OooO00o<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final int f120996OooOo0o = Math.max(1, Integer.getInteger("rx2.buffer-size", 128).intValue());

    public final oO0OOOOo.OooOO0 OooO00o(InterfaceC32331OooO0OO interfaceC32331OooO0OO) {
        o00Oo0.OooO00o(interfaceC32331OooO0OO, "mapper is null");
        o00Oo0.OooO0O0(Integer.MAX_VALUE, "maxConcurrency");
        return new oO0OOOOo.OooOO0(this, interfaceC32331OooO0OO);
    }

    public final C32979OooOOoo OooO0O0() {
        int i = f120996OooOo0o;
        o00Oo0.OooO0O0(i, "bufferSize");
        AtomicReference atomicReference = new AtomicReference();
        return new C32979OooOOoo(new C32979OooOOoo.OooO00o(atomicReference, i), this, atomicReference, i);
    }

    public final void OooO0OO(InterfaceC33493OooO0oo<? super T> interfaceC33493OooO0oo) {
        o00Oo0.OooO00o(interfaceC33493OooO0oo, "s is null");
        try {
            OooO0Oo(interfaceC33493OooO0oo);
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

    public abstract void OooO0Oo(oOO00OOO.OooO0O0<? super T> oooO0O0);

    @Override // oOO00OOO.OooO00o
    public final void subscribe(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        if (oooO0O0 instanceof InterfaceC33493OooO0oo) {
            OooO0OO((InterfaceC33493OooO0oo) oooO0O0);
        } else {
            o00Oo0.OooO00o(oooO0O0, "s is null");
            OooO0OO(new C32374OooO0Oo(oooO0O0));
        }
    }
}
