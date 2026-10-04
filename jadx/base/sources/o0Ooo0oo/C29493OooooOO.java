package o0Ooo0oo;

import android.animation.Animator;

/* JADX INFO: renamed from: o0Ooo0oo.OooooOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29493OooooOO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29466OooOoo0 f104595OooO00o;

    public C29493OooooOO(C29466OooOoo0 c29466OooOoo0) {
        this.f104595OooO00o = c29466OooOoo0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f104595OooO00o.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
