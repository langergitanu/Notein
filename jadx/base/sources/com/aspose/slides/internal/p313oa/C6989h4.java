package com.aspose.slides.internal.p313oa;

import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.oa.h4 */
/* JADX INFO: loaded from: classes4.dex */
class C6989h4 extends C6985du {
    public C6989h4(byte b, byte b2, byte b3, byte b4) {
        super(b, b2, b3, b4);
    }

    @Override // com.aspose.slides.internal.p313oa.C6985du
    /* JADX INFO: renamed from: k4 */
    public void mo27331k4() {
        int[] iArr = new int[16];
        this.f18997m9 = iArr;
        iArr[0] = 0;
        iArr[1] = C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) * C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) * C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) * C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6);
        this.f18997m9[2] = C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) * C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) * C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6);
        int[] iArr2 = this.f18997m9;
        iArr2[3] = iArr2[2] + iArr2[1];
        iArr2[4] = C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) * C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6);
        int[] iArr3 = this.f18997m9;
        int i = iArr3[4];
        iArr3[5] = iArr3[1] + i;
        iArr3[6] = iArr3[2] + i;
        iArr3[7] = i + iArr3[3];
        iArr3[8] = C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6);
        int[] iArr4 = this.f18997m9;
        int i2 = iArr4[8];
        iArr4[9] = iArr4[1] + i2;
        iArr4[10] = iArr4[2] + i2;
        iArr4[11] = iArr4[3] + i2;
        iArr4[12] = iArr4[4] + i2;
        iArr4[13] = iArr4[5] + i2;
        iArr4[14] = iArr4[6] + i2;
        iArr4[15] = i2 + iArr4[7];
    }

    @Override // com.aspose.slides.internal.p313oa.C6985du
    /* JADX INFO: renamed from: k4 */
    public void mo27333k4(float[] fArr) {
        byte bM27462to = (byte) (C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) - 1);
        byte bM27462to2 = (byte) (C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) - 1);
        byte bM27462to3 = (byte) (C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) - 1);
        byte bM27462to4 = (byte) (C7019kk.m27462to(Byte.valueOf(this.f18998to), 6) - 1);
        float fM27437dy = C7019kk.m27437dy(Byte.valueOf(bM27462to), 6) * fArr[0];
        float fM27437dy2 = C7019kk.m27437dy(Byte.valueOf(bM27462to2), 6) * fArr[1];
        float fM27437dy3 = C7019kk.m27437dy(Byte.valueOf(bM27462to3), 6) * fArr[2];
        float fM27437dy4 = C7019kk.m27437dy(Byte.valueOf(bM27462to4), 6) * fArr[3];
        int iM27462to = C7019kk.m27462to(Float.valueOf(fM27437dy), 13);
        int iM27462to2 = C7019kk.m27462to(Float.valueOf(fM27437dy2), 13);
        int iM27462to3 = C7019kk.m27462to(Float.valueOf(fM27437dy3), 13);
        int iM27462to4 = C7019kk.m27462to(Float.valueOf(fM27437dy4), 13);
        float f = fM27437dy - iM27462to;
        float f2 = fM27437dy2 - iM27462to2;
        float f3 = fM27437dy3 - iM27462to3;
        int[] iArr = {iM27462to};
        float[] fArr2 = {f};
        C6985du.m27330k4(bM27462to, iArr, fArr2);
        int i = iArr[0];
        float f4 = fArr2[0];
        int[] iArr2 = {iM27462to2};
        float[] fArr3 = {f2};
        C6985du.m27330k4(bM27462to2, iArr2, fArr3);
        int i2 = iArr2[0];
        float f5 = fArr3[0];
        int[] iArr3 = {iM27462to3};
        float[] fArr4 = {f3};
        C6985du.m27330k4(bM27462to3, iArr3, fArr4);
        int i3 = iArr3[0];
        float f6 = fArr4[0];
        int[] iArr4 = {iM27462to4};
        float[] fArr5 = {fM27437dy4 - iM27462to4};
        C6985du.m27330k4(bM27462to4, iArr4, fArr5);
        int i4 = iArr4[0];
        float f7 = fArr5[0];
        float f8 = 1.0f - f7;
        float f9 = 1.0f - f6;
        float f10 = 1.0f - f5;
        float f11 = 1.0f - f4;
        int[] iArr5 = this.f18997m9;
        int i5 = (i4 * iArr5[8]) + (i3 * iArr5[4]) + (i2 * iArr5[2]) + (i * iArr5[1]);
        float f12 = f8 * f9;
        float f13 = f12 * f10;
        float f14 = f12 * f5;
        float f15 = f8 * f6;
        float f16 = f15 * f10;
        float f17 = f15 * f5;
        float f18 = f9 * f7;
        float f19 = f18 * f10;
        float f20 = f18 * f5;
        float f21 = f7 * f6;
        float f22 = f10 * f21;
        float f23 = f21 * f5;
        float[] fArr6 = {f13 * f11, f13 * f4, f14 * f11, f14 * f4, f16 * f11, f16 * f4, f17 * f11, f17 * f4, f19 * f11, f19 * f4, f20 * f11, f20 * f4, f22 * f11, f22 * f4, f11 * f23, f23 * f4};
        for (int i6 = 0; i6 < C7019kk.m27462to(Byte.valueOf(this.f18996kk), 6); i6++) {
            float f24 = 0.0f;
            for (int i7 = 0; i7 < 16; i7++) {
                f24 += this.f18994h4[this.f18997m9[i7] + i5 + i6] * fArr6[i7];
            }
            fArr[i6] = C6979b3.m27309kk(f24);
        }
    }
}
