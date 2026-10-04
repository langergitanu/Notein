package o0O0O00;

import OooOoOO.C20519OooO0Oo;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.core.os.BuildCompat;
import o000000.C24078OooO0Oo;
import o000000.C24081OooO0oo;
import oO00ooO.C32443OooOOO;
import oO00ooO.EnumC32441OooOO0O;

/* JADX INFO: renamed from: o0O0O00.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C25869Oooo00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final float f88254OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f88255OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final boolean f88256OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final boolean f88257OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Layout f88258OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final int f88259OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f88260OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f88261OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final float f88262OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final boolean f88263OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Paint.FontMetricsInt f88264OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final int f88265OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final Rect f88266OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final C24081OooO0oo[] f88267OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final Object f88268OooOOOO;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0213  */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r39v1, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C25869Oooo00O(CharSequence charSequence, float f, TextPaint textPaint, int i, TextUtils.TruncateAt truncateAt, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, C25853OooO0oo layoutIntrinsics) {
        C25854OooOO0o c25854OooOO0o;
        int i9;
        String str;
        boolean zOooO00o;
        Layout layoutOooO00o;
        int i10;
        int i11;
        C32443OooOOO<Integer, Integer> c32443OooOOO;
        C24081OooO0oo[] lineHeightStyleSpans;
        int length;
        int i12;
        int i13;
        Layout layout;
        C32443OooOOO c32443OooOOO2;
        String str2;
        boolean z2;
        kotlin.jvm.internal.OooOOO0.OooO0oO(charSequence, "charSequence");
        kotlin.jvm.internal.OooOOO0.OooO0oO(textPaint, "textPaint");
        kotlin.jvm.internal.OooOOO0.OooO0oO(layoutIntrinsics, "layoutIntrinsics");
        this.f88255OooO00o = z;
        this.f88256OooO0O0 = true;
        this.f88266OooOOO = new Rect();
        int length2 = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristicOooO00o = C25870Oooo00o.OooO00o(i2);
        Layout.Alignment alignment = C25863OooOoO0.f88250OooO00o;
        Layout.Alignment alignment2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? Layout.Alignment.ALIGN_NORMAL : C25863OooOoO0.f88251OooO0O0 : C25863OooOoO0.f88250OooO00o : Layout.Alignment.ALIGN_CENTER : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        boolean z3 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length2, o000000.OooO00o.class) < length2;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics metricsOooO00o = layoutIntrinsics.OooO00o();
            double d = f;
            int iCeil = (int) Math.ceil(d);
            C25854OooOO0o c25854OooOO0o2 = C25860OooOo0O.f88249OooO00o;
            if (metricsOooO00o == null || layoutIntrinsics.OooO0O0() > f || z3) {
                c25854OooOO0o = c25854OooOO0o2;
                this.f88263OooOO0 = false;
                kotlin.jvm.internal.OooOOO0.OooO0oO(alignment2, "alignment");
                i9 = i3;
                str = "alignment";
                OooOo oooOo = new OooOo(charSequence, charSequence.length(), textPaint, iCeil, textDirectionHeuristicOooO00o, alignment2, i9, truncateAt, (int) Math.ceil(d), i8, z, true, i4, i5, i6, i7);
                textDirectionHeuristicOooO00o = textDirectionHeuristicOooO00o;
                zOooO00o = true;
                layoutOooO00o = c25854OooOO0o.OooO00o(oooOo);
            } else {
                this.f88263OooOO0 = true;
                kotlin.jvm.internal.OooOOO0.OooO0oO(alignment2, "alignment");
                if (iCeil < 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (iCeil < 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (BuildCompat.isAtLeastT()) {
                    str2 = "alignment";
                    c25854OooOO0o = c25854OooOO0o2;
                    layoutOooO00o = OooO0OO.OooO00o(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsOooO00o, z, true, truncateAt, iCeil);
                    z2 = true;
                } else {
                    c25854OooOO0o = c25854OooOO0o2;
                    str2 = "alignment";
                    z2 = true;
                    layoutOooO00o = C25850OooO0Oo.OooO00o(charSequence, textPaint, iCeil, alignment2, 1.0f, 0.0f, metricsOooO00o, z, truncateAt, iCeil);
                }
                i9 = i3;
                zOooO00o = z2;
                str = str2;
            }
            this.f88258OooO0Oo = layoutOooO00o;
            Trace.endSection();
            int iMin = Math.min(layoutOooO00o.getLineCount(), i9);
            this.f88260OooO0o0 = iMin;
            if (iMin >= i9) {
                i10 = 1;
                int i14 = iMin - 1;
                boolean z4 = layoutOooO00o.getEllipsisCount(i14) > 0 || layoutOooO00o.getLineEnd(i14) != charSequence.length();
                this.f88257OooO0OO = z4;
                if (z) {
                    i11 = 0;
                    c32443OooOOO = new C32443OooOOO<>(0, 0);
                } else if (this.f88263OooOO0) {
                    zOooO00o = BuildCompat.isAtLeastT() ? ((BoringLayout) layoutOooO00o).isFallbackLineSpacingEnabled() : false;
                    if (zOooO00o) {
                        TextPaint paint = layoutOooO00o.getPaint();
                        CharSequence text = layoutOooO00o.getText();
                        kotlin.jvm.internal.OooOOO0.OooO0o(paint, "paint");
                        kotlin.jvm.internal.OooOOO0.OooO0o(text, "text");
                        i11 = 0;
                        Rect rectOooO00o = OooOO0O.OooO00o(paint, text, layoutOooO00o.getLineStart(0), layoutOooO00o.getLineEnd(0));
                        int lineAscent = layoutOooO00o.getLineAscent(0);
                        int i15 = rectOooO00o.top;
                        int topPadding = i15 < lineAscent ? lineAscent - i15 : layoutOooO00o.getTopPadding();
                        if (iMin != i10) {
                            int i16 = iMin - 1;
                            rectOooO00o = OooOO0O.OooO00o(paint, text, layoutOooO00o.getLineStart(i16), layoutOooO00o.getLineEnd(i16));
                        }
                        int lineDescent = layoutOooO00o.getLineDescent(iMin - i10);
                        int i17 = rectOooO00o.bottom;
                        int bottomPadding = i17 > lineDescent ? i17 - lineDescent : layoutOooO00o.getBottomPadding();
                        c32443OooOOO = (topPadding == 0 && bottomPadding == 0) ? C25870Oooo00o.f88270OooO0O0 : new C32443OooOOO<>(Integer.valueOf(topPadding), Integer.valueOf(bottomPadding));
                    }
                } else {
                    StaticLayout staticLayout = (StaticLayout) layoutOooO00o;
                    if (BuildCompat.isAtLeastT()) {
                        zOooO00o = C25859OooOo0.OooO00o(staticLayout);
                    } else if (Build.VERSION.SDK_INT < 28) {
                    }
                    if (zOooO00o) {
                    }
                }
                if (OooO0oo() instanceof Spanned) {
                    lineHeightStyleSpans = new C24081OooO0oo[i11];
                } else {
                    lineHeightStyleSpans = (C24081OooO0oo[]) ((Spanned) OooO0oo()).getSpans(i11, OooO0oo().length(), C24081OooO0oo.class);
                    kotlin.jvm.internal.OooOOO0.OooO0o(lineHeightStyleSpans, "lineHeightStyleSpans");
                    if (lineHeightStyleSpans.length == 0) {
                        lineHeightStyleSpans = new C24081OooO0oo[i11];
                    }
                }
                this.f88267OooOOO0 = lineHeightStyleSpans;
                length = lineHeightStyleSpans.length;
                int iMax = i11;
                int iMax2 = iMax;
                for (i12 = iMax2; i12 < length; i12 += i10) {
                    C24081OooO0oo c24081OooO0oo = lineHeightStyleSpans[i12];
                    int i18 = c24081OooO0oo.f81147Oooo000;
                    iMax = i18 < 0 ? Math.max(iMax, Math.abs(i18)) : iMax;
                    int i19 = c24081OooO0oo.f81148Oooo00O;
                    if (i19 < 0) {
                        iMax2 = Math.max(iMax, Math.abs(i19));
                    }
                }
                C32443OooOOO<Integer, Integer> c32443OooOOO3 = (iMax == 0 || iMax2 != 0) ? new C32443OooOOO<>(Integer.valueOf(iMax), Integer.valueOf(iMax2)) : C25870Oooo00o.f88270OooO0O0;
                this.f88259OooO0o = Math.max(c32443OooOOO.f116638OooOo0o.intValue(), c32443OooOOO3.f116638OooOo0o.intValue());
                this.f88261OooO0oO = Math.max(c32443OooOOO.f116637OooOo.intValue(), c32443OooOOO3.f116637OooOo.intValue());
                C24081OooO0oo[] c24081OooO0ooArr = this.f88267OooOOO0;
                i13 = this.f88260OooO0o0 - i10;
                layout = this.f88258OooO0Oo;
                if (layout.getLineStart(i13) == layout.getLineEnd(i13) || c24081OooO0ooArr.length == 0) {
                    c32443OooOOO2 = new C32443OooOOO(null, Integer.valueOf(i11));
                } else {
                    SpannableString spannableString = new SpannableString("\u200b");
                    C24081OooO0oo c24081OooO0oo2 = (C24081OooO0oo) oOo000Oo.OooOOO.OooOoo0(c24081OooO0ooArr);
                    spannableString.setSpan(new C24081OooO0oo(c24081OooO0oo2.f81139OooOo0o, spannableString.length(), (i13 == 0 || !c24081OooO0oo2.f81140OooOoO) ? c24081OooO0oo2.f81140OooOoO : i11, c24081OooO0oo2.f81140OooOoO, c24081OooO0oo2.f81142OooOoOO), i11, spannableString.length(), 33);
                    int length3 = spannableString.length();
                    Layout.Alignment alignment3 = OooO0o.f88214OooO00o;
                    kotlin.jvm.internal.OooOOO0.OooO0oO(alignment3, str);
                    StaticLayout staticLayoutOooO00o = c25854OooOO0o.OooO00o(new OooOo(spannableString, length3, textPaint, Integer.MAX_VALUE, textDirectionHeuristicOooO00o, alignment3, Integer.MAX_VALUE, null, Integer.MAX_VALUE, 0, this.f88255OooO00o, this.f88256OooO0O0, 0, 0, 0, 0));
                    Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                    fontMetricsInt.ascent = staticLayoutOooO00o.getLineAscent(i11);
                    fontMetricsInt.descent = staticLayoutOooO00o.getLineDescent(i11);
                    fontMetricsInt.top = staticLayoutOooO00o.getLineTop(i11);
                    int lineBottom = staticLayoutOooO00o.getLineBottom(i11);
                    fontMetricsInt.bottom = lineBottom;
                    c32443OooOOO2 = new C32443OooOOO(fontMetricsInt, Integer.valueOf(lineBottom - ((int) (OooO0Oo(i13) - OooO0o0(i13)))));
                }
                this.f88264OooOO0O = (Paint.FontMetricsInt) c32443OooOOO2.f116638OooOo0o;
                this.f88265OooOO0o = ((Number) c32443OooOOO2.f116637OooOo).intValue();
                Layout layout2 = this.f88258OooO0Oo;
                int i20 = this.f88260OooO0o0 - i10;
                TextPaint paint2 = layout2.getPaint();
                kotlin.jvm.internal.OooOOO0.OooO0o(paint2, "this.paint");
                this.f88262OooO0oo = C24078OooO0Oo.OooO00o(layout2, i20, paint2);
                Layout layout3 = this.f88258OooO0Oo;
                int i21 = this.f88260OooO0o0 - i10;
                TextPaint paint3 = layout3.getPaint();
                kotlin.jvm.internal.OooOOO0.OooO0o(paint3, "this.paint");
                this.f88254OooO = C24078OooO0Oo.OooO0O0(layout3, i21, paint3);
                this.f88268OooOOOO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new Oooo000(this));
            }
            i10 = 1;
            this.f88257OooO0OO = z4;
            if (z) {
            }
            if (OooO0oo() instanceof Spanned) {
            }
            this.f88267OooOOO0 = lineHeightStyleSpans;
            length = lineHeightStyleSpans.length;
            int iMax3 = i11;
            int iMax22 = iMax3;
            while (i12 < length) {
            }
            if (iMax3 == 0) {
            }
            this.f88259OooO0o = Math.max(c32443OooOOO.f116638OooOo0o.intValue(), c32443OooOOO3.f116638OooOo0o.intValue());
            this.f88261OooO0oO = Math.max(c32443OooOOO.f116637OooOo.intValue(), c32443OooOOO3.f116637OooOo.intValue());
            C24081OooO0oo[] c24081OooO0ooArr2 = this.f88267OooOOO0;
            i13 = this.f88260OooO0o0 - i10;
            layout = this.f88258OooO0Oo;
            if (layout.getLineStart(i13) == layout.getLineEnd(i13)) {
                c32443OooOOO2 = new C32443OooOOO(null, Integer.valueOf(i11));
            }
            this.f88264OooOO0O = (Paint.FontMetricsInt) c32443OooOOO2.f116638OooOo0o;
            this.f88265OooOO0o = ((Number) c32443OooOOO2.f116637OooOo).intValue();
            Layout layout22 = this.f88258OooO0Oo;
            int i202 = this.f88260OooO0o0 - i10;
            TextPaint paint22 = layout22.getPaint();
            kotlin.jvm.internal.OooOOO0.OooO0o(paint22, "this.paint");
            this.f88262OooO0oo = C24078OooO0Oo.OooO00o(layout22, i202, paint22);
            Layout layout32 = this.f88258OooO0Oo;
            int i212 = this.f88260OooO0o0 - i10;
            TextPaint paint32 = layout32.getPaint();
            kotlin.jvm.internal.OooOOO0.OooO0o(paint32, "this.paint");
            this.f88254OooO = C24078OooO0Oo.OooO0O0(layout32, i212, paint32);
            this.f88268OooOOOO = C20519OooO0Oo.OooO0O0(EnumC32441OooOO0O.f116636OooOoO0, new Oooo000(this));
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final int OooO00o() {
        boolean z = this.f88257OooO0OO;
        Layout layout = this.f88258OooO0Oo;
        return (z ? layout.getLineBottom(this.f88260OooO0o0 - 1) : layout.getHeight()) + this.f88259OooO0o + this.f88261OooO0oO + this.f88265OooOO0o;
    }

    public final float OooO0O0(int i) {
        if (i == this.f88260OooO0o0 - 1) {
            return this.f88262OooO0oo + this.f88254OooO;
        }
        return 0.0f;
    }

    public final float OooO0OO(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        return this.f88259OooO0o + ((i != this.f88260OooO0o0 + (-1) || (fontMetricsInt = this.f88264OooOO0O) == null) ? this.f88258OooO0Oo.getLineBaseline(i) : OooO0o0(i) - fontMetricsInt.ascent);
    }

    public final float OooO0Oo(int i) {
        Paint.FontMetricsInt fontMetricsInt;
        int i2 = this.f88260OooO0o0;
        int i3 = i2 - 1;
        Layout layout = this.f88258OooO0Oo;
        if (i != i3 || (fontMetricsInt = this.f88264OooOO0O) == null) {
            return this.f88259OooO0o + layout.getLineBottom(i) + (i == i2 + (-1) ? this.f88261OooO0oO : 0);
        }
        return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    public final float OooO0o(int i, boolean z) {
        return OooO0O0(this.f88258OooO0Oo.getLineForOffset(i)) + ((C25852OooO0oO) this.f88268OooOOOO.getValue()).OooO00o(i, true, z);
    }

    public final float OooO0o0(int i) {
        return this.f88258OooO0Oo.getLineTop(i) + (i == 0 ? 0 : this.f88259OooO0o);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, oO00ooO.OooOO0] */
    public final float OooO0oO(int i, boolean z) {
        return OooO0O0(this.f88258OooO0Oo.getLineForOffset(i)) + ((C25852OooO0oO) this.f88268OooOOOO.getValue()).OooO00o(i, false, z);
    }

    public final CharSequence OooO0oo() {
        CharSequence text = this.f88258OooO0Oo.getText();
        kotlin.jvm.internal.OooOOO0.OooO0o(text, "layout.text");
        return text;
    }
}
