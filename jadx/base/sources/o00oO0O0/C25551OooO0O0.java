package o00oO0O0;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o00oO0O0.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public class C25551OooO0O0 extends Drawable implements Drawable.Callback, InterfaceC25568OooOoo, InterfaceC25569OooOoo0 {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public InterfaceC25568OooOoo f87141OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final InterfaceC25553OooO0Oo[] f87142OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Drawable[] f87143OooOoO0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public final C25554OooO0o0 f87140OooOo = new C25554OooO0o0();

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final Rect f87144OooOoOO = new Rect();

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f87146OooOoo0 = false;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public boolean f87145OooOoo = false;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public boolean f87147OooOooO = false;

    public C25551OooO0O0(Drawable[] drawableArr) {
        int i = 0;
        this.f87143OooOoO0 = drawableArr;
        while (true) {
            Drawable[] drawableArr2 = this.f87143OooOoO0;
            if (i >= drawableArr2.length) {
                this.f87142OooOoO = new InterfaceC25553OooO0Oo[drawableArr2.length];
                return;
            } else {
                OooO0o.OooO0OO(drawableArr2[i], this, this);
                i++;
            }
        }
    }

    @Override // o00oO0O0.InterfaceC25568OooOoo
    public final void OooO(Matrix matrix) {
        InterfaceC25568OooOoo interfaceC25568OooOoo = this.f87141OooOo0o;
        if (interfaceC25568OooOoo != null) {
            interfaceC25568OooOoo.OooO(matrix);
        } else {
            matrix.reset();
        }
    }

    public final Drawable OooO00o(int i) {
        OooOoo0.OooOo00.OooO0O0(Boolean.valueOf(i >= 0));
        Drawable[] drawableArr = this.f87143OooOoO0;
        OooOoo0.OooOo00.OooO0O0(Boolean.valueOf(i < drawableArr.length));
        return drawableArr[i];
    }

    @Override // o00oO0O0.InterfaceC25569OooOoo0
    public final void OooO0o(InterfaceC25568OooOoo interfaceC25568OooOoo) {
        this.f87141OooOo0o = interfaceC25568OooOoo;
    }

    @Override // o00oO0O0.InterfaceC25568OooOoo
    public final void OooO0o0(RectF rectF) {
        InterfaceC25568OooOoo interfaceC25568OooOoo = this.f87141OooOo0o;
        if (interfaceC25568OooOoo != null) {
            interfaceC25568OooOoo.OooO0o0(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicHeight());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        int i = 0;
        int iMax = -1;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                break;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iMax = Math.max(iMax, drawable.getIntrinsicWidth());
            }
            i++;
        }
        if (iMax > 0) {
            return iMax;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable[] drawableArr = this.f87143OooOoO0;
        if (drawableArr.length == 0) {
            return -2;
        }
        int iResolveOpacity = -1;
        for (int i = 1; i < drawableArr.length; i++) {
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                iResolveOpacity = Drawable.resolveOpacity(iResolveOpacity, drawable.getOpacity());
            }
        }
        return iResolveOpacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        int i = 0;
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                return true;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                Rect rect2 = this.f87144OooOoOO;
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!this.f87145OooOoo) {
            this.f87146OooOoo0 = false;
            int i = 0;
            while (true) {
                Drawable[] drawableArr = this.f87143OooOoO0;
                boolean z = true;
                if (i >= drawableArr.length) {
                    break;
                }
                Drawable drawable = drawableArr[i];
                boolean z2 = this.f87146OooOoo0;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f87146OooOoo0 = z2 | z;
                i++;
            }
            this.f87145OooOoo = true;
        }
        return this.f87146OooOoo0;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                this.f87147OooOooO = true;
                return this;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.mutate();
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setBounds(rect);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        int i2 = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i2 >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                return z;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f87140OooOo.f87152OooO00o = i;
        int i2 = 0;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i2 >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                drawable.setAlpha(i);
            }
            i2++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C25554OooO0o0 c25554OooO0o0 = this.f87140OooOo;
        c25554OooO0o0.f87154OooO0OO = colorFilter;
        int i = 0;
        c25554OooO0o0.f87153OooO0O0 = colorFilter != null;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        this.f87140OooOo.f87155OooO0Oo = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setDither(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z) {
        this.f87140OooOo.f87156OooO0o0 = z ? 1 : 0;
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                return;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        int i = 0;
        while (true) {
            Drawable[] drawableArr = this.f87143OooOoO0;
            if (i >= drawableArr.length) {
                return visible;
            }
            Drawable drawable = drawableArr[i];
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
            i++;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
