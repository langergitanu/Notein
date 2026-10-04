package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.transition.C22107OooOo0o;
import androidx.transition.OooOOO0;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class TextScale extends OooOOO0 {
    private static final String PROPNAME_SCALE = "android:textscale:scale";

    private void captureValues(C22107OooOo0o c22107OooOo0o) {
        View view = c22107OooOo0o.f66395OooO0O0;
        if (view instanceof TextView) {
            c22107OooOo0o.f66394OooO00o.put(PROPNAME_SCALE, Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // androidx.transition.OooOOO0
    public void captureEndValues(C22107OooOo0o c22107OooOo0o) {
        captureValues(c22107OooOo0o);
    }

    @Override // androidx.transition.OooOOO0
    public void captureStartValues(C22107OooOo0o c22107OooOo0o) {
        captureValues(c22107OooOo0o);
    }

    @Override // androidx.transition.OooOOO0
    public Animator createAnimator(ViewGroup viewGroup, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        if (c22107OooOo0o == null || c22107OooOo0o2 == null || !(c22107OooOo0o.f66395OooO0O0 instanceof TextView)) {
            return null;
        }
        View view = c22107OooOo0o2.f66395OooO0O0;
        if (!(view instanceof TextView)) {
            return null;
        }
        final TextView textView = (TextView) view;
        HashMap map = c22107OooOo0o.f66394OooO00o;
        float fFloatValue = map.get(PROPNAME_SCALE) != null ? ((Float) map.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        HashMap map2 = c22107OooOo0o2.f66394OooO00o;
        float fFloatValue2 = map2.get(PROPNAME_SCALE) != null ? ((Float) map2.get(PROPNAME_SCALE)).floatValue() : 1.0f;
        if (fFloatValue == fFloatValue2) {
            return null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, fFloatValue2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.internal.TextScale.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textView.setScaleX(fFloatValue3);
                textView.setScaleY(fFloatValue3);
            }
        });
        return valueAnimatorOfFloat;
    }
}
