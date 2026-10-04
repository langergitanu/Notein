package o0O0O00;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;

/* JADX INFO: renamed from: o0O0O00.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25850OooO0Oo {
    public static final BoringLayout OooO00o(CharSequence text, TextPaint paint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        kotlin.jvm.internal.OooOOO0.OooO0oO(alignment, "alignment");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metrics, "metrics");
        return new BoringLayout(text, paint, i, alignment, f, f2, metrics, z, truncateAt, i2);
    }

    public static final BoringLayout.Metrics OooO0O0(CharSequence text, TextPaint paint, TextDirectionHeuristic textDir) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        kotlin.jvm.internal.OooOOO0.OooO0oO(textDir, "textDir");
        if (textDir.isRtl(text, 0, text.length())) {
            return null;
        }
        return BoringLayout.isBoring(text, paint, null);
    }
}
