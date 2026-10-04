package OooOO0;

import OooO0oo.C20441OooO00o;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import com.orion.notein.global.R;

/* JADX INFO: renamed from: OooOO0.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20442OooO0Oo extends Drawable {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final float f58307OooOO0o = (float) Math.toRadians(45.0d);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f58308OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Paint f58309OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final float f58310OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final float f58311OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final float f58312OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final boolean f58313OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final float f58314OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final Path f58315OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final int f58316OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final float f58317OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f58318OooOO0O;

    public C20442OooO0Oo(Context context) {
        Paint paint = new Paint();
        this.f58309OooO00o = paint;
        this.f58315OooO0oO = new Path();
        this.f58318OooOO0O = 2;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.MITER);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, C20441OooO00o.f58290OooOOO, R.attr.drawerArrowStyle, 2132017371);
        int color = typedArrayObtainStyledAttributes.getColor(3, 0);
        if (color != paint.getColor()) {
            paint.setColor(color);
            invalidateSelf();
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(7, 0.0f);
        if (paint.getStrokeWidth() != dimension) {
            paint.setStrokeWidth(dimension);
            this.f58317OooOO0 = (float) (Math.cos(f58307OooOO0o) * ((double) (dimension / 2.0f)));
            invalidateSelf();
        }
        boolean z = typedArrayObtainStyledAttributes.getBoolean(6, true);
        if (this.f58313OooO0o != z) {
            this.f58313OooO0o = z;
            invalidateSelf();
        }
        float fRound = Math.round(typedArrayObtainStyledAttributes.getDimension(5, 0.0f));
        if (fRound != this.f58314OooO0o0) {
            this.f58314OooO0o0 = fRound;
            invalidateSelf();
        }
        this.f58316OooO0oo = typedArrayObtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f58311OooO0OO = Math.round(typedArrayObtainStyledAttributes.getDimension(2, 0.0f));
        this.f58310OooO0O0 = Math.round(typedArrayObtainStyledAttributes.getDimension(0, 0.0f));
        this.f58312OooO0Oo = typedArrayObtainStyledAttributes.getDimension(1, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float OooO00o(float f, float f2, float f3) {
        return OooO0OO.OooO0O0(f2, f, f3, f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int i = this.f58318OooOO0O;
        boolean z = false;
        if (i != 0 && (i == 1 || (i == 3 ? DrawableCompat.getLayoutDirection(this) == 0 : DrawableCompat.getLayoutDirection(this) == 1))) {
            z = true;
        }
        float f = this.f58310OooO0O0;
        float fSqrt = (float) Math.sqrt(f * f * 2.0f);
        float f2 = this.f58308OooO;
        float f3 = this.f58311OooO0OO;
        float fOooO00o = OooO00o(f3, fSqrt, f2);
        float fOooO00o2 = OooO00o(f3, this.f58312OooO0Oo, this.f58308OooO);
        float fRound = Math.round(OooO00o(0.0f, this.f58317OooOO0, this.f58308OooO));
        float fOooO00o3 = OooO00o(0.0f, f58307OooOO0o, this.f58308OooO);
        float fOooO00o4 = OooO00o(z ? 0.0f : -180.0f, z ? 180.0f : 0.0f, this.f58308OooO);
        double d = fOooO00o;
        double d2 = fOooO00o3;
        boolean z2 = z;
        float fRound2 = Math.round(Math.cos(d2) * d);
        float fRound3 = Math.round(Math.sin(d2) * d);
        Path path = this.f58315OooO0oO;
        path.rewind();
        float f4 = this.f58314OooO0o0;
        Paint paint = this.f58309OooO00o;
        float fOooO00o5 = OooO00o(paint.getStrokeWidth() + f4, -this.f58317OooOO0, this.f58308OooO);
        float f5 = (-fOooO00o2) / 2.0f;
        path.moveTo(f5 + fRound, 0.0f);
        path.rLineTo(fOooO00o2 - (fRound * 2.0f), 0.0f);
        path.moveTo(f5, fOooO00o5);
        path.rLineTo(fRound2, fRound3);
        path.moveTo(f5, -fOooO00o5);
        path.rLineTo(fRound2, -fRound3);
        path.close();
        canvas.save();
        float strokeWidth = paint.getStrokeWidth();
        float fHeight = bounds.height() - (3.0f * strokeWidth);
        canvas.translate(bounds.centerX(), OooO0O0.OooO00o(strokeWidth, 1.5f, this.f58314OooO0o0, (((int) (fHeight - (r6 * 2.0f))) / 4) * 2));
        if (this.f58313OooO0o) {
            canvas.rotate(fOooO00o4 * (z2 ? -1 : 1));
        } else if (z2) {
            canvas.rotate(180.0f);
        }
        canvas.drawPath(path, paint);
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f58316OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f58316OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.f58309OooO00o;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f58309OooO00o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setProgress(float f) {
        if (this.f58308OooO != f) {
            this.f58308OooO = f;
            invalidateSelf();
        }
    }
}
