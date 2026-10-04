package OooOoo;

import OooOoo.C20595OooO0o0;
import java.util.concurrent.CancellationException;
import oO00ooO.C32460OooOooO;
import oO0o0OO.InterfaceC33611OooOO0O;

/* JADX INFO: renamed from: OooOoo.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20592OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Oooo.OooO0O0<C20595OooO0o0.OooO00o> f58869OooO00o = new Oooo.OooO0O0<>(new C20595OooO0o0.OooO00o[16]);

    public final void OooO00o(CancellationException cancellationException) {
        Oooo.OooO0O0<C20595OooO0o0.OooO00o> oooO0O0 = this.f58869OooO00o;
        int i = oooO0O0.f59746OooOoO0;
        InterfaceC33611OooOO0O[] interfaceC33611OooOO0OArr = new InterfaceC33611OooOO0O[i];
        for (int i2 = 0; i2 < i; i2++) {
            interfaceC33611OooOO0OArr[i2] = oooO0O0.f59745OooOo0o[i2].f58886OooO0O0;
        }
        for (int i3 = 0; i3 < i; i3++) {
            interfaceC33611OooOO0OArr[i3].cancel(cancellationException);
        }
        if (!oooO0O0.OooO()) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final void OooO0O0() {
        Oooo.OooO0O0<C20595OooO0o0.OooO00o> oooO0O0 = this.f58869OooO00o;
        int i = 0;
        int i2 = new oO0O00oo.OooO(0, oooO0O0.f59746OooOoO0 - 1, 1).f116811OooOo;
        if (i2 >= 0) {
            while (true) {
                oooO0O0.f59745OooOo0o[i].f58886OooO0O0.resumeWith(C32460OooOooO.f116667OooO00o);
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        oooO0O0.OooO0o();
    }
}
