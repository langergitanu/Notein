package Oooo0;

import Oooo0O0.C20928OooOoOO;
import Oooo0O0.InterfaceC20926OooOoO;
import OooooO0.C21290OooO0o0;
import oo000o.InterfaceC34635OooOOOO;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO implements InterfaceC20865o00000oO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public long f60001OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public long f60002OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ C20861o000000o f60003OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20926OooOoO f60004OooO0Oo;

    public o00000OO(C20861o000000o c20861o000000o, InterfaceC20926OooOoO interfaceC20926OooOoO) {
        this.f60003OooO0OO = c20861o000000o;
        this.f60004OooO0Oo = interfaceC20926OooOoO;
        long j = C21290OooO0o0.f61718OooO0O0;
        this.f60001OooO00o = j;
        this.f60002OooO0O0 = j;
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO00o() {
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO0O0(long j) {
        C20861o000000o c20861o000000o = this.f60003OooO0OO;
        o000OO0O o000oo0o2 = c20861o000000o.f59987OooOo0o;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO = o000oo0o2.f60164OooO0OO;
        if (interfaceC34635OooOOOO == null || !interfaceC34635OooOOOO.OooOo()) {
            return;
        }
        InterfaceC20926OooOoO interfaceC20926OooOoO = this.f60004OooO0Oo;
        if (C20928OooOoOO.OooO00o(interfaceC20926OooOoO, o000oo0o2.f60162OooO00o)) {
            long jOooO0o = C21290OooO0o0.OooO0o(this.f60002OooO0O0, j);
            this.f60002OooO0O0 = jOooO0o;
            long jOooO0o2 = C21290OooO0o0.OooO0o(this.f60001OooO00o, jOooO0o);
            if (C20861o000000o.OooO00o(c20861o000000o, this.f60001OooO00o, jOooO0o2) || !interfaceC20926OooOoO.OooOO0()) {
                return;
            }
            this.f60001OooO00o = jOooO0o2;
            this.f60002OooO0O0 = C21290OooO0o0.f61718OooO0O0;
        }
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO0OO(long j) {
        C20861o000000o c20861o000000o = this.f60003OooO0OO;
        o000OO0O o000oo0o2 = c20861o000000o.f59987OooOo0o;
        InterfaceC34635OooOOOO interfaceC34635OooOOOO = o000oo0o2.f60164OooO0OO;
        InterfaceC20926OooOoO interfaceC20926OooOoO = this.f60004OooO0Oo;
        if (interfaceC34635OooOOOO != null) {
            if (!interfaceC34635OooOOOO.OooOo()) {
                return;
            }
            if (C20861o000000o.OooO00o(c20861o000000o, j, j)) {
                interfaceC20926OooOoO.OooO0o0();
            } else {
                interfaceC20926OooOoO.OooO0o();
            }
            this.f60001OooO00o = j;
        }
        if (C20928OooOoOO.OooO00o(interfaceC20926OooOoO, o000oo0o2.f60162OooO00o)) {
            this.f60002OooO0O0 = C21290OooO0o0.f61718OooO0O0;
        }
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void OooO0Oo() {
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void onCancel() {
        long j = this.f60003OooO0OO.f59987OooOo0o.f60162OooO00o;
        InterfaceC20926OooOoO interfaceC20926OooOoO = this.f60004OooO0Oo;
        if (C20928OooOoOO.OooO00o(interfaceC20926OooOoO, j)) {
            interfaceC20926OooOoO.OooO00o();
        }
    }

    @Override // Oooo0.InterfaceC20865o00000oO
    public final void onStop() {
        long j = this.f60003OooO0OO.f59987OooOo0o.f60162OooO00o;
        InterfaceC20926OooOoO interfaceC20926OooOoO = this.f60004OooO0Oo;
        if (C20928OooOoOO.OooO00o(interfaceC20926OooOoO, j)) {
            interfaceC20926OooOoO.OooO00o();
        }
    }
}
