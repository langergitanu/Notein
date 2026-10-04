package com.aspose.slides.internal.p159h0;

import OooOO0.OooO0OO;
import com.aspose.slides.internal.p159h0.AbstractC4434bz;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.h0.w6 */
/* JADX INFO: loaded from: classes.dex */
public class C4479w6 {
    /* JADX INFO: renamed from: k4 */
    public static double m18402k4(double d) {
        return d * 0.017453292519943295d;
    }

    /* JADX INFO: renamed from: x1 */
    public static float m18418x1(float f) {
        return C14116yg.m67504x1(1.0f, C14116yg.m67481k4(0.0f, f));
    }

    /* JADX INFO: renamed from: k4 */
    public static float m18403k4(float f) {
        return (float) (((double) f) * 0.017453292519943295d);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m18404k4(float f, float f2, float f3) {
        return OooO0OO.OooO0O0(f2, f, f3, f);
    }

    /* JADX INFO: renamed from: k4 */
    public static float m18405k4(float f, float... fArr) {
        for (float f2 : fArr) {
            f = C14116yg.m67481k4(f, f2);
        }
        return f;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4443em m18406k4(C4428ai c4428ai, int i, int i2) {
        return new C4443em(C7019kk.m27462to(Float.valueOf((c4428ai.m18044k4() + 1.0f) * i * 0.5f), 13), C7019kk.m27462to(Float.valueOf((1.0f - c4428ai.m18051x1()) * i2 * 0.5f), 13));
    }

    /* JADX INFO: renamed from: k4 */
    public static C4489zj m18407k4(C4489zj c4489zj) {
        return new C4489zj(C14116yg.m67504x1(1.0f, C14116yg.m67481k4(0.0f, c4489zj.m18506k4())), C14116yg.m67504x1(1.0f, C14116yg.m67481k4(0.0f, c4489zj.m18511x1())), C14116yg.m67504x1(1.0f, C14116yg.m67481k4(0.0f, c4489zj.m18508kk())));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18408k4(C4428ai c4428ai, byte[] bArr, int i) {
        bArr[i] = C7019kk.m27442k4(Float.valueOf(m18418x1(c4428ai.m18044k4()) * 255.0f), 13);
        bArr[i + 1] = C7019kk.m27442k4(Float.valueOf(m18418x1(c4428ai.m18051x1()) * 255.0f), 13);
        bArr[i + 2] = C7019kk.m27442k4(Float.valueOf(m18418x1(c4428ai.m18047kk()) * 255.0f), 13);
        bArr[i + 3] = C7019kk.m27442k4(Float.valueOf(m18418x1(c4428ai.m18049to()) * 255.0f), 13);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18409k4(C4428ai[] c4428aiArr, C4428ai[] c4428aiArr2) {
        C4428ai c4428aiClone = c4428aiArr[0].Clone();
        c4428aiArr[0] = c4428aiArr2[0];
        c4428aiArr2[0] = c4428aiClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18410k4(AbstractC4434bz.kk[] kkVarArr, AbstractC4434bz.kk[] kkVarArr2) {
        AbstractC4434bz.kk kkVarClone = kkVarArr[0].Clone();
        kkVarArr[0] = kkVarArr2[0];
        kkVarArr2[0] = kkVarClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18411k4(C4443em[] c4443emArr, C4443em[] c4443emArr2) {
        C4443em c4443emClone = c4443emArr[0].Clone();
        c4443emArr[0] = c4443emArr2[0];
        c4443emArr2[0] = c4443emClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18412k4(C4459os[] c4459osArr, C4459os[] c4459osArr2) {
        C4459os c4459osClone = c4459osArr[0].Clone();
        c4459osArr[0] = c4459osArr2[0];
        c4459osArr2[0] = c4459osClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18413k4(C4489zj[] c4489zjArr, C4489zj[] c4489zjArr2) {
        C4489zj c4489zjClone = c4489zjArr[0].Clone();
        c4489zjArr[0] = c4489zjArr2[0];
        c4489zjArr2[0] = c4489zjClone;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18414k4(Float[] fArr, Float[] fArr2) {
        Float f = ((Float[]) fArr.clone())[0];
        fArr[0] = fArr2[0];
        fArr2[0] = f;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m18415k4(C4459os c4459os, C4459os c4459os2) {
        return m18416k4(c4459os, c4459os2, 0.001f);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m18416k4(C4459os c4459os, C4459os c4459os2, float f) {
        return C14116yg.m67480k4(c4459os.m18285k4() - c4459os2.m18285k4()) < f && C14116yg.m67480k4(c4459os.m18290x1() - c4459os2.m18290x1()) < f;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m18417k4(C4459os c4459os, C4459os c4459os2, C4459os c4459os3, C4459os c4459os4, C4459os[] c4459osArr) {
        c4459osArr[0] = new C4459os(Float.NaN, Float.NaN);
        C4459os c4459osClone = C4459os.m18282x1(c4459os2, c4459os).Clone();
        C4459os c4459osClone2 = C4459os.m18282x1(c4459os4, c4459os3).Clone();
        float fM18290x1 = (c4459osClone2.m18290x1() * c4459osClone.m18285k4()) - (c4459osClone.m18290x1() * c4459osClone2.m18285k4());
        if (fM18290x1 == 0.0f) {
            return false;
        }
        boolean z = fM18290x1 > 0.0f;
        C4459os c4459osClone3 = C4459os.m18282x1(c4459os, c4459os3).Clone();
        float fM18290x12 = (c4459osClone3.m18290x1() * c4459osClone.m18285k4()) - (c4459osClone3.m18285k4() * c4459osClone.m18290x1());
        if ((fM18290x12 < 0.0f) == z) {
            return false;
        }
        float fM18290x13 = (c4459osClone3.m18290x1() * c4459osClone2.m18285k4()) - (c4459osClone3.m18285k4() * c4459osClone2.m18290x1());
        if ((fM18290x13 < 0.0f) == z) {
            return false;
        }
        if ((fM18290x12 > fM18290x1) != z) {
            if ((fM18290x13 > fM18290x1) != z) {
                float f = fM18290x13 / fM18290x1;
                c4459osArr[0] = new C4459os((c4459osClone.m18285k4() * f) + c4459os.m18285k4(), (c4459osClone.m18290x1() * f) + c4459os.m18290x1());
                return true;
            }
        }
        return false;
    }
}
