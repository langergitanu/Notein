package OooooOO;

import OooooO0.C21290OooO0o0;
import OooooO0.C21291OooO0oO;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import o0000Ooo.C24226OooO;
import oO00ooO.C32460OooOooO;

/* JADX INFO: renamed from: OooooOO.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21325OooOooo implements InterfaceC21342OoooOOO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public Canvas f61733OooO00o = C21328Oooo000.f61738OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Rect f61734OooO0O0 = new Rect();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rect f61735OooO0OO = new Rect();

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooO(InterfaceC21352Oooooo image, long j, long j2, long j3, long j4, C21331Oooo0O0 c21331Oooo0O0) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(image, "image");
        Canvas canvas = this.f61733OooO00o;
        Bitmap bitmapOooO00o = C21330Oooo00o.OooO00o(image);
        int i = C24226OooO.f81469OooO0OO;
        int i2 = (int) (j >> 32);
        Rect rect = this.f61734OooO0O0;
        rect.left = i2;
        int i3 = (int) (j & 4294967295L);
        rect.top = i3;
        rect.right = i2 + ((int) (j2 >> 32));
        rect.bottom = i3 + ((int) (j2 & 4294967295L));
        C32460OooOooO c32460OooOooO = C32460OooOooO.f116667OooO00o;
        int i4 = (int) (j3 >> 32);
        Rect rect2 = this.f61735OooO0OO;
        rect2.left = i4;
        int i5 = (int) (j3 & 4294967295L);
        rect2.top = i5;
        rect2.right = i4 + ((int) (j4 >> 32));
        rect2.bottom = i5 + ((int) (j4 & 4294967295L));
        canvas.drawBitmap(bitmapOooO00o, rect, rect2, c21331Oooo0O0.OooO00o());
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooO0O0(float f, float f2, float f3, float f4, int i) {
        this.f61733OooO00o.clipRect(f, f2, f3, f4, i == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooO0OO(float f, float f2) {
        this.f61733OooO00o.translate(f, f2);
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooO0o(C21291OooO0oO c21291OooO0oO, C21331Oooo0O0 c21331Oooo0O0) {
        Canvas canvas = this.f61733OooO00o;
        Paint paintOooO00o = c21331Oooo0O0.OooO00o();
        canvas.saveLayer(c21291OooO0oO.f61724OooO00o, c21291OooO0oO.f61725OooO0O0, c21291OooO0oO.f61726OooO0OO, c21291OooO0oO.f61727OooO0Oo, paintOooO00o, 31);
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooO0o0() {
        C21344OoooOo0.OooO00o(this.f61733OooO00o, false);
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooO0oO(float f, float f2, float f3, float f4, float f5, float f6, C21331Oooo0O0 c21331Oooo0O0) {
        this.f61733OooO00o.drawRoundRect(f, f2, f3, f4, f5, f6, c21331Oooo0O0.OooO00o());
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooO0oo(long j, long j2, C21331Oooo0O0 c21331Oooo0O0) {
        this.f61733OooO00o.drawLine(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j), C21290OooO0o0.OooO0OO(j2), C21290OooO0o0.OooO0Oo(j2), c21331Oooo0O0.OooO00o());
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOO0(InterfaceC21352Oooooo interfaceC21352Oooooo, long j, C21331Oooo0O0 c21331Oooo0O0) {
        this.f61733OooO00o.drawBitmap(C21330Oooo00o.OooO00o(interfaceC21352Oooooo), C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j), c21331Oooo0O0.OooO00o());
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOO0O() {
        this.f61733OooO00o.scale(-1.0f, 1.0f);
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOO0o() {
        this.f61733OooO00o.restore();
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOOO(float f, long j, C21331Oooo0O0 c21331Oooo0O0) {
        this.f61733OooO00o.drawCircle(C21290OooO0o0.OooO0OO(j), C21290OooO0o0.OooO0Oo(j), f, c21331Oooo0O0.OooO00o());
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOOO0(float f, float f2, float f3, float f4, C21331Oooo0O0 paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        this.f61733OooO00o.drawRect(f, f2, f3, f4, paint.OooO00o());
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOOOO() {
        C21344OoooOo0.OooO00o(this.f61733OooO00o, true);
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOOOo(InterfaceC21370ooOO path) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        Canvas canvas = this.f61733OooO00o;
        if (!(path instanceof C21334Oooo0o0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((C21334Oooo0o0) path).f61747OooO00o, Region.Op.INTERSECT);
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOOo(float[] matrix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(matrix, "matrix");
        int i = 0;
        while (i < 4) {
            int i2 = 0;
            while (i2 < 4) {
                if (matrix[(i * 4) + i2] != (i == i2 ? 1.0f : 0.0f)) {
                    Matrix matrix2 = new Matrix();
                    float f = matrix[2];
                    if (f == 0.0f) {
                        float f2 = matrix[6];
                        if (f2 == 0.0f && matrix[10] == 1.0f && matrix[14] == 0.0f) {
                            float f3 = matrix[8];
                            if (f3 == 0.0f && matrix[9] == 0.0f && matrix[11] == 0.0f) {
                                float f4 = matrix[0];
                                float f5 = matrix[1];
                                float f6 = matrix[3];
                                float f7 = matrix[4];
                                float f8 = matrix[5];
                                float f9 = matrix[7];
                                float f10 = matrix[12];
                                float f11 = matrix[13];
                                float f12 = matrix[15];
                                matrix[0] = f4;
                                matrix[1] = f7;
                                matrix[2] = f10;
                                matrix[3] = f5;
                                matrix[4] = f8;
                                matrix[5] = f11;
                                matrix[6] = f6;
                                matrix[7] = f9;
                                matrix[8] = f12;
                                matrix2.setValues(matrix);
                                matrix[0] = f4;
                                matrix[1] = f5;
                                matrix[2] = f;
                                matrix[3] = f6;
                                matrix[4] = f7;
                                matrix[5] = f8;
                                matrix[6] = f2;
                                matrix[7] = f9;
                                matrix[8] = f3;
                                this.f61733OooO00o.concat(matrix2);
                                return;
                            }
                        }
                    }
                    throw new IllegalArgumentException("Android does not support arbitrary transforms");
                }
                i2++;
            }
            i++;
        }
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOOo0() {
        this.f61733OooO00o.save();
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOOoo() {
        this.f61733OooO00o.rotate(45.0f);
    }

    @Override // OooooOO.InterfaceC21342OoooOOO
    public final void OooOo00(InterfaceC21370ooOO path, C21331Oooo0O0 paint) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(path, "path");
        kotlin.jvm.internal.OooOOO0.OooO0oO(paint, "paint");
        Canvas canvas = this.f61733OooO00o;
        if (!(path instanceof C21334Oooo0o0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((C21334Oooo0o0) path).f61747OooO00o, paint.OooO00o());
    }
}
