package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p085dk.AbstractC3174jd;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11738ew;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11797qm;
import com.aspose.slides.internal.p464vq.C11801r5;
import com.aspose.slides.internal.p464vq.C11867z9;
import com.aspose.slides.internal.p541z6.C13452x1;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class x8n {

    /* JADX INFO: renamed from: k4 */
    private hxc f50009k4;

    /* JADX INFO: renamed from: x1 */
    private C11791os f50010x1;

    /* JADX INFO: renamed from: du */
    private void m73186du(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        if (c11867z9.m55452yj() != null) {
            new C14565tk(c11867z9.m55452yj(), this.f50009k4).m71238k4(chartDataWorkbook.m671h4().m70133uz());
        }
        if (c11867z9.m55446ks() != null) {
            new C14668v9(c11867z9.m55446ks(), this.f50009k4).m72097k4(chartDataWorkbook.m671h4().m70133uz());
        }
        if (c11867z9.m55450up() != null) {
            new C13708k0(c11867z9.m55450up(), this.f50009k4).m63590k4(chartDataWorkbook.m671h4().m70133uz());
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m73191kk(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        new pjq(c11867z9.m55445ix(), this.f50009k4).m69118k4(chartDataWorkbook);
    }

    /* JADX INFO: renamed from: to */
    private void m73192to(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        if (c11867z9.m55448rv() != null) {
            new C13830mc(c11867z9.m55448rv(), this.f50009k4).m64823k4(chartDataWorkbook);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m73193x1(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        if (c11867z9.m55447ne() != null) {
            new q0e(c11867z9.m55447ne(), this.f50009k4).m69352k4(chartDataWorkbook);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73194k4(ChartDataWorkbook chartDataWorkbook, AbstractC3150x6 abstractC3150x6, C13452x1 c13452x1, final InterruptionToken interruptionToken) {
        C11867z9 c11867z9 = new C11867z9(abstractC3150x6, new AbstractC3174jd() { // from class: com.aspose.slides.x8n.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(interruptionToken) + "Aspose.Slides.InterruptionToken.ThrowIfInterruptionRequested()";
            }

            @Override // com.aspose.slides.internal.p085dk.AbstractC3174jd
            /* JADX INFO: renamed from: k4 */
            public void mo4791k4() {
                interruptionToken.throwIfInterruptionRequested();
            }
        });
        this.f50009k4 = new hxc(chartDataWorkbook, c13452x1, interruptionToken);
        C11791os c11791osM55445ix = c11867z9.m55445ix();
        this.f50010x1 = c11791osM55445ix;
        chartDataWorkbook.m679k4(a5l.m3285k4(c11791osM55445ix.m55372fa().mo55273k4(), 0));
        m73189k4(c11867z9, chartDataWorkbook.m688to());
        m73187k4(c11867z9, chartDataWorkbook);
        m73193x1(c11867z9, chartDataWorkbook);
        m73191kk(c11867z9, chartDataWorkbook);
        m73192to(c11867z9, chartDataWorkbook);
        m73186du(c11867z9, chartDataWorkbook);
        m73188k4(c11867z9, chartDataWorkbook, this.f50009k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m73187k4(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook) {
        if (c11867z9.m55451x6() != null) {
            new se2(c11867z9.m55451x6(), this.f50009k4).m70600k4(chartDataWorkbook);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    public static void m73188k4(C11867z9 c11867z9, ChartDataWorkbook chartDataWorkbook, hxc hxcVar) {
        rhq rhqVarM671h4 = chartDataWorkbook.m671h4();
        for (C11791os c11791os : c11867z9.m55388c5()) {
            if (!c11791os.m55413c5() && !C7019kk.m27469x1(c11791os.m55372fa(), C11738ew.class)) {
                rhqVarM671h4.m70104ix().m64893k4(c11791os.m55427x1(), c11791os.m55426to(), c11791os.m55372fa().mo55273k4(), c11791os.m55372fa().mo55275x1() != null ? c11791os.m55372fa().mo55275x1().m55382k4() : "", c11791os.m55377up());
                c11791os.m55422k4(true);
            }
        }
        for (C11709bg c11709bg : c11867z9.m55445ix().m55377up().m55313x1()) {
            m73190k4(rhqVarM671h4, rhqVarM671h4.m70131u4(), c11709bg);
        }
        List list = new List();
        for (C11791os c11791os2 : c11867z9.m55449u4()) {
            list.addItem(c11791os2);
        }
        List.Enumerator it = list.iterator();
        while (it.hasNext()) {
            try {
                C11791os c11791os3 = (C11791os) it.next();
                voq voqVarM694du = ((ChartDataWorksheet) hxcVar.m7323k4().get_Item(c11791os3.m55427x1())).m694du();
                for (C11709bg c11709bg2 : c11791os3.m55377up().m55313x1()) {
                    m73190k4(rhqVarM671h4, voqVarM694du.m72410e0(), c11709bg2);
                }
            } finally {
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m73189k4(C11867z9 c11867z9, zxr zxrVar) {
        C11723d3 c11723d3M55390dy = c11867z9.m55390dy();
        C11801r5 c11801r5 = C11797qm.f39832k4;
        if (c11723d3M55390dy.m55309k4(c11801r5).length > 0) {
            zxrVar.m74880x1();
            c11867z9.m55390dy().m55312x1(c11801r5);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m73190k4(rhq rhqVar, List<coq> list, C11709bg c11709bg) {
        ipw ipwVarM64892k4 = rhqVar.m70104ix().m64892k4(c11709bg.m55292k4());
        if (ipwVarM64892k4 != null && C14113y2.m67411k4(ipwVarM64892k4.m63031to())) {
            ipwVarM64892k4.m63029k4(c11709bg.m55291h4());
        }
        coq coqVar = new coq(c11709bg.m55289du(), c11709bg.m55291h4(), c11709bg.m55292k4(), c11709bg.m55294m9());
        list.addItem(coqVar);
    }
}
