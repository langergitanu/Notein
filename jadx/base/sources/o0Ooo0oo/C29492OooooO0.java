package o0Ooo0oo;

import android.animation.Animator;

/* JADX INFO: renamed from: o0Ooo0oo.OooooO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29492OooooO0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29466OooOoo0 f104594OooO00o;

    public C29492OooooO0(C29466OooOoo0 c29466OooOoo0) {
        this.f104594OooO00o = c29466OooOoo0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f104594OooO00o.invoke();
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
