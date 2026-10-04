package o00oO0O0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class OooOOO extends C25556OooO0oo implements OooOO0O {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public final OooO00o f87182OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public final RectF f87183OooOoOO;

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    public final float[] f87184OooOoo;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public final float[] f87185OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public final Paint f87186OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public boolean f87187OooOooo;

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    public float f87188Oooo0;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public float f87189Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public int f87190Oooo00O;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    public int f87191Oooo00o;

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    public final Path f87192Oooo0O0;

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    public final Path f87193Oooo0OO;

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    public final RectF f87194Oooo0o0;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class OooO00o {

        /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
        public static final /* synthetic */ OooO00o[] f87195OooOo;

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public static final OooO00o f87196OooOo0o;

        static {
            OooO00o oooO00o = new OooO00o("OVERLAY_COLOR", 0);
            f87196OooOo0o = oooO00o;
            f87195OooOo = new OooO00o[]{oooO00o, new OooO00o("CLIPPING", 1)};
        }

        public OooO00o() {
            throw null;
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) f87195OooOo.clone();
        }
    }

    public OooOOO(C25555OooO0oO c25555OooO0oO) {
        super(c25555OooO0oO);
        this.f87182OooOoO = OooO00o.f87196OooOo0o;
        this.f87183OooOoOO = new RectF();
        this.f87185OooOoo0 = new float[8];
        this.f87184OooOoo = new float[8];
        this.f87186OooOooO = new Paint(1);
        this.f87187OooOooo = false;
        this.f87189Oooo000 = 0.0f;
        this.f87190Oooo00O = 0;
        this.f87191Oooo00o = 0;
        this.f87188Oooo0 = 0.0f;
        this.f87192Oooo0O0 = new Path();
        this.f87193Oooo0OO = new Path();
        this.f87194Oooo0o0 = new RectF();
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO00o(int i, float f) {
        this.f87190Oooo00O = i;
        this.f87189Oooo000 = f;
        OooOOOO();
        invalidateSelf();
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0O0(boolean z) {
        this.f87187OooOooo = z;
        OooOOOO();
        invalidateSelf();
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0OO(float f) {
        this.f87188Oooo0 = f;
        OooOOOO();
        invalidateSelf();
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0Oo() {
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooO0oO() {
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooOO0O() {
        OooOOOO();
        invalidateSelf();
    }

    @Override // o00oO0O0.OooOO0O
    public final void OooOO0o(float[] fArr) {
        float[] fArr2 = this.f87185OooOoo0;
        if (fArr == null) {
            Arrays.fill(fArr2, 0.0f);
        } else {
            OooOoo0.OooOo00.OooO0OO(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, fArr2, 0, 8);
        }
        OooOOOO();
        invalidateSelf();
    }

    public final void OooOOOO() {
        float[] fArr;
        Path path = this.f87192Oooo0O0;
        path.reset();
        Path path2 = this.f87193Oooo0OO;
        path2.reset();
        RectF rectF = this.f87194Oooo0o0;
        rectF.set(getBounds());
        float f = this.f87188Oooo0;
        rectF.inset(f, f);
        if (this.f87182OooOoO == OooO00o.f87196OooOo0o) {
            path.addRect(rectF, Path.Direction.CW);
        }
        boolean z = this.f87187OooOooo;
        float[] fArr2 = this.f87185OooOoo0;
        if (z) {
            path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            path.addRoundRect(rectF, fArr2, Path.Direction.CW);
        }
        float f2 = this.f87188Oooo0;
        rectF.inset(-f2, -f2);
        float f3 = this.f87189Oooo000;
        rectF.inset(f3 / 2.0f, f3 / 2.0f);
        if (this.f87187OooOooo) {
            path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i = 0;
            while (true) {
                fArr = this.f87184OooOoo;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (fArr2[i] + this.f87188Oooo0) - (this.f87189Oooo000 / 2.0f);
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f4 = this.f87189Oooo000;
        rectF.inset((-f4) / 2.0f, (-f4) / 2.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        Canvas canvas2;
        RectF rectF = this.f87183OooOoOO;
        rectF.set(getBounds());
        int iOrdinal = this.f87182OooOoO.ordinal();
        Path path = this.f87192Oooo0O0;
        Paint paint = this.f87186OooOooO;
        if (iOrdinal == 0) {
            super.draw(canvas);
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(this.f87191Oooo00o);
            paint.setStrokeWidth(0.0f);
            paint.setFilterBitmap(false);
            path.setFillType(Path.FillType.EVEN_ODD);
            canvas.drawPath(path, paint);
            if (this.f87187OooOooo) {
                float fWidth = ((rectF.width() - rectF.height()) + this.f87189Oooo000) / 2.0f;
                float fHeight = ((rectF.height() - rectF.width()) + this.f87189Oooo000) / 2.0f;
                if (fWidth > 0.0f) {
                    float f = rectF.left;
                    canvas2 = canvas;
                    canvas2.drawRect(f, rectF.top, f + fWidth, rectF.bottom, paint);
                    float f2 = rectF.right;
                    canvas2.drawRect(f2 - fWidth, rectF.top, f2, rectF.bottom, paint);
                } else {
                    canvas2 = canvas;
                }
                if (fHeight > 0.0f) {
                    float f3 = rectF.left;
                    float f4 = rectF.top;
                    canvas2.drawRect(f3, f4, rectF.right, f4 + fHeight, paint);
                    float f5 = rectF.left;
                    float f6 = rectF.bottom;
                    canvas2.drawRect(f5, f6 - fHeight, rectF.right, f6, paint);
                }
            }
            if (this.f87190Oooo00O == 0) {
                paint.setStyle(Paint.Style.STROKE);
                paint.setColor(this.f87190Oooo00O);
                paint.setStrokeWidth(this.f87189Oooo000);
                path.setFillType(Path.FillType.EVEN_ODD);
                canvas2.drawPath(this.f87193Oooo0OO, paint);
                return;
            }
            return;
        }
        if (iOrdinal == 1) {
            int iSave = canvas.save();
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        canvas2 = canvas;
        if (this.f87190Oooo00O == 0) {
        }
    }

    @Override // o00oO0O0.C25556OooO0oo, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        OooOOOO();
    }
}
