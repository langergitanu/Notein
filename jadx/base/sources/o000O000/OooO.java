package o000O000;

import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import androidx.core.util.Preconditions;
import o000OoO.C24533OooO00o;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO extends ReplacementSpan {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final OooOOO f82248OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Paint.FontMetricsInt f82249OooOo0o = new Paint.FontMetricsInt();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public short f82251OooOoO0 = -1;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f82250OooOoO = 1.0f;

    public OooO(OooOOO oooOOO) {
        Preconditions.checkNotNull(oooOOO, "rasterizer cannot be null");
        this.f82248OooOo = oooOOO;
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        Paint.FontMetricsInt fontMetricsInt2 = this.f82249OooOo0o;
        paint.getFontMetricsInt(fontMetricsInt2);
        float fAbs = Math.abs(fontMetricsInt2.descent - fontMetricsInt2.ascent) * 1.0f;
        OooOOO oooOOO = this.f82248OooOo;
        this.f82250OooOoO = fAbs / (oooOOO.OooO0O0().OooO00o(14) != 0 ? r8.f82986OooO0O0.getShort(r1 + r8.f82985OooO00o) : (short) 0);
        C24533OooO00o c24533OooO00oOooO0O0 = oooOOO.OooO0O0();
        int iOooO00o = c24533OooO00oOooO0O0.OooO00o(14);
        if (iOooO00o != 0) {
            c24533OooO00oOooO0O0.f82986OooO0O0.getShort(iOooO00o + c24533OooO00oOooO0O0.f82985OooO00o);
        }
        short s = (short) ((oooOOO.OooO0O0().OooO00o(12) != 0 ? r5.f82986OooO0O0.getShort(r7 + r5.f82985OooO00o) : (short) 0) * this.f82250OooOoO);
        this.f82251OooOoO0 = s;
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = fontMetricsInt2.ascent;
            fontMetricsInt.descent = fontMetricsInt2.descent;
            fontMetricsInt.top = fontMetricsInt2.top;
            fontMetricsInt.bottom = fontMetricsInt2.bottom;
        }
        return s;
    }
}
