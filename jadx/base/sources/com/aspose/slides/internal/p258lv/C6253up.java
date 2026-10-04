package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p151gj.C4320jd;
import com.aspose.slides.internal.p505xn.C12565ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.up */
/* JADX INFO: loaded from: classes4.dex */
public class C6253up extends C6257wy {
    public C6253up(C6258x1 c6258x1) {
        super(c6258x1);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m25368k4(int i) {
        if (i != 1) {
            if (i == 2) {
                return 0;
            }
            if (i != 17) {
                return i != 18 ? 1 : 0;
            }
        }
        return 2;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m25369x1(int i) {
        if (i != 0) {
            if (i == 2) {
                return 0;
            }
            if (i != 3) {
                return 1;
            }
        }
        return 2;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25370k4(C4320jd c4320jd) {
        m25384h4().m25282k4(1);
        m25384h4().m25293x1((short) C12565ks.m58608k4(c4320jd.m17375x1()));
        m25384h4().m25294x1(m25368k4(c4320jd.m17369kk()), 2, false);
        int iM25369x1 = m25369x1(c4320jd.m17358du());
        m25384h4().m25294x1(iM25369x1, 2, false);
        m25384h4().m25289k4(true, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25294x1(0, 5, false);
        m25384h4().m25289k4(false, false);
        m25384h4().m25294x1(m25368k4(c4320jd.m17373to()), 2, false);
        if (iM25369x1 == 2) {
            m25384h4().m25293x1((short) C12565ks.m58608k4(c4320jd.m17372m9()));
        }
        new C6236du(m25385m9()).m25257x1(c4320jd.m17362h4());
    }
}
