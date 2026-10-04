package o00oO0O0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import o00ooO.C25732OooO0O0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class OooOOOO extends Drawable implements OooOO0O, InterfaceC25569OooOoo0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final Drawable f87210OooOo0o;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public InterfaceC25568OooOoo f87231OoooO0O;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f87209OooOo = false;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public boolean f87212OooOoO0 = false;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public float f87211OooOoO = 0.0f;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Path f87213OooOoOO = new Path();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f87215OooOoo0 = true;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f87214OooOoo = 0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Path f87216OooOooO = new Path();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final float[] f87217OooOooo = new float[8];

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public final float[] f87220Oooo000 = new float[8];

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public final RectF f87221Oooo00O = new RectF();

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public final RectF f87222Oooo00o = new RectF();

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public final RectF f87219Oooo0 = new RectF();

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final RectF f87223Oooo0O0 = new RectF();

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Matrix f87224Oooo0OO = new Matrix();

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final Matrix f87226Oooo0o0 = new Matrix();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final Matrix f87225Oooo0o = new Matrix();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final Matrix f87227Oooo0oO = new Matrix();

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final Matrix f87228Oooo0oo = new Matrix();

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final Matrix f87218Oooo = new Matrix();

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public float f87230OoooO00 = 0.0f;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f87229OoooO0 = true;

    public OooOOOO(Drawable drawable) {
        this.f87210OooOo0o = drawable;
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO00o(int i, float f) {
        if (this.f87214OooOoo == i && this.f87211OooOoO == f) {
            return;
        }
        this.f87214OooOoo = i;
        this.f87211OooOoO = f;
        this.f87229OoooO0 = true;
        invalidateSelf();
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0O0(boolean z) {
        this.f87209OooOo = z;
        this.f87229OoooO0 = true;
        invalidateSelf();
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0OO(float f) {
        if (this.f87230OoooO00 != f) {
            this.f87230OoooO00 = f;
            this.f87229OoooO0 = true;
            invalidateSelf();
        }
    }

    public void OooO0Oo() {
    }

    @Override // o00oO0O0.InterfaceC25569OooOoo0
    public final void OooO0o(InterfaceC25568OooOoo interfaceC25568OooOoo) {
        this.f87231OoooO0O = interfaceC25568OooOoo;
    }

    public final void OooO0o0() {
        float[] fArr;
        if (this.f87229OoooO0) {
            Path path = this.f87216OooOooO;
            path.reset();
            RectF rectF = this.f87221Oooo00O;
            float f = this.f87211OooOoO / 2.0f;
            rectF.inset(f, f);
            boolean z = this.f87209OooOo;
            float[] fArr2 = this.f87217OooOooo;
            if (z) {
                path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.f87220Oooo000;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (fArr2[i] + this.f87230OoooO00) - (this.f87211OooOoO / 2.0f);
                    i++;
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = (-this.f87211OooOoO) / 2.0f;
            rectF.inset(f2, f2);
            Path path2 = this.f87213OooOoOO;
            path2.reset();
            float f3 = this.f87230OoooO00 + 0.0f;
            rectF.inset(f3, f3);
            if (this.f87209OooOo) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, fArr2, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.f87229OoooO0 = false;
        }
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0oO() {
    }

    public void OooO0oo() {
        InterfaceC25568OooOoo interfaceC25568OooOoo = this.f87231OoooO0O;
        Matrix matrix = this.f87225Oooo0o;
        RectF rectF = this.f87221Oooo00O;
        if (interfaceC25568OooOoo != null) {
            interfaceC25568OooOoo.OooO(matrix);
            this.f87231OoooO0O.OooO0o0(rectF);
        } else {
            matrix.reset();
            rectF.set(getBounds());
        }
        RectF rectF2 = this.f87219Oooo0;
        Drawable drawable = this.f87210OooOo0o;
        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF3 = this.f87223Oooo0O0;
        rectF3.set(drawable.getBounds());
        Matrix matrix2 = this.f87224Oooo0OO;
        matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
        Matrix matrix3 = this.f87227Oooo0oO;
        boolean zEquals = matrix.equals(matrix3);
        Matrix matrix4 = this.f87226Oooo0o0;
        if (!zEquals || !matrix2.equals(matrix4)) {
            this.f87215OooOoo0 = true;
            matrix.invert(this.f87228Oooo0oo);
            Matrix matrix5 = this.f87218Oooo;
            matrix5.set(matrix);
            matrix5.preConcat(matrix2);
            matrix3.set(matrix);
            matrix4.set(matrix2);
        }
        RectF rectF4 = this.f87222Oooo00o;
        if (rectF.equals(rectF4)) {
            return;
        }
        this.f87229OoooO0 = true;
        rectF4.set(rectF);
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooOO0O() {
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooOO0o(float[] fArr) {
        float[] fArr2 = this.f87217OooOooo;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
            this.f87212OooOoO0 = false;
        } else {
            OooOoo0.OooOo00.OooO0OO(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, fArr2, 0, 8);
            this.f87212OooOoO0 = false;
            for (int i = 0; i < 8; i++) {
                this.f87212OooOoO0 |= fArr[i] > 0.0f;
            }
        }
        this.f87229OoooO0 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.f87210OooOo0o.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C25732OooO0O0.OooO00o();
        this.f87210OooOo0o.draw(canvas);
        C25732OooO0O0.OooO00o();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f87210OooOo0o.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f87210OooOo0o.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f87210OooOo0o.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f87210OooOo0o.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.f87210OooOo0o.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f87210OooOo0o.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f87210OooOo0o.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.f87210OooOo0o.setColorFilter(i, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f87210OooOo0o.setColorFilter(colorFilter);
    }
}
