package o00oOO;

import o00o0Ooo.C25431OooO0oo;
import o00oO00O.C25476OooO0OO;
import o0ooOO.InterfaceC31496OooO00o;
import o0ooOO.InterfaceC31497OooO0O0;

/* JADX INFO: renamed from: o00oOO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25580OooO0O0<DH extends InterfaceC31497OooO0O0> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public DH f87262OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final C25476OooO0OO f87263OooO0o;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f87259OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f87260OooO0O0 = false;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public boolean f87261OooO0OO = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public InterfaceC31496OooO00o f87264OooO0o0 = null;

    public C25580OooO0O0() {
        this.f87263OooO0o = C25476OooO0OO.f86796OooO0OO ? new C25476OooO0OO() : C25476OooO0OO.f86795OooO0O0;
    }

    public final void OooO00o() {
        if (this.f87259OooO00o) {
            return;
        }
        this.f87263OooO0o.OooO00o(C25476OooO0OO.OooO00o.f86803OooOoo);
        this.f87259OooO00o = true;
        InterfaceC31496OooO00o interfaceC31496OooO00o = this.f87264OooO0o0;
        if (interfaceC31496OooO00o == null || interfaceC31496OooO00o.OooO0o0() == null) {
            return;
        }
        this.f87264OooO0o0.OooO0O0();
    }

    public final void OooO0O0() {
        if (this.f87260OooO0O0 && this.f87261OooO0OO) {
            OooO00o();
            return;
        }
        if (this.f87259OooO00o) {
            this.f87263OooO0o.OooO00o(C25476OooO0OO.OooO00o.f86805OooOooO);
            this.f87259OooO00o = false;
            if (OooO0OO()) {
                this.f87264OooO0o0.OooO0OO();
            }
        }
    }

    public final boolean OooO0OO() {
        InterfaceC31496OooO00o interfaceC31496OooO00o = this.f87264OooO0o0;
        return interfaceC31496OooO00o != null && interfaceC31496OooO00o.OooO0o0() == this.f87262OooO0Oo;
    }

    public final void OooO0Oo(boolean z) {
        if (this.f87261OooO0OO == z) {
            return;
        }
        this.f87263OooO0o.OooO00o(z ? C25476OooO0OO.OooO00o.f86814Oooo0o : C25476OooO0OO.OooO00o.f86816Oooo0oO);
        this.f87261OooO0OO = z;
        OooO0O0();
    }

    public final void OooO0o0(InterfaceC31496OooO00o interfaceC31496OooO00o) {
        boolean z = this.f87259OooO00o;
        C25476OooO0OO c25476OooO0OO = this.f87263OooO0o;
        if (z && z) {
            c25476OooO0OO.OooO00o(C25476OooO0OO.OooO00o.f86805OooOooO);
            this.f87259OooO00o = false;
            if (OooO0OO()) {
                this.f87264OooO0o0.OooO0OO();
            }
        }
        if (OooO0OO()) {
            c25476OooO0OO.OooO00o(C25476OooO0OO.OooO00o.f86800OooOoO);
            this.f87264OooO0o0.OooO0Oo(null);
        }
        this.f87264OooO0o0 = interfaceC31496OooO00o;
        if (interfaceC31496OooO00o != null) {
            c25476OooO0OO.OooO00o(C25476OooO0OO.OooO00o.f86801OooOoO0);
            this.f87264OooO0o0.OooO0Oo(this.f87262OooO0Oo);
        } else {
            c25476OooO0OO.OooO00o(C25476OooO0OO.OooO00o.f86802OooOoOO);
        }
        if (z) {
            OooO00o();
        }
    }

    public final String toString() {
        C25431OooO0oo.OooO00o oooO00oOooO0O0 = C25431OooO0oo.OooO0O0(this);
        oooO00oOooO0O0.OooO0O0("controllerAttached", this.f87259OooO00o);
        oooO00oOooO0O0.OooO0O0("holderAttached", this.f87260OooO0O0);
        oooO00oOooO0O0.OooO0O0("drawableVisible", this.f87261OooO0OO);
        oooO00oOooO0O0.OooO0OO(this.f87263OooO0o.f86797OooO00o.toString(), "events");
        return oooO00oOooO0O0.toString();
    }
}
