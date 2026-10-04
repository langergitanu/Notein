package androidx.lifecycle;

import androidx.lifecycle.AbstractC21979OooOOo0;

/* JADX INFO: renamed from: androidx.lifecycle.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22010OoooOoo implements InterfaceC21986OooOoOO {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C22008OoooOo0 f65651OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f65652OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f65653OooOoO0;

    public C22010OoooOoo(String str, C22008OoooOo0 c22008OoooOo0) {
        this.f65652OooOo0o = str;
        this.f65651OooOo = c22008OoooOo0;
    }

    public final void OooO00o(AbstractC21979OooOOo0 lifecycle, o000ooo0.OooO0OO registry) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(registry, "registry");
        kotlin.jvm.internal.OooOOO0.OooO0oO(lifecycle, "lifecycle");
        if (this.f65653OooOoO0) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f65653OooOoO0 = true;
        lifecycle.OooO00o(this);
        registry.OooO0OO(this.f65652OooOo0o, this.f65651OooOo.f65649OooO0o0);
    }

    @Override // androidx.lifecycle.InterfaceC21986OooOoOO
    public final void OooOOo0(InterfaceC21987OooOoo interfaceC21987OooOoo, AbstractC21979OooOOo0.OooO00o oooO00o) {
        if (oooO00o == AbstractC21979OooOOo0.OooO00o.ON_DESTROY) {
            this.f65653OooOoO0 = false;
            interfaceC21987OooOoo.getLifecycle().OooO0OO(this);
        }
    }
}
