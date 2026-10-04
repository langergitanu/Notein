package o0O0O00;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.app.C21635OooO0o0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO {
    public static final BoringLayout OooO00o(CharSequence text, TextPaint paint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, boolean z2, TextUtils.TruncateAt truncateAt, int i2) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        kotlin.jvm.internal.OooOOO0.OooO0oO(alignment, "alignment");
        kotlin.jvm.internal.OooOOO0.OooO0oO(metrics, "metrics");
        return C21635OooO0o0.OooO00o(text, paint, i, alignment, f, f2, metrics, z, z2, truncateAt, i2);
    }

    public static final BoringLayout.Metrics OooO0O0(CharSequence text, TextPaint paint, TextDirectionHeuristic textDir) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        kotlin.jvm.internal.OooOOO0.OooO0oO(textDir, "textDir");
        return BoringLayout.isBoring(text, paint, textDir, true, null);
    }
}
