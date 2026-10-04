package com.aspose.slides.internal.p192iu;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p040bg.C1702x1;
import com.aspose.slides.internal.p102e8.AbstractC3589to;
import com.aspose.slides.internal.p102e8.C3585h4;
import com.aspose.slides.internal.p117ew.C3805du;
import com.aspose.slides.internal.p117ew.C3806h4;
import com.aspose.slides.internal.p117ew.C3808kk;
import com.aspose.slides.internal.p117ew.C3809to;
import com.aspose.slides.internal.p117ew.C3810x1;
import com.aspose.slides.internal.p138fu.C4121ck;
import com.aspose.slides.internal.p349q3.C9723vw;
import com.aspose.slides.internal.p420th.C10951c5;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.C12018u4;

/* JADX INFO: renamed from: com.aspose.slides.internal.iu.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C5131k4 {
    /* JADX INFO: renamed from: du */
    private static void m21989du(C9723vw c9723vw, C3585h4 c3585h4) {
        C3809to.m15216h4(c9723vw, c3585h4);
        m21992k4(c3585h4.m14544s7(), c3585h4);
    }

    /* JADX INFO: renamed from: h4 */
    private static void m21990h4(C9723vw c9723vw, C3585h4 c3585h4) {
        C3805du.m15213h4(c9723vw, c3585h4);
        if (c3585h4.m14534ks() == null) {
            return;
        }
        m21992k4(c3585h4.m14544s7(), c3585h4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m21991k4(C9723vw c9723vw, C3585h4 c3585h4) {
        if (AbstractC3589to.m14681du(c9723vw, c3585h4)) {
            int iM47767v4 = (int) c9723vw.m47767v4();
            if (iM47767v4 == 26) {
                m21989du(c9723vw, c3585h4);
                return;
            }
            if (iM47767v4 == 67) {
                m21990h4(c9723vw, c3585h4);
                return;
            }
            if (iM47767v4 == 75) {
                m21993kk(c9723vw, c3585h4);
                return;
            }
            switch (iM47767v4) {
                case 28:
                    C3806h4.m15214k4(c3585h4);
                    return;
                case 29:
                    m21995x1(c9723vw, c3585h4);
                    return;
                case 30:
                    m21994to(c9723vw, c3585h4);
                    return;
                default:
                    throw new ArgumentException();
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    private static void m21993kk(C9723vw c9723vw, C3585h4 c3585h4) {
        C3810x1.m15217h4(c9723vw, c3585h4);
        m21992k4(c3585h4.m14544s7(), c3585h4);
    }

    /* JADX INFO: renamed from: to */
    private static void m21994to(C9723vw c9723vw, C3585h4 c3585h4) {
        C3808kk.m15215h4(c9723vw, c3585h4);
        m21992k4(c3585h4.m14544s7(), c3585h4);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m21995x1(C9723vw c9723vw, C3585h4 c3585h4) {
        C1702x1.m9148k4(c9723vw, c3585h4);
        m21992k4(c3585h4.m14544s7(), c3585h4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m21992k4(C12018u4 c12018u4, C3585h4 c3585h4) {
        C10951c5 c10951c5 = (C10951c5) c3585h4.m14502k4();
        if (c10951c5.mo52902du() != null) {
            c10951c5 = (C10951c5) c10951c5.m53116um();
        }
        C11913yj c11913yjM14561vj = c3585h4.m14561vj();
        c11913yjM14561vj.m55780m9();
        C12018u4 c12018u4M56768x1 = c12018u4.m56768x1();
        c12018u4M56768x1.m56771x1(c11913yjM14561vj);
        C10951c5 c10951c52 = new C10951c5();
        c10951c52.m52907k4(C4121ck.m16485k4(c12018u4M56768x1));
        c10951c5.m52930k4(c10951c52);
        c3585h4.m14524k4(c10951c52);
    }
}
