package o0O0O00;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import androidx.core.os.BuildCompat;
import o000000.C24079OooO0o0;

/* JADX INFO: renamed from: o0O0O00.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25853OooO0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final CharSequence f88226OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final TextPaint f88227OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f88228OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public float f88229OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public BoringLayout.Metrics f88230OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f88231OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f88232OooO0oO;

    public C25853OooO0oo(CharSequence charSequence, TextPaint textPaint, int i) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "charSequence");
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        this.f88226OooO00o = charSequence;
        this.f88227OooO0O0 = textPaint;
        this.f88228OooO0OO = i;
        this.f88229OooO0Oo = Float.NaN;
        this.f88231OooO0o0 = Float.NaN;
    }

    public final BoringLayout.Metrics OooO00o() {
        if (!this.f88232OooO0oO) {
            TextDirectionHeuristic textDirectionHeuristicOooO00o = C25870Oooo00o.OooO00o(this.f88228OooO0OO);
            CharSequence text = this.f88226OooO00o;
            kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
            TextPaint paint = this.f88227OooO0O0;
            kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
            this.f88230OooO0o = BuildCompat.isAtLeastT() ? OooO0OO.OooO0O0(text, paint, textDirectionHeuristicOooO00o) : C25850OooO0Oo.OooO0O0(text, paint, textDirectionHeuristicOooO00o);
            this.f88232OooO0oO = true;
        }
        return this.f88230OooO0o;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float OooO0O0() {
        if (!Float.isNaN(this.f88229OooO0Oo)) {
            return this.f88229OooO0Oo;
        }
        Float fValueOf = OooO00o() != null ? Float.valueOf(r0.width) : null;
        TextPaint textPaint = this.f88227OooO0O0;
        CharSequence charSequence = this.f88226OooO00o;
        if (fValueOf == null) {
            fValueOf = Float.valueOf((float) Math.ceil(Layout.getDesiredWidth(charSequence, 0, charSequence.length(), textPaint)));
        }
        if (fValueOf.floatValue() != 0.0f) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                kotlin.jvm.internal.OooOOO0.OooO0oO(spanned, "<this>");
                if (spanned.nextSpanTransition(-1, spanned.length(), o000000.OooO0o.class) == spanned.length() && spanned.nextSpanTransition(-1, spanned.length(), C24079OooO0o0.class) == spanned.length()) {
                    if (textPaint.getLetterSpacing() != 0.0f) {
                        fValueOf = Float.valueOf(fValueOf.floatValue() + 0.5f);
                    }
                }
            }
        }
        float fFloatValue = fValueOf.floatValue();
        this.f88229OooO0Oo = fFloatValue;
        return fFloatValue;
    }
}
