package com.aspose.slides.internal.p078db;

import com.aspose.slides.internal.p127fb.C3914k4;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;
import java.lang.reflect.Array;

/* JADX INFO: renamed from: com.aspose.slides.internal.db.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C3118k4 {
    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13293k4(C12009k4 c12009k4, double[][] dArr, float f) {
        return m13294k4(c12009k4, dArr, f, 1.0d, 0);
    }

    /* JADX INFO: renamed from: k4 */
    public static C12009k4 m13294k4(C12009k4 c12009k4, double[][] dArr, float f, double d, int i) {
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, 2498570);
        int iM15716k4 = c3983k4M56597k4.m15716k4() * c3983k4M56597k4.m15715du();
        byte[] bArr = new byte[iM15716k4];
        int iM15716k42 = c3983k4M56597k4.m15716k4() * c3983k4M56597k4.m15715du();
        byte[] bArr2 = new byte[iM15716k42];
        C3914k4.m15618k4(c3983k4M56597k4.m15721to(), bArr, 0, iM15716k4);
        c12009k4.m56605k4(c3983k4M56597k4);
        int iM67266du = AbstractC14092to.m67209k4(dArr, 2).m67266du(1);
        AbstractC14092to.m67209k4(dArr, 2).m67266du(0);
        int i2 = (iM67266du - 1) / 2;
        for (int i3 = i2; i3 < c12009k4.mo15757m9() - i2; i3++) {
            int i4 = i2;
            while (i4 < c12009k4.mo15760yj() - i2) {
                int iM15715du = (i4 * 4) + (c3983k4M56597k4.m15715du() * i3);
                int i5 = -i2;
                double d2 = 0.0d;
                double d3 = 0.0d;
                double d4 = 0.0d;
                double d5 = 0.0d;
                for (int i6 = i5; i6 <= i2; i6++) {
                    int i7 = i5;
                    while (i7 <= i2) {
                        int iM15715du2 = (c3983k4M56597k4.m15715du() * i6) + (i7 * 4) + iM15715du;
                        double d6 = bArr[iM15715du2] & 255;
                        double d7 = dArr[i6 + i2][i7 + i2];
                        d2 = (d6 * d7) + d2;
                        d3 = (((double) (bArr[iM15715du2 + 1] & 255)) * d7) + d3;
                        d4 = (((double) (bArr[iM15715du2 + 2] & 255)) * d7) + d4;
                        d5 = (((double) (bArr[iM15715du2 + 3] & 255)) * d7) + d5;
                        i7++;
                        bArr2 = bArr2;
                    }
                }
                byte[] bArr3 = bArr2;
                double d8 = i;
                double d9 = (d2 * d) + d8;
                double d10 = (d3 * d) + d8;
                double d11 = (d4 * d) + d8;
                double d12 = (d5 * d) + d8;
                if (d9 > 255.0d) {
                    d9 = 255.0d;
                } else if (d9 < 0.0d) {
                    d9 = 0.0d;
                }
                if (d10 > 255.0d) {
                    d10 = 255.0d;
                } else if (d10 < 0.0d) {
                    d10 = 0.0d;
                }
                if (d11 > 255.0d) {
                    d11 = 255.0d;
                } else if (d11 < 0.0d) {
                    d11 = 0.0d;
                }
                double d13 = d12 > 255.0d ? 255.0d : d12 < 0.0d ? 0.0d : d12;
                bArr3[iM15715du] = C7019kk.m27442k4(Double.valueOf(d9), 14);
                bArr3[iM15715du + 1] = C7019kk.m27442k4(Double.valueOf(d10), 14);
                bArr3[iM15715du + 2] = C7019kk.m27442k4(Double.valueOf(d11), 14);
                bArr3[iM15715du + 3] = C7019kk.m27442k4(Double.valueOf(d13 * ((double) f)), 14);
                i4++;
                bArr = bArr;
                bArr2 = bArr3;
            }
        }
        C12009k4 c12009k42 = new C12009k4(c12009k4.mo15760yj(), c12009k4.mo15757m9());
        C3983k4 c3983k4M56597k42 = c12009k42.m56597k4(new C12014ne(0, 0, c12009k42.mo15760yj(), c12009k42.mo15757m9()), 2, 2498570);
        C3914k4.m15621k4(bArr2, 0, c3983k4M56597k42.m15721to(), iM15716k42);
        c12009k42.m56605k4(c3983k4M56597k42);
        return c12009k42;
    }

    /* JADX INFO: renamed from: k4 */
    public static double[][] m13295k4(int i, double d) {
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i, i);
        int i2 = i / 2;
        double d2 = 2.0d;
        double dM67469du = 1.0d / (C14116yg.m67469du(d, 2.0d) * 6.283185307179586d);
        int i3 = -i2;
        double d3 = 0.0d;
        for (int i4 = i3; i4 <= i2; i4++) {
            int i5 = i3;
            while (i5 <= i2) {
                double d4 = d2;
                int i6 = i4 + i2;
                int i7 = i5 + i2;
                dArr[i6][i7] = C14116yg.m67500up(-(((double) ((i4 * i4) + (i5 * i5))) / ((d * d) * d4))) * dM67469du;
                d3 += dArr[i6][i7];
                i5++;
                d2 = d4;
            }
        }
        for (int i8 = 0; i8 < i; i8++) {
            for (int i9 = 0; i9 < i; i9++) {
                double[] dArr2 = dArr[i8];
                dArr2[i9] = (1.0d / d3) * dArr2[i9];
            }
        }
        return dArr;
    }
}
