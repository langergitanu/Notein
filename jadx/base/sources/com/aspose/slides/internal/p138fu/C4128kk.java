package com.aspose.slides.internal.p138fu;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p083di.C3165x1;
import com.aspose.slides.internal.p129fe.C3976c5;
import com.aspose.slides.internal.p129fe.C3984kk;
import com.aspose.slides.internal.p129fe.C3990x1;
import com.aspose.slides.internal.p151gj.AbstractC4326to;
import com.aspose.slides.internal.p151gj.C4314c5;
import com.aspose.slides.internal.p151gj.C4316du;
import com.aspose.slides.internal.p151gj.C4318fa;
import com.aspose.slides.internal.p151gj.C4324m9;
import com.aspose.slides.internal.p151gj.C4327up;
import com.aspose.slides.internal.p151gj.C4328x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p420th.AbstractC10973uz;
import com.aspose.slides.internal.p472w8.C11900jd;
import com.aspose.slides.internal.p472w8.C11902kk;
import com.aspose.slides.internal.p472w8.C11906rv;
import com.aspose.slides.internal.p472w8.C11909up;
import com.aspose.slides.internal.p472w8.C11911x1;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.fu.kk */
/* JADX INFO: loaded from: classes.dex */
public class C4128kk {
    /* JADX INFO: renamed from: k4 */
    private static C11902kk m16552k4(AbstractC4326to abstractC4326to, boolean z) {
        C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), abstractC4326to.m17409x1().length));
        float[] fArr = new float[abstractC4326to.m17409x1().length];
        for (int i = 0; i < abstractC4326to.m17409x1().length; i++) {
            abstractC4326to.m17409x1()[i].m17353k4().m23101k4().CloneTo(c12003duArr[i]);
            fArr[i] = abstractC4326to.m17409x1()[i].m17355x1();
        }
        C11902kk c11902kk = new C11902kk();
        c11902kk.m55667k4(c12003duArr);
        c11902kk.m55666k4(fArr);
        return c11902kk;
    }

    /* JADX INFO: renamed from: x1 */
    private static void m16562x1(C4327up c4327up, C3976c5 c3976c5) {
        if (c4327up.m17414kk() == -3.4028235E38f) {
            return;
        }
        C3984kk c3984kk = new C3984kk();
        c3984kk.m15732k4(3, 3, c4327up.m17414kk());
        c3976c5.m15667k4(c3984kk, 0, 1);
    }

    /* JADX INFO: renamed from: k4 */
    private static C11911x1 m16553k4(AbstractC4326to abstractC4326to) {
        C11911x1 c11911x1 = new C11911x1();
        c11911x1.m55742k4(abstractC4326to.m17407to());
        c11911x1.m55746x1(abstractC4326to.m17406kk());
        return c11911x1;
    }

    /* JADX INFO: renamed from: k4 */
    private static C12007ix m16554k4(C4327up c4327up, AbstractC12002ck abstractC12002ck) {
        return C12007ix.m56546kk(c4327up.m17410du(), C12007ix.f40519k4) ? new C12007ix(0.0f, 0.0f, abstractC12002ck.mo15760yj(), abstractC12002ck.mo15757m9()) : c4327up.m17410du();
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC12024x1 m16555k4(C4314c5 c4314c5) {
        C3165x1 c3165x1 = new C3165x1();
        c3165x1.m53112x1((AbstractC10973uz) c4314c5.m17301h4());
        C11906rv c11906rv = new C11906rv(c3165x1.m13532x1());
        c11906rv.m55693k4(c4314c5.m17306m9().Clone());
        if (c4314c5.m17298c5() != null) {
            c11906rv.m55692k4(c4314c5.m17298c5().m23101k4().Clone());
        }
        c11906rv.m55699to(C4123dy.m16495k4(c4314c5.m17385fa()));
        c11906rv.m55689k4(c4314c5.m17388up());
        if (c4314c5.m17407to() != null) {
            c11906rv.m55691k4(m16553k4((AbstractC4326to) c4314c5));
        }
        if (c4314c5.m17409x1() != null) {
            c11906rv.m55690k4(m16552k4((AbstractC4326to) c4314c5, true));
        }
        if (c4314c5.m17300dy() != null) {
            C12003du[] c12003duArr = (C12003du[]) AbstractC14092to.m67212k4(AbstractC14092to.m67205k4(C7019kk.m27443k4((Class<?>) C12003du.class), c4314c5.m17300dy().length));
            for (int i = 0; i < c4314c5.m17300dy().length; i++) {
                c4314c5.m17300dy()[i].m23101k4().CloneTo(c12003duArr[i]);
            }
            c11906rv.m55694k4(c12003duArr);
        }
        return c11906rv;
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC12024x1 m16556k4(C4316du c4316du) {
        return new C11900jd(c4316du.m17317x1(), c4316du.m17315kk().m23101k4().Clone(), c4316du.m17316to().m23101k4().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC12024x1 m16557k4(C4318fa c4318fa) {
        return new C11999ar(c4318fa.m17352x1().m23101k4().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC12024x1 m16558k4(C4324m9 c4324m9) {
        C11909up c11909up;
        if (!c4324m9.m17394jd().m56894k4() && !c4324m9.m17390ck().m56894k4()) {
            C12025x6 c12025x6Clone = c4324m9.m17394jd().Clone();
            C12025x6 c12025x6Clone2 = c4324m9.m17390ck().Clone();
            if (C14116yg.m67480k4(c12025x6Clone.m56897x1() - c12025x6Clone2.m56897x1()) < 0.001f && C14116yg.m67480k4(c12025x6Clone.m56895kk() - c12025x6Clone2.m56895kk()) < 0.001f) {
                c12025x6Clone2 = new C12025x6(c12025x6Clone2.m56897x1() + 0.1f, c12025x6Clone2.m56895kk());
            }
            c11909up = new C11909up(c12025x6Clone.Clone(), c12025x6Clone2.Clone(), c4324m9.m17393h4().m23101k4().Clone(), c4324m9.m17399m9().m23101k4().Clone());
            c11909up.m55730kk(new C11913yj());
        } else if (C14116yg.m67480k4(c4324m9.m17391du().m56575x1()) < 0.5d || C14116yg.m67480k4(c4324m9.m17391du().m56550c5()) < 0.5d) {
            C12025x6 c12025x6Clone3 = c4324m9.m17391du().m56552du().Clone();
            c11909up = new C11909up(c12025x6Clone3.Clone(), new C12025x6(c4324m9.m17391du().m56550c5() + c12025x6Clone3.m56897x1(), c4324m9.m17391du().m56575x1() + c12025x6Clone3.m56895kk()).Clone(), c4324m9.m17393h4().m23101k4().Clone(), c4324m9.m17399m9().m23101k4().Clone());
        } else {
            c11909up = new C11909up(c4324m9.m17391du().Clone(), c4324m9.m17393h4().m23101k4().Clone(), c4324m9.m17399m9().m23101k4().Clone(), (float) c4324m9.m17389c5(), c4324m9.m17392dy());
        }
        c11909up.m55735to(C4123dy.m16495k4(c4324m9.m17385fa()));
        c11909up.m55725k4(c4324m9.m17388up());
        if (c4324m9.m17407to() != null) {
            c11909up.m55727k4(m16553k4((AbstractC4326to) c4324m9));
        }
        if (c4324m9.m17409x1() != null) {
            c11909up.m55726k4(m16552k4((AbstractC4326to) c4324m9, false));
        }
        return c11909up;
    }

    /* JADX INFO: renamed from: k4 */
    private static AbstractC12024x1 m16559k4(C4327up c4327up) {
        C3976c5 c3976c5 = new C3976c5();
        m16561k4(c4327up, c3976c5);
        m16562x1(c4327up, c3976c5);
        AbstractC12002ck abstractC12002ckM17411h4 = c4327up.m17411h4();
        C12012lr c12012lr = new C12012lr(abstractC12002ckM17411h4, m16554k4(c4327up, abstractC12002ckM17411h4).Clone().Clone(), c3976c5);
        try {
            c12012lr.m56623kk(C4123dy.m16495k4(c4327up.m17385fa()));
        } catch (RuntimeException unused) {
        }
        c12012lr.m56620k4(c4327up.m17388up());
        return c12012lr;
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12024x1 m16560k4(C4328x1 c4328x1) {
        int iM17417k4 = c4328x1.m17417k4();
        if (iM17417k4 == 0) {
            return m16557k4((C4318fa) c4328x1);
        }
        if (iM17417k4 == 1) {
            return m16556k4((C4316du) c4328x1);
        }
        if (iM17417k4 == 2) {
            return m16559k4((C4327up) c4328x1);
        }
        if (iM17417k4 == 3) {
            return m16558k4((C4324m9) c4328x1);
        }
        if (iM17417k4 == 4) {
            return m16555k4((C4314c5) c4328x1);
        }
        throw new InvalidOperationException("Unknown brush type.");
    }

    /* JADX INFO: renamed from: k4 */
    private static void m16561k4(C4327up c4327up, C3976c5 c3976c5) {
        if (c4327up.m17415to() == null) {
            return;
        }
        int length = c4327up.m17415to().length / 2;
        C3990x1[] c3990x1Arr = new C3990x1[length];
        for (int i = 0; i < length; i++) {
            C3990x1 c3990x1 = new C3990x1();
            int i2 = i * 2;
            c3990x1.m15764x1(c4327up.m17415to()[i2].m23101k4().Clone());
            c3990x1.m15762k4(c4327up.m17415to()[i2 + 1].m23101k4().Clone());
            c3990x1Arr[i] = c3990x1;
        }
        c3976c5.m15670k4(c3990x1Arr);
    }
}
