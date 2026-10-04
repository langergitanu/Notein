package o0Ooo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;

/* JADX INFO: renamed from: o0Ooo.OoooOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29314OoooOoo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103959OooO00o;

    public C29314OoooOoo(PenBoxChildFragment penBoxChildFragment) {
        this.f103959OooO00o = penBoxChildFragment;
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
        View view = this.f103959OooO00o.f75365Oooo00O;
        if (view != null) {
            view.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
    }
}
