package com.aspose.slides;

import com.alipay.share.sdk.openapi.algorithm.MD5;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p077d8.C3063jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
public class ColorOperation implements IColorOperation {

    /* JADX INFO: renamed from: kk */
    private static final float[][] f1967kk = {new float[]{0.0f, 1.0f}, new float[]{0.0f, 1.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 1.0f}, new float[]{0.0f, 2147483.8f}, new float[]{0.0f, 360.0f}, new float[]{-360.0f, 360.0f}, new float[]{0.0f, 2147483.8f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 1.0f}, new float[]{0.0f, 2147483.8f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 1.0f}, new float[]{0.0f, 2147483.8f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 1.0f}, new float[]{0.0f, 2147483.8f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 1.0f}, new float[]{0.0f, 2147483.8f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 1.0f}, new float[]{0.0f, 2147483.8f}, new float[]{0.0f, 0.0f}, new float[]{0.0f, 0.0f}};

    /* JADX INFO: renamed from: k4 */
    private int f1968k4;

    /* JADX INFO: renamed from: x1 */
    private float f1969x1;

    public ColorOperation(int i) {
        m1108k4(i, 0.0f);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m1107k4(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) C14116yg.m67469du((((double) f) + 0.055d) / 1.055d, 2.4d);
    }

    /* JADX INFO: renamed from: x1 */
    public static float m1110x1(float f) {
        double d = f;
        return d <= 0.0031308d ? f / 12.92f : (float) ((C14116yg.m67469du(d, 0.4166666666666667d) * 1.055d) - 0.055d);
    }

    public boolean equals(Object obj) {
        ColorOperation colorOperation = (ColorOperation) C7019kk.m27452k4(obj, ColorOperation.class);
        if (colorOperation == null) {
            return super.equals(obj);
        }
        if (getOperationType() == colorOperation.getOperationType()) {
            return !m1112x1() || getParameter() == colorOperation.getParameter();
        }
        return false;
    }

    @Override // com.aspose.slides.IColorOperation
    public final int getOperationType() {
        return this.f1968k4;
    }

    @Override // com.aspose.slides.IColorOperation
    public final float getParameter() {
        return this.f1969x1;
    }

    public int hashCode() {
        throw new NotImplementedException();
    }

