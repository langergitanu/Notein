package com.aspose.slides.internal.p345pu;

import com.aspose.slides.internal.p370qv.AbstractC9947x1;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p475wh.C12003du;
import java.util.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.pu.kk */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9566kk<T extends AbstractC9947x1> extends AbstractC9565k4<T> {
    public AbstractC9566kk(C11906rv c11906rv) {
        super(c11906rv);
    }

    /* JADX INFO: renamed from: k4 */
    public double m46721k4(double d, double d2, double d3) {
        return (d - d2) / (d3 - d2);
    }

    /* JADX INFO: renamed from: x1 */
    public C12003du m46725x1(double d, C12003du c12003du, double d2, double d3) {
        return m46717k4(c12003du, 1.0d - m46721k4(d, d2, d3));
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m46722k4(double d, C12003du c12003du, double d2, double d3) {
        return m46717k4(c12003du, m46721k4(d, d2, d3));
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m46723k4(double d, List<C12003du[]> list, float[] fArr) {
        double dMax = Math.max(0.0d, Math.min(1.0d, d));
        int size = list.size() - 1;
        int length = fArr.length - 1;
        while (length > 0) {
            float f = fArr[length - 1];
            float f2 = fArr[length];
            if (f > f2) {
                f2 = f;
                f = f2;
            }
            double d2 = f;
            if (d2 <= dMax) {
                double d3 = f2;
                if (dMax <= d3) {
                    return m46718k4(list.get(size), m46721k4(dMax, d2, d3));
                }
            }
            length--;
            size--;
        }
        return C12003du.m56396k4(0);
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m46724k4(double d, C12003du[] c12003duArr, float[] fArr) {
        C12003du c12003du;
        double dMax = Math.max(0.0d, Math.min(1.0d, d));
        for (int length = fArr.length - 1; length > 0; length--) {
            int i = length - 1;
            C12003du c12003du2 = c12003duArr[i];
            C12003du c12003du3 = c12003duArr[length];
            float f = fArr[i];
            float f2 = fArr[length];
            if (f > f2) {
                f2 = f;
                f = f2;
                c12003du = c12003du2;
                c12003du2 = c12003du3;
            } else {
                c12003du = c12003du3;
            }
            double d2 = f;
            if (d2 <= dMax) {
                double d3 = f2;
                if (dMax <= d3) {
                    C12003du c12003duM46722k4 = m46722k4(dMax, c12003du, d2, d3);
                    C12003du c12003duM46725x1 = m46725x1(dMax, c12003du2, d2, d3);
                    c12003duM46722k4.m56501c5();
                    c12003duM46725x1.m56501c5();
                    return m46716k4(255, (c12003duM46722k4.m56507jd() & 255) + (c12003duM46725x1.m56507jd() & 255), (c12003duM46722k4.m56502ck() & 255) + (c12003duM46725x1.m56502ck() & 255), (c12003duM46722k4.m56505fa() & 255) + (c12003duM46725x1.m56505fa() & 255));
                }
            }
        }
        return C12003du.m56396k4(0);
    }
}
