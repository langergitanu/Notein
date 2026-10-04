package o00ooO0;

import java.util.concurrent.CancellationException;
import o0Oo00oO.C28035OooO00o;
import oO00ooO.C32443OooOOO;
import oO00ooO.C32460OooOooO;
import oO0o0OO.C33609OooO0oo;
import oO0o0OOo.C33702OooOOO;
import oO0o0OOo.C33705OooOOOo;
import oO0o0OOo.InterfaceC33709OooOo;
import oO0o0OOo.InterfaceC33715OooOoO0;

/* JADX INFO: renamed from: o00ooO0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25749OooOoO0 {
    public static final int OooO00o(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    public static final void OooO0O0(InterfaceC33709OooOo interfaceC33709OooOo, Throwable th) {
        CancellationException cancellationExceptionOooO00o = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionOooO00o == null) {
            cancellationExceptionOooO00o = C28035OooO00o.OooO00o("Channel was consumed, consumer had failed", th);
        }
        interfaceC33709OooOo.cancel(cancellationExceptionOooO00o);
    }

    public static final void OooO0OO(int i, int i2, int i3, int i4, int i5) {
        OooOoo0.OooOo00.OooO0Oo(i4 >= 0, "count (%d) ! >= 0", Integer.valueOf(i4));
        OooOoo0.OooOo00.OooO0Oo(i >= 0, "offset (%d) ! >= 0", Integer.valueOf(i));
        OooOoo0.OooOo00.OooO0Oo(i3 >= 0, "otherOffset (%d) ! >= 0", Integer.valueOf(i3));
        OooOoo0.OooOo00.OooO0Oo(i + i4 <= i5, "offset (%d) + count (%d) ! <= %d", Integer.valueOf(i), Integer.valueOf(i4), Integer.valueOf(i5));
        OooOoo0.OooOo00.OooO0Oo(i3 + i4 <= i2, "otherOffset (%d) + count (%d) ! <= %d", Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i2));
    }

    public static final C32443OooOOO OooO0Oo(Object obj, Object obj2) {
        return new C32443OooOOO(obj, obj2);
    }

    public static final void OooO0o0(InterfaceC33715OooOoO0 interfaceC33715OooOoO0, Object obj) {
        Object objOooO0o0 = interfaceC33715OooOoO0.OooO0o0(obj);
        if (objOooO0o0 instanceof C33702OooOOO.OooO0O0) {
            Object obj2 = ((C33702OooOOO) C33609OooO0oo.OooO0Oo(oOo0000O.OooO.f123416OooOo0o, new C33705OooOOOo(interfaceC33715OooOoO0, obj, null))).f121484OooO00o;
        } else {
            C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        }
    }
}
