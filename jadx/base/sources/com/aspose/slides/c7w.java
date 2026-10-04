package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p407st.C10409du;
import com.aspose.slides.internal.p407st.C10555n4;
import com.aspose.slides.internal.p407st.C10561ni;

/* JADX INFO: loaded from: classes3.dex */
class c7w {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f4290k4 = new C7017h4("tgtEl", "tn", "rtn");

    /* JADX INFO: renamed from: k4 */
    private static byte m4508k4(long j) {
        switch ((int) j) {
            case 1:
                return (byte) 0;
            case 2:
            case 6:
            case 8:
            default:
                return (byte) -1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 7:
                return (byte) 6;
            case 9:
                return (byte) 8;
            case 10:
                return (byte) 9;
            case 11:
                return (byte) 10;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static long m4509k4(byte b) {
        if (b == 0) {
            return 1L;
        }
        if (b == 6) {
            return 7L;
        }
        if (b == 2) {
            return 3L;
        }
        if (b == 3) {
            return 4L;
        }
        if (b == 4) {
            return 5L;
        }
        switch (b) {
            case 8:
                return 9L;
            case 9:
                return 10L;
            case 10:
                return 11L;
            default:
                return 0L;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4510k4(com.aspose.slides.internal.p332p7.bnx bnxVar, C10409du c10409du, int i, gi8 gi8Var) {
        if (bnxVar == null) {
            return;
        }
        C10561ni c10561ni = new C10561ni(i);
        c10409du.m50513yj().addItem(c10561ni);
        m4511k4(bnxVar, c10561ni);
        if (bnxVar.m29013kk() == null || !"tgtEl".equals(bnxVar.m29013kk().m29539k4())) {
            return;
        }
        fut.m6322k4((com.aspose.slides.internal.p332p7.ycb) bnxVar.m29013kk().m29542x1(), c10561ni, gi8Var);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m4511k4(com.aspose.slides.internal.p332p7.bnx bnxVar, C10561ni c10561ni) {
        long jM43241k4;
        C10555n4 c10555n4 = new C10555n4();
        c10561ni.m50513yj().addItem(c10555n4);
        if (bnxVar.m29013kk() != null) {
            int iM27428k4 = f4290k4.m27428k4(bnxVar.m29013kk().m29539k4());
            if (iM27428k4 != 0) {
                if (iM27428k4 != 1) {
                    if (iM27428k4 == 2) {
                        c10555n4.m51350k4(3);
                        jM43241k4 = 2;
                    }
                    c10555n4.m51350k4(0);
                } else {
                    c10555n4.m51350k4(2);
                    jM43241k4 = ((long) ((com.aspose.slides.internal.p332p7.vsk) bnxVar.m29013kk().m29542x1()).m43241k4()) & 4294967295L;
                }
                c10555n4.m51356x1(jM43241k4);
            } else {
                c10555n4.m51350k4(1);
            }
        } else {
            c10555n4.m51350k4(0);
        }
        c10555n4.m51351k4(m4509k4(bnxVar.m29010k4()));
        c10555n4.m51355x1(ubb.m71602k4(C13670j2.m63183k4(bnxVar.m29014x1())));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m4512k4(com.aspose.slides.internal.p332p7.bnx bnxVar, C10561ni c10561ni, m4c m4cVar) {
        if (c10561ni == null || c10561ni.m51371x1() == null) {
            return;
        }
        if (c10561ni.m51371x1().m51354x1() == 1 && c10561ni.m51370to() != null) {
            fut.m6324k4((com.aspose.slides.internal.p332p7.ycb) bnxVar.m29011k4("tgtEl").m29542x1(), c10561ni.m51370to().m50973x1(), m4cVar);
        } else if (c10561ni.m51371x1().m51354x1() == 3) {
            ((com.aspose.slides.internal.p332p7.fdb) bnxVar.m29011k4("rtn").m29542x1()).m31747k4(3);
        } else if (c10561ni.m51371x1().m51354x1() == 2) {
            ((com.aspose.slides.internal.p332p7.vsk) bnxVar.m29011k4("tn").m29542x1()).m43242k4((int) c10561ni.m51371x1().m51353to());
        }
        bnxVar.m29012k4(m4508k4(c10561ni.m51371x1().m51352kk()));
        bnxVar.m29015x1(ubb.m71630x1(c10561ni.m51371x1().m51349du() / 1000.0f));
    }
}
