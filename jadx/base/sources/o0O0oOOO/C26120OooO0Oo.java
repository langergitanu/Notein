package o0O0oOOO;

import Oooo0oO.o0Oo0oo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.BlendMode;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.CornerPathEffect;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathDashPathEffect;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.os.Build;
import androidx.core.view.ViewCompat;
import com.orion.ni_render_engine.impl.ink.C22840OooO0Oo;
import java.util.Stack;
import kotlin.jvm.internal.OooOOO0;

/* JADX INFO: renamed from: o0O0oOOO.OooO0Oo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C26120OooO0Oo implements o0O0oo00.OooO00o<Canvas> {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public static final int f89159OooOO0o = Color.parseColor("#26000000");

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static final ColorMatrixColorFilter f89160OooOOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public float f89161OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Path f89162OooO00o = new Path();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Stack<Path> f89163OooO0O0 = new Stack<>();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Canvas f89164OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Paint f89165OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public float f89166OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f89167OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public boolean f89168OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public Float f89169OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public float f89170OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public float f89171OooOO0O;

    /* JADX INFO: renamed from: o0O0oOOO.OooO0Oo$OooO00o */
    public /* synthetic */ class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f89172OooO00o;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Paint.Style.FILL_AND_STROKE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89172OooO00o = iArr;
        }
    }

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.set(new float[]{-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        f89160OooOOO0 = new ColorMatrixColorFilter(colorMatrix);
    }

    public C26120OooO0Oo() {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.f89165OooO0Oo = paint;
        this.f89166OooO0o = 1.0f;
    }

    public static Paint.Style OooOooO(int i) {
        if (i == 0) {
            return Paint.Style.STROKE;
        }
        if (i == 1) {
            return Paint.Style.FILL;
        }
        if (i == 2) {
            return Paint.Style.FILL_AND_STROKE;
        }
        throw new IllegalArgumentException(o0Oo0oo.OooO0O0(i, "style ", " not defined"));
    }

    public static PorterDuff.Mode OooOooo(int i) {
        switch (i) {
            case 0:
                return PorterDuff.Mode.CLEAR;
            case 1:
                return PorterDuff.Mode.SRC;
            case 2:
                return PorterDuff.Mode.DST;
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
                return PorterDuff.Mode.DST_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 6:
                return PorterDuff.Mode.DST_IN;
            case 7:
                return PorterDuff.Mode.SRC_OUT;
            case 8:
                return PorterDuff.Mode.DST_OUT;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 10:
                return PorterDuff.Mode.DST_ATOP;
            case 11:
                return PorterDuff.Mode.XOR;
            case 12:
                return PorterDuff.Mode.ADD;
            case 13:
                return PorterDuff.Mode.MULTIPLY;
            case 14:
                return PorterDuff.Mode.SCREEN;
            case 15:
                return PorterDuff.Mode.OVERLAY;
            case 16:
                return PorterDuff.Mode.DARKEN;
            case 17:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO(float f) {
        this.f89165OooO0Oo.setStrokeWidth(f);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO00o(float f, float f2, float f3, float f4, float f5, float f6) {
        this.f89162OooO00o.cubicTo(f, f2, f3, f4, f5, f6);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0O0(float f, float f2, float f3, float f4) {
        this.f89162OooO00o.quadTo(f, f2, f3, f4);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0OO() {
        this.f89162OooO00o.close();
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0Oo() {
        this.f89163OooO0O0.push(new Path(this.f89162OooO00o));
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0o(RectF bounds, Paint paint) {
        OooOOO0.OooO0oO(bounds, "bounds");
        OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f89164OooO0OO;
        if (canvas == null) {
            throw new IllegalArgumentException("need render target");
        }
        canvas.drawRect(bounds, paint);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0o0() {
        this.f89162OooO00o = this.f89163OooO0O0.pop();
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0oO(float f) {
        this.f89169OooO0oo = Float.valueOf(f);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooO0oo(float[] fArr) {
        this.f89165OooO0Oo.setPathEffect(new DashPathEffect(fArr, 0.0f));
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOO0(RectF rectF) {
        Path path = new Path();
        path.addRect(rectF, Path.Direction.CW);
        this.f89165OooO0Oo.setPathEffect(new PathDashPathEffect(path, 1.0f, 0.0f, PathDashPathEffect.Style.TRANSLATE));
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOO0O(int i) {
        this.f89165OooO0Oo.setColor(i);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOO0o(androidx.ink.strokes.OooOOO0 oooOOO0, Matrix matrix, o0O0oo00.OooO0OO oooO0OO) {
        Canvas canvas = this.f89164OooO0OO;
        if (canvas == null) {
            throw new IllegalArgumentException("need render target");
        }
        C22840OooO0Oo.OooO0O0(canvas, oooOOO0, matrix, oooO0OO);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOO(float f, float f2) {
        this.f89161OooO = f;
        this.f89170OooOO0 = f2;
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOO0(float f) {
        this.f89171OooOO0O = f;
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOOO(float f) {
        Shader shader;
        Canvas canvas = this.f89164OooO0OO;
        if (canvas == null) {
            throw new IllegalArgumentException("need render target");
        }
        if (this.f89168OooO0oO) {
            float f2 = this.f89171OooOO0O;
            int i = f89159OooOO0o;
            if (f2 == 0.0f) {
                this.f89165OooO0Oo.setShadowLayer(10.0f, 3.0f, 3.0f, i);
            } else {
                double d = ((double) (f2 / 180.0f)) * 3.141592653589793d;
                double d2 = 3;
                this.f89165OooO0Oo.setShadowLayer(10.0f, oO0O00O.OooO00o.OooO00o(Math.cos(d) * d2), oO0O00O.OooO00o.OooO00o(Math.sin(d) * d2), i);
            }
        } else {
            this.f89165OooO0Oo.clearShadowLayer();
        }
        canvas.drawPath(this.f89162OooO00o, this.f89165OooO0Oo);
        if (this.f89168OooO0oO) {
            Paint paint = this.f89165OooO0Oo;
            if (!canvas.isHardwareAccelerated() || Build.VERSION.SDK_INT < 33) {
                float fFloatValue = f;
                Float f3 = this.f89169OooO0oo;
                if (f3 != null) {
                    fFloatValue = f3.floatValue();
                }
                float f4 = fFloatValue >= 0.05f ? fFloatValue : 0.05f;
                float f5 = f4 * 20.0f;
                int iCeil = (int) Math.ceil(f5);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iCeil, iCeil, Bitmap.Config.ARGB_8888);
                OooOOO0.OooO0o(bitmapCreateBitmap, "createBitmap(...)");
                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                float f6 = 1 * Resources.getSystem().getDisplayMetrics().density * f4;
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setStrokeCap(Paint.Cap.BUTT);
                paint2.setColor(-1);
                paint2.setStrokeWidth(f6);
                float f7 = 2;
                float f8 = f6 / f7;
                float fSqrt = (float) Math.sqrt((f8 * f8) / f7);
                float f9 = f5 - fSqrt;
                canvas2.drawLine(f5, f5, f9, f9, paint2);
                canvas2.drawLine(0.0f, 0.0f, fSqrt, fSqrt, paint2);
                canvas2.drawLine(0.0f, f5, f5, 0.0f, paint2);
                Shader.TileMode tileMode = Shader.TileMode.REPEAT;
                BitmapShader bitmapShader = new BitmapShader(bitmapCreateBitmap, tileMode, tileMode);
                Matrix matrix = new Matrix();
                matrix.setTranslate(this.f89161OooO, this.f89170OooOO0);
                float f10 = this.f89171OooOO0O;
                if (f10 != 0.0f) {
                    float f11 = f5 / f7;
                    matrix.postRotate(f10, this.f89161OooO + f11, this.f89170OooOO0 + f11);
                }
                bitmapShader.setLocalMatrix(matrix);
                shader = bitmapShader;
            } else {
                float fMax = Math.max(f, 0.05f);
                float f12 = 20.0f * fMax;
                float f13 = 1 * Resources.getSystem().getDisplayMetrics().density * fMax;
                RuntimeShader runtimeShaderOooO00o = C26119OooO0OO.OooO00o();
                runtimeShaderOooO00o.setFloatUniform("uTile", f12, f12);
                runtimeShaderOooO00o.setFloatUniform("uStroke", f13);
                Matrix matrix2 = new Matrix();
                matrix2.setTranslate(this.f89161OooO, this.f89170OooOO0);
                float f14 = this.f89171OooOO0O;
                if (f14 != 0.0f) {
                    float f15 = f12 / 2;
                    matrix2.postRotate(f14, this.f89161OooO + f15, this.f89170OooOO0 + f15);
                }
                runtimeShaderOooO00o.setLocalMatrix(matrix2);
                shader = runtimeShaderOooO00o;
            }
            paint.setShader(shader);
            canvas.drawPath(this.f89162OooO00o, this.f89165OooO0Oo);
            this.f89165OooO0Oo.setShader(null);
        }
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOOo(float f, float f2, float f3) {
        this.f89162OooO00o.addCircle(f, f2, f3, Path.Direction.CW);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOo() {
        this.f89165OooO0Oo.setPathEffect(null);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOo0(float f, int i, int i2, int i3, boolean z) {
        PorterDuff.Mode modeOooOooo = OooOooo(i3);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStyle(OooOooO(i2));
        paint.setColor(i);
        paint.setStrokeWidth(f);
        if (modeOooOooo != null) {
            paint.setXfermode(new PorterDuffXfermode(modeOooOooo));
        }
        this.f89165OooO0Oo = paint;
        if (this.f89167OooO0o0) {
            paint.setColorFilter(f89160OooOOO0);
        } else {
            paint.setColorFilter(null);
        }
        this.f89162OooO00o = new Path();
        this.f89168OooO0oO = z;
        this.f89166OooO0o = f;
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOOoo(RectF rect) {
        OooOOO0.OooO0oO(rect, "rect");
        this.f89162OooO00o.addRect(rect, Path.Direction.CW);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo(int i) {
        this.f89165OooO0Oo.setStyle(OooOooO(i));
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo0(int i) {
        Canvas canvas = this.f89164OooO0OO;
        if (canvas == null) {
            throw new IllegalArgumentException("need render target");
        }
        canvas.drawColor(i);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo00(o0O0oo00.OooO0O0<Canvas> target) {
        OooOOO0.OooO0oO(target, "target");
        if (!(target instanceof C26121OooO0o0)) {
            throw new IllegalArgumentException();
        }
        C26121OooO0o0 c26121OooO0o0 = (C26121OooO0o0) target;
        this.f89164OooO0OO = c26121OooO0o0.OooO0OO();
        boolean z = c26121OooO0o0.f89175OooO0OO;
        this.f89167OooO0o0 = z;
        if (z) {
            this.f89165OooO0Oo.setColorFilter(f89160OooOOO0);
        } else {
            this.f89165OooO0Oo.setColorFilter(null);
        }
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo0O(String text, float f, float f2, float f3) {
        OooOOO0.OooO0oO(text, "text");
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        paint.setTextSize(f3);
        Canvas canvas = this.f89164OooO0OO;
        if (canvas != null) {
            Rect rect = new Rect();
            paint.getTextBounds(text, 0, text.length(), rect);
            canvas.drawText(text, f, f2 - rect.exactCenterY(), paint);
        }
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOo0o(Bitmap bitmap, RectF bounds, float f) {
        OooOOO0.OooO0oO(bitmap, "bitmap");
        OooOOO0.OooO0oO(bounds, "bounds");
        Canvas canvas = this.f89164OooO0OO;
        if (canvas == null) {
            throw new IllegalArgumentException("need render target");
        }
        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        RectF rectF = new RectF(bounds);
        Matrix matrix = new Matrix();
        matrix.postScale(rectF.width() / rect.width(), rectF.height() / rect.height());
        matrix.postTranslate(rectF.left, rectF.top);
        matrix.postRotate(f, (rectF.width() / 2.0f) + rectF.left, (rectF.height() / 2.0f) + rectF.top);
        canvas.drawBitmap(bitmap, matrix, null);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoO(RectF rectF, float f) {
        Path path = new Path();
        Matrix matrix = new Matrix();
        float f2 = 2;
        matrix.postTranslate(-((rectF.width() / f2) + rectF.left), -((rectF.height() / f2) + rectF.top));
        matrix.postRotate(f);
        matrix.postTranslate((rectF.width() / f2) + rectF.left, (rectF.height() / f2) + rectF.top);
        path.addOval(rectF, Path.Direction.CW);
        path.transform(matrix);
        this.f89162OooO00o.addPath(path);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoO0(int i) {
        PorterDuff.Mode modeOooOooo = OooOooo(i);
        this.f89165OooO0Oo.setXfermode(modeOooOooo != null ? new PorterDuffXfermode(modeOooOooo) : null);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoOO(CornerPathEffect cornerPathEffect) {
        this.f89165OooO0Oo.setPathEffect(cornerPathEffect);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoo() {
        int i;
        Canvas canvas = this.f89164OooO0OO;
        if (canvas == null) {
            throw new IllegalStateException("need render target");
        }
        RectF rectF = new RectF();
        this.f89162OooO00o.computeBounds(rectF, true);
        float f = -((this.f89165OooO0Oo.getStrokeWidth() / 2.0f) + 2.0f);
        rectF.inset(f, f);
        PathMeasure pathMeasure = new PathMeasure(this.f89162OooO00o, false);
        if (pathMeasure.getLength() <= 0.0f) {
            return;
        }
        int color = this.f89165OooO0Oo.getColor();
        int iAlpha = Color.alpha(color);
        float[] fArr = new float[3];
        Color.colorToHSV(color, fArr);
        float f2 = fArr[0];
        float strokeWidth = this.f89165OooO0Oo.getStrokeWidth();
        float f3 = strokeWidth * 48.0f;
        float f4 = strokeWidth / (strokeWidth >= 5.0f ? strokeWidth < 20.0f ? 4.0f : strokeWidth < 50.0f ? 6.0f : 8.0f : 2.0f);
        if (f4 < 0.5f) {
            f4 = 0.5f;
        }
        if (f4 <= strokeWidth) {
            strokeWidth = f4;
        }
        float[] fArr2 = null;
        int iSaveLayer = canvas.saveLayer(rectF, null);
        Paint paint = new Paint(this.f89165OooO0Oo);
        if (Build.VERSION.SDK_INT >= 33) {
            BlendMode unused = BlendMode.SRC;
            paint.setBlendMode(BlendMode.SRC);
        } else {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
        paint.setAlpha(255);
        float[] fArr3 = new float[2];
        float[] fArr4 = new float[2];
        pathMeasure.getPosTan(0.0f, fArr3, null);
        PathMeasure pathMeasure2 = pathMeasure;
        int iMax = Math.max(1, (int) Math.ceil(pathMeasure.getLength() / strokeWidth));
        if (1 <= iMax) {
            int i2 = 1;
            while (true) {
                float length = (pathMeasure2.getLength() * i2) / iMax;
                PathMeasure pathMeasure3 = pathMeasure2;
                pathMeasure3.getPosTan(length, fArr4, fArr2);
                fArr[0] = (((((((pathMeasure3.getLength() - length) % f3) / f3) * 360.0f) + f2) % 360.0f) + 360.0f) % 360.0f;
                paint.setColor(Color.HSVToColor(255, fArr));
                i = iSaveLayer;
                pathMeasure2 = pathMeasure3;
                float[] fArr5 = fArr4;
                canvas.drawLine(fArr3[0], fArr3[1], fArr5[0], fArr5[1], paint);
                fArr3[0] = fArr5[0];
                fArr3[1] = fArr5[1];
                if (i2 == iMax) {
                    break;
                }
                i2++;
                iSaveLayer = i;
                fArr4 = fArr5;
                fArr2 = null;
            }
        } else {
            i = iSaveLayer;
        }
        Paint paint2 = new Paint(this.f89165OooO0Oo);
        if (Build.VERSION.SDK_INT >= 33) {
            BlendMode unused2 = BlendMode.DST_IN;
            paint2.setBlendMode(BlendMode.DST_IN);
        } else {
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        paint2.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint2.setAlpha(iAlpha);
        paint2.setStyle(Paint.Style.STROKE);
        canvas.drawPath(this.f89162OooO00o, paint2);
        canvas.restoreToCount(i);
        this.f89165OooO0Oo.setColor(color);
    }

    @Override // o0O0oo00.OooO00o
    public final void OooOoo0(float f, float f2, RectF rectF) {
        this.f89162OooO00o.addRoundRect(rectF, f, f2, Path.Direction.CW);
    }

    public final void Oooo000() {
        this.f89165OooO0Oo.setMaskFilter(new BlurMaskFilter(20.0f, BlurMaskFilter.Blur.SOLID));
    }

    @Override // o0O0oo00.OooO00o
    public final int getStyle() {
        Paint.Style style = this.f89165OooO0Oo.getStyle();
        int i = style == null ? -1 : OooO00o.f89172OooO00o[style.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 0;
            if (i != 2) {
                return i != 3 ? 0 : 2;
            }
        }
        return i2;
    }

    @Override // o0O0oo00.OooO00o
    public final float getWidth() {
        return this.f89166OooO0o;
    }

    @Override // o0O0oo00.OooO00o
    public final void lineTo(float f, float f2) {
        this.f89162OooO00o.lineTo(f, f2);
    }

    @Override // o0O0oo00.OooO00o
    public final void moveTo(float f, float f2) {
        this.f89162OooO00o.moveTo(f, f2);
    }

    @Override // o0O0oo00.OooO00o
    public final void reset() {
        this.f89162OooO00o = new Path();
        this.f89163OooO0O0.clear();
    }
}
