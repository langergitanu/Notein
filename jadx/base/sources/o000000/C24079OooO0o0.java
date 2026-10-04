package o000000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: renamed from: o000000.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24079OooO0o0 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f81136OooOo0o;

    public C24079OooO0o0(float f) {
        this.f81136OooOo0o = f;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f81136OooOo0o);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        textPaint.setLetterSpacing(this.f81136OooOo0o);
    }
}
