package androidx.core.view;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.core.view.DifferentialMotionFlingController;

/* JADX INFO: renamed from: androidx.core.view.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C21700OooOOo implements DifferentialMotionFlingController.DifferentialVelocityProvider {
    @Override // androidx.core.view.DifferentialMotionFlingController.DifferentialVelocityProvider
    public final float getCurrentVelocity(VelocityTracker velocityTracker, MotionEvent motionEvent, int i) {
        return DifferentialMotionFlingController.getCurrentVelocity(velocityTracker, motionEvent, i);
    }
}
