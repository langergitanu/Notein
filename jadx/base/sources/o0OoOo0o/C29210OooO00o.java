package o0OoOo0o;

import Oooo0.o000000O;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.jvm.internal.OooOOO0;
import oOo000Oo.C34429OooOOo0;

/* JADX INFO: renamed from: o0OoOo0o.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29210OooO00o extends Drawable {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Paint f103593OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public List<Float> f103594OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f103595OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f103596OooO0Oo;

    public C29210OooO00o() {
        this(Color.parseColor("#1D5AC5"));
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        OooOOO0.OooO0oO(canvas2, "canvas");
        Rect bounds = getBounds();
        OooOOO0.OooO0o(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int iCenterY = bounds.centerY();
        int size = this.f103594OooO0O0.size() - 1;
        if (size < 0) {
            size = 0;
        }
        float f = this.f103595OooO0OO;
        float size2 = (iWidth - (size * f)) / this.f103594OooO0O0.size();
        int size3 = this.f103594OooO0O0.size();
        int i = 0;
        while (i < size3) {
            float fFloatValue = this.f103594OooO0O0.get(i).floatValue() * this.f103596OooO0Oo;
            if (fFloatValue > 1.0f) {
                fFloatValue = 1.0f;
            }
            float f2 = fFloatValue * (iHeight / 2);
            float f3 = ((size2 + f) * i) + bounds.left;
            float f4 = iCenterY;
            canvas2.drawRoundRect(f3, f4 - f2, f3 + size2, f2 + f4, size2, size2, this.f103593OooO00o);
            i++;
            canvas2 = canvas;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f103593OooO00o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f103593OooO00o.setColorFilter(colorFilter);
    }

    public C29210OooO00o(int i) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        this.f103593OooO00o = paint;
        Float fValueOf = Float.valueOf(0.2f);
        this.f103594OooO0O0 = C34429OooOOo0.OooOO0o(fValueOf, fValueOf, fValueOf, fValueOf, fValueOf, fValueOf, fValueOf);
        this.f103595OooO0OO = o000000O.OooO0o0(1.5f);
        this.f103596OooO0Oo = 0.5f;
    }
}
