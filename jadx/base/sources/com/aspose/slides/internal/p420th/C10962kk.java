package com.aspose.slides.internal.p420th;

import androidx.datastore.preferences.protobuf.C21825OoooOO0;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.th.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C10962kk {

    /* JADX INFO: renamed from: k4 */
    private int f38193k4;

    /* JADX INFO: renamed from: x1 */
    private double[] f38194x1 = new double[4];

    /* JADX INFO: renamed from: k4 */
    private static double m52960k4(double d, double d2) {
        return (d2 * 3.0d) - (d * 3.0d);
    }

    /* JADX INFO: renamed from: kk */
    private List<C12025x6> m52967kk(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        List<C12025x6> list = new List<>();
        list.addItem(c12025x6.Clone());
        list.addItem(c12025x64.Clone());
        for (int i = 0; i < this.f38193k4; i++) {
            double d = this.f38194x1[i];
            list.addItem(new C12025x6((float) m52963k4(c12025x6.m56897x1(), c12025x62.m56897x1(), c12025x63.m56897x1(), c12025x64.m56897x1(), d), (float) m52963k4(c12025x6.m56895kk(), c12025x62.m56895kk(), c12025x63.m56895kk(), c12025x64.m56895kk(), d)).Clone());
        }
        return list;
    }

    /* JADX INFO: renamed from: x1 */
    private static double m52969x1(double d, double d2, double d3) {
        return C21825OoooOO0.OooO00o(d, 4.0d, d3, C14116yg.m67469du(d2, 2.0d));
    }

    /* JADX INFO: renamed from: k4 */
    private static double m52961k4(double d, double d2, double d3) {
        return (d * 6.0d) + ((d3 * 6.0d) - (d2 * 12.0d));
    }

    /* JADX INFO: renamed from: kk */
    private void m52968kk(double d, double d2, double d3) {
        double d4;
        boolean z;
        double dM52964k4;
        double dM52969x1 = m52969x1(d, d2, d3);
        if (dM52969x1 < 0.0d) {
            return;
        }
        if (d != 0.0d) {
            if (dM52969x1 == 0.0d) {
                z = true;
                d4 = d;
            } else {
                d4 = d;
                m52966k4(m52964k4(d4, d2, d3, true));
                z = false;
            }
            dM52964k4 = m52964k4(d4, d2, d3, z);
        } else if (d2 == 0.0d) {
            return;
        } else {
            dM52964k4 = (-d3) / d2;
        }
        m52966k4(dM52964k4);
    }

    /* JADX INFO: renamed from: x1 */
    private void m52970x1(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        double dM52962k4 = m52962k4(c12025x6.m56897x1(), c12025x62.m56897x1(), c12025x63.m56897x1(), c12025x64.m56897x1());
        double dM52961k4 = m52961k4(c12025x6.m56897x1(), c12025x62.m56897x1(), c12025x63.m56897x1());
        double dM52960k4 = m52960k4(c12025x6.m56897x1(), c12025x62.m56897x1());
        double dM52962k42 = m52962k4(c12025x6.m56895kk(), c12025x62.m56895kk(), c12025x63.m56895kk(), c12025x64.m56895kk());
        double dM52961k42 = m52961k4(c12025x6.m56895kk(), c12025x62.m56895kk(), c12025x63.m56895kk());
        double dM52960k42 = m52960k4(c12025x6.m56895kk(), c12025x62.m56895kk());
        m52968kk(dM52962k4, dM52961k4, dM52960k4);
        m52968kk(dM52962k42, dM52961k42, dM52960k42);
    }

    /* JADX INFO: renamed from: k4 */
    private static double m52962k4(double d, double d2, double d3, double d4) {
        return ((d2 * 9.0d) + ((d4 * 3.0d) - (d3 * 9.0d))) - (d * 3.0d);
    }

    /* JADX INFO: renamed from: k4 */
    private static double m52963k4(double d, double d2, double d3, double d4, double d5) {
        double d6 = d3 * 3.0d;
        double d7 = d2 * 3.0d;
        double dM67469du = C14116yg.m67469du(d5, 3.0d) * (((d4 - d6) + d7) - d);
        double d8 = 3.0d * d;
        return ((d7 - d8) * d5) + (C14116yg.m67469du(d5, 2.0d) * ((d6 - (d2 * 6.0d)) + d8)) + dM67469du + d;
    }

    /* JADX INFO: renamed from: k4 */
    private static double m52964k4(double d, double d2, double d3, boolean z) {
        return ((C14116yg.m67496rv(m52969x1(d, d2, d3)) * (z ? 1.0d : -1.0d)) + (-d2)) / (d * 2.0d);
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m52965k4(List<C12025x6> list) {
        List.Enumerator<C12025x6> it = list.iterator();
        float fM67504x1 = Float.MAX_VALUE;
        float fM67481k4 = -3.4028235E38f;
        float fM67481k42 = -3.4028235E38f;
        float fM67504x12 = Float.MAX_VALUE;
        while (it.hasNext()) {
            try {
                C12025x6 next = it.next();
                fM67504x1 = C14116yg.m67504x1(next.m56897x1(), fM67504x1);
                fM67504x12 = C14116yg.m67504x1(next.m56895kk(), fM67504x12);
                fM67481k4 = C14116yg.m67481k4(next.m56897x1(), fM67481k4);
                fM67481k42 = C14116yg.m67481k4(next.m56895kk(), fM67481k42);
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return new C12007ix(fM67504x1, fM67504x12, fM67481k4 - fM67504x1, fM67481k42 - fM67504x12);
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m52971k4(C10955du c10955du) {
        if (c10955du == null) {
            return C12007ix.f40519k4;
        }
        C10969to c10969toClone = c10955du.m52919k4().Clone();
        return m52972k4(c10969toClone.m53050k4().Clone(), c10969toClone.m53057x1().Clone(), c10969toClone.m53053kk().Clone(), c10969toClone.m53055to().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final C12007ix m52972k4(C12025x6 c12025x6, C12025x6 c12025x62, C12025x6 c12025x63, C12025x6 c12025x64) {
        if (C12025x6.m56883k4(c12025x6, c12025x62) && C12025x6.m56883k4(c12025x6, c12025x63) && C12025x6.m56883k4(c12025x6, c12025x64)) {
            return new C12007ix(c12025x6.Clone(), C12015qq.f40552k4.Clone());
        }
        this.f38193k4 = 0;
        m52970x1(c12025x6.Clone(), c12025x62.Clone(), c12025x63.Clone(), c12025x64.Clone());
        return m52965k4(m52967kk(c12025x6.Clone(), c12025x62.Clone(), c12025x63.Clone(), c12025x64.Clone()));
    }

    /* JADX INFO: renamed from: k4 */
    private void m52966k4(double d) {
        if (d < 0.0d || 1.0d < d) {
            return;
        }
        double[] dArr = this.f38194x1;
        int i = this.f38193k4;
        dArr[i] = d;
        this.f38193k4 = i + 1;
    }
}
