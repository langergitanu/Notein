package OooOoo0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: OooOoo0.OooO0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20656OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final C20656OooO0o f59254OooO00o = new C20656OooO0o();

    public final EdgeEffect OooO00o(Context context, AttributeSet attributeSet) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        try {
            return new EdgeEffect(context, attributeSet);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public final float OooO0O0(EdgeEffect edgeEffect) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public final float OooO0OO(EdgeEffect edgeEffect, float f, float f2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(edgeEffect, "edgeEffect");
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }
}
