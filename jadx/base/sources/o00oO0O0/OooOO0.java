package o00oO0O0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOO0 extends C25556OooO0oo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final Matrix f87172OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final int f87173OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final Matrix f87174OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final int f87175OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final RectF f87176OooOooO;

    public OooOO0(BitmapDrawable bitmapDrawable, int i, int i2) {
        super(bitmapDrawable);
        this.f87172OooOoO = new Matrix();
        this.f87173OooOoOO = i - (i % 90);
        this.f87175OooOoo0 = (i2 < 0 || i2 > 8) ? 0 : i2;
        this.f87174OooOoo = new Matrix();
        this.f87176OooOooO = new RectF();
    }

    @Override // o00oO0O0.C25556OooO0oo, o00oO0O0.InterfaceC25568OooOoo
    public final void OooO(Matrix transform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        OooOOO0(transform);
        Matrix matrix = this.f87172OooOoO;
        if (matrix.isIdentity()) {
            return;
        }
        transform.preConcat(matrix);
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        if (this.f87173OooOoOO <= 0 && ((i = this.f87175OooOoo0) == 0 || i == 1)) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.concat(this.f87172OooOoO);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = this.f87175OooOoo0;
        return (i == 5 || i == 7 || this.f87173OooOoOO % 180 != 0) ? super.getIntrinsicWidth() : super.getIntrinsicHeight();
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = this.f87175OooOoo0;
        return (i == 5 || i == 7 || this.f87173OooOoOO % 180 != 0) ? super.getIntrinsicHeight() : super.getIntrinsicWidth();
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bounds, "bounds");
        Drawable drawable = this.f87170OooOo0o;
        if (drawable == null) {
            return;
        }
        int i = this.f87175OooOoo0;
        int i2 = this.f87173OooOoOO;
        if (i2 <= 0 && (i == 0 || i == 1)) {
            drawable.setBounds(bounds);
            return;
        }
        Matrix matrix = this.f87172OooOoO;
        if (i == 2) {
            matrix.setScale(-1.0f, 1.0f);
        } else if (i == 7) {
            matrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            matrix.postScale(-1.0f, 1.0f);
        } else if (i == 4) {
            matrix.setScale(1.0f, -1.0f);
        } else if (i != 5) {
            matrix.setRotate(i2, bounds.centerX(), bounds.centerY());
        } else {
            matrix.setRotate(270.0f, bounds.centerX(), bounds.centerY());
            matrix.postScale(1.0f, -1.0f);
        }
        Matrix matrix2 = this.f87174OooOoo;
        matrix2.reset();
        matrix.invert(matrix2);
        RectF rectF = this.f87176OooOooO;
        rectF.set(bounds);
        matrix2.mapRect(rectF);
        drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }
}
