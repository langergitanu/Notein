package o0Ooo0oo;

import android.animation.Animator;
import android.view.View;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;

/* JADX INFO: renamed from: o0Ooo0oo.OooooOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29494OooooOo implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104596OooO00o;

    public C29494OooooOo(PenBarChildFragment penBarChildFragment) {
        this.f104596OooO00o = penBarChildFragment;
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
        PenBarChildFragment penBarChildFragment = this.f104596OooO00o;
        penBarChildFragment.f75310o0O0O00 = true;
        View view = penBarChildFragment.f75252Oooo00O;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("dragHandle");
            throw null;
        }
        view.setVisibility(0);
        View view2 = penBarChildFragment.f75251Oooo000;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("contentView");
            throw null;
        }
        view2.setVisibility(0);
        View view3 = penBarChildFragment.f75253Oooo00o;
        if (view3 != null) {
            view3.setVisibility(0);
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
            throw null;
        }
    }
}
