package o0Ooo;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.orion.notein.p607ui.noteeditor.penbox.PenBoxChildFragment;

/* JADX INFO: renamed from: o0Ooo.OoooOOO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29310OoooOOO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ PenBoxChildFragment f103952OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ViewGroup.MarginLayoutParams f103953OooO0O0;

    public C29310OoooOOO(PenBoxChildFragment penBoxChildFragment, ViewGroup.MarginLayoutParams marginLayoutParams) {
        this.f103952OooO00o = penBoxChildFragment;
        this.f103953OooO0O0 = marginLayoutParams;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PenBoxChildFragment penBoxChildFragment = this.f103952OooO00o;
        View view = penBoxChildFragment.f75366Oooo00o;
        if (view == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxPanel");
            throw null;
        }
        view.setVisibility(8);
        View view2 = penBoxChildFragment.f75376OoooO0O;
        if (view2 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("toolBoxIconWrapper");
            throw null;
        }
        view2.setVisibility(0);
        ViewGroup.MarginLayoutParams marginLayoutParams = this.f103953OooO0O0;
        marginLayoutParams.width = -2;
        marginLayoutParams.setMargins(PenBoxChildFragment.f75351o0000, PenBoxChildFragment.f75357o0000oo, PenBoxChildFragment.f75354o0000O00, PenBoxChildFragment.f75356o0000oO);
        view2.setLayoutParams(marginLayoutParams);
        view2.requestLayout();
        View view3 = penBoxChildFragment.f75365Oooo00O;
        if (view3 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view3.setRotation(0.0f);
        View view4 = penBoxChildFragment.f75365Oooo00O;
        if (view4 == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("rootView");
            throw null;
        }
        view4.setScaleY(1.0f);
        RecyclerView recyclerView = penBoxChildFragment.f75381OoooOoO;
        if (recyclerView == null) {
            kotlin.jvm.internal.OooOOO0.OooOOOO("penWidthListView");
            throw null;
        }
        recyclerView.setScaleX(1.0f);
        RecyclerView.OooOOOO layoutManager = recyclerView.getLayoutManager();
        kotlin.jvm.internal.OooOOO0.OooO0o0(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        ((LinearLayoutManager) layoutManager).setReverseLayout(false);
        recyclerView.invalidateItemDecorations();
        View view5 = penBoxChildFragment.f75365Oooo00O;
        if (view5 != null) {
            view5.requestLayout();
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
