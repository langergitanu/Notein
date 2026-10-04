package o00ooo00;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* JADX INFO: renamed from: o00ooo00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25814OooO0Oo extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public boolean f88028OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ View f88029OooO0O0;

    public C25814OooO0Oo(View view) {
        this.f88029OooO0O0 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f88028OooO00o = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        if (!this.f88028OooO00o) {
            this.f88029OooO0O0.setVisibility(4);
        }
        this.f88028OooO00o = false;
    }
}
