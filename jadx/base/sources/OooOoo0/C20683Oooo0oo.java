package OooOoo0;

import OooOooO.C20727OooO0Oo;
import OooOooO.C20729OooO0o0;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.InterfaceC21063OoooO0O;

/* JADX INFO: renamed from: OooOoo0.Oooo0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20683Oooo0oo implements InterfaceC21063OoooO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59373OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59374OooO0O0;

    public C20683Oooo0oo(Oooo0oO.o00oO0O o00oo0o, InterfaceC20736OooOOO0 interfaceC20736OooOOO0) {
        this.f59373OooO00o = o00oo0o;
        this.f59374OooO0O0 = interfaceC20736OooOOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0oO.InterfaceC21063OoooO0O
    public final void dispose() {
        Oooo0oO.o00oO0O o00oo0o = this.f59373OooO00o;
        C20727OooO0Oo c20727OooO0Oo = (C20727OooO0Oo) o00oo0o.getValue();
        if (c20727OooO0Oo != null) {
            C20729OooO0o0 c20729OooO0o0 = new C20729OooO0o0(c20727OooO0Oo);
            InterfaceC20736OooOOO0 interfaceC20736OooOOO0 = this.f59374OooO0O0;
            if (interfaceC20736OooOOO0 != null) {
                interfaceC20736OooOOO0.OooO00o(c20729OooO0o0);
            }
            o00oo0o.setValue(null);
        }
    }
}
