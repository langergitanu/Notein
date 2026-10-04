package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;

/* JADX INFO: loaded from: classes3.dex */
class sim {

    /* JADX INFO: renamed from: k4 */
    private double f48859k4;

    /* JADX INFO: renamed from: x1 */
    private double f48860x1;

    public sim(C0886d8 c0886d8, C14365qy c14365qy, double d) {
        if (c0886d8 == null) {
            throw new ArgumentException("chartPoint is null");
        }
        if (c14365qy == null) {
            throw new ArgumentException("renderContext is null");
        }
        m70649k4(c0886d8, c14365qy, d);
    }

    /* JADX INFO: renamed from: k4 */
    public final double m70650k4() {
        return this.f48859k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final double m70651x1() {
        return this.f48860x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m70648k4(List<C13847mr> list, int i, double[] dArr, double[] dArr2) {
        dArr[0] = 0.0d;
        dArr2[0] = 0.0d;
        for (int i2 = 0; i2 < list.size(); i2++) {
            double dM4989k4 = list.get_Item(i2).m64944dy().get_Item(i).m4989k4();
            if (dM4989k4 > 0.0d) {
                dArr[0] = dArr[0] + dM4989k4;
            }
            if (dM4989k4 < 0.0d) {
                dArr2[0] = dArr2[0] + dM4989k4;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m70649k4(C0886d8 c0886d8, C14365qy c14365qy, double d) {
        double d2;
        C13847mr c13847mrM5012up = c0886d8.m5012up();
        C13847mr c13847mr = c14365qy.m69865up().get_Item(0);
        int iM72789k4 = C14743wm.m72789k4(c14365qy.m69865up());
        double dM73410ne = iM72789k4 == 1 ? c14365qy.m69863u4().m73410ne() : iM72789k4 == 2 ? c14365qy.m69863u4().m73389ix() : 0.0d;
        double[] dArr = {0.0d};
        double[] dArr2 = {0.0d};
        m70648k4(c13847mrM5012up.m64941c5().m69865up(), c0886d8.m5007rv(), dArr, dArr2);
        double d3 = dArr[0];
        double d4 = dArr2[0];
        double d5 = 1.0d;
        if (c0886d8.m4989k4() == 0.0d) {
            d2 = 1.0d;
        } else if (c0886d8.m4989k4() > 0.0d) {
            double dM4989k4 = c0886d8.m4989k4();
            if (c13847mrM5012up == c13847mr) {
                dM4989k4 -= dM73410ne;
            }
            d2 = d3 == 0.0d ? 1.0d : (d3 - d) / (d3 - dM73410ne);
            if (d3 != 0.0d) {
                d5 = (d3 - (d - dM4989k4)) / (d3 - dM73410ne);
            }
        } else {
            double dM4989k42 = c0886d8.m4989k4();
            if (c13847mrM5012up == c13847mr) {
                dM4989k42 -= dM73410ne;
            }
            d2 = d4 == 0.0d ? 1.0d : (d4 - d) / (d4 - dM73410ne);
            if (d4 != 0.0d) {
                d5 = (d4 - (d - dM4989k42)) / (d4 - dM73410ne);
            }
        }
        this.f48859k4 = d5;
        this.f48860x1 = d2;
    }
}
