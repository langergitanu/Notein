package o00OooO;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import o00oo0O0.InterfaceC25676OooOo0;
import oO00Oo0.C32269OooO0oo;
import oO00Oo0O.C32271OooO00o;
import oO0o0OO.C33603OooO0O0;
import oO0o0OO.C33614OooOOO0;
import oO0o0OO.C33624OooOo0o;
import oO0o0Ooo.C33824OooO0o;
import oO0o0Ooo.C33826OooO0oO;
import oO0o0Ooo.C33839OooOo0;

/* JADX INFO: renamed from: o00OooO.OooOOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25139OooOOOo implements InterfaceC25676OooOo0 {
    public static final C33614OooOOO0 OooO0Oo(Continuation continuation) {
        C33614OooOOO0 c33614OooOOO0;
        C33614OooOOO0 c33614OooOOO02;
        if (!(continuation instanceof C33824OooO0o)) {
            return new C33614OooOOO0(1, continuation);
        }
        C33824OooO0o c33824OooO0o = (C33824OooO0o) continuation;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C33824OooO0o.f121918OooOooO;
            Object obj = atomicReferenceFieldUpdater.get(c33824OooO0o);
            C33839OooOo0 c33839OooOo0 = C33826OooO0oO.f121925OooO0O0;
            c33614OooOOO0 = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(c33824OooO0o, c33839OooOo0);
                c33614OooOOO02 = null;
                break;
            }
            if (obj instanceof C33614OooOOO0) {
                while (!atomicReferenceFieldUpdater.compareAndSet(c33824OooO0o, obj, c33839OooOo0)) {
                    if (atomicReferenceFieldUpdater.get(c33824OooO0o) != obj) {
                        break;
                    }
                }
                c33614OooOOO02 = (C33614OooOOO0) obj;
                break loop0;
            }
            if (obj != c33839OooOo0 && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c33614OooOOO02 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C33614OooOOO0.f121295OooOoo;
            Object obj2 = atomicReferenceFieldUpdater2.get(c33614OooOOO02);
            if (!(obj2 instanceof C33624OooOo0o) || ((C33624OooOo0o) obj2).f121308OooO0Oo == null) {
                C33614OooOOO0.f121296OooOoo0.set(c33614OooOOO02, 536870911);
                atomicReferenceFieldUpdater2.set(c33614OooOOO02, C33603OooO0O0.f121273OooOo0o);
                c33614OooOOO0 = c33614OooOOO02;
            } else {
                c33614OooOOO02.OooOO0o();
            }
            if (c33614OooOOO0 != null) {
                return c33614OooOOO0;
            }
        }
        return new C33614OooOOO0(2, continuation);
    }

    public static final void OooO0o0(oO00Oo0.OooO0OO oooO0OO, short s) throws C32269OooO0oo {
        kotlin.jvm.internal.OooOOO0.OooO0oO(oooO0OO, "<this>");
        int i = oooO0OO.f115955OooOoOO;
        if (oooO0OO.f115957OooOoo0 - i > 2) {
            oooO0OO.f115955OooOoOO = i + 2;
            oooO0OO.f115953OooOoO.putShort(i, s);
            return;
        }
        C32271OooO00o c32271OooO00oO0Oo0oo = oooO0OO.o0Oo0oo(2);
        int i2 = c32271OooO00oO0Oo0oo.f115946OooO0OO;
        int i3 = c32271OooO00oO0Oo0oo.f115949OooO0o0 - i2;
        if (i3 < 2) {
            throw new C32269OooO0oo("short integer", 2, i3);
        }
        c32271OooO00oO0Oo0oo.f115944OooO00o.putShort(i2, s);
        c32271OooO00oO0Oo0oo.OooO00o(2);
        oooO0OO.OooO00o();
    }

    @Override // o00oo0O0.InterfaceC25676OooOo0
    public void OooO00o(Object obj) {
    }

    @Override // o00oo0O0.InterfaceC25676OooOo0
    public void OooO0O0(Object obj) {
    }

    @Override // o00oo0O0.InterfaceC25676OooOo0
    public void OooO0OO(Object obj) {
    }
}
