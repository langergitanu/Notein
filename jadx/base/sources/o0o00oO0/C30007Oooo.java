package o0o00oO0;

import android.animation.Animator;
import android.view.View;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: o0o00oO0.Oooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C30007Oooo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ View f106630OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ float f106631OooO0O0;

    public C30007Oooo(View view, float f, C30015Oooo0oo c30015Oooo0oo) {
        this.f106630OooO00o = view;
        this.f106631OooO0O0 = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f106630OooO00o.setTranslationY(this.f106631OooO0O0);
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
