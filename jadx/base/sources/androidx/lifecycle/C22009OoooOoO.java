package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;

/* JADX INFO: renamed from: androidx.lifecycle.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22009OoooOoO implements InterfaceC21986OooOoOO {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final C22013OooooO0 f65650OooOo0o;

    public C22009OoooOoO(C22013OooooO0 c22013OooooO0) {
        this.f65650OooOo0o = c22013OooooO0;
    }

    @Override // androidx.lifecycle.InterfaceC21986OooOoOO
    public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_CREATE) {
            interfaceC21987OooOoo.getLifecycle().OooO0OO(this);
            this.f65650OooOo0o.OooO0O0();
        } else {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + oooO00o).toString());
        }
    }
}
