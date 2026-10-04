package o00oO0O0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: o00oO0O0.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25560OooOOo0 extends C25556OooO0oo {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final AbstractC20449OooO0Oo f87233OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public Object f87234OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public int f87235OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f87236OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public Matrix f87237OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Matrix f87238OooOooo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25560OooOOo0(Drawable drawable, AbstractC20449OooO0Oo scaleType) {
        super(drawable);
        kotlin.jvm.internal.OooOOO0.OooO0oO(scaleType, "scaleType");
        this.f87238OooOooo = new Matrix();
        this.f87233OooOoO = scaleType;
    }

    @Override // o00oO0O0.C25556OooO0oo, o00oO0O0.InterfaceC25568OooOoo
    public final void OooO(Matrix transform) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(transform, "transform");
        OooOOO0(transform);
        OooOOOo();
        Matrix matrix = this.f87237OooOooO;
        if (matrix != null) {
            transform.preConcat(matrix);
        }
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
            this.f87235OooOoo = 0;
            this.f87236OooOoo0 = 0;
            this.f87237OooOooO = null;
            return;
        }
        Rect bounds = getBounds();
        kotlin.jvm.internal.OooOOO0.OooO0o(bounds, "getBounds(...)");
        int iWidth = bounds.width();
        int iHeight = bounds.height();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        this.f87236OooOoo0 = intrinsicWidth;
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.f87235OooOoo = intrinsicHeight;
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(bounds);
            this.f87237OooOooO = null;
            return;
        }
        if (intrinsicWidth == iWidth && intrinsicHeight == iHeight) {
            drawable.setBounds(bounds);
            this.f87237OooOooO = null;
            return;
        }
        C25566OooOoO0 c25566OooOoO0 = C25566OooOoO0.f87246OooOo0o;
        AbstractC20449OooO0Oo abstractC20449OooO0Oo = this.f87233OooOoO;
        if (abstractC20449OooO0Oo == c25566OooOoO0) {
            drawable.setBounds(bounds);
            this.f87237OooOooO = null;
            return;
        }
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        Matrix matrix = this.f87238OooOooo;
        matrix.reset();
        abstractC20449OooO0Oo.getClass();
        abstractC20449OooO0Oo.OooOo0O(matrix, bounds, intrinsicWidth, intrinsicHeight, 0.5f, 0.5f, bounds.width() / intrinsicWidth, bounds.height() / intrinsicHeight);
        this.f87237OooOooO = matrix;
    }

    public final void OooOOOo() {
        boolean z;
        Object obj = this.f87233OooOoO;
        if (obj instanceof InterfaceC25567OooOoOO) {
            kotlin.jvm.internal.OooOOO0.OooO0o0(obj, "null cannot be cast to non-null type com.facebook.drawee.drawable.ScalingUtils.StatefulScaleType");
            Object state = ((InterfaceC25567OooOoOO) obj).getState();
            kotlin.jvm.internal.OooOOO0.OooO0o(state, "getState(...)");
            z = !state.equals(this.f87234OooOoOO);
            this.f87234OooOoOO = state;
        } else {
            z = false;
        }
        Drawable drawable = this.f87170OooOo0o;
        if (drawable == null) {
            return;
        }
        if (this.f87236OooOoo0 == drawable.getIntrinsicWidth() && this.f87235OooOoo == drawable.getIntrinsicHeight() && !z) {
            return;
        }
        OooOOOO();
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(canvas, "canvas");
        OooOOOo();
        if (this.f87237OooOooO == null) {
            super.draw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipRect(getBounds());
        canvas.concat(this.f87237OooOooO);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect bounds) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(bounds, "bounds");
        OooOOOO();
    }
}
