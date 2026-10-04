package com.miui.penengine.p597f;

import Oooo0o0.C21009OooOooO;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.miui.penengine.f.b */
/* JADX INFO: loaded from: classes9.dex */
public class C18777b {

    /* JADX INFO: renamed from: d */
    public float f57284d;

    /* JADX INFO: renamed from: e */
    public float f57285e;

    /* JADX INFO: renamed from: f */
    public float f57286f;

    /* JADX INFO: renamed from: l */
    public float[][] f57292l;

    /* JADX INFO: renamed from: m */
    public float[][] f57293m;

    /* JADX INFO: renamed from: n */
    public float[][] f57294n;

    /* JADX INFO: renamed from: o */
    public float[][] f57295o;

    /* JADX INFO: renamed from: p */
    public float[][] f57296p;

    /* JADX INFO: renamed from: q */
    public float[][] f57297q;

    /* JADX INFO: renamed from: r */
    public float[][] f57298r;

    /* JADX INFO: renamed from: s */
    public float[][] f57299s;

    /* JADX INFO: renamed from: t */
    public float[][] f57300t;

    /* JADX INFO: renamed from: u */
    public float[][] f57301u;

    /* JADX INFO: renamed from: v */
    public float[][] f57302v;

    /* JADX INFO: renamed from: w */
    public float[][] f57303w;

    /* JADX INFO: renamed from: a */
    public final float f57281a = 20000.0f;

    /* JADX INFO: renamed from: b */
    public final float f57282b = 500.0f;

    /* JADX INFO: renamed from: c */
    public final float f57283c = 1.0f;

    /* JADX INFO: renamed from: g */
    public float[] f57287g = new float[2];

    /* JADX INFO: renamed from: h */
    public float[] f57288h = new float[4];

    /* JADX INFO: renamed from: i */
    public float[] f57289i = new float[2];

    /* JADX INFO: renamed from: j */
    public float[] f57290j = new float[4];

    /* JADX INFO: renamed from: k */
    public float[] f57291k = new float[2];

    public C18777b() {
        Class cls = Float.TYPE;
        this.f57292l = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
        this.f57293m = (float[][]) Array.newInstance((Class<?>) cls, 2, 2);
        this.f57294n = (float[][]) Array.newInstance((Class<?>) cls, 2, 2);
        this.f57295o = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
        this.f57296p = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
        this.f57297q = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
        this.f57298r = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
        this.f57299s = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
        this.f57300t = (float[][]) Array.newInstance((Class<?>) cls, 4, 2);
        this.f57301u = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
        this.f57302v = (float[][]) Array.newInstance((Class<?>) cls, 2, 2);
        this.f57303w = (float[][]) Array.newInstance((Class<?>) cls, 4, 4);
    }

