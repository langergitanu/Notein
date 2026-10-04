package com.orion.editor;

import android.animation.Animator;

/* JADX INFO: loaded from: classes9.dex */
public final class OooO0OO implements Animator.AnimatorListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ ForegroundView f69106OooO00o;

    public OooO0OO(ForegroundView foregroundView) {
        this.f69106OooO00o = foregroundView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        ForegroundView foregroundView = this.f69106OooO00o;
        foregroundView.f69049OooOoO = null;
        foregroundView.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ForegroundView foregroundView = this.f69106OooO00o;
        foregroundView.f69049OooOoO = null;
        foregroundView.invalidate();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
