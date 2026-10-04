package oO00o;

import java.util.Objects;
import oO00oOo0.C32430OooO00o;
import oO0o0OO.C33669o000oOoO;

/* JADX INFO: renamed from: oO00o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC32314OooO00o<T> implements oOO00OOO.OooO00o<T> {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final int f116231OooOo0o = Math.max(1, Integer.getInteger("rx3.buffer-size", 128).intValue());

    public final void OooO00o(InterfaceC32315OooO0O0<? super T> interfaceC32315OooO0O0) {
        Objects.requireNonNull(interfaceC32315OooO0O0, "subscriber is null");
        try {
            OooO0O0(interfaceC32315OooO0O0);
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

    public abstract void OooO0O0(oOO00OOO.OooO0O0<? super T> oooO0O0);

    @Override // oOO00OOO.OooO00o
    public final void subscribe(oOO00OOO.OooO0O0<? super T> oooO0O0) {
        if (oooO0O0 instanceof InterfaceC32315OooO0O0) {
            OooO00o((InterfaceC32315OooO0O0) oooO0O0);
        } else {
            Objects.requireNonNull(oooO0O0, "subscriber is null");
            OooO00o(new oO0OO00o.OooO0OO(oooO0O0));
        }
    }
}
