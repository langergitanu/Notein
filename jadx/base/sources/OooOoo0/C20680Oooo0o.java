package OooOoo0;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;

/* JADX INFO: renamed from: OooOoo0.Oooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20680Oooo0o {
    public static EdgeEffect OooO00o(Context context) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(context, "context");
        return Build.VERSION.SDK_INT >= 31 ? C20656OooO0o.f59254OooO00o.OooO00o(context, null) : new C20701OoooooO(context);
    }

    public static float OooO0O0(EdgeEffect edgeEffect) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            return C20656OooO0o.f59254OooO00o.OooO0O0(edgeEffect);
        }
        return 0.0f;
    }

    public static void OooO0OO(EdgeEffect edgeEffect, float f) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(edgeEffect, "<this>");
        if (Build.VERSION.SDK_INT >= 31) {
            C20656OooO0o.f59254OooO00o.OooO0OO(edgeEffect, f, 0.0f);
        } else {
            edgeEffect.onPull(f, 0.0f);
        }
    }
}
