package o00oO0O0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO0 extends Drawable implements OooOO0O {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final int f87206Oooo000;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final float[] f87198OooOo0o = new float[8];

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final float[] f87197OooOo = new float[8];

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Paint f87200OooOoO0 = new Paint(1);

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public boolean f87199OooOoO = false;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f87201OooOoOO = 0.0f;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public float f87203OooOoo0 = 0.0f;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f87202OooOoo = 0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Path f87204OooOooO = new Path();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Path f87205OooOooo = new Path();

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final RectF f87207Oooo00O = new RectF();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f87208Oooo00o = 255;

    public OooOOO0(int i) {
        this.f87206Oooo000 = 0;
        if (this.f87206Oooo000 != i) {
            this.f87206Oooo000 = i;
            invalidateSelf();
        }
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO00o(int i, float f) {
        if (this.f87202OooOoo != i) {
            this.f87202OooOoo = i;
            invalidateSelf();
        }
        if (this.f87201OooOoOO != f) {
            this.f87201OooOoOO = f;
            OooO0o0();
            invalidateSelf();
        }
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0O0(boolean z) {
        this.f87199OooOoO = z;
        OooO0o0();
        invalidateSelf();
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0OO(float f) {
        if (this.f87203OooOoo0 != f) {
            this.f87203OooOoo0 = f;
            OooO0o0();
            invalidateSelf();
        }
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0Oo() {
    }

    public final void OooO0o0() {
        float[] fArr;
        Path path = this.f87204OooOooO;
        path.reset();
        Path path2 = this.f87205OooOooo;
        path2.reset();
        RectF rectF = this.f87207Oooo00O;
        rectF.set(getBounds());
        float f = this.f87201OooOoOO / 2.0f;
        rectF.inset(f, f);
        boolean z = this.f87199OooOoO;
        float[] fArr2 = this.f87198OooOo0o;
        if (z) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f87197OooOo;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (fArr2[i] + this.f87203OooOoo0) - (this.f87201OooOoOO / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = (-this.f87201OooOoOO) / 2.0f;
        rectF.inset(f2, f2);
        float f3 = this.f87203OooOoo0 + 0.0f;
        rectF.inset(f3, f3);
        if (this.f87199OooOoO) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0oO() {
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooOO0O() {
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooOO0o(float[] fArr) {
        float[] fArr2 = this.f87198OooOo0o;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            OooOoo0.OooOo00.OooO0OO(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        OooO0o0();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.f87200OooOoO0;
        paint.setColor(OooO0o.OooO0O0(this.f87206Oooo000, this.f87208Oooo00o));
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(false);
        canvas.drawPath(this.f87204OooOooO, paint);
        if (this.f87201OooOoOO != 0.0f) {
            paint.setColor(OooO0o.OooO0O0(this.f87202OooOoo, this.f87208Oooo00o));
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f87201OooOoOO);
            canvas.drawPath(this.f87205OooOooo, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f87208Oooo00o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int iOooO0O0 = OooO0o.OooO0O0(this.f87206Oooo000, this.f87208Oooo00o) >>> 24;
        if (iOooO0O0 != 0) {
            return iOooO0O0 != 255 ? -3 : -1;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooO0o0();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.f87208Oooo00o) {
            this.f87208Oooo00o = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
