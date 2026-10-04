package o000000;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOO0 extends MetricAffectingSpan {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Typeface f81156OooOo0o;

    public OooOOO0(Typeface typeface) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(typeface, "typeface");
        this.f81156OooOo0o = typeface;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint ds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(ds, "ds");
        ds.setTypeface(this.f81156OooOo0o);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        paint.setTypeface(this.f81156OooOo0o);
    }
}
