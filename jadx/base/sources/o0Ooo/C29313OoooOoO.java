package o0Ooo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;

/* JADX INFO: renamed from: o0Ooo.OoooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29313OoooOoO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103957OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ boolean f103958OooO0O0;

    public C29313OoooOoO(PenBoxChildFragment penBoxChildFragment, boolean z) {
        this.f103957OooO00o = penBoxChildFragment;
        this.f103958OooO0O0 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view = this.f103957OooO00o.f75365Oooo00O;
        if (view != null) {
            view.setVisibility(this.f103958OooO0O0 ? 0 : 8);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
