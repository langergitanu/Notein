package o00oOo;

import OooOOO0.AbstractC20449OooO0Oo;
import Oooo0.C20855OooooOO;
import Oooo0oO.C21111o0ooOoO;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.content.C21650OooOoO;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: o00oOo.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25600OooO00o extends Drawable {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public HashMap<String, String> f87331OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public AbstractC20449OooO0Oo f87332OooO0o0;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public int f87338OooOOO;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public int f87340OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public int f87341OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public int f87342OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f87343OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public long f87344OooOOoo;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final int f87326OooO = 80;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final Paint f87335OooOO0 = new Paint(1);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final Matrix f87336OooOO0O = new Matrix();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Rect f87337OooOO0o = new Rect();

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final RectF f87339OooOOO0 = new RectF();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f87328OooO0O0 = -1;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public int f87329OooO0OO = -1;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f87330OooO0Oo = -1;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f87333OooO0oO = -1;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f87334OooO0oo = -1;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public String f87327OooO00o = "none";

    public C25600OooO00o() {
        this.f87331OooO0o = new HashMap<>();
        this.f87331OooO0o = new HashMap<>();
        invalidateSelf();
        this.f87344OooOOoo = -1L;
        invalidateSelf();
    }

    public final void OooO00o(Canvas canvas, String str, String str2, int i) {
        String strOooO0Oo = C21111o0ooOoO.OooO0Oo(str, ": ");
        Paint paint = this.f87335OooOO0;
        float fMeasureText = paint.measureText(strOooO0Oo);
        float fMeasureText2 = paint.measureText(str2);
        paint.setColor(1711276032);
        int i2 = this.f87343OooOOo0;
        int i3 = this.f87342OooOOo;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + fMeasureText + fMeasureText2 + 4.0f, i3 + this.f87341OooOOOo + 8, paint);
        paint.setColor(-1);
        canvas.drawText(strOooO0Oo, this.f87343OooOOo0, this.f87342OooOOo, paint);
        paint.setColor(i);
        canvas.drawText(str2, this.f87343OooOOo0 + fMeasureText, this.f87342OooOOo, paint);
        this.f87342OooOOo += this.f87341OooOOOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        Paint paint = this.f87335OooOO0;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(0);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, paint);
        paint.setStyle(style);
        paint.setStrokeWidth(0.0f);
        paint.setColor(-1);
        this.f87343OooOOo0 = this.f87338OooOOO;
        this.f87342OooOOo = this.f87340OooOOOO;
        OooO00o(canvas, "ID", this.f87327OooO00o, -1);
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        Locale locale = Locale.US;
        OooO00o(canvas, "D", iWidth + "x" + iHeight, -1);
        if (bounds.height() > 0) {
            OooO00o(canvas, "DAR", String.valueOf(Float.valueOf(bounds.width() / bounds.height())), -1);
        }
        int i = this.f87328OooO0O0;
        int i2 = this.f87329OooO0OO;
        AbstractC20449OooO0Oo abstractC20449OooO0Oo = this.f87332OooO0o0;
        int iWidth2 = getBounds().width();
        int iHeight2 = getBounds().height();
        int i3 = SupportMenu.CATEGORY_MASK;
        if (iWidth2 > 0 && iHeight2 > 0 && i > 0 && i2 > 0) {
            if (abstractC20449OooO0Oo != null) {
                Rect rect = this.f87337OooOO0o;
                rect.top = 0;
                rect.left = 0;
                rect.right = iWidth2;
                rect.bottom = iHeight2;
                Matrix matrix = this.f87336OooOO0O;
                matrix.reset();
                float f = i;
                float f2 = i2;
                abstractC20449OooO0Oo.OooOo0O(matrix, rect, i, i2, 0.0f, 0.0f, rect.width() / f, rect.height() / f2);
                RectF rectF = this.f87339OooOOO0;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = f;
                rectF.bottom = f2;
                matrix.mapRect(rectF);
                int iWidth3 = (int) rectF.width();
                int iHeight3 = (int) rectF.height();
                iWidth2 = Math.min(iWidth2, iWidth3);
                iHeight2 = Math.min(iHeight2, iHeight3);
            }
            float f3 = iWidth2;
            float f4 = f3 * 0.1f;
            float f5 = f3 * 0.5f;
            float f6 = iHeight2;
            float f7 = 0.1f * f6;
            float f8 = f6 * 0.5f;
            int iAbs = Math.abs(i - iWidth2);
            int iAbs2 = Math.abs(i2 - iHeight2);
            float f9 = iAbs;
            if (f9 < f4 && iAbs2 < f7) {
                i3 = -16711936;
            } else if (f9 < f5 && iAbs2 < f8) {
                i3 = InputDeviceCompat.SOURCE_ANY;
            }
        }
        OooO00o(canvas, "I", this.f87328OooO0O0 + "x" + this.f87329OooO0OO, i3);
        int i4 = this.f87329OooO0OO;
        if (i4 > 0) {
            OooO00o(canvas, "IAR", String.valueOf(Float.valueOf(this.f87328OooO0O0 / i4)), -1);
        }
        OooO00o(canvas, "I", C21650OooOoO.OooO00o(this.f87330OooO0Oo / 1024, " KiB"), -1);
        int i5 = this.f87333OooO0oO;
        if (i5 > 0) {
            OooO00o(canvas, "anim", C20855OooooOO.OooO0OO(i5, this.f87334OooO0oo, "f ", ", l "), -1);
        }
        AbstractC20449OooO0Oo abstractC20449OooO0Oo2 = this.f87332OooO0o0;
        if (abstractC20449OooO0Oo2 != null) {
            OooO00o(canvas, "scale", String.valueOf(abstractC20449OooO0Oo2), -1);
        }
        long j = this.f87344OooOOoo;
        if (j >= 0) {
            OooO00o(canvas, "t", j + " ms", -1);
        }
        for (Map.Entry<String, String> entry : this.f87331OooO0o.entrySet()) {
            OooO00o(canvas, entry.getKey(), entry.getValue(), -1);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int iMin = Math.min(40, Math.max(10, Math.min(rect.width() / 8, rect.height() / 9)));
        this.f87335OooOO0.setTextSize(iMin);
        int i = iMin + 8;
        this.f87341OooOOOo = i;
        int i2 = this.f87326OooO;
        if (i2 == 80) {
            this.f87341OooOOOo = i * (-1);
        }
        this.f87338OooOOO = rect.left + 10;
        this.f87340OooOOOO = i2 == 80 ? rect.bottom - 10 : rect.top + 20;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
