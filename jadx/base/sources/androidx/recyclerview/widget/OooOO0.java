package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.AbstractC22078OooOooO f65862OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ View f65863OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f65864OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ C22031OooO0oo f65865OooO0Oo;

    public OooOO0(View view, ViewPropertyAnimator viewPropertyAnimator, C22031OooO0oo c22031OooO0oo, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO) {
        this.f65865OooO0Oo = c22031OooO0oo;
        this.f65862OooO00o = abstractC22078OooOooO;
        this.f65863OooO0O0 = view;
        this.f65864OooO0OO = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f65863OooO0O0.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f65864OooO0OO.setListener(null);
        C22031OooO0oo c22031OooO0oo = this.f65865OooO0Oo;
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f65862OooO00o;
        c22031OooO0oo.OooO0oO(abstractC22078OooOooO);
        c22031OooO0oo.f65841OooOOOO.remove(abstractC22078OooOooO);
        c22031OooO0oo.OooOOO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f65865OooO0Oo.getClass();
    }
}
