package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.C22107OooOo0o;
import androidx.transition.Oooo0;

/* JADX INFO: loaded from: classes7.dex */
public final class Hold extends Oooo0 {
    @Override // androidx.transition.Oooo0
    public Animator onAppear(ViewGroup viewGroup, View view, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        return ValueAnimator.ofFloat(0.0f);
    }

    @Override // androidx.transition.Oooo0
    public Animator onDisappear(ViewGroup viewGroup, View view, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        return ValueAnimator.ofFloat(0.0f);
    }
}
