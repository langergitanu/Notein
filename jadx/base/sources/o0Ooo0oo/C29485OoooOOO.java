package o0Ooo0oo;

import android.animation.Animator;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;

/* JADX INFO: renamed from: o0Ooo0oo.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29485OoooOOO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104583OooO00o;

    public C29485OoooOOO(PenBarChildFragment penBarChildFragment) {
        this.f104583OooO00o = penBarChildFragment;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f104583OooO00o.f75310o0O0O00 = true;
    }
}
