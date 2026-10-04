package androidx.vectordrawable.graphics.drawable;

import OooOo.C20493Oooo00o;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.core.content.res.ComplexColorCompat;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import androidx.core.graphics.drawable.DrawableCompat;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o extends AbstractC22122OooO0o0 {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final PorterDuff.Mode f66446Oooo000 = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public C22120OooO0oO f66447OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public ColorFilter f66448OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public PorterDuffColorFilter f66449OooOoO0;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public boolean f66450OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float[] f66451OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public boolean f66452OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Matrix f66453OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final Rect f66454OooOooo;

    public static class OooO00o extends AbstractC22119OooO0o0 {
    }

    public static class OooO0O0 extends AbstractC22119OooO0o0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public ComplexColorCompat f66456OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public ComplexColorCompat f66457OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f66458OooO0o0 = 0.0f;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f66459OooO0oO = 1.0f;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f66460OooO0oo = 1.0f;

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f66455OooO = 0.0f;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f66461OooOO0 = 1.0f;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f66462OooOO0O = 0.0f;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Paint.Cap f66463OooOO0o = Paint.Cap.BUTT;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public Paint.Join f66465OooOOO0 = Paint.Join.MITER;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public float f66464OooOOO = 4.0f;

        @Override // androidx.vectordrawable.graphics.drawable.OooO0o.AbstractC22118OooO0Oo
        public final boolean OooO00o() {
            return this.f66457OooO0o.isStateful() || this.f66456OooO0Oo.isStateful();
        }

        @Override // androidx.vectordrawable.graphics.drawable.OooO0o.AbstractC22118OooO0Oo
        public final boolean OooO0O0(int[] iArr) {
            return this.f66456OooO0Oo.onStateChanged(iArr) | this.f66457OooO0o.onStateChanged(iArr);
        }

        public float getFillAlpha() {
            return this.f66460OooO0oo;
        }

        public int getFillColor() {
            return this.f66457OooO0o.getColor();
        }

        public float getStrokeAlpha() {
            return this.f66459OooO0oO;
        }

        public int getStrokeColor() {
            return this.f66456OooO0Oo.getColor();
        }

        public float getStrokeWidth() {
            return this.f66458OooO0o0;
        }

        public float getTrimPathEnd() {
            return this.f66461OooOO0;
        }

        public float getTrimPathOffset() {
            return this.f66462OooOO0O;
        }

        public float getTrimPathStart() {
            return this.f66455OooO;
        }

        public void setFillAlpha(float f) {
            this.f66460OooO0oo = f;
        }

        public void setFillColor(int i) {
            this.f66457OooO0o.setColor(i);
        }

        public void setStrokeAlpha(float f) {
            this.f66459OooO0oO = f;
        }

        public void setStrokeColor(int i) {
            this.f66456OooO0Oo.setColor(i);
        }

        public void setStrokeWidth(float f) {
            this.f66458OooO0o0 = f;
        }

        public void setTrimPathEnd(float f) {
            this.f66461OooOO0 = f;
        }

        public void setTrimPathOffset(float f) {
            this.f66462OooOO0O = f;
        }

        public void setTrimPathStart(float f) {
            this.f66455OooO = f;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.OooO0o$OooO0Oo, reason: case insensitive filesystem */
    public static abstract class AbstractC22118OooO0Oo {
        public boolean OooO00o() {
            return false;
        }

        public boolean OooO0O0(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.OooO0o$OooO0oO, reason: case insensitive filesystem */
    public static class C22120OooO0oO extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public int f66496OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f66497OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public C19045OooO0o f66498OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public ColorStateList f66499OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public PorterDuff.Mode f66500OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Bitmap f66501OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f66502OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public ColorStateList f66503OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public PorterDuff.Mode f66504OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public boolean f66505OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public boolean f66506OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public Paint f66507OooOO0o;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f66497OooO00o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new OooO0o(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new OooO0o(this);
        }
    }

    public OooO0o() {
        this.f66452OooOoo0 = true;
        this.f66451OooOoo = new float[9];
        this.f66453OooOooO = new Matrix();
        this.f66454OooOooo = new Rect();
        C22120OooO0oO c22120OooO0oO = new C22120OooO0oO();
        c22120OooO0oO.f66499OooO0OO = null;
        c22120OooO0oO.f66500OooO0Oo = f66446Oooo000;
        c22120OooO0oO.f66498OooO0O0 = new C19045OooO0o();
        this.f66447OooOo = c22120OooO0oO;
    }

    public final PorterDuffColorFilter OooO00o(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable == null) {
            return false;
        }
        DrawableCompat.canApplyTheme(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f66454OooOooo;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f66448OooOoO;
        if (colorFilter == null) {
            colorFilter = this.f66449OooOoO0;
        }
        Matrix matrix = this.f66453OooOooO;
        canvas.getMatrix(matrix);
        float[] fArr = this.f66451OooOoo;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && DrawableCompat.getLayoutDirection(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C22120OooO0oO c22120OooO0oO = this.f66447OooOo;
        Bitmap bitmap = c22120OooO0oO.f66501OooO0o;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c22120OooO0oO.f66501OooO0o.getHeight()) {
            c22120OooO0oO.f66501OooO0o = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c22120OooO0oO.f66506OooOO0O = true;
        }
        if (this.f66452OooOoo0) {
            C22120OooO0oO c22120OooO0oO2 = this.f66447OooOo;
            if (c22120OooO0oO2.f66506OooOO0O || c22120OooO0oO2.f66503OooO0oO != c22120OooO0oO2.f66499OooO0OO || c22120OooO0oO2.f66504OooO0oo != c22120OooO0oO2.f66500OooO0Oo || c22120OooO0oO2.f66505OooOO0 != c22120OooO0oO2.f66502OooO0o0 || c22120OooO0oO2.f66496OooO != c22120OooO0oO2.f66498OooO0O0.getRootAlpha()) {
                C22120OooO0oO c22120OooO0oO3 = this.f66447OooOo;
                c22120OooO0oO3.f66501OooO0o.eraseColor(0);
                Canvas canvas2 = new Canvas(c22120OooO0oO3.f66501OooO0o);
                C19045OooO0o c19045OooO0o = c22120OooO0oO3.f66498OooO0O0;
                c19045OooO0o.OooO00o(c19045OooO0o.f66485OooO0oO, C19045OooO0o.f66477OooOOOo, canvas2, iMin, iMin2);
                C22120OooO0oO c22120OooO0oO4 = this.f66447OooOo;
                c22120OooO0oO4.f66503OooO0oO = c22120OooO0oO4.f66499OooO0OO;
                c22120OooO0oO4.f66504OooO0oo = c22120OooO0oO4.f66500OooO0Oo;
                c22120OooO0oO4.f66496OooO = c22120OooO0oO4.f66498OooO0O0.getRootAlpha();
                c22120OooO0oO4.f66505OooOO0 = c22120OooO0oO4.f66502OooO0o0;
                c22120OooO0oO4.f66506OooOO0O = false;
            }
        } else {
            C22120OooO0oO c22120OooO0oO5 = this.f66447OooOo;
            c22120OooO0oO5.f66501OooO0o.eraseColor(0);
            Canvas canvas3 = new Canvas(c22120OooO0oO5.f66501OooO0o);
            C19045OooO0o c19045OooO0o2 = c22120OooO0oO5.f66498OooO0O0;
            c19045OooO0o2.OooO00o(c19045OooO0o2.f66485OooO0oO, C19045OooO0o.f66477OooOOOo, canvas3, iMin, iMin2);
        }
        C22120OooO0oO c22120OooO0oO6 = this.f66447OooOo;
        if (c22120OooO0oO6.f66498OooO0O0.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c22120OooO0oO6.f66507OooOO0o == null) {
                Paint paint2 = new Paint();
                c22120OooO0oO6.f66507OooOO0o = paint2;
                paint2.setFilterBitmap(true);
            }
            c22120OooO0oO6.f66507OooOO0o.setAlpha(c22120OooO0oO6.f66498OooO0O0.getRootAlpha());
            c22120OooO0oO6.f66507OooOO0o.setColorFilter(colorFilter);
            paint = c22120OooO0oO6.f66507OooOO0o;
        }
        canvas.drawBitmap(c22120OooO0oO6.f66501OooO0o, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? DrawableCompat.getAlpha(drawable) : this.f66447OooOo.f66498OooO0O0.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f66447OooOo.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? DrawableCompat.getColorFilter(drawable) : this.f66448OooOoO;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f66509OooOo0o != null) {
            return new C22121OooO0oo(this.f66509OooOo0o.getConstantState());
        }
        this.f66447OooOo.f66497OooO00o = getChangingConfigurations();
        return this.f66447OooOo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f66447OooOo.f66498OooO0O0.f66478OooO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f66447OooOo.f66498OooO0O0.f66486OooO0oo;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? DrawableCompat.isAutoMirrored(drawable) : this.f66447OooOo.f66502OooO0o0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C22120OooO0oO c22120OooO0oO = this.f66447OooOo;
        if (c22120OooO0oO == null) {
            return false;
        }
        C19045OooO0o c19045OooO0o = c22120OooO0oO.f66498OooO0O0;
        if (c19045OooO0o.f66490OooOOO == null) {
            c19045OooO0o.f66490OooOOO = Boolean.valueOf(c19045OooO0o.f66485OooO0oO.OooO00o());
        }
        if (c19045OooO0o.f66490OooOOO.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f66447OooOo.f66499OooO0OO;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f66450OooOoOO && super.mutate() == this) {
            C22120OooO0oO c22120OooO0oO = this.f66447OooOo;
            C22120OooO0oO c22120OooO0oO2 = new C22120OooO0oO();
            c22120OooO0oO2.f66499OooO0OO = null;
            c22120OooO0oO2.f66500OooO0Oo = f66446Oooo000;
            if (c22120OooO0oO != null) {
                c22120OooO0oO2.f66497OooO00o = c22120OooO0oO.f66497OooO00o;
                C19045OooO0o c19045OooO0o = new C19045OooO0o(c22120OooO0oO.f66498OooO0O0);
                c22120OooO0oO2.f66498OooO0O0 = c19045OooO0o;
                if (c22120OooO0oO.f66498OooO0O0.f66484OooO0o0 != null) {
                    c19045OooO0o.f66484OooO0o0 = new Paint(c22120OooO0oO.f66498OooO0O0.f66484OooO0o0);
                }
                if (c22120OooO0oO.f66498OooO0O0.f66482OooO0Oo != null) {
                    c22120OooO0oO2.f66498OooO0O0.f66482OooO0Oo = new Paint(c22120OooO0oO.f66498OooO0O0.f66482OooO0Oo);
                }
                c22120OooO0oO2.f66499OooO0OO = c22120OooO0oO.f66499OooO0OO;
                c22120OooO0oO2.f66500OooO0Oo = c22120OooO0oO.f66500OooO0Oo;
                c22120OooO0oO2.f66502OooO0o0 = c22120OooO0oO.f66502OooO0o0;
            }
            this.f66447OooOo = c22120OooO0oO2;
            this.f66450OooOoOO = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        PorterDuff.Mode mode;
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C22120OooO0oO c22120OooO0oO = this.f66447OooOo;
        ColorStateList colorStateList = c22120OooO0oO.f66499OooO0OO;
        if (colorStateList == null || (mode = c22120OooO0oO.f66500OooO0Oo) == null) {
            z = false;
        } else {
            this.f66449OooOoO0 = OooO00o(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        C19045OooO0o c19045OooO0o = c22120OooO0oO.f66498OooO0O0;
        if (c19045OooO0o.f66490OooOOO == null) {
            c19045OooO0o.f66490OooOOO = Boolean.valueOf(c19045OooO0o.f66485OooO0oO.OooO00o());
        }
        if (c19045OooO0o.f66490OooOOO.booleanValue()) {
            boolean zOooO0O0 = c22120OooO0oO.f66498OooO0O0.f66485OooO0oO.OooO0O0(iArr);
            c22120OooO0oO.f66506OooOO0O |= zOooO0O0;
            if (zOooO0O0) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f66447OooOo.f66498OooO0O0.getRootAlpha() != i) {
            this.f66447OooOo.f66498OooO0O0.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.setAutoMirrored(drawable, z);
        } else {
            this.f66447OooOo.f66502OooO0o0 = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f66448OooOoO = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTint(int i) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.setTint(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.setTintList(drawable, colorStateList);
            return;
        }
        C22120OooO0oO c22120OooO0oO = this.f66447OooOo;
        if (c22120OooO0oO.f66499OooO0OO != colorStateList) {
            c22120OooO0oO.f66499OooO0OO = colorStateList;
            this.f66449OooOoO0 = OooO00o(colorStateList, c22120OooO0oO.f66500OooO0Oo);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.setTintMode(drawable, mode);
            return;
        }
        C22120OooO0oO c22120OooO0oO = this.f66447OooOo;
        if (c22120OooO0oO.f66500OooO0Oo != mode) {
            c22120OooO0oO.f66500OooO0Oo = mode;
            this.f66449OooOoO0 = OooO00o(c22120OooO0oO.f66499OooO0OO, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f66509OooOo0o;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.OooO0o$OooO0oo, reason: case insensitive filesystem */
    public static class C22121OooO0oo extends Drawable.ConstantState {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Drawable.ConstantState f66508OooO00o;

        public C22121OooO0oo(Drawable.ConstantState constantState) {
            this.f66508OooO00o = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f66508OooO00o.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f66508OooO00o.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            OooO0o oooO0o = new OooO0o();
            oooO0o.f66509OooOo0o = (VectorDrawable) this.f66508OooO00o.newDrawable();
            return oooO0o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            OooO0o oooO0o = new OooO0o();
            oooO0o.f66509OooOo0o = (VectorDrawable) this.f66508OooO00o.newDrawable(resources);
            return oooO0o;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            OooO0o oooO0o = new OooO0o();
            oooO0o.f66509OooOo0o = (VectorDrawable) this.f66508OooO00o.newDrawable(resources, theme);
            return oooO0o;
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.OooO0o$OooO0o0, reason: case insensitive filesystem */
    public static abstract class AbstractC22119OooO0o0 extends AbstractC22118OooO0Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public PathParser.PathDataNode[] f66493OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public String f66494OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public int f66495OooO0OO;

        public AbstractC22119OooO0o0() {
            this.f66493OooO00o = null;
            this.f66495OooO0OO = 0;
        }

        public PathParser.PathDataNode[] getPathData() {
            return this.f66493OooO00o;
        }

        public String getPathName() {
            return this.f66494OooO0O0;
        }

        public void setPathData(PathParser.PathDataNode[] pathDataNodeArr) {
            if (PathParser.canMorph(this.f66493OooO00o, pathDataNodeArr)) {
                PathParser.updateNodes(this.f66493OooO00o, pathDataNodeArr);
            } else {
                this.f66493OooO00o = PathParser.deepCopyNodes(pathDataNodeArr);
            }
        }

        public AbstractC22119OooO0o0(AbstractC22119OooO0o0 abstractC22119OooO0o0) {
            this.f66493OooO00o = null;
            this.f66495OooO0OO = 0;
            this.f66494OooO0O0 = abstractC22119OooO0o0.f66494OooO0O0;
            this.f66493OooO00o = PathParser.deepCopyNodes(abstractC22119OooO0o0.f66493OooO00o);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        C19045OooO0o c19045OooO0o;
        int i;
        int i2;
        char c;
        char c2;
        ArrayDeque arrayDeque;
        C20493Oooo00o c20493Oooo00o;
        TypedArray typedArray;
        Resources.Theme theme2 = theme;
        Drawable drawable = this.f66509OooOo0o;
        if (drawable != null) {
            DrawableCompat.inflate(drawable, resources, xmlPullParser, attributeSet, theme2);
            return;
        }
        C22120OooO0oO c22120OooO0oO = this.f66447OooOo;
        c22120OooO0oO.f66498OooO0O0 = new C19045OooO0o();
        TypedArray typedArrayObtainAttributes = TypedArrayUtils.obtainAttributes(resources, theme2, attributeSet, androidx.vectordrawable.graphics.drawable.OooO00o.f66427OooO00o);
        C22120OooO0oO c22120OooO0oO2 = this.f66447OooOo;
        C19045OooO0o c19045OooO0o2 = c22120OooO0oO2.f66498OooO0O0;
        int namedInt = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i3 = 3;
        if (namedInt == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (namedInt != 5) {
            if (namedInt != 9) {
                switch (namedInt) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c22120OooO0oO2.f66500OooO0Oo = mode;
        ColorStateList namedColorStateList = TypedArrayUtils.getNamedColorStateList(typedArrayObtainAttributes, xmlPullParser, theme2, "tint", 1);
        if (namedColorStateList != null) {
            c22120OooO0oO2.f66499OooO0OO = namedColorStateList;
        }
        c22120OooO0oO2.f66502OooO0o0 = TypedArrayUtils.getNamedBoolean(typedArrayObtainAttributes, xmlPullParser, "autoMirrored", 5, c22120OooO0oO2.f66502OooO0o0);
        c19045OooO0o2.f66487OooOO0 = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "viewportWidth", 7, c19045OooO0o2.f66487OooOO0);
        char c3 = '\b';
        float namedFloat = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "viewportHeight", 8, c19045OooO0o2.f66488OooOO0O);
        c19045OooO0o2.f66488OooOO0O = namedFloat;
        if (c19045OooO0o2.f66487OooOO0 <= 0.0f) {
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (namedFloat > 0.0f) {
            c19045OooO0o2.f66486OooO0oo = typedArrayObtainAttributes.getDimension(3, c19045OooO0o2.f66486OooO0oo);
            int i4 = 2;
            float dimension = typedArrayObtainAttributes.getDimension(2, c19045OooO0o2.f66478OooO);
            c19045OooO0o2.f66478OooO = dimension;
            if (c19045OooO0o2.f66486OooO0oo <= 0.0f) {
                throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                c19045OooO0o2.setAlpha(TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes, xmlPullParser, "alpha", 4, c19045OooO0o2.getAlpha()));
                int i5 = 0;
                String string = typedArrayObtainAttributes.getString(0);
                if (string != null) {
                    c19045OooO0o2.f66491OooOOO0 = string;
                    c19045OooO0o2.f66492OooOOOO.put(string, c19045OooO0o2);
                }
                typedArrayObtainAttributes.recycle();
                c22120OooO0oO.f66497OooO00o = getChangingConfigurations();
                c22120OooO0oO.f66506OooOO0O = true;
                C22120OooO0oO c22120OooO0oO3 = this.f66447OooOo;
                C19045OooO0o c19045OooO0o3 = c22120OooO0oO3.f66498OooO0O0;
                ArrayDeque arrayDeque2 = new ArrayDeque();
                arrayDeque2.push(c19045OooO0o3.f66485OooO0oO);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z = true;
                for (int i6 = 1; eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i3); i6 = 1) {
                    if (eventType == i4) {
                        String name = xmlPullParser.getName();
                        OooO0OO oooO0OO = (OooO0OO) arrayDeque2.peek();
                        boolean zEquals = "path".equals(name);
                        C20493Oooo00o c20493Oooo00o2 = c19045OooO0o3.f66492OooOOOO;
                        if (zEquals) {
                            OooO0O0 oooO0O0 = new OooO0O0();
                            TypedArray typedArrayObtainAttributes2 = TypedArrayUtils.obtainAttributes(resources, theme2, attributeSet, androidx.vectordrawable.graphics.drawable.OooO00o.f66429OooO0OO);
                            if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                                String string2 = typedArrayObtainAttributes2.getString(i5);
                                if (string2 != null) {
                                    oooO0O0.f66494OooO0O0 = string2;
                                }
                                String string3 = typedArrayObtainAttributes2.getString(2);
                                if (string3 != null) {
                                    oooO0O0.f66493OooO00o = PathParser.createNodesFromPathData(string3);
                                }
                                arrayDeque = arrayDeque2;
                                c20493Oooo00o = c20493Oooo00o2;
                                c19045OooO0o = c19045OooO0o3;
                                typedArray = typedArrayObtainAttributes2;
                                oooO0O0.f66457OooO0o = TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme2, "fillColor", 1, 0);
                                oooO0O0.f66460OooO0oo = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, oooO0O0.f66460OooO0oo);
                                int namedInt2 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1);
                                Paint.Cap cap = oooO0O0.f66463OooOO0o;
                                if (namedInt2 == 0) {
                                    cap = Paint.Cap.BUTT;
                                } else if (namedInt2 == 1) {
                                    cap = Paint.Cap.ROUND;
                                } else if (namedInt2 == 2) {
                                    cap = Paint.Cap.SQUARE;
                                }
                                oooO0O0.f66463OooOO0o = cap;
                                int namedInt3 = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1);
                                Paint.Join join = oooO0O0.f66465OooOOO0;
                                if (namedInt3 == 0) {
                                    join = Paint.Join.MITER;
                                } else if (namedInt3 == 1) {
                                    join = Paint.Join.ROUND;
                                } else if (namedInt3 == 2) {
                                    join = Paint.Join.BEVEL;
                                }
                                oooO0O0.f66465OooOOO0 = join;
                                oooO0O0.f66464OooOOO = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, oooO0O0.f66464OooOOO);
                                theme2 = theme;
                                c = '\b';
                                oooO0O0.f66456OooO0Oo = TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme2, "strokeColor", 3, 0);
                                oooO0O0.f66459OooO0oO = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, oooO0O0.f66459OooO0oO);
                                oooO0O0.f66458OooO0o0 = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, oooO0O0.f66458OooO0o0);
                                oooO0O0.f66461OooOO0 = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, oooO0O0.f66461OooOO0);
                                oooO0O0.f66462OooOO0O = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, oooO0O0.f66462OooOO0O);
                                oooO0O0.f66455OooO = TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, oooO0O0.f66455OooO);
                                oooO0O0.f66495OooO0OO = TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 13, oooO0O0.f66495OooO0OO);
                            } else {
                                arrayDeque = arrayDeque2;
                                c20493Oooo00o = c20493Oooo00o2;
                                c = '\b';
                                c19045OooO0o = c19045OooO0o3;
                                typedArray = typedArrayObtainAttributes2;
                            }
                            typedArray.recycle();
                            oooO0OO.f66468OooO0O0.add(oooO0O0);
                            if (oooO0O0.getPathName() != null) {
                                c20493Oooo00o.put(oooO0O0.getPathName(), oooO0O0);
                            }
                            c22120OooO0oO3.f66497OooO00o = c22120OooO0oO3.f66497OooO00o;
                            arrayDeque2 = arrayDeque;
                            i = 0;
                            c2 = 4;
                            z = false;
                        } else {
                            ArrayDeque arrayDeque3 = arrayDeque2;
                            c = '\b';
                            c19045OooO0o = c19045OooO0o3;
                            if ("clip-path".equals(name)) {
                                OooO00o oooO00o = new OooO00o();
                                if (TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                                    TypedArray typedArrayObtainAttributes3 = TypedArrayUtils.obtainAttributes(resources, theme2, attributeSet, androidx.vectordrawable.graphics.drawable.OooO00o.f66430OooO0Oo);
                                    String string4 = typedArrayObtainAttributes3.getString(0);
                                    if (string4 != null) {
                                        oooO00o.f66494OooO0O0 = string4;
                                    }
                                    String string5 = typedArrayObtainAttributes3.getString(1);
                                    if (string5 != null) {
                                        oooO00o.f66493OooO00o = PathParser.createNodesFromPathData(string5);
                                    }
                                    oooO00o.f66495OooO0OO = TypedArrayUtils.getNamedInt(typedArrayObtainAttributes3, xmlPullParser, "fillType", 2, 0);
                                    typedArrayObtainAttributes3.recycle();
                                }
                                oooO0OO.f66468OooO0O0.add(oooO00o);
                                if (oooO00o.getPathName() != null) {
                                    c20493Oooo00o2.put(oooO00o.getPathName(), oooO00o);
                                }
                                c22120OooO0oO3.f66497OooO00o = c22120OooO0oO3.f66497OooO00o;
                            } else if ("group".equals(name)) {
                                OooO0OO oooO0OO2 = new OooO0OO();
                                TypedArray typedArrayObtainAttributes4 = TypedArrayUtils.obtainAttributes(resources, theme2, attributeSet, androidx.vectordrawable.graphics.drawable.OooO00o.f66428OooO0O0);
                                oooO0OO2.f66469OooO0OO = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, "rotation", 5, oooO0OO2.f66469OooO0OO);
                                oooO0OO2.f66470OooO0Oo = typedArrayObtainAttributes4.getFloat(1, oooO0OO2.f66470OooO0Oo);
                                oooO0OO2.f66472OooO0o0 = typedArrayObtainAttributes4.getFloat(2, oooO0OO2.f66472OooO0o0);
                                oooO0OO2.f66471OooO0o = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, "scaleX", 3, oooO0OO2.f66471OooO0o);
                                c2 = 4;
                                oooO0OO2.f66473OooO0oO = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, "scaleY", 4, oooO0OO2.f66473OooO0oO);
                                oooO0OO2.f66474OooO0oo = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, "translateX", 6, oooO0OO2.f66474OooO0oo);
                                oooO0OO2.f66466OooO = TypedArrayUtils.getNamedFloat(typedArrayObtainAttributes4, xmlPullParser, "translateY", 7, oooO0OO2.f66466OooO);
                                i = 0;
                                String string6 = typedArrayObtainAttributes4.getString(0);
                                if (string6 != null) {
                                    oooO0OO2.f66476OooOO0O = string6;
                                }
                                oooO0OO2.OooO0OO();
                                typedArrayObtainAttributes4.recycle();
                                oooO0OO.f66468OooO0O0.add(oooO0OO2);
                                arrayDeque2 = arrayDeque3;
                                arrayDeque2.push(oooO0OO2);
                                if (oooO0OO2.getGroupName() != null) {
                                    c20493Oooo00o2.put(oooO0OO2.getGroupName(), oooO0OO2);
                                }
                                c22120OooO0oO3.f66497OooO00o = c22120OooO0oO3.f66497OooO00o;
                            }
                            arrayDeque2 = arrayDeque3;
                            i = 0;
                            c2 = 4;
                        }
                        i2 = 3;
                    } else {
                        c19045OooO0o = c19045OooO0o3;
                        i = i5;
                        i2 = i3;
                        c = c3;
                        if (eventType == i2 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque2.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i3 = i2;
                    i5 = i;
                    c3 = c;
                    c19045OooO0o3 = c19045OooO0o;
                    i4 = 2;
                }
                if (!z) {
                    this.f66449OooOoO0 = OooO00o(c22120OooO0oO.f66499OooO0OO, c22120OooO0oO.f66500OooO0Oo);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayObtainAttributes.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public static class OooO0OO extends AbstractC22118OooO0Oo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f66466OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Matrix f66467OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final ArrayList<AbstractC22118OooO0Oo> f66468OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public float f66469OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public float f66470OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public float f66471OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public float f66472OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public float f66473OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f66474OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final Matrix f66475OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public String f66476OooOO0O;

        public OooO0OO() {
            this.f66467OooO00o = new Matrix();
            this.f66468OooO0O0 = new ArrayList<>();
            this.f66469OooO0OO = 0.0f;
            this.f66470OooO0Oo = 0.0f;
            this.f66472OooO0o0 = 0.0f;
            this.f66471OooO0o = 1.0f;
            this.f66473OooO0oO = 1.0f;
            this.f66474OooO0oo = 0.0f;
            this.f66466OooO = 0.0f;
            this.f66475OooOO0 = new Matrix();
            this.f66476OooOO0O = null;
        }

        @Override // androidx.vectordrawable.graphics.drawable.OooO0o.AbstractC22118OooO0Oo
        public final boolean OooO00o() {
            int i = 0;
            while (true) {
                ArrayList<AbstractC22118OooO0Oo> arrayList = this.f66468OooO0O0;
                if (i >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i).OooO00o()) {
                    return true;
                }
                i++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.OooO0o.AbstractC22118OooO0Oo
        public final boolean OooO0O0(int[] iArr) {
            int i = 0;
            boolean zOooO0O0 = false;
            while (true) {
                ArrayList<AbstractC22118OooO0Oo> arrayList = this.f66468OooO0O0;
                if (i >= arrayList.size()) {
                    return zOooO0O0;
                }
                zOooO0O0 |= arrayList.get(i).OooO0O0(iArr);
                i++;
            }
        }

        public final void OooO0OO() {
            Matrix matrix = this.f66475OooOO0;
            matrix.reset();
            matrix.postTranslate(-this.f66470OooO0Oo, -this.f66472OooO0o0);
            matrix.postScale(this.f66471OooO0o, this.f66473OooO0oO);
            matrix.postRotate(this.f66469OooO0OO, 0.0f, 0.0f);
            matrix.postTranslate(this.f66474OooO0oo + this.f66470OooO0Oo, this.f66466OooO + this.f66472OooO0o0);
        }

        public String getGroupName() {
            return this.f66476OooOO0O;
        }

        public Matrix getLocalMatrix() {
            return this.f66475OooOO0;
        }

        public float getPivotX() {
            return this.f66470OooO0Oo;
        }

        public float getPivotY() {
            return this.f66472OooO0o0;
        }

        public float getRotation() {
            return this.f66469OooO0OO;
        }

        public float getScaleX() {
            return this.f66471OooO0o;
        }

        public float getScaleY() {
            return this.f66473OooO0oO;
        }

        public float getTranslateX() {
            return this.f66474OooO0oo;
        }

        public float getTranslateY() {
            return this.f66466OooO;
        }

        public void setPivotX(float f) {
            if (f != this.f66470OooO0Oo) {
                this.f66470OooO0Oo = f;
                OooO0OO();
            }
        }

        public void setPivotY(float f) {
            if (f != this.f66472OooO0o0) {
                this.f66472OooO0o0 = f;
                OooO0OO();
            }
        }

        public void setRotation(float f) {
            if (f != this.f66469OooO0OO) {
                this.f66469OooO0OO = f;
                OooO0OO();
            }
        }

        public void setScaleX(float f) {
            if (f != this.f66471OooO0o) {
                this.f66471OooO0o = f;
                OooO0OO();
            }
        }

        public void setScaleY(float f) {
            if (f != this.f66473OooO0oO) {
                this.f66473OooO0oO = f;
                OooO0OO();
            }
        }

        public void setTranslateX(float f) {
            if (f != this.f66474OooO0oo) {
                this.f66474OooO0oo = f;
                OooO0OO();
            }
        }

        public void setTranslateY(float f) {
            if (f != this.f66466OooO) {
                this.f66466OooO = f;
                OooO0OO();
            }
        }

        public OooO0OO(OooO0OO oooO0OO, OooOo.OooO00o<String, Object> oooO00o) {
            AbstractC22119OooO0o0 oooO00o2;
            this.f66467OooO00o = new Matrix();
            this.f66468OooO0O0 = new ArrayList<>();
            this.f66469OooO0OO = 0.0f;
            this.f66470OooO0Oo = 0.0f;
            this.f66472OooO0o0 = 0.0f;
            this.f66471OooO0o = 1.0f;
            this.f66473OooO0oO = 1.0f;
            this.f66474OooO0oo = 0.0f;
            this.f66466OooO = 0.0f;
            Matrix matrix = new Matrix();
            this.f66475OooOO0 = matrix;
            this.f66476OooOO0O = null;
            this.f66469OooO0OO = oooO0OO.f66469OooO0OO;
            this.f66470OooO0Oo = oooO0OO.f66470OooO0Oo;
            this.f66472OooO0o0 = oooO0OO.f66472OooO0o0;
            this.f66471OooO0o = oooO0OO.f66471OooO0o;
            this.f66473OooO0oO = oooO0OO.f66473OooO0oO;
            this.f66474OooO0oo = oooO0OO.f66474OooO0oo;
            this.f66466OooO = oooO0OO.f66466OooO;
            String str = oooO0OO.f66476OooOO0O;
            this.f66476OooOO0O = str;
            if (str != null) {
                oooO00o.put(str, this);
            }
            matrix.set(oooO0OO.f66475OooOO0);
            ArrayList<AbstractC22118OooO0Oo> arrayList = oooO0OO.f66468OooO0O0;
            for (int i = 0; i < arrayList.size(); i++) {
                AbstractC22118OooO0Oo abstractC22118OooO0Oo = arrayList.get(i);
                if (abstractC22118OooO0Oo instanceof OooO0OO) {
                    this.f66468OooO0O0.add(new OooO0OO((OooO0OO) abstractC22118OooO0Oo, oooO00o));
                } else {
                    if (abstractC22118OooO0Oo instanceof OooO0O0) {
                        OooO0O0 oooO0O0 = (OooO0O0) abstractC22118OooO0Oo;
                        OooO0O0 oooO0O02 = new OooO0O0(oooO0O0);
                        oooO0O02.f66458OooO0o0 = 0.0f;
                        oooO0O02.f66459OooO0oO = 1.0f;
                        oooO0O02.f66460OooO0oo = 1.0f;
                        oooO0O02.f66455OooO = 0.0f;
                        oooO0O02.f66461OooOO0 = 1.0f;
                        oooO0O02.f66462OooOO0O = 0.0f;
                        oooO0O02.f66463OooOO0o = Paint.Cap.BUTT;
                        oooO0O02.f66465OooOOO0 = Paint.Join.MITER;
                        oooO0O02.f66464OooOOO = 4.0f;
                        oooO0O02.f66456OooO0Oo = oooO0O0.f66456OooO0Oo;
                        oooO0O02.f66458OooO0o0 = oooO0O0.f66458OooO0o0;
                        oooO0O02.f66459OooO0oO = oooO0O0.f66459OooO0oO;
                        oooO0O02.f66457OooO0o = oooO0O0.f66457OooO0o;
                        oooO0O02.f66495OooO0OO = oooO0O0.f66495OooO0OO;
                        oooO0O02.f66460OooO0oo = oooO0O0.f66460OooO0oo;
                        oooO0O02.f66455OooO = oooO0O0.f66455OooO;
                        oooO0O02.f66461OooOO0 = oooO0O0.f66461OooOO0;
                        oooO0O02.f66462OooOO0O = oooO0O0.f66462OooOO0O;
                        oooO0O02.f66463OooOO0o = oooO0O0.f66463OooOO0o;
                        oooO0O02.f66465OooOOO0 = oooO0O0.f66465OooOOO0;
                        oooO0O02.f66464OooOOO = oooO0O0.f66464OooOOO;
                        oooO00o2 = oooO0O02;
                    } else if (abstractC22118OooO0Oo instanceof OooO00o) {
                        oooO00o2 = new OooO00o((OooO00o) abstractC22118OooO0Oo);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f66468OooO0O0.add(oooO00o2);
                    String str2 = oooO00o2.f66494OooO0O0;
                    if (str2 != null) {
                        oooO00o.put(str2, oooO00o2);
                    }
                }
            }
        }
    }

    public OooO0o(C22120OooO0oO c22120OooO0oO) {
        this.f66452OooOoo0 = true;
        this.f66451OooOoo = new float[9];
        this.f66453OooOooO = new Matrix();
        this.f66454OooOooo = new Rect();
        this.f66447OooOo = c22120OooO0oO;
        this.f66449OooOoO0 = OooO00o(c22120OooO0oO.f66499OooO0OO, c22120OooO0oO.f66500OooO0Oo);
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.OooO0o$OooO0o, reason: collision with other inner class name */
    public static class C19045OooO0o {

        /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
        public static final Matrix f66477OooOOOo = new Matrix();

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public float f66478OooO;

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Path f66479OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Path f66480OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final Matrix f66481OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public Paint f66482OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public PathMeasure f66483OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public Paint f66484OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final OooO0OO f66485OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public float f66486OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public float f66487OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public float f66488OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public int f66489OooOO0o;

        /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
        public Boolean f66490OooOOO;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public String f66491OooOOO0;

        /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
        public final OooOo.OooO00o<String, Object> f66492OooOOOO;

        public C19045OooO0o() {
            this.f66481OooO0OO = new Matrix();
            this.f66486OooO0oo = 0.0f;
            this.f66478OooO = 0.0f;
            this.f66487OooOO0 = 0.0f;
            this.f66488OooOO0O = 0.0f;
            this.f66489OooOO0o = 255;
            this.f66491OooOOO0 = null;
            this.f66490OooOOO = null;
            this.f66492OooOOOO = new OooOo.OooO00o<>();
            this.f66485OooO0oO = new OooO0OO();
            this.f66479OooO00o = new Path();
            this.f66480OooO0O0 = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void OooO00o(OooO0OO oooO0OO, Matrix matrix, Canvas canvas, int i, int i2) {
            char c;
            float f;
            float f2;
            int i3;
            OooO0OO oooO0OO2 = oooO0OO;
            char c2 = 1;
            oooO0OO2.f66467OooO00o.set(matrix);
            Matrix matrix2 = oooO0OO2.f66475OooOO0;
            Matrix matrix3 = oooO0OO2.f66467OooO00o;
            matrix3.preConcat(matrix2);
            canvas.save();
            char c3 = 0;
            int i4 = 0;
            while (true) {
                ArrayList<AbstractC22118OooO0Oo> arrayList = oooO0OO2.f66468OooO0O0;
                if (i4 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                AbstractC22118OooO0Oo abstractC22118OooO0Oo = arrayList.get(i4);
                if (abstractC22118OooO0Oo instanceof OooO0OO) {
                    OooO00o((OooO0OO) abstractC22118OooO0Oo, matrix3, canvas, i, i2);
                } else if (abstractC22118OooO0Oo instanceof AbstractC22119OooO0o0) {
                    AbstractC22119OooO0o0 abstractC22119OooO0o0 = (AbstractC22119OooO0o0) abstractC22118OooO0Oo;
                    float f3 = i / this.f66487OooOO0;
                    float f4 = i2 / this.f66488OooOO0O;
                    float fMin = Math.min(f3, f4);
                    Matrix matrix4 = this.f66481OooO0OO;
                    matrix4.set(matrix3);
                    matrix4.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c3], fArr[c2]);
                    boolean z = c2;
                    boolean z2 = c3;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[z2 ? 1 : 0] * fArr[3]) - (fArr[z ? 1 : 0] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f5) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        abstractC22119OooO0o0.getClass();
                        Path path = this.f66479OooO00o;
                        path.reset();
                        PathParser.PathDataNode[] pathDataNodeArr = abstractC22119OooO0o0.f66493OooO00o;
                        if (pathDataNodeArr != null) {
                            PathParser.PathDataNode.nodesToPath(pathDataNodeArr, path);
                        }
                        Path path2 = this.f66480OooO0O0;
                        path2.reset();
                        if (abstractC22119OooO0o0 instanceof OooO00o) {
                            path2.setFillType(abstractC22119OooO0o0.f66495OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            OooO0O0 oooO0O0 = (OooO0O0) abstractC22119OooO0o0;
                            float f6 = oooO0O0.f66455OooO;
                            if (f6 != 0.0f || oooO0O0.f66461OooOO0 != 1.0f) {
                                float f7 = oooO0O0.f66462OooOO0O;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (oooO0O0.f66461OooOO0 + f7) % 1.0f;
                                if (this.f66483OooO0o == null) {
                                    this.f66483OooO0o = new PathMeasure();
                                }
                                this.f66483OooO0o.setPath(path, z2);
                                float length = this.f66483OooO0o.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    this.f66483OooO0o.getSegment(f10, length, path, z);
                                    f = 0.0f;
                                    this.f66483OooO0o.getSegment(0.0f, f11, path, z);
                                } else {
                                    f = 0.0f;
                                    this.f66483OooO0o.getSegment(f10, f11, path, z);
                                }
                                path.rLineTo(f, f);
                            }
                            path2.addPath(path, matrix4);
                            if (oooO0O0.f66457OooO0o.willDraw()) {
                                ComplexColorCompat complexColorCompat = oooO0O0.f66457OooO0o;
                                if (this.f66484OooO0o0 == null) {
                                    i3 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f66484OooO0o0 = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i3 = 16777215;
                                }
                                Paint paint2 = this.f66484OooO0o0;
                                if (complexColorCompat.isGradient()) {
                                    Shader shader = complexColorCompat.getShader();
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(oooO0O0.f66460OooO0oo * 255.0f));
                                    f2 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int color = complexColorCompat.getColor();
                                    float f12 = oooO0O0.f66460OooO0oo;
                                    PorterDuff.Mode mode = OooO0o.f66446Oooo000;
                                    f2 = 255.0f;
                                    paint2.setColor((color & i3) | (((int) (Color.alpha(color) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(oooO0O0.f66495OooO0OO == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f2 = 255.0f;
                                i3 = 16777215;
                            }
                            if (oooO0O0.f66456OooO0Oo.willDraw()) {
                                ComplexColorCompat complexColorCompat2 = oooO0O0.f66456OooO0Oo;
                                if (this.f66482OooO0Oo == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f66482OooO0Oo = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f66482OooO0Oo;
                                Paint.Join join = oooO0O0.f66465OooOOO0;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = oooO0O0.f66463OooOO0o;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(oooO0O0.f66464OooOOO);
                                if (complexColorCompat2.isGradient()) {
                                    Shader shader2 = complexColorCompat2.getShader();
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(oooO0O0.f66459OooO0oO * f2));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int color2 = complexColorCompat2.getColor();
                                    float f13 = oooO0O0.f66459OooO0oO;
                                    PorterDuff.Mode mode2 = OooO0o.f66446Oooo000;
                                    paint4.setColor((color2 & i3) | (((int) (Color.alpha(color2) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(oooO0O0.f66458OooO0o0 * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    c = 1;
                    i4++;
                    oooO0OO2 = oooO0OO;
                    c2 = c;
                    c3 = 0;
                }
                c = c2;
                i4++;
                oooO0OO2 = oooO0OO;
                c2 = c;
                c3 = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f66489OooOO0o;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public void setRootAlpha(int i) {
            this.f66489OooOO0o = i;
        }

        public C19045OooO0o(C19045OooO0o c19045OooO0o) {
            this.f66481OooO0OO = new Matrix();
            this.f66486OooO0oo = 0.0f;
            this.f66478OooO = 0.0f;
            this.f66487OooOO0 = 0.0f;
            this.f66488OooOO0O = 0.0f;
            this.f66489OooOO0o = 255;
            this.f66491OooOOO0 = null;
            this.f66490OooOOO = null;
            OooOo.OooO00o<String, Object> oooO00o = new OooOo.OooO00o<>();
            this.f66492OooOOOO = oooO00o;
            this.f66485OooO0oO = new OooO0OO(c19045OooO0o.f66485OooO0oO, oooO00o);
            this.f66479OooO00o = new Path(c19045OooO0o.f66479OooO00o);
            this.f66480OooO0O0 = new Path(c19045OooO0o.f66480OooO0O0);
            this.f66486OooO0oo = c19045OooO0o.f66486OooO0oo;
            this.f66478OooO = c19045OooO0o.f66478OooO;
            this.f66487OooOO0 = c19045OooO0o.f66487OooOO0;
            this.f66488OooOO0O = c19045OooO0o.f66488OooOO0O;
            this.f66489OooOO0o = c19045OooO0o.f66489OooOO0o;
            this.f66491OooOOO0 = c19045OooO0o.f66491OooOOO0;
            String str = c19045OooO0o.f66491OooOOO0;
            if (str != null) {
                oooO00o.put(str, this);
            }
            this.f66490OooOOO = c19045OooO0o.f66490OooOOO;
        }
    }
}
