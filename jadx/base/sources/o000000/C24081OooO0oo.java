package o000000;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* JADX INFO: renamed from: o000000.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C24081OooO0oo implements LineHeightSpan {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f81138OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float f81139OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final boolean f81140OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final boolean f81141OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final float f81142OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f81143OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f81144OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public int f81145OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f81146OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public int f81147Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f81148Oooo00O;

    public C24081OooO0oo(float f, int i, boolean z, boolean z2, float f2) {
        this.f81139OooOo0o = f;
        this.f81138OooOo = i;
        this.f81141OooOoO0 = z;
        this.f81140OooOoO = z2;
        this.f81142OooOoOO = f2;
        if ((0.0f > f2 || f2 > 1.0f) && f2 != -1.0f) {
            throw new IllegalStateException("topRatio should be in [0..1] range or -1");
        }
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence text, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(text, "text");
        kotlin.jvm.internal.OooOOO0.OooO0oO(fontMetricsInt, "fontMetricsInt");
        int i5 = fontMetricsInt.descent;
        int i6 = fontMetricsInt.ascent;
        if (i5 - i6 <= 0) {
            return;
        }
        boolean z = i == 0;
        boolean z2 = i2 == this.f81138OooOo;
        boolean z3 = this.f81140OooOoO;
        boolean z4 = this.f81141OooOoO0;
        if (z && z2 && z4 && z3) {
            return;
        }
        if (z) {
            int i7 = i5 - i6;
            int iCeil = (int) Math.ceil(this.f81139OooOo0o);
            int i8 = iCeil - i7;
            float fAbs = this.f81142OooOoOO;
            if (fAbs == -1.0f) {
                fAbs = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
            }
            int iCeil2 = (int) (i8 <= 0 ? Math.ceil(i8 * fAbs) : Math.ceil((1.0f - fAbs) * i8));
            int i9 = fontMetricsInt.descent;
            int i10 = iCeil2 + i9;
            this.f81145OooOooO = i10;
            int i11 = i10 - iCeil;
            this.f81143OooOoo = i11;
            if (z4) {
                i11 = fontMetricsInt.ascent;
            }
            this.f81144OooOoo0 = i11;
            if (z3) {
                i10 = i9;
            }
            this.f81146OooOooo = i10;
            this.f81147Oooo000 = fontMetricsInt.ascent - i11;
            this.f81148Oooo00O = i10 - i9;
        }
        fontMetricsInt.ascent = z ? this.f81144OooOoo0 : this.f81143OooOoo;
        fontMetricsInt.descent = z2 ? this.f81146OooOooo : this.f81145OooOooO;
    }
}
