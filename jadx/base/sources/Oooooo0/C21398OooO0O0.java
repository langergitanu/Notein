package Oooooo0;

import OooooO0.C21290OooO0o0;
import OooooO0.C21293OooOO0;
import OooooO0.C21294OooOO0O;
import OooooOO.InterfaceC21342OoooOOO;
import Oooooo0.C21397OooO00o;

/* JADX INFO: renamed from: Oooooo0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21398OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C21397OooO00o.OooO0O0 f61921OooO00o;

    public C21398OooO0O0(C21397OooO00o.OooO0O0 oooO0O0) {
        this.f61921OooO00o = oooO0O0;
    }

    public final void OooO00o(float f, float f2, float f3, float f4, int i) {
        this.f61921OooO00o.OooO00o().OooO0O0(f, f2, f3, f4, i);
    }

    public final void OooO0O0(float f, float f2, float f3, float f4) {
        C21397OooO00o.OooO0O0 oooO0O0 = this.f61921OooO00o;
        InterfaceC21342OoooOOO interfaceC21342OoooOOOOooO00o = oooO0O0.OooO00o();
        long jOooO00o = C21294OooOO0O.OooO00o(C21293OooOO0.OooO0Oo(oooO0O0.OooO0O0()) - (f3 + f), C21293OooOO0.OooO0O0(oooO0O0.OooO0O0()) - (f4 + f2));
        if (C21293OooOO0.OooO0Oo(jOooO00o) < 0.0f || C21293OooOO0.OooO0O0(jOooO00o) < 0.0f) {
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero");
        }
        oooO0O0.OooO0OO(jOooO00o);
        interfaceC21342OoooOOOOooO00o.OooO0OO(f, f2);
    }

    public final void OooO0OO(long j) {
        InterfaceC21342OoooOOO interfaceC21342OoooOOOOooO00o = this.f61921OooO00o.OooO00o();
        interfaceC21342OoooOOOOooO00o.OooO0OO(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j));
        interfaceC21342OoooOOOOooO00o.OooOO0O();
        interfaceC21342OoooOOOOooO00o.OooO0OO(-C21290OooO0o0.OooO0OO(j), -C21290OooO0o0.OooO0Oo(j));
    }

    public final void OooO0Oo(float f, float f2) {
        this.f61921OooO00o.OooO00o().OooO0OO(f, f2);
    }
}
