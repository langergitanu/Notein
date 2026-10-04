package com.google.android.material.motion;

import OooO0Oo.OooO0OO;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import androidx.core.view.animation.PathInterpolatorCompat;
import com.google.android.material.C15966R;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MaterialBackAnimationHelper<V extends View> {
    private static final int CANCEL_DURATION_DEFAULT = 100;
    private static final int HIDE_DURATION_MAX_DEFAULT = 300;
    private static final int HIDE_DURATION_MIN_DEFAULT = 150;
    private static final String TAG = "MaterialBackHelper";
    private OooO0OO backEvent;
    protected final int cancelDuration;
    protected final int hideDurationMax;
    protected final int hideDurationMin;
    private final TimeInterpolator progressInterpolator;
    protected final V view;

    public MaterialBackAnimationHelper(V v) {
        this.view = v;
        Context context = v.getContext();
        this.progressInterpolator = MotionUtils.resolveThemeInterpolator(context, C15966R.attr.motionEasingStandardDecelerateInterpolator, PathInterpolatorCompat.create(0.0f, 0.0f, 0.0f, 1.0f));
        this.hideDurationMax = MotionUtils.resolveThemeDuration(context, C15966R.attr.motionDurationMedium2, 300);
        this.hideDurationMin = MotionUtils.resolveThemeDuration(context, C15966R.attr.motionDurationShort3, 150);
        this.cancelDuration = MotionUtils.resolveThemeDuration(context, C15966R.attr.motionDurationShort2, 100);
    }

    public float interpolateProgress(float f) {
        return this.progressInterpolator.getInterpolation(f);
    }

    public OooO0OO onCancelBackProgress() {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() and updateBackProgress() before cancelBackProgress()");
        }
        OooO0OO oooO0OO = this.backEvent;
        this.backEvent = null;
        return oooO0OO;
    }

    public OooO0OO onHandleBackInvoked() {
        OooO0OO oooO0OO = this.backEvent;
        this.backEvent = null;
        return oooO0OO;
    }

    public void onStartBackProgress(OooO0OO oooO0OO) {
        this.backEvent = oooO0OO;
    }

    public OooO0OO onUpdateBackProgress(OooO0OO oooO0OO) {
        if (this.backEvent == null) {
            Log.w(TAG, "Must call startBackProgress() before updateBackProgress()");
        }
        OooO0OO oooO0OO2 = this.backEvent;
        this.backEvent = oooO0OO;
        return oooO0OO2;
    }
}
