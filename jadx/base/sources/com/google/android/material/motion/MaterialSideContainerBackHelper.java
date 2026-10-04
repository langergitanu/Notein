package com.google.android.material.motion;

import OooO0Oo.OooO0OO;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.C15966R;
import com.google.android.material.animation.AnimationUtils;
import o000Oooo.C24552OooO0O0;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialSideContainerBackHelper extends MaterialBackAnimationHelper<View> {
    private final float maxScaleXDistanceGrow;
    private final float maxScaleXDistanceShrink;
    private final float maxScaleYDistance;

    public MaterialSideContainerBackHelper(View view) {
        super(view);
        Resources resources = view.getResources();
        this.maxScaleXDistanceShrink = resources.getDimension(C15966R.dimen.m3_back_progress_side_container_max_scale_x_distance_shrink);
        this.maxScaleXDistanceGrow = resources.getDimension(C15966R.dimen.m3_back_progress_side_container_max_scale_x_distance_grow);
        this.maxScaleYDistance = resources.getDimension(C15966R.dimen.m3_back_progress_side_container_max_scale_y_distance);
    }

    private boolean checkAbsoluteGravity(int i, int i2) {
        return (GravityCompat.getAbsoluteGravity(i, ViewCompat.getLayoutDirection(this.view)) & i2) == i2;
    }

    private int getEdgeMargin(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return 0;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return z ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
    }

    public void cancelBackProgress() {
        if (super.onCancelBackProgress() == null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.view, (Property<V, Float>) View.SCALE_Y, 1.0f));
        V v = this.view;
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setDuration(this.cancelDuration);
        animatorSet.start();
    }

    public void finishBackProgress(OooO0OO oooO0OO, final int i, Animator.AnimatorListener animatorListener, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        final boolean z = oooO0OO.f58183OooO0Oo == 0;
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i, 3);
        float scaleX = (this.view.getScaleX() * this.view.getWidth()) + getEdgeMargin(zCheckAbsoluteGravity);
        V v = this.view;
        Property property = View.TRANSLATION_X;
        if (zCheckAbsoluteGravity) {
            scaleX = -scaleX;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(v, (Property<V, Float>) property, scaleX);
        if (animatorUpdateListener != null) {
            objectAnimatorOfFloat.addUpdateListener(animatorUpdateListener);
        }
        objectAnimatorOfFloat.setInterpolator(new C24552OooO0O0());
        objectAnimatorOfFloat.setDuration(AnimationUtils.lerp(this.hideDurationMax, this.hideDurationMin, oooO0OO.f58182OooO0OO));
        objectAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.motion.MaterialSideContainerBackHelper.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                MaterialSideContainerBackHelper.this.view.setTranslationX(0.0f);
                MaterialSideContainerBackHelper.this.updateBackProgress(0.0f, z, i);
            }
        });
        if (animatorListener != null) {
            objectAnimatorOfFloat.addListener(animatorListener);
        }
        objectAnimatorOfFloat.start();
    }

    public void startBackProgress(OooO0OO oooO0OO) {
        super.onStartBackProgress(oooO0OO);
    }

    public void updateBackProgress(OooO0OO oooO0OO, int i) {
        if (super.onUpdateBackProgress(oooO0OO) == null) {
            return;
        }
        updateBackProgress(oooO0OO.f58182OooO0OO, oooO0OO.f58183OooO0Oo == 0, i);
    }

    public void updateBackProgress(float f, boolean z, int i) {
        float fInterpolateProgress = interpolateProgress(f);
        boolean zCheckAbsoluteGravity = checkAbsoluteGravity(i, 3);
        boolean z2 = z == zCheckAbsoluteGravity;
        int width = this.view.getWidth();
        int height = this.view.getHeight();
        float f2 = width;
        if (f2 > 0.0f) {
            float f3 = height;
            if (f3 <= 0.0f) {
                return;
            }
            float f4 = this.maxScaleXDistanceShrink / f2;
            float f5 = this.maxScaleXDistanceGrow / f2;
            float f6 = this.maxScaleYDistance / f3;
            V v = this.view;
            if (zCheckAbsoluteGravity) {
                f2 = 0.0f;
            }
            v.setPivotX(f2);
            if (!z2) {
                f5 = -f4;
            }
            float fLerp = AnimationUtils.lerp(0.0f, f5, fInterpolateProgress);
            float f7 = fLerp + 1.0f;
            this.view.setScaleX(f7);
            float fLerp2 = 1.0f - AnimationUtils.lerp(0.0f, f6, fInterpolateProgress);
            this.view.setScaleY(fLerp2);
            V v2 = this.view;
            if (v2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) v2;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    childAt.setPivotX(zCheckAbsoluteGravity ? childAt.getWidth() + (width - childAt.getRight()) : -childAt.getLeft());
                    childAt.setPivotY(-childAt.getTop());
                    float f8 = z2 ? 1.0f - fLerp : 1.0f;
                    float f9 = fLerp2 != 0.0f ? (f7 / fLerp2) * f8 : 1.0f;
                    childAt.setScaleX(f8);
                    childAt.setScaleY(f9);
                }
            }
        }
    }
}
