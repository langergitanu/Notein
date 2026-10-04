package o000000;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* JADX INFO: loaded from: classes.dex */
public final class OooO extends ReplacementSpan {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public int f81128OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Paint.FontMetricsInt f81129OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f81130OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public int f81131OooOoO0;

    public final Paint.FontMetricsInt OooO00o() {
        Paint.FontMetricsInt fontMetricsInt = this.f81129OooOo0o;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        kotlin.jvm.internal.OooOOO0.OooOOOO("fontMetrics");
        throw null;
    }

    public final int OooO0O0() {
        if (this.f81130OooOoO) {
            return this.f81131OooOoO0;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        this.f81130OooOoO = true;
        paint.getTextSize();
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        kotlin.jvm.internal.OooOOO0.OooO0o(fontMetricsInt2, "paint.fontMetricsInt");
        this.f81129OooOo0o = fontMetricsInt2;
        if (OooO00o().descent <= OooO00o().ascent) {
            throw new IllegalArgumentException("Invalid fontMetrics: line height can not be negative.");
        }
        this.f81128OooOo = (int) Math.ceil(0.0f);
        this.f81131OooOoO0 = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = OooO00o().ascent;
            fontMetricsInt.descent = OooO00o().descent;
            fontMetricsInt.leading = OooO00o().leading;
            if (fontMetricsInt.ascent > (-OooO0O0())) {
                fontMetricsInt.ascent = -OooO0O0();
            }
            fontMetricsInt.top = Math.min(OooO00o().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(OooO00o().bottom, fontMetricsInt.descent);
        }
        if (this.f81130OooOoO) {
            return this.f81128OooOo;
        }
        throw new IllegalStateException("PlaceholderSpan is not laid out yet.");
    }
}
