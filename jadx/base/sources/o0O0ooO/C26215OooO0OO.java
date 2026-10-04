package o0O0ooO;

import android.animation.Animator;
import o0O0ooO.C26216OooO0Oo;

/* JADX INFO: renamed from: o0O0ooO.OooO0OO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C26215OooO0OO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C26216OooO0Oo.OooO00o f89549OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ C26216OooO0Oo f89550OooO0O0;

    public C26215OooO0OO(C26216OooO0Oo c26216OooO0Oo, C26216OooO0Oo.OooO00o oooO00o) {
        this.f89550OooO0O0 = c26216OooO0Oo;
        this.f89549OooO00o = oooO00o;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        C26216OooO0Oo c26216OooO0Oo = this.f89550OooO0O0;
        C26216OooO0Oo.OooO00o oooO00o = this.f89549OooO00o;
        c26216OooO0Oo.OooO00o(1.0f, oooO00o, true);
        oooO00o.f89570OooOO0O = oooO00o.f89566OooO0o0;
        oooO00o.f89571OooOO0o = oooO00o.f89565OooO0o;
        oooO00o.f89573OooOOO0 = oooO00o.f89567OooO0oO;
        oooO00o.OooO00o((oooO00o.f89569OooOO0 + 1) % oooO00o.f89560OooO.length);
        if (!c26216OooO0Oo.f89559OooOoo0) {
            c26216OooO0Oo.f89558OooOoOO += 1.0f;
            return;
        }
        c26216OooO0Oo.f89559OooOoo0 = false;
        animator.cancel();
        animator.setDuration(1332L);
        animator.start();
        if (oooO00o.f89572OooOOO) {
            oooO00o.f89572OooOOO = false;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f89550OooO0O0.f89558OooOoOO = 0.0f;
    }
}
