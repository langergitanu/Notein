package o0Ooo0oo;

import android.animation.Animator;
import o0Oo.C28016OooO0o0;

/* JADX INFO: renamed from: o0Ooo0oo.OoooOO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29484OoooOO0 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C28016OooO0o0 f104582OooO00o;

    public C29484OoooOO0(C28016OooO0o0 c28016OooO0o0) {
        this.f104582OooO00o = c28016OooO0o0;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f104582OooO00o.invoke();
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
