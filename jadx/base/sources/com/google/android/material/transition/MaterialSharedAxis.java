package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.C21532OooOOo;
import androidx.core.view.GravityCompat;
import androidx.transition.C22107OooOo0o;
import com.google.android.material.C15966R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class MaterialSharedAxis extends MaterialVisibility<VisibilityAnimatorProvider> {
    private static final int DEFAULT_THEMED_DURATION_ATTR = C15966R.attr.motionDurationLong1;
    private static final int DEFAULT_THEMED_EASING_ATTR = C15966R.attr.motionEasingEmphasizedInterpolator;

    /* JADX INFO: renamed from: X */
    public static final int f51393X = 0;

    /* JADX INFO: renamed from: Y */
    public static final int f51394Y = 1;

    /* JADX INFO: renamed from: Z */
    public static final int f51395Z = 2;
    private final int axis;
    private final boolean forward;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Axis {
    }

    public MaterialSharedAxis(int i, boolean z) {
        super(createPrimaryAnimatorProvider(i, z), createSecondaryAnimatorProvider());
        this.axis = i;
        this.forward = z;
    }

    private static VisibilityAnimatorProvider createPrimaryAnimatorProvider(int i, boolean z) {
        if (i == 0) {
            return new SlideDistanceProvider(z ? GravityCompat.END : GravityCompat.START);
        }
        if (i == 1) {
            return new SlideDistanceProvider(z ? 80 : 48);
        }
        if (i == 2) {
            return new ScaleProvider(z);
        }
        throw new IllegalArgumentException(C21532OooOOo.OooO0OO(i, "Invalid axis: "));
    }

    private static VisibilityAnimatorProvider createSecondaryAnimatorProvider() {
        return new FadeThroughProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void addAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.addAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void clearAdditionalAnimatorProvider() {
        super.clearAdditionalAnimatorProvider();
    }

    public int getAxis() {
        return this.axis;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public int getDurationThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_DURATION_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public int getEasingThemeAttrResId(boolean z) {
        return DEFAULT_THEMED_EASING_ATTR;
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getPrimaryAnimatorProvider() {
        return super.getPrimaryAnimatorProvider();
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ VisibilityAnimatorProvider getSecondaryAnimatorProvider() {
        return super.getSecondaryAnimatorProvider();
    }

    public boolean isForward() {
        return this.forward;
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.OooOOO0
    public /* bridge */ /* synthetic */ boolean isSeekingSupported() {
        return super.isSeekingSupported();
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Oooo0
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        return super.onAppear(viewGroup, view, c22107OooOo0o, c22107OooOo0o2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility, androidx.transition.Oooo0
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, C22107OooOo0o c22107OooOo0o, C22107OooOo0o c22107OooOo0o2) {
        return super.onDisappear(viewGroup, view, c22107OooOo0o, c22107OooOo0o2);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ boolean removeAdditionalAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        return super.removeAdditionalAnimatorProvider(visibilityAnimatorProvider);
    }

    @Override // com.google.android.material.transition.MaterialVisibility
    public /* bridge */ /* synthetic */ void setSecondaryAnimatorProvider(VisibilityAnimatorProvider visibilityAnimatorProvider) {
        super.setSecondaryAnimatorProvider(visibilityAnimatorProvider);
    }
}
