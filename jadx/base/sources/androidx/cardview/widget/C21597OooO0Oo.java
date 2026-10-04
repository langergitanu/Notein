package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: androidx.cardview.widget.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21597OooO0Oo extends Drawable {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public PorterDuffColorFilter f63300OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public float f63301OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Paint f63302OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final RectF f63303OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Rect f63304OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public float f63306OooO0o0;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public ColorStateList f63308OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public ColorStateList f63309OooOO0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f63305OooO0o = false;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f63307OooO0oO = true;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public PorterDuff.Mode f63310OooOO0O = PorterDuff.Mode.SRC_IN;

    public C21597OooO0Oo(float f, ColorStateList colorStateList) {
        this.f63301OooO00o = f;
        Paint paint = new Paint(5);
        this.f63302OooO0O0 = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.f63308OooO0oo = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.f63308OooO0oo.getDefaultColor()));
        this.f63303OooO0OO = new RectF();
        this.f63304OooO0Oo = new Rect();
    }

    public final PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void OooO0O0(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.f63303OooO0OO;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.f63304OooO0Oo;
        rect2.set(rect);
        if (this.f63305OooO0o) {
            rect2.inset((int) Math.ceil(C21598OooO0o0.OooO00o(this.f63306OooO0o0, this.f63301OooO00o, this.f63307OooO0oO)), (int) Math.ceil(C21598OooO0o0.OooO0O0(this.f63306OooO0o0, this.f63301OooO00o, this.f63307OooO0oO)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f63302OooO0O0;
        if (this.f63300OooO == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f63300OooO);
            z = true;
        }
        RectF rectF = this.f63303OooO0OO;
        float f = this.f63301OooO00o;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f63304OooO0Oo, this.f63301OooO00o);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f63309OooOO0;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f63308OooO0oo;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooO0O0(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f63308OooO0oo;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f63302OooO0O0;
        boolean z = colorForState != paint.getColor();
        if (z) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f63309OooOO0;
        if (colorStateList2 == null || (mode = this.f63310OooOO0O) == null) {
            return z;
        }
        this.f63300OooO = OooO00o(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f63302OooO0O0.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f63302OooO0O0.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f63309OooOO0 = colorStateList;
        this.f63300OooO = OooO00o(colorStateList, this.f63310OooOO0O);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f63310OooOO0O = mode;
        this.f63300OooO = OooO00o(this.f63309OooOO0, mode);
        invalidateSelf();
    }
}
