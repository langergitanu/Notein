package com.google.android.material.transition;

import androidx.transition.OooOOO0;

/* JADX INFO: loaded from: classes7.dex */
abstract class TransitionListenerAdapter implements OooOOO0.OooO {
    @Override // androidx.transition.OooOOO0.OooO
    public void onTransitionCancel(OooOOO0 oooOOO0) {
    }

    @Override // androidx.transition.OooOOO0.OooO
    public void onTransitionEnd(OooOOO0 oooOOO0) {
    }

    @Override // androidx.transition.OooOOO0.OooO
    public void onTransitionPause(OooOOO0 oooOOO0) {
    }

    @Override // androidx.transition.OooOOO0.OooO
    public void onTransitionResume(OooOOO0 oooOOO0) {
    }

    @Override // androidx.transition.OooOOO0.OooO
    public void onTransitionStart(OooOOO0 oooOOO0) {
    }

    @Override // androidx.transition.OooOOO0.OooO
    public void onTransitionEnd(OooOOO0 oooOOO0, boolean z) {
        onTransitionEnd(oooOOO0);
    }

    @Override // androidx.transition.OooOOO0.OooO
    public void onTransitionStart(OooOOO0 oooOOO0, boolean z) {
        onTransitionStart(oooOOO0);
    }
}
