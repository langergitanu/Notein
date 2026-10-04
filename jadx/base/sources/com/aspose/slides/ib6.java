package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p332p7.C8961uk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;

/* JADX INFO: loaded from: classes3.dex */
class ib6 {
    /* JADX INFO: renamed from: k4 */
    public static void m7613k4(Ink ink, InkTrace inkTrace, C8961uk c8961uk) {
        if (c8961uk == null) {
            return;
        }
        inkTrace.m1821k4(c8961uk.m42455k4());
        if (c8961uk.m42464x1() != 0) {
            int iM42464x1 = c8961uk.m42464x1();
            if (iM42464x1 == 2) {
                inkTrace.m1820k4(2);
            } else if (iM42464x1 != 3) {
                inkTrace.m1820k4(1);
            } else {
                inkTrace.m1820k4(3);
            }
        }
        if (c8961uk.m42458kk() != 0) {
            int iM42458kk = c8961uk.m42458kk();
            if (iM42458kk == 1) {
                inkTrace.m1831x1(1);
            } else if (iM42458kk == 2) {
                inkTrace.m1831x1(2);
            } else {
                if (iM42458kk != 3) {
                    throw new NotImplementedException("LoadTraceElementData: Continuation - unknown element.");
                }
                inkTrace.m1831x1(3);
            }
        }
        inkTrace.m1832x1(c8961uk.m42462to());
        inkTrace.m1824kk(c8961uk.m42450du());
        inkTrace.m1827to(c8961uk.m42453h4());
        if (!C14113y2.m67411k4(c8961uk.m42460m9())) {
            inkTrace.m1819k4(C14044b3.m66428k4(c8961uk.m42460m9(), C11697x1.m55250kk()));
        }
        if (!C14113y2.m67411k4(c8961uk.m42452dy())) {
            inkTrace.m1830x1(C14044b3.m66428k4(c8961uk.m42452dy(), C11697x1.m55250kk()));
        }
        inkTrace.m1813du(c8961uk.m42449c5());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7614k4(InkTrace inkTrace, C8961uk c8961uk) {
        c8961uk.m42457k4(inkTrace.m1823kk());
        c8961uk.m42466x1(inkTrace.m1816h4());
        c8961uk.m42459kk(inkTrace.m1825m9());
        c8961uk.m42463to(inkTrace.m1814dy());
        if (inkTrace.m1810c5() != 0.0d) {
            c8961uk.m42451du(C14044b3.m66432k4(inkTrace.m1810c5(), (InterfaceC14073kp) C11697x1.m55250kk()));
        }
        if (inkTrace.m1817jd() != 0.0d) {
            c8961uk.m42454h4(C14044b3.m66432k4(inkTrace.m1817jd(), (InterfaceC14073kp) C11697x1.m55250kk()));
        }
        c8961uk.m42461m9(inkTrace.m1811ck());
        if (inkTrace.m1826to() != 0) {
            int iM1826to = inkTrace.m1826to();
            if (iM1826to == 2) {
                c8961uk.m42456k4(2);
            } else if (iM1826to != 3) {
                c8961uk.m42456k4(1);
            } else {
                c8961uk.m42456k4(3);
            }
        }
        if (inkTrace.m1812du() != 0) {
            int iM1812du = inkTrace.m1812du();
            if (iM1812du == 1) {
                c8961uk.m42465x1(1);
            } else if (iM1812du == 2) {
                c8961uk.m42465x1(2);
            } else {
                if (iM1812du != 3) {
                    return;
                }
                c8961uk.m42465x1(3);
            }
        }
    }
}