    /* JADX INFO: renamed from: a */
    public final void m80370a() {
        for (int i = 0; i < 2; i++) {
            for (int i2 = 0; i2 < 2; i2++) {
                this.f57302v[i][i2] = 0.0f;
            }
        }
        float[][] fArr = this.f57302v;
        float[] fArr2 = fArr[0];
        float[][] fArr3 = this.f57294n;
        float f = fArr3[0][0];
        float[][] fArr4 = this.f57299s;
        fArr2[0] = 1.0f / (f + fArr4[0][0]);
        fArr[1][1] = 1.0f / (fArr3[1][1] + fArr4[2][2]);
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i4 = 0; i4 < 2; i4++) {
                this.f57300t[i3][i4] = 0.0f;
            }
        }
        float[][] fArr5 = this.f57300t;
        float[] fArr6 = fArr5[0];
        float[][] fArr7 = this.f57299s;
        float f2 = fArr7[0][0];
        float[][] fArr8 = this.f57302v;
        float[] fArr9 = fArr8[0];
        fArr6[0] = f2 * fArr9[0];
        fArr5[1][0] = fArr7[1][0] * fArr9[0];
        float[] fArr10 = fArr5[2];
        float f3 = fArr7[2][2];
        float[] fArr11 = fArr8[1];
        fArr10[1] = f3 * fArr11[1];
        fArr5[3][1] = fArr7[3][2] * fArr11[1];
    }

    /* JADX INFO: renamed from: b */
    public final void m80374b() {
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.f57297q[i][i2] = 0.0f;
            }
        }
        float[][] fArr = this.f57297q;
        float[] fArr2 = fArr[0];
        float[][] fArr3 = this.f57303w;
        float[] fArr4 = fArr3[0];
        float f = fArr4[0];
        float[][] fArr5 = this.f57295o;
        float[] fArr6 = fArr5[0];
        float f2 = f * fArr6[0];
        float f3 = fArr4[1];
        float[] fArr7 = fArr5[1];
        fArr2[0] = (fArr7[0] * f3) + f2;
        fArr2[1] = (f3 * fArr7[1]) + (fArr4[0] * fArr6[1]);
        float[] fArr8 = fArr[1];
        float f4 = fArr3[1][1];
        fArr8[0] = fArr7[0] * f4;
        fArr8[1] = f4 * fArr7[1];
        float[] fArr9 = fArr[2];
        float[] fArr10 = fArr3[2];
        float f5 = fArr10[2];
        float[] fArr11 = fArr5[2];
        float f6 = f5 * fArr11[2];
        float f7 = fArr10[3];
        float[] fArr12 = fArr5[3];
        fArr9[2] = (fArr12[2] * f7) + f6;
        fArr9[3] = (f7 * fArr12[3]) + (fArr10[2] * fArr11[3]);
        float[] fArr13 = fArr[3];
        float f8 = fArr3[3][3];
        fArr13[2] = fArr12[2] * f8;
        fArr13[3] = f8 * fArr12[3];
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i4 = 0; i4 < 4; i4++) {
                this.f57298r[i3][i4] = 0.0f;
            }
        }
        float[][] fArr14 = this.f57298r;
        float[] fArr15 = fArr14[0];
        float[][] fArr16 = this.f57297q;
        float[] fArr17 = fArr16[0];
        float f9 = fArr17[0];
        float[][] fArr18 = this.f57303w;
        float[] fArr19 = fArr18[0];
        float f10 = f9 * fArr19[0];
        float f11 = fArr17[1];
        fArr15[0] = (fArr19[1] * f11) + f10;
        float[] fArr20 = fArr18[1];
        fArr15[1] = f11 * fArr20[1];
        float[] fArr21 = fArr14[1];
        float[] fArr22 = fArr16[1];
        float f12 = fArr22[0] * fArr19[0];
        float f13 = fArr22[1];
        fArr21[0] = (fArr19[1] * f13) + f12;
        fArr21[1] = f13 * fArr20[1];
        float[] fArr23 = fArr14[2];
        float[] fArr24 = fArr16[2];
        float f14 = fArr24[2];
        float[] fArr25 = fArr18[2];
        float f15 = f14 * fArr25[2];
        float f16 = fArr24[3];
        fArr23[2] = (fArr25[3] * f16) + f15;
        float[] fArr26 = fArr18[3];
        fArr23[3] = f16 * fArr26[3];
        float[] fArr27 = fArr14[3];
        float[] fArr28 = fArr16[3];
        float f17 = fArr28[2] * fArr25[2];
        float f18 = fArr28[3];
        fArr27[2] = (fArr25[3] * f18) + f17;
        fArr27[3] = f18 * fArr26[3];
        for (int i5 = 0; i5 < 4; i5++) {
            for (int i6 = 0; i6 < 4; i6++) {
                this.f57292l[i5][i6] = 0.0f;
            }
        }
        float[][] fArr29 = this.f57292l;
        float[] fArr30 = fArr29[0];
        float f19 = this.f57286f;
        fArr30[0] = f19;
        float f20 = f19 / 10.0f;
        fArr29[1][1] = f20;
        fArr29[2][2] = f19;
        fArr29[3][3] = f20;
        for (int i7 = 0; i7 < 4; i7++) {
            for (int i8 = 0; i8 < 4; i8++) {
                this.f57301u[i7][i8] = 0.0f;
            }
        }
        m80372a(this.f57298r, this.f57284d, this.f57301u, 4, 4);
        m80372a(this.f57292l, 0.125f, this.f57297q, 4, 4);
        m80373a(this.f57301u, this.f57297q, this.f57299s, 4, 4);
    }

    /* JADX INFO: renamed from: c */
    public float m80377c() {
        return this.f57288h[0];
    }

    /* JADX INFO: renamed from: d */
    public float m80380d() {
        return this.f57288h[2];
    }

    /* JADX INFO: renamed from: e */
    public final void m80381e() {
        float[] fArr = this.f57288h;
        float f = fArr[0];
        float[] fArr2 = this.f57289i;
        float f2 = f - fArr2[0];
        float f3 = fArr[2] - fArr2[1];
        double dSqrt = Math.sqrt((f3 * f3) + (f2 * f2));
        float[] fArr3 = this.f57291k;
        float f4 = fArr3[0];
        float f5 = fArr3[1];
        this.f57286f = ((float) Math.sqrt(Math.sqrt((f5 * f5) + (f4 * f4)) * dSqrt)) / 20000.0f;
    }

    /* JADX INFO: renamed from: f */
    public final void m80382f() {
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.f57301u[i][i2] = 0.0f;
            }
        }
        float[][] fArr = this.f57301u;
        float[] fArr2 = fArr[0];
        float[][] fArr3 = this.f57300t;
        fArr2[0] = fArr3[0][0];
        fArr[1][0] = fArr3[1][0];
        fArr[2][2] = fArr3[2][1];
        fArr[3][2] = fArr3[3][1];
        m80379c(this.f57296p, fArr, fArr, 4, 4);
        m80376b(this.f57301u, this.f57299s, this.f57295o, 4, 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m80383g() {
        float[][] fArr = this.f57298r;
        float f = fArr[0][0] + fArr[2][2];
        float[] fArr2 = this.f57291k;
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float[] fArr3 = this.f57287g;
        fArr3[0] = C21009OooOooO.OooO00o(fArr3[0], 0.95f, f2 * f2, 1.95f);
        fArr3[1] = C21009OooOooO.OooO00o(fArr3[1], 0.95f, f3 * f3, 1.95f);
        float[][] fArr4 = this.f57302v;
        float[] fArr5 = fArr4[0];
        float[][] fArr6 = this.f57292l;
        float f4 = fArr6[0][0];
        float[][] fArr7 = this.f57293m;
        float f5 = f4 + fArr7[0][0];
        fArr5[0] = f5;
        float[] fArr8 = fArr4[1];
        float f6 = fArr6[2][2] + fArr7[1][1];
        fArr8[1] = f6;
        float f7 = ((fArr3[0] - f5) + fArr3[1]) - f6;
        if (f != 0.0f) {
            float f8 = (f7 / f) / 500.0f;
            this.f57284d = f8;
            float f9 = this.f57285e;
            float f10 = 0.02f + f9;
            if (f8 > f10) {
                this.f57284d = f10;
            } else {
                float f11 = f9 - 0.1f;
                if (f8 <= f11) {
                    this.f57284d = f11;
                }
            }
            float f12 = this.f57284d;
            if (f12 < 1.0f) {
                this.f57284d = 1.0f;
            } else if (f12 > 1.6f) {
                this.f57284d = 1.6f;
            }
        }
        this.f57285e = this.f57284d;
    }

    /* JADX INFO: renamed from: h */
    public void m80384h() {
        float[] fArr = this.f57290j;
        float[][] fArr2 = this.f57303w;
        float[] fArr3 = fArr2[0];
        float f = fArr3[0];
        float[] fArr4 = this.f57288h;
        float f2 = f * fArr4[0];
        float f3 = fArr3[1];
        float f4 = fArr4[1];
        fArr[0] = (f3 * f4) + f2;
        fArr[1] = fArr2[1][1] * f4;
        float[] fArr5 = fArr2[2];
        float f5 = fArr5[2] * fArr4[2];
        float f6 = fArr5[3];
        float f7 = fArr4[3];
        fArr[2] = (f6 * f7) + f5;
        fArr[3] = fArr2[3][3] * f7;
    }

    /* JADX INFO: renamed from: a */
    public void m80371a(float f, float f2) {
        float[] fArr = this.f57288h;
        fArr[0] = f;
        fArr[1] = 0.0f;
        fArr[2] = f2;
        fArr[3] = 0.0f;
        this.f57286f = 0.01f;
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                this.f57292l[i][i2] = 0.0f;
            }
        }
        float[][] fArr2 = this.f57292l;
        float[] fArr3 = fArr2[0];
        float f3 = this.f57286f;
        fArr3[0] = f3;
        float f4 = f3 / 10.0f;
        fArr2[1][1] = f4;
        fArr2[2][2] = f3;
        fArr2[3][3] = f4;
        for (int i3 = 0; i3 < 4; i3++) {
            for (int i4 = 0; i4 < 4; i4++) {
                this.f57295o[i3][i4] = 0.0f;
            }
        }
        float[][] fArr4 = this.f57295o;
        fArr4[0][0] = 10.0f;
        fArr4[1][1] = 2.0f;
        fArr4[2][2] = 10.0f;
        fArr4[3][3] = 2.0f;
        for (int i5 = 0; i5 < 2; i5++) {
            this.f57287g[i5] = 0.0f;
        }
        this.f57284d = 1.0f;
        this.f57285e = 1.0f;
        for (int i6 = 0; i6 < 2; i6++) {
            for (int i7 = 0; i7 < 2; i7++) {
                this.f57294n[i6][i7] = 0.0f;
                this.f57293m[i6][i7] = 0.0f;
            }
        }
        float[][] fArr5 = this.f57294n;
        fArr5[0][0] = 1.0f;
        fArr5[1][1] = 1.0f;
        float[][] fArr6 = this.f57293m;
        fArr6[0][0] = 1.0f;
        fArr6[1][1] = 1.0f;
        for (int i8 = 0; i8 < 4; i8++) {
            for (int i9 = 0; i9 < 4; i9++) {
                this.f57303w[i8][i9] = 0.0f;
            }
        }
        float[][] fArr7 = this.f57303w;
        float[] fArr8 = fArr7[0];
        fArr8[0] = 1.0f;
        fArr8[1] = 1.0f;
        fArr7[1][1] = 1.0f;
        float[] fArr9 = fArr7[2];
        fArr9[2] = 1.0f;
        fArr9[3] = 1.0f;
        fArr7[3][3] = 1.0f;
        for (int i10 = 0; i10 < 4; i10++) {
            for (int i11 = 0; i11 < 4; i11++) {
                this.f57296p[i10][i11] = 0.0f;
            }
        }
        float[][] fArr10 = this.f57296p;
        fArr10[0][0] = 1.0f;
        fArr10[1][1] = 1.0f;
        fArr10[2][2] = 1.0f;
        fArr10[3][3] = 1.0f;
    }

    /* JADX INFO: renamed from: b */
    public final void m80376b(float[][] fArr, float[][] fArr2, float[][] fArr3, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                float f = 0.0f;
                for (int i5 = 0; i5 < i2; i5++) {
                    f += fArr[i3][i5] * fArr2[i5][i4];
                }
                fArr3[i3][i4] = f;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m80379c(float[][] fArr, float[][] fArr2, float[][] fArr3, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                fArr3[i3][i4] = fArr[i3][i4] - fArr2[i3][i4];
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m80373a(float[][] fArr, float[][] fArr2, float[][] fArr3, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                fArr3[i3][i4] = fArr[i3][i4] + fArr2[i3][i4];
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m80375b(float f, float f2) {
        m80384h();
        m80374b();
        m80370a();
        m80378c(f, f2);
        m80382f();
        m80381e();
        m80383g();
    }

    /* JADX INFO: renamed from: c */
    public final void m80378c(float f, float f2) {
        float[] fArr = this.f57291k;
        float[] fArr2 = this.f57290j;
        float f3 = f - fArr2[0];
        fArr[0] = f3;
        float f4 = fArr2[2];
        fArr[1] = f2 - f4;
        float[] fArr3 = this.f57288h;
        float f5 = fArr2[0];
        float[][] fArr4 = this.f57300t;
        fArr3[0] = (fArr4[0][0] * f3) + f5;
        fArr3[1] = (fArr4[1][0] * fArr[0]) + fArr2[1];
        float f6 = fArr4[2][1];
        float f7 = fArr[1];
        fArr3[2] = (f6 * f7) + f4;
        fArr3[3] = (fArr4[3][1] * f7) + fArr2[3];
    }

    /* JADX INFO: renamed from: a */
    public final void m80372a(float[][] fArr, float f, float[][] fArr2, int i, int i2) {
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                fArr2[i3][i4] = fArr[i3][i4] * f;
            }
        }
    }
}
