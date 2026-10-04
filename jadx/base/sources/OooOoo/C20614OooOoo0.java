package OooOoo;

import OooOooO.C20724OooO00o;
import OooOooO.C20725OooO0O0;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.InterfaceC21063OoooO0O;

/* JADX INFO: renamed from: OooOoo.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20614OooOoo0 implements InterfaceC21063OoooO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59003OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59004OooO0O0;

    public C20614OooOoo0(Oooo0oO.o00oO0O o00oo0o, InterfaceC20736OooOOO0 interfaceC20736OooOOO0) {
        this.f59003OooO00o = o00oo0o;
        this.f59004OooO0O0 = interfaceC20736OooOOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0oO.InterfaceC21063OoooO0O
    public final void dispose() {
        Oooo0oO.o00oO0O o00oo0o = this.f59003OooO00o;
        C20725OooO0O0 c20725OooO0O0 = (C20725OooO0O0) o00oo0o.getValue();
        if (c20725OooO0O0 != null) {
            InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f59004OooO0O0;
            if (interfaceC20736OooOOO0 != null) {
                interfaceC20736OooOOO0.OooO00o(new C20724OooO00o(c20725OooO0O0));
            }
            o00oo0o.setValue(null);
        }
    }
}
