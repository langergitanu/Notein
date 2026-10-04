package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C22031OooO0oo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C22031OooO0oo.C22032OooO0Oo f65899OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f65900OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ View f65901OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ C22031OooO0oo f65902OooO0Oo;

    public OooOOO0(C22031OooO0oo c22031OooO0oo, C22031OooO0oo.C22032OooO0Oo c22032OooO0Oo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f65902OooO0Oo = c22031OooO0oo;
        this.f65899OooO00o = c22032OooO0Oo;
        this.f65900OooO0O0 = viewPropertyAnimator;
        this.f65901OooO0OO = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f65900OooO0O0.setListener(null);
        View view = this.f65901OooO0OO;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C22031OooO0oo.C22032OooO0Oo c22032OooO0Oo = this.f65899OooO00o;
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = c22032OooO0Oo.f65852OooO0O0;
        C22031OooO0oo c22031OooO0oo = this.f65902OooO0Oo;
        c22031OooO0oo.OooO0oO(abstractC22078OooOooO);
        c22031OooO0oo.f65843OooOOo.remove(c22032OooO0Oo.f65852OooO0O0);
        c22031OooO0oo.OooOOO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f65899OooO00o.f65852OooO0O0;
        this.f65902OooO0Oo.getClass();
    }
}
