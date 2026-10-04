package oOO00OOo;

import oOO00Oo.C34358OooO0o0;
import oOO00Oo.OooOO0O;
import ooooOoOo.InterfaceC35245OooO00o;
import ooooOoOo.InterfaceC35246OooO0O0;

/* JADX INFO: renamed from: oOO00OOo.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C34355OooO0o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final InterfaceC35245OooO00o f123316OooO00o;

    static {
        InterfaceC35246OooO0O0 interfaceC35246OooO0O0OooO0Oo = C34354OooO0Oo.OooO0Oo();
        if (interfaceC35246OooO0O0OooO0Oo != null) {
            f123316OooO00o = interfaceC35246OooO0O0OooO0Oo.OooO0O0();
            return;
        }
        OooOO0O.OooO00o("Failed to find provider.");
        OooOO0O.OooO00o("Defaulting to no-operation MDCAdapter implementation.");
        f123316OooO00o = new C34358OooO0o0();
    }
}