    public ColorOperation(int i, float f) {
        m1108k4(i, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1108k4(int i, float f) {
        float f2;
        float f3;
        this.f1968k4 = i;
        if (i >= 0) {
            float[][] fArr = f1967kk;
            if (i < AbstractC14092to.m67209k4(fArr, 2).m67266du(0)) {
                float[] fArr2 = fArr[this.f1968k4];
                f2 = fArr2[0];
                f3 = fArr2[1];
            } else {
                f2 = 0.0f;
                f3 = 0.0f;
            }
        }
        if (f < f2) {
            f = f2;
        }
        if (f <= f3) {
            f3 = f;
        }
        this.f1969x1 = f3;
    }

    /* JADX INFO: renamed from: x1 */
    public static void m1111x1(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = 1.0f - fArr[0];
        fArr2[0] = 1.0f - fArr2[0];
        fArr3[0] = 1.0f - fArr3[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean m1112x1() {
        float f;
        float f2;
        int i = this.f1968k4;
        if (i >= 0) {
            float[][] fArr = f1967kk;
            if (i < AbstractC14092to.m67209k4(fArr, 2).m67266du(0)) {
                float[] fArr2 = fArr[this.f1968k4];
                f = fArr2[0];
                f2 = fArr2[1];
            } else {
                f = 0.0f;
                f2 = 0.0f;
            }
        }
        return f != f2;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [byte[], float] */
    /* JADX WARN: Type inference failed for: r0v36, types: [float, java.lang.String] */
    /* JADX INFO: renamed from: k4 */
    public final void m1113k4(C14321pz c14321pz) {
        switch (this.f1968k4) {
            case 0:
                float f = 1.0f - this.f1969x1;
                c14321pz.f48208x1 = m1110x1((m1107k4(c14321pz.f48208x1) * this.f1969x1) + f);
                c14321pz.f48206kk = m1110x1((m1107k4(c14321pz.f48206kk) * this.f1969x1) + f);
                c14321pz.f48207to = m1110x1((m1107k4(c14321pz.f48207to) * this.f1969x1) + f);
                break;
            case 1:
                c14321pz.f48208x1 = m1110x1(m1107k4(c14321pz.f48208x1) * this.f1969x1);
                c14321pz.f48206kk = m1110x1(m1107k4(c14321pz.f48206kk) * this.f1969x1);
                c14321pz.f48207to = m1110x1(m1107k4(c14321pz.f48207to) * this.f1969x1);
                break;
            case 2:
                float[] fArr = {c14321pz.f48208x1};
                float[] fArr2 = {c14321pz.f48206kk};
                float[] fArr3 = {c14321pz.f48207to};
                m1109k4(fArr, fArr2, fArr3);
                c14321pz.f48208x1 = fArr[0];
                c14321pz.f48206kk = fArr2[0];
                c14321pz.f48207to = fArr3[0];
                break;
            case 3:
                float[] fArr4 = {c14321pz.f48208x1};
                float[] fArr5 = {c14321pz.f48206kk};
                float[] fArr6 = {c14321pz.f48207to};
                m1111x1(fArr4, fArr5, fArr6);
                c14321pz.f48208x1 = fArr4[0];
                c14321pz.f48206kk = fArr5[0];
                c14321pz.f48207to = fArr6[0];
                break;
            case 4:
                float f2 = (c14321pz.f48206kk * 547.0f) + (c14321pz.f48208x1 * 163.0f);
                ?? messageDigest = MD5.getMessageDigest(c14321pz.f48207to);
                c14321pz.f48208x1 = messageDigest;
                c14321pz.f48206kk = messageDigest;
                c14321pz.f48207to = messageDigest;
                break;
            case 5:
                c14321pz.f48205k4 = this.f1969x1;
                break;
            case 6:
                c14321pz.f48205k4 = C14321pz.m69335kk(c14321pz.f48205k4 + this.f1969x1, 0.0f, 1.0f);
                break;
            case 7:
                c14321pz.f48205k4 = C14321pz.m69335kk(c14321pz.f48205k4 * this.f1969x1, 0.0f, 1.0f);
                break;
            case 8:
                float[] fArr7 = {0.0f};
                float[] fArr8 = {0.0f};
                ColorFormat.m1063k4(c14321pz.f48208x1, c14321pz.f48206kk, c14321pz.f48207to, new float[]{0.0f}, fArr7, fArr8);
                c14321pz.m69340k4(this.f1969x1, fArr7[0], fArr8[0]);
                break;
            case 9:
                float[] fArr9 = {0.0f};
                float[] fArr10 = {0.0f};
                float[] fArr11 = {0.0f};
                ColorFormat.m1063k4(c14321pz.f48208x1, c14321pz.f48206kk, c14321pz.f48207to, fArr9, fArr10, fArr11);
                float f3 = fArr9[0];
                float f4 = fArr10[0];
                float f5 = fArr11[0];
                float f6 = (f3 + this.f1969x1) % 360.0f;
                if (f6 < 0.0f) {
                    f6 += 360.0f;
                }
                c14321pz.m69340k4(f6, f4, f5);
                break;
            case 10:
                float[] fArr12 = {0.0f};
                float[] fArr13 = {0.0f};
                float[] fArr14 = {0.0f};
                ColorFormat.m1063k4(c14321pz.f48208x1, c14321pz.f48206kk, c14321pz.f48207to, fArr12, fArr13, fArr14);
                float f7 = fArr12[0];
                float f8 = fArr13[0];
                float f9 = fArr14[0];
                float f10 = (f7 * this.f1969x1) % 360.0f;
                if (f10 < 0.0f) {
                    f10 += 360.0f;
                }
                c14321pz.m69340k4(f10, f8, f9);
                break;
            case 11:
                float[] fArr15 = {0.0f};
                float[] fArr16 = {0.0f};
                ColorFormat.m1063k4(c14321pz.f48208x1, c14321pz.f48206kk, c14321pz.f48207to, fArr15, new float[]{0.0f}, fArr16);
                c14321pz.m69340k4(fArr15[0], this.f1969x1, fArr16[0]);
                break;
            case 12:
                float f11 = c14321pz.f48208x1;
                boolean z = f11 > 0.0f && f11 < 1.0f && f11 == c14321pz.f48206kk && f11 == c14321pz.f48207to;
                float[] fArr17 = {0.0f};
                float[] fArr18 = {0.0f};
                float[] fArr19 = {0.0f};
                ColorFormat.m1063k4(f11, c14321pz.f48206kk, c14321pz.f48207to, fArr17, fArr18, fArr19);
                c14321pz.m69340k4(fArr17[0], fArr18[0] + this.f1969x1, fArr19[0]);
                if (this.f1969x1 != 0.0f && z) {
                    c14321pz.f48207to = 0.0f;
                    break;
                }
                break;
            case 13:
                float[] fArr20 = {0.0f};
                float[] fArr21 = {0.0f};
                float[] fArr22 = {0.0f};
                ColorFormat.m1063k4(c14321pz.f48208x1, c14321pz.f48206kk, c14321pz.f48207to, fArr20, fArr21, fArr22);
                c14321pz.m69340k4(fArr20[0], fArr21[0] * this.f1969x1, fArr22[0]);
                break;
            case 14:
                float[] fArr23 = {0.0f};
                float[] fArr24 = {0.0f};
                ColorFormat.m1063k4(c14321pz.f48208x1, c14321pz.f48206kk, c14321pz.f48207to, fArr23, fArr24, new float[]{0.0f});
                c14321pz.m69340k4(fArr23[0], fArr24[0], this.f1969x1);
                break;
            case 15:
                float[] fArr25 = {0.0f};
                float[] fArr26 = {0.0f};
                float[] fArr27 = {0.0f};
                ColorFormat.m1063k4(c14321pz.f48208x1, c14321pz.f48206kk, c14321pz.f48207to, fArr25, fArr26, fArr27);
                c14321pz.m69340k4(fArr25[0], fArr26[0], fArr27[0] + this.f1969x1);
                break;
            case 16:
                float[] fArr28 = {0.0f};
                float[] fArr29 = {0.0f};
                float[] fArr30 = {0.0f};
                ColorFormat.m1063k4(c14321pz.f48208x1, c14321pz.f48206kk, c14321pz.f48207to, fArr28, fArr29, fArr30);
                c14321pz.m69340k4(fArr28[0], fArr29[0], fArr30[0] * this.f1969x1);
                break;
            case 17:
                c14321pz.f48208x1 = this.f1969x1;
                break;
            case 18:
                c14321pz.f48208x1 = C14321pz.m69335kk(c14321pz.f48208x1 + this.f1969x1, 0.0f, 1.0f);
                break;
            case 19:
                c14321pz.f48208x1 = C14321pz.m69335kk(c14321pz.f48208x1 * this.f1969x1, 0.0f, 1.0f);
                break;
            case 20:
                c14321pz.f48206kk = this.f1969x1;
                break;
            case 21:
                c14321pz.f48206kk = C14321pz.m69335kk(c14321pz.f48206kk + this.f1969x1, 0.0f, 1.0f);
                break;
            case 22:
                c14321pz.f48206kk = C14321pz.m69335kk(c14321pz.f48206kk * this.f1969x1, 0.0f, 1.0f);
                break;
            case 23:
                c14321pz.f48207to = this.f1969x1;
                break;
            case 24:
                c14321pz.f48207to = C14321pz.m69335kk(c14321pz.f48207to + this.f1969x1, 0.0f, 1.0f);
                break;
            case 25:
                c14321pz.f48207to = C14321pz.m69335kk(c14321pz.f48207to * this.f1969x1, 0.0f, 1.0f);
                break;
            case 26:
                float[] fArr31 = {c14321pz.f48208x1};
                float[] fArr32 = {c14321pz.f48206kk};
                float[] fArr33 = {c14321pz.f48207to};
                C3063jd.m12958k4(fArr31, fArr32, fArr33);
                c14321pz.f48208x1 = fArr31[0];
                c14321pz.f48206kk = fArr32[0];
                c14321pz.f48207to = fArr33[0];
                break;
            case 27:
                float[] fArr34 = {c14321pz.f48208x1};
                float[] fArr35 = {c14321pz.f48206kk};
                float[] fArr36 = {c14321pz.f48207to};
                C3063jd.m12959x1(fArr34, fArr35, fArr36);
                c14321pz.f48208x1 = fArr34[0];
                c14321pz.f48206kk = fArr35[0];
                c14321pz.f48207to = fArr36[0];
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m1109k4(float[] fArr, float[] fArr2, float[] fArr3) {
        float fM67481k4 = C14116yg.m67481k4(fArr[0], C14116yg.m67481k4(fArr2[0], fArr3[0]));
        fArr[0] = fM67481k4 - fArr[0];
        fArr2[0] = fM67481k4 - fArr2[0];
        fArr3[0] = fM67481k4 - fArr3[0];
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m1114k4() {
        int i = this.f1968k4;
        return i >= 5 && i <= 7;
    }
}
