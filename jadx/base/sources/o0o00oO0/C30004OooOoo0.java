package o0o00oO0;

import android.animation.Animator;
import android.view.View;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0o00oO0.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30004OooOoo0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ View f106601OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ float f106602OooO0O0;

    public C30004OooOoo0(View view, float f, OooOo oooOo) {
        this.f106601OooO00o = view;
        this.f106602OooO0O0 = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f106601OooO00o.setTranslationY(this.f106602OooO0O0);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
