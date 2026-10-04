package o0OoOOo;

import android.animation.Animator;

/* JADX INFO: renamed from: o0OoOOo.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29144OooOOo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C29128OooO0O0 f103308OooO00o;

    public C29144OooOOo(C29128OooO0O0 c29128OooO0O0) {
        this.f103308OooO00o = c29128OooO0O0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f103308OooO00o.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
