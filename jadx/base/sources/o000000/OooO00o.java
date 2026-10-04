package o000000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends MetricAffectingSpan {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f81132OooOo0o;

    public OooO00o(float f) {
        this.f81132OooOo0o = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f81132OooOo0o);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.f81132OooOo0o);
    }
}
