package com.aspose.slides.internal.p198j2;

import com.aspose.slides.internal.p420th.C10950bv;
import com.aspose.slides.internal.p420th.C10955du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.j2.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5187k4 {

    /* JADX INFO: renamed from: du */
    private static final double[][] f14145du;

    /* JADX INFO: renamed from: h4 */
    private static final double[][] f14146h4;

    /* JADX INFO: renamed from: k4 */
    private static final double f14147k4;

    /* JADX INFO: renamed from: kk */
    private static final double[][] f14148kk;

    /* JADX INFO: renamed from: to */
    private static final double[][] f14149to;

    /* JADX INFO: renamed from: x1 */
    private static final int[] f14150x1;

    static {
        double dM67496rv = 0.5d - ((C14116yg.m67496rv(2.0d) - 1.0d) * 0.6666666666666666d);
        f14147k4 = dM67496rv;
        f14150x1 = new int[]{0, 3, 1, 3};
        f14148kk = new double[][]{new double[]{0.0d, 0.0d, 0.0d, 0.5d}, new double[]{0.0d, 0.0d, 0.0d, dM67496rv, 0.0d, dM67496rv, 0.0d, 0.0d, 0.0d, 0.5d, 0.0d, 0.0d}, new double[]{1.0d, -0.5d, 0.0d, 0.0d}, new double[]{1.0d, -dM67496rv, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, dM67496rv, 1.0d, 0.0d, 0.0d, 0.5d}};
        f14149to = new double[][]{new double[]{1.0d, -0.5d, 0.0d, 0.0d}, new double[]{1.0d, -dM67496rv, 0.0d, 0.0d, 1.0d, 0.0d, 0.0d, dM67496rv, 1.0d, 0.0d, 0.0d, 0.5d}, new double[]{1.0d, 0.0d, 1.0d, -0.5d}, new double[]{1.0d, 0.0d, 1.0d, -dM67496rv, 1.0d, -dM67496rv, 1.0d, 0.0d, 1.0d, -0.5d, 1.0d, 0.0d}};
        f14145du = new double[][]{new double[]{1.0d, 0.0d, 1.0d, -0.5d}, new double[]{1.0d, 0.0d, 1.0d, -dM67496rv, 1.0d, -dM67496rv, 1.0d, 0.0d, 1.0d, -0.5d, 1.0d, 0.0d}, new double[]{0.0d, 0.5d, 1.0d, 0.0d}, new double[]{0.0d, dM67496rv, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, -dM67496rv, 0.0d, 0.0d, 1.0d, -0.5d}};
        f14146h4 = new double[][]{new double[]{0.0d, 0.5d, 1.0d, 0.0d}, new double[]{0.0d, dM67496rv, 1.0d, 0.0d, 0.0d, 0.0d, 1.0d, -dM67496rv, 0.0d, 0.0d, 1.0d, -0.5d}, new double[]{0.0d, 0.0d, 0.0d, 0.5d}, new double[]{0.0d, 0.0d, 0.0d, dM67496rv, 0.0d, dM67496rv, 0.0d, 0.0d, 0.0d, 0.5d, 0.0d, 0.0d}};
    }

    /* JADX INFO: renamed from: k4 */
    public static C10950bv m22083k4(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        return m22084k4(f14148kk, c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
    }

    /* JADX INFO: renamed from: kk */
    public static C10950bv m22085kk(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        return m22084k4(f14145du, c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
    }

    /* JADX INFO: renamed from: to */
    public static C10950bv m22086to(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        return m22084k4(f14146h4, c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
    }

    /* JADX INFO: renamed from: x1 */
    public static C10950bv m22087x1(C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        return m22084k4(f14149to, c12007ix.Clone(), c12025x6.Clone(), c12025x62.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private static C10950bv m22084k4(double[][] dArr, C12007ix c12007ix, C12025x6 c12025x6, C12025x6 c12025x62) {
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        C10950bv c10950bv = new C10950bv();
        int i = 0;
        while (i <= dArr.length) {
            float[] fArr = new float[6];
            if (i == dArr.length) {
                break;
            }
            double[] dArr2 = dArr[i];
            float fM67504x1 = C14116yg.m67504x1(c12007ix.m56550c5(), i <= 1 ? c12025x6.m56897x1() : c12025x62.m56897x1());
            float fM67504x12 = C14116yg.m67504x1(c12007ix.m56575x1(), i <= 1 ? c12025x6.m56895kk() : c12025x62.m56895kk());
            int i2 = 0;
            int i3 = 0;
            while (i2 < dArr2.length) {
                int i4 = i3 + 1;
                float f = fM67504x12;
                fArr[i3] = (float) ((dArr2[i2 + 1] * ((double) fM67504x1)) + (dArr2[i2] * ((double) c12007ix.m56550c5())) + ((double) c12007ix.m56557jd()));
                i3 += 2;
                fArr[i4] = (float) ((dArr2[i2 + 3] * ((double) f)) + (dArr2[i2 + 2] * ((double) c12007ix.m56575x1())) + ((double) c12007ix.m56551ck()));
                i2 += 4;
                fM67504x12 = f;
                i = i;
            }
            int i5 = i;
            int i6 = f14150x1[i5];
            if (i6 == 0) {
                c12025x6Clone = new C12025x6(fArr[0], fArr[1]);
            } else if (i6 == 1) {
                C12025x6 c12025x63 = new C12025x6(fArr[0], fArr[1]);
                c10950bv.m52900x1(c12025x6Clone.Clone(), c12025x63.Clone());
                c12025x63.CloneTo(c12025x6Clone);
            } else if (i6 == 3) {
                C12025x6 c12025x64 = new C12025x6(fArr[4], fArr[5]);
                C10955du c10955du = new C10955du(c12025x6Clone.Clone(), new C12025x6(fArr[0], fArr[1]), new C12025x6(fArr[2], fArr[3]), c12025x64.Clone());
                c12025x64.CloneTo(c12025x6Clone);
                c10950bv.m52930k4(c10955du);
            }
            i = i5 + 1;
        }
        return c10950bv;
    }
}
