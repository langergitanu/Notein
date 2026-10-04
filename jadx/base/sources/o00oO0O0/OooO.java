package o00oO0O0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes5.dex */
public final class OooO extends C25556OooO0oo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public int f87137OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f87138OooOoOO;

    @Override // o00oO0O0.C25556OooO0oo, o00oO0O0.InterfaceC25568OooOoo
    public final void OooO(Matrix matrix) {
        OooOOO0(matrix);
    }

    @Override // o00oO0O0.C25556OooO0oo
    public final Drawable OooOOO(Drawable drawable) {
        Drawable drawableOooOOO = super.OooOOO(drawable);
        OooOOOO();
        return drawableOooOOO;
    }

    public final void OooOOOO() {
        Drawable drawable = this.f87170OooOo0o;
        if (drawable == null) {
            return;
        }
        Rect bounds = getBounds();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.f87137OooOoO = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f87138OooOoOO = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
        } else {
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f87170OooOo0o;
        if (drawable != null && (this.f87137OooOoO != drawable.getIntrinsicWidth() || this.f87138OooOoOO != drawable.getIntrinsicHeight())) {
            OooOOOO();
        }
        super.draw(canvas);
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooOOOO();
    }
}
