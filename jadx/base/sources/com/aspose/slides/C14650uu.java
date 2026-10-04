package com.aspose.slides;

import com.aspose.slides.internal.p332p7.C7785gp;
import com.aspose.slides.internal.p332p7.C7825h7;
import com.aspose.slides.internal.p332p7.C7954ir;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.C14057f9;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.uu */
/* JADX INFO: loaded from: classes3.dex */
class C14650uu extends ywb {
    public C14650uu(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m71903k4(C7825h7 c7825h7) {
        if (c7825h7 == null) {
            return -2;
        }
        if ("auto".equals(c7825h7.m33148k4())) {
            return -1;
        }
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(c7825h7.m33148k4(), iArr);
        int i = iArr[0];
        if (zM66590k4) {
            return i;
        }
        return -1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71907x1(C13726kf c13726kf) {
        mo55332up();
        C7785gp c7785gpM63801k4 = c13726kf.m63801k4();
        if (c7785gpM63801k4 != null) {
            c7785gpM63801k4.mo6846k4(null, m55442ck(), "chartStyle");
        }
        mo55333yj();
    }

    public C14650uu(C11791os c11791os, u8s u8sVar) {
        super(c11791os, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m71904k4(C0859cl c0859cl, C7954ir c7954ir, gnb gnbVar) {
        if (c7954ir.m34414h4() != null) {
            C13691jl.m63393k4(c0859cl.m4617kk().getPortionFormat(), c7954ir.m34414h4(), (gnb) null);
        }
        if (c7954ir.m34417m9() != null) {
            C13691jl.m63394k4(c0859cl.m4617kk().getTextBlockFormat(), c7954ir.m34417m9());
        }
        C8087kh c8087khM34413du = c7954ir.m34413du();
        if (c8087khM34413du != null) {
            C14864yx.m74128k4(c0859cl.m4620x1(), c8087khM34413du, gnbVar);
        }
        C1246ib.m7610k4(c0859cl.m4615k4().getLineColor(), c7954ir.m34415k4().m41126x1());
        c0859cl.m4615k4().setLineStyleIndex((int) (c7954ir.m34415k4().m41124k4() & C18177fb.f54859s));
        c0859cl.m4619to().m63276k4(m71903k4(c7954ir.m34415k4().m41125kk()));
        C1246ib.m7610k4(c0859cl.m4615k4().getFillColor(), c7954ir.m34419x1().m41126x1());
        c0859cl.m4615k4().setFillStyleIndex((short) c7954ir.m34419x1().m41124k4());
        c0859cl.m4612du().m63276k4(m71903k4(c7954ir.m34419x1().m41125kk()));
        C1246ib.m7610k4(c0859cl.m4615k4().getEffectColor(), c7954ir.m34416kk().m41126x1());
        c0859cl.m4615k4().setEffectStyleIndex(c7954ir.m34416kk().m41124k4());
        c0859cl.m4614h4().m63276k4(m71903k4(c7954ir.m34416kk().m41125kk()));
        if (c7954ir.m34418to().m39925x1() != null) {
            c0859cl.m4617kk().getPortionFormat().getFillFormat().setFillType((byte) 1);
            C1246ib.m7610k4(c0859cl.m4617kk().getPortionFormat().getFillFormat().getSolidFillColor(), c7954ir.m34418to().m39925x1());
            c0859cl.m4615k4().setFontCollectionIndex(c7954ir.m34418to().m39923k4());
            c0859cl.m4618m9().m63276k4(m71903k4(c7954ir.m34418to().m39924kk()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71906k4(C13726kf c13726kf) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "chartStyle".equals(m55443jd().mo65023fa())) {
                c13726kf.m63803k4(new C7785gp(m55443jd()));
                m71905k4(c13726kf, mo3471m9());
            }
        }
        mo55330fa();
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71905k4(C13726kf c13726kf, gnb gnbVar) {
        m71904k4(c13726kf.m63794du(), c13726kf.m63801k4().m32803k4(), gnbVar);
        m71904k4(c13726kf.m63797h4(), c13726kf.m63801k4().m32800h4(), gnbVar);
        m71904k4(c13726kf.m63808m9(), c13726kf.m63801k4().m32818x1(), gnbVar);
        m71904k4(c13726kf.m63795dy(), c13726kf.m63801k4().m32804kk(), gnbVar);
        m71904k4(c13726kf.m63791c5(), c13726kf.m63801k4().m32811to(), gnbVar);
        m71904k4(c13726kf.m63799jd(), c13726kf.m63801k4().m32797du(), gnbVar);
        m71904k4(c13726kf.m63792ck(), c13726kf.m63801k4().m32807m9(), gnbVar);
        m71904k4(c13726kf.m63796fa(), c13726kf.m63801k4().m32798dy(), gnbVar);
        m71904k4(c13726kf.m63815up(), c13726kf.m63801k4().m32795c5(), gnbVar);
        m71904k4(c13726kf.m63825yj(), c13726kf.m63801k4().m32802jd(), gnbVar);
        m71904k4(c13726kf.m63806ks(), c13726kf.m63801k4().m32796ck(), gnbVar);
        m71904k4(c13726kf.m63811rv(), c13726kf.m63801k4().m32799fa(), gnbVar);
        m71904k4(c13726kf.m63822x6(), c13726kf.m63801k4().m32814up(), gnbVar);
        m71904k4(c13726kf.m63809ne(), c13726kf.m63801k4().m32821yj(), gnbVar);
        m71904k4(c13726kf.m63798ix(), c13726kf.m63801k4().m32805ks(), gnbVar);
        m71904k4(c13726kf.m63813u4(), c13726kf.m63801k4().m32810rv(), gnbVar);
        m71904k4(c13726kf.m63816uz(), c13726kf.m63801k4().m32819x6(), gnbVar);
        m71904k4(c13726kf.m63818wl(), c13726kf.m63801k4().m32808ne(), gnbVar);
        m71904k4(c13726kf.m63810qq(), c13726kf.m63801k4().m32801ix(), gnbVar);
        m71904k4(c13726kf.m63788ar(), c13726kf.m63801k4().m32812u4(), gnbVar);
        m71904k4(c13726kf.m63814um(), c13726kf.m63801k4().m32815uz(), gnbVar);
        m71904k4(c13726kf.m63790bv(), c13726kf.m63801k4().m32817wl(), gnbVar);
        m71904k4(c13726kf.m63817v4(), c13726kf.m63801k4().m32809qq(), gnbVar);
        m71904k4(c13726kf.m63807lr(), c13726kf.m63801k4().m32792ar(), gnbVar);
        m71904k4(c13726kf.m63824yd(), c13726kf.m63801k4().m32813um(), gnbVar);
        m71904k4(c13726kf.m63789b3(), c13726kf.m63801k4().m32794bv(), gnbVar);
        m71904k4(c13726kf.m63819wy(), c13726kf.m63801k4().m32816v4(), gnbVar);
        m71904k4(c13726kf.m63787ak(), c13726kf.m63801k4().m32806lr(), gnbVar);
        m71904k4(c13726kf.m63793dq(), c13726kf.m63801k4().m32820yd(), gnbVar);
        m71904k4(c13726kf.m63823xk(), c13726kf.m63801k4().m32793b3(), gnbVar);
    }
}
