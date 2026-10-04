package o000000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0O extends MetricAffectingSpan {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f81153OooOo0o;

    public OooOO0O(float f) {
        this.f81153OooOo0o = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f81153OooOo0o);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        textPaint.setTextSkewX(textPaint.getTextSkewX() + this.f81153OooOo0o);
    }
}
