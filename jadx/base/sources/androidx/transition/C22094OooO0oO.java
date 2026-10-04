package androidx.transition;

import androidx.transition.OooOOO0;

/* JADX INFO: renamed from: androidx.transition.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22094OooO0oO implements OooOOO0.OooO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ Runnable f66347OooO00o;

    public C22094OooO0oO(Runnable runnable) {
        this.f66347OooO00o = runnable;
    }

    @Override // androidx.transition.OooOOO0.OooO
    public final void onTransitionCancel(OooOOO0 oooOOO0) {
    }

    @Override // androidx.transition.OooOOO0.OooO
    public final void onTransitionEnd(OooOOO0 oooOOO0) {
        this.f66347OooO00o.run();
    }

    @Override // androidx.transition.OooOOO0.OooO
    public final void onTransitionPause(OooOOO0 oooOOO0) {
    }

    @Override // androidx.transition.OooOOO0.OooO
    public final void onTransitionResume(OooOOO0 oooOOO0) {
    }

    @Override // androidx.transition.OooOOO0.OooO
    public final void onTransitionStart(OooOOO0 oooOOO0) {
    }
}
