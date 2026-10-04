package com.aspose.slides.internal.p271mc;

import com.aspose.slides.internal.p128fc.C3924ck;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p492x4.C12380dy;
import com.aspose.slides.internal.p492x4.C12385to;
import com.aspose.slides.internal.p506xo.AbstractC12580du;
import com.aspose.slides.internal.p506xo.AbstractC12588to;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.mc.up */
/* JADX INFO: loaded from: classes4.dex */
public class C6370up {

    /* JADX INFO: renamed from: du */
    private C12007ix f18153du = new C12007ix();

    /* JADX INFO: renamed from: k4 */
    private final C3924ck[] f18154k4;

    /* JADX INFO: renamed from: kk */
    private boolean f18155kk;

    /* JADX INFO: renamed from: to */
    private boolean f18156to;

    /* JADX INFO: renamed from: x1 */
    private String f18157x1;

    public C6370up(C3924ck[] c3924ckArr) {
        this.f18154k4 = c3924ckArr;
        C6765kp c6765kp = new C6765kp();
        C12007ix c12007ixClone = C12007ix.f40519k4.Clone();
        for (C3924ck c3924ck : c3924ckArr) {
            C12007ix c12007ix = new C12007ix(c3924ck.m15646k4(), c3924ck.m15652x1(), c3924ck.m15651to(), c3924ck.m15649kk());
            if (!C12007ix.m56546kk(c12007ixClone, C12007ix.f40519k4)) {
                c12007ix = C12007ix.m56549x1(c12007ixClone.Clone(), c12007ix.Clone());
            }
            c12007ix.CloneTo(c12007ixClone);
            c6765kp.m26792k4(c3924ck.m15650m9());
        }
        m26176k4(c12007ixClone.Clone());
        m26177k4(c6765kp.toString());
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m26180c5() {
        return this.f18156to;
    }

    /* JADX INFO: renamed from: ck */
    public final C12007ix m26181ck() {
        return this.f18153du.Clone();
    }

    /* JADX INFO: renamed from: du */
    public final String m26182du() {
        String strM26178kk;
        String str = C14113y2.f47374k4;
        AbstractC12580du abstractC12580duM58776x6 = m26190x1().m58776x6();
        return (abstractC12580duM58776x6 == null || (strM26178kk = m26178kk(abstractC12580duM58776x6.mo58728dy())) == null) ? m26189to() : strM26178kk;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m26183dy() {
        return this.f18155kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m26184h4() {
        AbstractC12580du abstractC12580duM58776x6 = m26190x1().m58776x6();
        return abstractC12580duM58776x6 != null && C14116yg.m67480k4(abstractC12580duM58776x6.mo58730jd()) > 0.01f;
    }

    /* JADX INFO: renamed from: jd */
    public final float m26185jd() {
        C3924ck[] c3924ckArr = this.f18154k4;
        if (c3924ckArr == null || c3924ckArr.length <= 0) {
            return 0.0f;
        }
        return c3924ckArr[0].m15644h4();
    }

    /* JADX INFO: renamed from: k4 */
    public final String m26186k4() {
        return this.f18157x1;
    }

    /* JADX INFO: renamed from: kk */
    public final C12003du m26187kk() {
        C3924ck[] c3924ckArr = this.f18154k4;
        if (c3924ckArr != null) {
            return (c3924ckArr.length > 0 ? c3924ckArr[0].m15643dy() : C12003du.m56460uz()).Clone();
        }
        return C12003du.m56460uz();
    }

    /* JADX INFO: renamed from: m9 */
    public final boolean m26188m9() {
        AbstractC12580du abstractC12580duM58776x6 = m26190x1().m58776x6();
        return abstractC12580duM58776x6 != null && abstractC12580duM58776x6.mo58726ck() > 699.0f;
    }

    /* JADX INFO: renamed from: to */
    public final String m26189to() {
        C3924ck[] c3924ckArr = this.f18154k4;
        if (c3924ckArr == null || c3924ckArr.length <= 0) {
            return null;
        }
        return m26179x1(c3924ckArr[0].m15642du().m58769ks());
    }

    /* JADX INFO: renamed from: x1 */
    public final AbstractC12588to m26190x1() {
        C3924ck[] c3924ckArr = this.f18154k4;
        if (c3924ckArr == null || c3924ckArr.length <= 0) {
            return null;
        }
        return c3924ckArr[0].m15642du();
    }

    /* JADX INFO: renamed from: k4 */
    private void m26176k4(C12007ix c12007ix) {
        this.f18153du = c12007ix.Clone();
    }

    /* JADX INFO: renamed from: kk */
    private static String m26178kk(String str) {
        if (str == null) {
            return null;
        }
        String strM67400k4 = C14113y2.f47374k4;
        Iterator<C12385to> it = C12380dy.m57979x1(str, "(MT)|([A-Z]+(?=Bold))|([A-Z]+[a-z]*)").iterator();
        while (it.hasNext()) {
            try {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14113y2.m67408k4(it.next().mo57995kk(), " "));
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    ((IDisposable) it).dispose();
                }
            }
        }
        return strM67400k4.length() > 0 ? C14113y2.m67396k4(strM67400k4, strM67400k4.length() - 1, 1) : strM67400k4;
    }

    /* JADX INFO: renamed from: x1 */
    private static String m26179x1(String str) {
        if (C14113y2.m67359c5(str, "+")) {
            str = C14113y2.m67414k4(str, '+')[1];
        }
        return m26178kk(C14113y2.m67401k4(str, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR, " "));
    }

    /* JADX INFO: renamed from: k4 */
    private void m26177k4(String str) {
        this.f18157x1 = str;
    }
}
