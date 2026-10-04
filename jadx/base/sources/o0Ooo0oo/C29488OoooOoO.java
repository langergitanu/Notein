package o0Ooo0oo;

import android.animation.Animator;

/* JADX INFO: renamed from: o0Ooo0oo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29488OoooOoO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29457OooOo f104588OooO00o;

    public C29488OoooOoO(C29457OooOo c29457OooOo) {
        this.f104588OooO00o = c29457OooOo;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f104588OooO00o.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
