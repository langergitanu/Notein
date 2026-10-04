package o0Ooo0oo;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import com.orion.notein.p607ui.noteeditor.penbar.PenBarChildFragment;

/* JADX INFO: renamed from: o0Ooo0oo.Ooooo00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29490Ooooo00 implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBarChildFragment f104590OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f104591OooO0O0;

    public C29490Ooooo00(PenBarChildFragment penBarChildFragment, int i) {
        this.f104590OooO00o = penBarChildFragment;
        this.f104591OooO0O0 = i;
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
        PenBarChildFragment penBarChildFragment = this.f104590OooO00o;
        penBarChildFragment.f75310o0O0O00 = true;
        View view = penBarChildFragment.f75253Oooo00o;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("shadowDivider");
            throw null;
        }
        view.setVisibility(8);
        View view2 = penBarChildFragment.f75250Oooo0;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(this.f104591OooO0O0);
        View view3 = penBarChildFragment.f75250Oooo0;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
            throw null;
        }
        view3.setLayoutParams(marginLayoutParams);
        View view4 = penBarChildFragment.f75250Oooo0;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
            throw null;
        }
        view4.setVisibility(0);
        View view5 = penBarChildFragment.f75250Oooo0;
        if (view5 != null) {
            view5.requestLayout();
        } else {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penBoxIconWrapper");
            throw null;
        }
    }
}
