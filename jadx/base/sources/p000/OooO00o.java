package p000;

import Oooo0.o000000O;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: loaded from: classes.dex */
public final class OooO00o extends ReplacementSpan {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final float f58144OooOoO = o000000O.OooO0o0(2.0f);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final int f58145OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final int f58146OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final int f58147OooOoO0;

    public OooO00o(int i, int i2, int i3) {
        this.f58146OooOo0o = i;
        this.f58145OooOo = i2;
        this.f58147OooOoO0 = i3;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence text, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        OooOOO0.OooO0oO(canvas, "canvas");
        OooOOO0.OooO0oO(text, "text");
        OooOOO0.OooO0oO(paint, "paint");
        int i6 = paint.getFontMetricsInt().ascent + i4;
        int i7 = this.f58147OooOoO0;
        RectF rectF = new RectF(f, o000000O.OooO0o(2) + (i6 - i7), getSize(paint, text, i, i2, null) + f, ((r2.descent + i4) + i7) - o000000O.OooO0o(2));
        paint.setColor(this.f58146OooOo0o);
        float f2 = f58144OooOoO;
        canvas.drawRoundRect(rectF, f2, f2, paint);
        paint.setColor(this.f58145OooOo);
        canvas.drawText(text, i, i2, f + i7, i4, paint);
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence text, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        OooOOO0.OooO0oO(paint, "paint");
        OooOOO0.OooO0oO(text, "text");
        int i3 = this.f58147OooOoO0;
        return (int) (paint.measureText(text.subSequence(i, i2).toString()) + i3 + i3);
    }
}
