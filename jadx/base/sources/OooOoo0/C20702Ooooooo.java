package OooOoo0;

import OooOooO.C20723OooO;
import OooOooO.C20731OooO0oo;
import OooOooO.InterfaceC20736OooOOO0;
import Oooo0oO.InterfaceC21063OoooO0O;

/* JADX INFO: renamed from: OooOoo0.Ooooooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20702Ooooooo implements InterfaceC21063OoooO0O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Oooo0oO.o00oO0O f59422OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ InterfaceC20736OooOOO0 f59423OooO0O0;

    public C20702Ooooooo(Oooo0oO.o00oO0O o00oo0o, InterfaceC20736OooOOO0 interfaceC20736OooOOO0) {
        this.f59422OooO00o = o00oo0o;
        this.f59423OooO0O0 = interfaceC20736OooOOO0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Oooo0oO.InterfaceC21063OoooO0O
    public final void dispose() {
        Oooo0oO.o00oO0O o00oo0o = this.f59422OooO00o;
        C20731OooO0oo c20731OooO0oo = (C20731OooO0oo) o00oo0o.getValue();
        if (c20731OooO0oo != null) {
            this.f59423OooO0O0.OooO00o(new C20723OooO(c20731OooO0oo));
            o00oo0o.setValue(null);
        }
    }
}
