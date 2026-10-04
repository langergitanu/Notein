package o0O0ooO;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.LinearInterpolator;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import o000Oooo.C24552OooO0O0;

/* JADX INFO: renamed from: o0O0ooO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C26216OooO0Oo extends Drawable implements Animatable {

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public static final LinearInterpolator f89551OooOoo = new LinearInterpolator();

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public static final C24552OooO0O0 f89552OooOooO = new C24552OooO0O0();

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public static final int[] f89553OooOooo = {ViewCompat.MEASURED_STATE_MASK};

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public float f89554OooOo;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public final OooO00o f89555OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final ValueAnimator f89556OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public final Resources f89557OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public float f89558OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f89559OooOoo0;

    /* JADX INFO: renamed from: o0O0ooO.OooO0Oo$OooO00o */
    public static class OooO00o {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int[] f89560OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final RectF f89561OooO00o = new RectF();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Paint f89562OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Paint f89563OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final Paint f89564OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f89565OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f89566OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f89567OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f89568OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public int f89569OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f89570OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public float f89571OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public boolean f89572OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public float f89573OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public Path f89574OooOOOO;

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public float f89575OooOOOo;

        /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
        public int f89576OooOOo;

        /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
        public float f89577OooOOo0;

        /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
        public int f89578OooOOoo;

        /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
        public int f89579OooOo0;

        /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
        public int f89580OooOo00;

        public OooO00o() {
            Paint paint = new Paint();
            this.f89562OooO0O0 = paint;
            Paint paint2 = new Paint();
            this.f89563OooO0OO = paint2;
            Paint paint3 = new Paint();
            this.f89564OooO0Oo = paint3;
            this.f89566OooO0o0 = 0.0f;
            this.f89565OooO0o = 0.0f;
            this.f89567OooO0oO = 0.0f;
            this.f89568OooO0oo = 5.0f;
            this.f89575OooOOOo = 1.0f;
            this.f89580OooOo00 = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        public final void OooO00o(int i) {
            this.f89569OooOO0 = i;
            this.f89579OooOo0 = this.f89560OooO[i];
        }
    }

    public C26216OooO0Oo(Context context) {
        this.f89557OooOoO0 = ((Context) Preconditions.checkNotNull(context)).getResources();
        OooO00o oooO00o = new OooO00o();
        this.f89555OooOo0o = oooO00o;
        oooO00o.f89560OooO = f89553OooOooo;
        oooO00o.OooO00o(0);
        oooO00o.f89568OooO0oo = 2.5f;
        oooO00o.f89562OooO0O0.setStrokeWidth(2.5f);
        invalidateSelf();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new C26214OooO0O0(this, oooO00o));
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setRepeatMode(1);
        valueAnimatorOfFloat.setInterpolator(f89551OooOoo);
        valueAnimatorOfFloat.addListener(new C26215OooO0OO(this, oooO00o));
        this.f89556OooOoO = valueAnimatorOfFloat;
    }

    public static void OooO0Oo(float f, OooO00o oooO00o) {
        if (f <= 0.75f) {
            oooO00o.f89579OooOo0 = oooO00o.f89560OooO[oooO00o.f89569OooOO0];
            return;
        }
        float f2 = (f - 0.75f) / 0.25f;
        int[] iArr = oooO00o.f89560OooO;
        int i = oooO00o.f89569OooOO0;
        int i2 = iArr[i];
        int i3 = iArr[(i + 1) % iArr.length];
        oooO00o.f89579OooOo0 = ((((i2 >> 24) & 255) + ((int) ((((i3 >> 24) & 255) - r1) * f2))) << 24) | ((((i2 >> 16) & 255) + ((int) ((((i3 >> 16) & 255) - r3) * f2))) << 16) | ((((i2 >> 8) & 255) + ((int) ((((i3 >> 8) & 255) - r4) * f2))) << 8) | ((i2 & 255) + ((int) (f2 * ((i3 & 255) - r2))));
    }

    public final void OooO00o(float f, OooO00o oooO00o, boolean z) {
        float interpolation;
        float interpolation2;
        if (this.f89559OooOoo0) {
            OooO0Oo(f, oooO00o);
            float fFloor = (float) (Math.floor(oooO00o.f89573OooOOO0 / 0.8f) + 1.0d);
            float f2 = oooO00o.f89570OooOO0O;
            float f3 = oooO00o.f89571OooOO0o;
            oooO00o.f89566OooO0o0 = (((f3 - 0.01f) - f2) * f) + f2;
            oooO00o.f89565OooO0o = f3;
            float f4 = oooO00o.f89573OooOOO0;
            oooO00o.f89567OooO0oO = OooOO0.OooO0OO.OooO0O0(fFloor, f4, f, f4);
            return;
        }
        if (f != 1.0f || z) {
            float f5 = oooO00o.f89573OooOOO0;
            C24552OooO0O0 c24552OooO0O0 = f89552OooOooO;
            if (f < 0.5f) {
                interpolation = oooO00o.f89570OooOO0O;
                interpolation2 = (c24552OooO0O0.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                float f6 = oooO00o.f89570OooOO0O + 0.79f;
                interpolation = f6 - (((1.0f - c24552OooO0O0.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                interpolation2 = f6;
            }
            float f7 = (0.20999998f * f) + f5;
            float f8 = (f + this.f89558OooOoOO) * 216.0f;
            oooO00o.f89566OooO0o0 = interpolation;
            oooO00o.f89565OooO0o = interpolation2;
            oooO00o.f89567OooO0oO = f7;
            this.f89554OooOo = f8;
        }
    }

    public final void OooO0O0(float f, float f2, float f3, float f4) {
        float f5 = this.f89557OooOoO0.getDisplayMetrics().density;
        float f6 = f2 * f5;
        OooO00o oooO00o = this.f89555OooOo0o;
        oooO00o.f89568OooO0oo = f6;
        oooO00o.f89562OooO0O0.setStrokeWidth(f6);
        oooO00o.f89577OooOOo0 = f * f5;
        oooO00o.OooO00o(0);
        oooO00o.f89576OooOOo = (int) (f3 * f5);
        oooO00o.f89578OooOOoo = (int) (f4 * f5);
    }

    public final void OooO0OO(int i) {
        if (i == 0) {
            OooO0O0(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            OooO0O0(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f89554OooOo, bounds.exactCenterX(), bounds.exactCenterY());
        OooO00o oooO00o = this.f89555OooOo0o;
        RectF rectF = oooO00o.f89561OooO00o;
        float f = oooO00o.f89577OooOOo0;
        float fMin = (oooO00o.f89568OooO0oo / 2.0f) + f;
        if (f <= 0.0f) {
            fMin = (Math.min(bounds.width(), bounds.height()) / 2.0f) - Math.max((oooO00o.f89576OooOOo * oooO00o.f89575OooOOOo) / 2.0f, oooO00o.f89568OooO0oo / 2.0f);
        }
        rectF.set(bounds.centerX() - fMin, bounds.centerY() - fMin, bounds.centerX() + fMin, bounds.centerY() + fMin);
        float f2 = oooO00o.f89566OooO0o0;
        float f3 = oooO00o.f89567OooO0oO;
        float f4 = (f2 + f3) * 360.0f;
        float f5 = ((oooO00o.f89565OooO0o + f3) * 360.0f) - f4;
        Paint paint = oooO00o.f89562OooO0O0;
        paint.setColor(oooO00o.f89579OooOo0);
        paint.setAlpha(oooO00o.f89580OooOo00);
        float f6 = oooO00o.f89568OooO0oo / 2.0f;
        rectF.inset(f6, f6);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, oooO00o.f89564OooO0Oo);
        float f7 = -f6;
        rectF.inset(f7, f7);
        canvas.drawArc(rectF, f4, f5, false, paint);
        if (oooO00o.f89572OooOOO) {
            Path path = oooO00o.f89574OooOOOO;
            if (path == null) {
                Path path2 = new Path();
                oooO00o.f89574OooOOOO = path2;
                path2.setFillType(Path.FillType.EVEN_ODD);
            } else {
                path.reset();
            }
            float fMin2 = Math.min(rectF.width(), rectF.height()) / 2.0f;
            float f8 = (oooO00o.f89576OooOOo * oooO00o.f89575OooOOOo) / 2.0f;
            oooO00o.f89574OooOOOO.moveTo(0.0f, 0.0f);
            oooO00o.f89574OooOOOO.lineTo(oooO00o.f89576OooOOo * oooO00o.f89575OooOOOo, 0.0f);
            Path path3 = oooO00o.f89574OooOOOO;
            float f9 = oooO00o.f89576OooOOo;
            float f10 = oooO00o.f89575OooOOOo;
            path3.lineTo((f9 * f10) / 2.0f, oooO00o.f89578OooOOoo * f10);
            oooO00o.f89574OooOOOO.offset((rectF.centerX() + fMin2) - f8, (oooO00o.f89568OooO0oo / 2.0f) + rectF.centerY());
            oooO00o.f89574OooOOOO.close();
            Paint paint2 = oooO00o.f89563OooO0OO;
            paint2.setColor(oooO00o.f89579OooOo0);
            paint2.setAlpha(oooO00o.f89580OooOo00);
            canvas.save();
            canvas.rotate(f4 + f5, rectF.centerX(), rectF.centerY());
            canvas.drawPath(oooO00o.f89574OooOOOO, paint2);
            canvas.restore();
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f89555OooOo0o.f89580OooOo00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f89556OooOoO.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f89555OooOo0o.f89580OooOo00 = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f89555OooOo0o.f89562OooO0O0.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f89556OooOoO.cancel();
        OooO00o oooO00o = this.f89555OooOo0o;
        float f = oooO00o.f89566OooO0o0;
        oooO00o.f89570OooOO0O = f;
        float f2 = oooO00o.f89565OooO0o;
        oooO00o.f89571OooOO0o = f2;
        oooO00o.f89573OooOOO0 = oooO00o.f89567OooO0oO;
        if (f2 != f) {
            this.f89559OooOoo0 = true;
            this.f89556OooOoO.setDuration(666L);
            this.f89556OooOoO.start();
            return;
        }
        oooO00o.OooO00o(0);
        oooO00o.f89570OooOO0O = 0.0f;
        oooO00o.f89571OooOO0o = 0.0f;
        oooO00o.f89573OooOOO0 = 0.0f;
        oooO00o.f89566OooO0o0 = 0.0f;
        oooO00o.f89565OooO0o = 0.0f;
        oooO00o.f89567OooO0oO = 0.0f;
        this.f89556OooOoO.setDuration(1332L);
        this.f89556OooOoO.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f89556OooOoO.cancel();
        this.f89554OooOo = 0.0f;
        OooO00o oooO00o = this.f89555OooOo0o;
        if (oooO00o.f89572OooOOO) {
            oooO00o.f89572OooOOO = false;
        }
        oooO00o.OooO00o(0);
        oooO00o.f89570OooOO0O = 0.0f;
        oooO00o.f89571OooOO0o = 0.0f;
        oooO00o.f89573OooOOO0 = 0.0f;
        oooO00o.f89566OooO0o0 = 0.0f;
        oooO00o.f89565OooO0o = 0.0f;
        oooO00o.f89567OooO0oO = 0.0f;
        invalidateSelf();
    }
}
