package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7535e5;
import com.aspose.slides.internal.p332p7.C8999v4;
import com.aspose.slides.internal.p332p7.C9132wr;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11757ix;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11825u4;
import com.aspose.slides.internal.p464vq.C11832uz;
import com.aspose.slides.internal.p464vq.C11850x6;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.s1 */
/* JADX INFO: loaded from: classes3.dex */
class C14426s1 {
    /* JADX INFO: renamed from: k4 */
    public static IChart m70415k4(IShapeCollection iShapeCollection, com.aspose.slides.internal.p332p7.pij pijVar, bjs bjsVar, boolean z) {
        if (pijVar == null) {
            return null;
        }
        C9132wr c9132wrM33836k4 = pijVar.mo31678kk().m33836k4();
        C11791os c11791osM55296x1 = bjsVar.m4229k4().m55338u4().m55303k4(z ? c9132wrM33836k4.m43912yj().m30791k4() : c9132wrM33836k4.m43908up().m42716k4()).m55296x1();
        if (c11791osM55296x1 == null) {
            return null;
        }
        IChart iChartM72998k4 = z ? new C14762x2(c11791osM55296x1, bjsVar.m4229k4()).m72998k4(iShapeCollection, null, pijVar, bjsVar) : new C1159gr(c11791osM55296x1, bjsVar.m4229k4()).m6893k4(iShapeCollection, null, pijVar, bjsVar);
        if (iChartM72998k4 != null) {
            C11709bg[] c11709bgArrM55309k4 = c11791osM55296x1.m55377up().m55309k4(C11850x6.f39932k4);
            C13726kf c13726kfM513ks = ((Chart) iChartM72998k4).m513ks();
            if (c11709bgArrM55309k4.length > 0) {
                new C0975f3(c11709bgArrM55309k4[0].m55296x1(), bjsVar.m4229k4()).m5813k4(c13726kfM513ks);
            }
            C11709bg[] c11709bgArrM55309k42 = c11791osM55296x1.m55377up().m55309k4(C11825u4.f39876k4);
            if (c11709bgArrM55309k42.length > 0) {
                new C14650uu(c11709bgArrM55309k42[0].m55296x1(), bjsVar.m4229k4()).m71906k4(c13726kfM513ks);
            }
        }
        return iChartM72998k4;
    }

    /* JADX INFO: renamed from: kk */
    private static void m70418kk(IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        C8999v4 c8999v4M43910x1 = pijVar.mo31678kk().m33836k4().m43910x1();
        final u8s u8sVarM70580k4 = sdpVar.m70580k4();
        C11791os c11791osM55394k4 = u8sVarM70580k4.mo4812qm().m55394k4("/ppt/charts/chart{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.s1.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return C22209OooOo0O.OooO00o(u8sVarM70580k4, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextChartFileNumber()");
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8sVarM70580k4.m71536jd();
            }
        }, new C11757ix());
        new C1159gr(c11791osM55394k4, u8sVarM70580k4).m6894k4(iChart, pijVar, sdpVar);
        c8999v4M43910x1.m42717k4(u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k4).m55289du());
        m70417k4(iChart, u8sVarM70580k4, c11791osM55394k4);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m70419x1(IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        C7535e5 c7535e5M43901kk = pijVar.mo31678kk().m33836k4().m43901kk();
        final u8s u8sVarM70580k4 = sdpVar.m70580k4();
        C11791os c11791osM55394k4 = u8sVarM70580k4.mo4812qm().m55394k4("/ppt/charts/chartEx{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.s1.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return C22209OooOo0O.OooO00o(u8sVarM70580k4, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextChartExFileNumber()");
            }

            @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
            /* JADX INFO: renamed from: k4 */
            public int mo5039k4() {
                return u8sVarM70580k4.m71533fa();
            }
        }, new C11832uz());
        new C14762x2(c11791osM55394k4, u8sVarM70580k4).m72999k4(iChart, pijVar, sdpVar);
        c7535e5M43901kk.m30792k4(u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k4).m55289du());
        m70417k4(iChart, u8sVarM70580k4, c11791osM55394k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70416k4(IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        boolean z;
        IGenericEnumerator<IChartSeries> it = iChart.getChartData().getSeries().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    z = false;
                    break;
                } else if (ChartTypeCharacterizer.m767to(it.next().getType())) {
                    z = true;
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (z) {
            m70419x1(iChart, pijVar, sdpVar);
        } else {
            m70418kk(iChart, pijVar, sdpVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m70417k4(IChart iChart, final u8s u8sVar, C11791os c11791os) {
        C13726kf c13726kfM513ks = ((Chart) iChart).m513ks();
        if (c13726kfM513ks.m63820x1() != null) {
            C11791os c11791osM55394k4 = u8sVar.mo4812qm().m55394k4("/ppt/charts/colors{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.s1.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextChartColorsFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return u8sVar.m71560up();
                }
            }, new C11850x6());
            new C0975f3(c11791osM55394k4, u8sVar).m5814x1(c13726kfM513ks);
            c11791os.m55377up().m55311x1(c11791osM55394k4);
        }
        if (c13726kfM513ks.m63801k4() != null) {
            C11791os c11791osM55394k42 = u8sVar.mo4812qm().m55394k4("/ppt/charts/style{0}.xml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.s1.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextChartStyleFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return u8sVar.m71573yj();
                }
            }, new C11825u4());
            new C14650uu(c11791osM55394k42, u8sVar).m71907x1(c13726kfM513ks);
            c11791os.m55377up().m55311x1(c11791osM55394k42);
        }
    }
}
