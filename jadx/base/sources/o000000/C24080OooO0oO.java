package o000000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: o000000.OooO0oO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24080OooO0oO implements LineHeightSpan {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f81137OooOo0o;

    public C24080OooO0oO(float f) {
        this.f81137OooOo0o = f;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence text, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontMetricsInt, "fontMetricsInt");
        int i5 = fontMetricsInt.descent - fontMetricsInt.ascent;
        if (i5 <= 0) {
            return;
        }
        int iCeil = (int) Math.ceil(this.f81137OooOo0o);
        int iCeil2 = (int) Math.ceil(((double) fontMetricsInt.descent) * ((double) ((iCeil * 1.0f) / i5)));
        fontMetricsInt.descent = iCeil2;
        fontMetricsInt.ascent = iCeil2 - iCeil;
    }
}
