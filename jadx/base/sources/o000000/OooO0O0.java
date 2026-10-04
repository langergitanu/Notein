package o000000;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0O0 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final String f81133OooOo0o;

    public OooO0O0(String fontFeatureSettings) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontFeatureSettings, "fontFeatureSettings");
        this.f81133OooOo0o = fontFeatureSettings;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f81133OooOo0o);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        textPaint.setFontFeatureSettings(this.f81133OooOo0o);
    }
}
