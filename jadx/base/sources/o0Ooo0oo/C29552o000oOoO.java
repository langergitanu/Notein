package o0Ooo0oo;

import android.animation.Animator;
import o0Oo.C28016OooO0o0;

/* JADX INFO: renamed from: o0Ooo0oo.o000oOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29552o000oOoO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C28016OooO0o0 f104832OooO00o;

    public C29552o000oOoO(C28016OooO0o0 c28016OooO0o0) {
        this.f104832OooO00o = c28016OooO0o0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f104832OooO00o.invoke();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
