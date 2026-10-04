package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.AbstractC22078OooOooO f65866OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ int f65867OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ View f65868OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f65869OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ C22031OooO0oo f65870OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f65871OooO0o0;

    public OooOO0O(C22031OooO0oo c22031OooO0oo, RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f65870OooO0o = c22031OooO0oo;
        this.f65866OooO00o = abstractC22078OooOooO;
        this.f65867OooO0O0 = i;
        this.f65868OooO0OO = view;
        this.f65869OooO0Oo = i2;
        this.f65871OooO0o0 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f65867OooO0O0;
        View view = this.f65868OooO0OO;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f65869OooO0Oo != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f65871OooO0o0.setListener(null);
        C22031OooO0oo c22031OooO0oo = this.f65870OooO0o;
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f65866OooO00o;
        c22031OooO0oo.OooO0oO(abstractC22078OooOooO);
        c22031OooO0oo.f65842OooOOOo.remove(abstractC22078OooOooO);
        c22031OooO0oo.OooOOO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f65870OooO0o.getClass();
    }
}
