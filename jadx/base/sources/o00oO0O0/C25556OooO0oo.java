package o00oO0O0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o00oO0O0.OooO0oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C25556OooO0oo extends Drawable implements Drawable.Callback, InterfaceC25568OooOoo, InterfaceC25569OooOoo0, InterfaceC25553OooO0Oo {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25554OooO0o0 f87169OooOo = new C25554OooO0o0();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public Drawable f87170OooOo0o;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public InterfaceC25568OooOoo f87171OooOoO0;

    static {
        new Matrix();
    }

    public C25556OooO0oo(Drawable drawable) {
        this.f87170OooOo0o = drawable;
        OooO0o.OooO0OO(drawable, this, this);
    }

    public void OooO(Matrix matrix) {
        OooOOO0(matrix);
    }

    @Override // o00oO0O0.InterfaceC25569OooOoo0
    public final void OooO0o(InterfaceC25568OooOoo interfaceC25568OooOoo) {
        this.f87171OooOoO0 = interfaceC25568OooOoo;
    }

    @Override // o00oO0O0.InterfaceC25568OooOoo
    public final void OooO0o0(RectF rectF) {
        InterfaceC25568OooOoo interfaceC25568OooOoo = this.f87171OooOoO0;
        if (interfaceC25568OooOoo != null) {
            interfaceC25568OooOoo.OooO0o0(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // o00oO0O0.InterfaceC25553OooO0Oo
    public final Drawable OooO0oo() {
        return this.f87170OooOo0o;
    }

    @Override // o00oO0O0.InterfaceC25553OooO0Oo
    public final Drawable OooOO0(Drawable drawable) {
        return OooOOO(drawable);
    }

    public Drawable OooOOO(Drawable drawable) {
        C25554OooO0o0 c25554OooO0o0;
        Drawable drawable2 = this.f87170OooOo0o;
        OooO0o.OooO0OO(drawable2, null, null);
        OooO0o.OooO0OO(drawable, null, null);
        if (drawable != null && (c25554OooO0o0 = this.f87169OooOo) != null) {
            c25554OooO0o0.OooO00o(drawable);
        }
        OooO0o.OooO00o(drawable, this);
        OooO0o.OooO0OO(drawable, this, this);
        this.f87170OooOo0o = drawable;
        invalidateSelf();
        return drawable2;
    }

    public final void OooOOO0(Matrix matrix) {
        InterfaceC25568OooOoo interfaceC25568OooOoo = this.f87171OooOoO0;
        if (interfaceC25568OooOoo != null) {
            interfaceC25568OooOoo.OooO(matrix);
        } else {
            matrix.reset();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f87170OooOo0o;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f87170OooOo0o;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f87170OooOo0o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f87170OooOo0o;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f87170OooOo0o;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f87170OooOo0o;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Drawable drawable = this.f87170OooOo0o;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f87170OooOo0o;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f87170OooOo0o;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f87170OooOo0o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f87170OooOo0o;
        return drawable == null ? super.onLevelChange(i) : drawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f87170OooOo0o;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f87169OooOo.f87152OooO00o = i;
        Drawable drawable = this.f87170OooOo0o;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C25554OooO0o0 c25554OooO0o0 = this.f87169OooOo;
        c25554OooO0o0.f87154OooO0OO = colorFilter;
        c25554OooO0o0.f87153OooO0O0 = colorFilter != null;
        Drawable drawable = this.f87170OooOo0o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f87169OooOo.f87155OooO0Oo = z ? 1 : 0;
        Drawable drawable = this.f87170OooOo0o;
        if (drawable != null) {
            drawable.setDither(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f87169OooOo.f87156OooO0o0 = z ? 1 : 0;
        Drawable drawable = this.f87170OooOo0o;
        if (drawable != null) {
            drawable.setFilterBitmap(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.f87170OooOo0o;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.f87170OooOo0o;
        return drawable == null ? visible : drawable.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
