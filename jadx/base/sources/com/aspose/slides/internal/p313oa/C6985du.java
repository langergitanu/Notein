package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.du */
/* JADX INFO: loaded from: classes4.dex */
class C6985du {

    /* JADX INFO: renamed from: du */
    protected byte f18993du;

    /* JADX INFO: renamed from: kk */
    protected byte f18996kk;

    /* JADX INFO: renamed from: to */
    protected byte f18998to;

    /* JADX INFO: renamed from: x1 */
    protected byte f18999x1;

    /* JADX INFO: renamed from: k4 */
    protected byte[] f18995k4 = null;

    /* JADX INFO: renamed from: h4 */
    protected float[] f18994h4 = null;

    /* JADX INFO: renamed from: m9 */
    protected int[] f18997m9 = null;

    public C6985du(byte b, byte b2, byte b3, byte b4) {
        this.f18999x1 = b;
        this.f18996kk = b2;
        this.f18998to = b3;
        this.f18993du = b4;
    }

    /* JADX INFO: renamed from: k4 */
    public static C6985du m27329k4(byte b, byte b2, byte b3, byte b4) {
        return C6996m9.m27375k4(b, b2, b3, b4);
    }

    /* JADX INFO: renamed from: x1 */
    public void m27334x1(C6990ix c6990ix) {
        int iM27462to = C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6) * C7019kk.m27462to(Double.valueOf(C14116yg.m67469du(C7019kk.m27433c5(Byte.valueOf(this.f18998to), 6), C7019kk.m27433c5(Byte.valueOf(this.f18999x1), 6))), 14);
        byte b = this.f18993du;
        if (b == 1) {
            this.f18994h4 = c6990ix.m27357x1(iM27462to);
        } else {
            if (b != 2) {
                return;
            }
            this.f18994h4 = c6990ix.m27353kk(iM27462to);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo27331k4() {
        int[] iArr = new int[8];
        this.f18997m9 = iArr;
        iArr[0] = 0;
        iArr[1] = C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) * C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) * C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6);
        this.f18997m9[2] = C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) * C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6);
        int[] iArr2 = this.f18997m9;
        iArr2[3] = iArr2[1] + iArr2[2];
        iArr2[4] = C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6);
        int[] iArr3 = this.f18997m9;
        int i = iArr3[4];
        int i2 = iArr3[1];
        iArr3[5] = i + i2;
        int i3 = i + iArr3[2];
        iArr3[6] = i3;
        iArr3[7] = i3 + i2;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m27330k4(byte b, int[] iArr, float[] fArr) {
        if (iArr[0] == C7019kk.m27462to(Byte.valueOf(b), 6)) {
            iArr[0] = iArr[0] - 1;
            fArr[0] = 1.0f;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m27332k4(C6990ix c6990ix) {
        byte[] bArrM27351k4 = c6990ix.m27351k4(16);
        this.f18993du = c6990ix.m27349k4();
        this.f18995k4 = c6990ix.m27351k4(3);
        this.f18998to = bArrM27351k4[0];
        m27334x1(c6990ix);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo27333k4(float[] fArr) {
        for (int i = 0; i < C7019kk.m27462to(Byte.valueOf(this.f18999x1), 6); i++) {
            fArr[i] = C6979b3.m27309kk(fArr[i]);
        }
        byte bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) - 1);
        byte bM27462to2 = (byte) (C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) - 1);
        byte bM27462to3 = (byte) (C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) - 1);
        float fM27437dy = C7019kk.m27437dy(Byte.valueOf(bM27462to), 6) * fArr[0];
        float fM27437dy2 = C7019kk.m27437dy(Byte.valueOf(bM27462to2), 6) * fArr[1];
        float fM27437dy3 = C7019kk.m27437dy(Byte.valueOf(bM27462to3), 6) * fArr[2];
        int iM27462to = C7019kk.m27462to(Float.valueOf(fM27437dy), 13);
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(fM27437dy2), 13);
        int iM27462to3 = C7019kk.m27462to(Float.valueOf(fM27437dy3), 13);
        float f = fM27437dy - iM27462to;
        float f2 = fM27437dy3 - iM27462to3;
        int[] iArr = {iM27462to};
        float[] fArr2 = {f};
        m27330k4(bM27462to, iArr, fArr2);
        int i2 = iArr[0];
        float f3 = fArr2[0];
        int[] iArr2 = {iM27462to2};
        float[] fArr3 = {fM27437dy2 - iM27462to2};
        m27330k4(bM27462to2, iArr2, fArr3);
        int i3 = iArr2[0];
        float f4 = fArr3[0];
        int[] iArr3 = {iM27462to3};
        float[] fArr4 = {f2};
        m27330k4(bM27462to3, iArr3, fArr4);
        int i4 = iArr3[0];
        float f5 = fArr4[0];
        float f6 = 1.0f - f5;
        float f7 = 1.0f - f4;
        float f8 = 1.0f - f3;
        int[] iArr4 = this.f18997m9;
        int i5 = (i4 * iArr4[4]) + (i3 * iArr4[2]) + (i2 * iArr4[1]);
        float f9 = f6 * f7;
        float f10 = f6 * f4;
        float f11 = f7 * f5;
        float f12 = f5 * f4;
        float[] fArr5 = {f9 * f8, f9 * f3, f10 * f8, f10 * f3, f11 * f8, f11 * f3, f8 * f12, f12 * f3};
        for (int i6 = 0; i6 < C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6); i6++) {
            double d = 0.0d;
            for (int i7 = 0; i7 < 8; i7++) {
                d += (double) (this.f18994h4[this.f18997m9[i7] + i5 + i6] * fArr5[i7]);
            }
            fArr[i6] = C6979b3.m27309kk((float) d);
        }
    }
}
