package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.C22031OooO0oo;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: androidx.recyclerview.widget.OooOO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22034OooOO0o extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ C22031OooO0oo.C22032OooO0Oo f65872OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f65873OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final /* synthetic */ View f65874OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ C22031OooO0oo f65875OooO0Oo;

    public C22034OooOO0o(C22031OooO0oo c22031OooO0oo, C22031OooO0oo.C22032OooO0Oo c22032OooO0Oo, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f65875OooO0Oo = c22031OooO0oo;
        this.f65872OooO00o = c22032OooO0Oo;
        this.f65873OooO0O0 = viewPropertyAnimator;
        this.f65874OooO0OO = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f65873OooO0O0.setListener(null);
        View view = this.f65874OooO0OO;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        C22031OooO0oo.C22032OooO0Oo c22032OooO0Oo = this.f65872OooO00o;
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = c22032OooO0Oo.f65851OooO00o;
        C22031OooO0oo c22031OooO0oo = this.f65875OooO0Oo;
        c22031OooO0oo.OooO0oO(abstractC22078OooOooO);
        c22031OooO0oo.f65843OooOOo.remove(c22032OooO0Oo.f65851OooO00o);
        c22031OooO0oo.OooOOO();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        RecyclerView.AbstractC22078OooOooO abstractC22078OooOooO = this.f65872OooO00o.f65851OooO00o;
        this.f65875OooO0Oo.getClass();
    }
}
