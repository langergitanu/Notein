package OooooOO;

import OooOo.C20496Oooo0o0;
import OooooOO.C21332Oooo0OO;
import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;

/* JADX INFO: renamed from: OooooOO.Oooo0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21331Oooo0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Paint f61740OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public int f61741OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public Shader f61742OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C21349OooooO0 f61743OooO0Oo;

    public final float OooO() {
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        return paint.getStrokeWidth();
    }

    public final Paint OooO00o() {
        return this.f61740OooO00o;
    }

    public final float OooO0O0() {
        kotlin.jvm.internal.OooOOO0.OooO0oO(this.f61740OooO00o, "<this>");
        return r1.getAlpha() / 255.0f;
    }

    public final long OooO0OO() {
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        return C20496Oooo0o0.OooO0O0(paint.getColor());
    }

    public final int OooO0Oo() {
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        return paint.isFilterBitmap() ? 1 : 0;
    }

    public final int OooO0o() {
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : C21332Oooo0OO.OooO00o.f61744OooO00o[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public final Shader OooO0o0() {
        return this.f61742OooO0OO;
    }

    public final int OooO0oO() {
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : C21332Oooo0OO.OooO00o.f61745OooO0O0[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public final float OooO0oo() {
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        return paint.getStrokeMiter();
    }

    public final void OooOO0(float f) {
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public final void OooOO0O(int i) {
        if (this.f61741OooO0O0 == i) {
            return;
        }
        this.f61741OooO0O0 = i;
        Paint setNativeBlendMode = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(setNativeBlendMode, "$this$setNativeBlendMode");
        if (Build.VERSION.SDK_INT >= 29) {
            o0O0O00.f61795OooO00o.OooO00o(setNativeBlendMode, i);
        } else {
            setNativeBlendMode.setXfermode(new PorterDuffXfermode(C21324OooOooO.OooO0O0(i)));
        }
    }

    public final void OooOO0o(long j) {
        Paint setNativeColor = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(setNativeColor, "$this$setNativeColor");
        setNativeColor.setColor(C20496Oooo0o0.OooO0oo(j));
    }

    public final void OooOOO(int i) {
        Paint setNativeFilterQuality = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(setNativeFilterQuality, "$this$setNativeFilterQuality");
        setNativeFilterQuality.setFilterBitmap(!(i == 0));
    }

    public final void OooOOO0(C21349OooooO0 c21349OooooO0) {
        this.f61743OooO0Oo = c21349OooooO0;
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        paint.setColorFilter(c21349OooooO0 != null ? c21349OooooO0.f61769OooO00o : null);
    }

    public final void OooOOOO(Shader shader) {
        this.f61742OooO0OO = shader;
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        paint.setShader(shader);
    }

    public final void OooOOOo(int i) {
        Paint setNativeStrokeCap = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(setNativeStrokeCap, "$this$setNativeStrokeCap");
        setNativeStrokeCap.setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void OooOOo(float f) {
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        paint.setStrokeMiter(f);
    }

    public final void OooOOo0(int i) {
        Paint setNativeStrokeJoin = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(setNativeStrokeJoin, "$this$setNativeStrokeJoin");
        setNativeStrokeJoin.setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void OooOOoo(float f) {
        Paint paint = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "<this>");
        paint.setStrokeWidth(f);
    }

    public final void OooOo00(int i) {
        Paint setNativeStyle = this.f61740OooO00o;
        kotlin.jvm.internal.OooOOO0.OooO0oO(setNativeStyle, "$this$setNativeStyle");
        setNativeStyle.setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
