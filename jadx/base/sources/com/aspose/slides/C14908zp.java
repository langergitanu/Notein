package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7599et;
import com.aspose.slides.internal.p332p7.C7809gy;
import com.aspose.slides.internal.p332p7.C7887hy;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8324nc;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9192xf;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.AbstractC11812sq;
import com.aspose.slides.internal.p464vq.C11701ai;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11712bs;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11804ri;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.zp */
/* JADX INFO: loaded from: classes3.dex */
class C14908zp {
    /* JADX INFO: renamed from: k4 */
    public static int m74713k4(C7809gy c7809gy, C8324nc c8324nc) {
        switch (c8324nc.m37380du()) {
            case 1:
                return 78;
            case 2:
                return 76;
            case 3:
                return 80;
            case 4:
                return 77;
            case 5:
                return 81;
            case 6:
                return 75;
            case 7:
                return 74;
            case 8:
                return 79;
            default:
                throw new Exception("Unknown series type");
        }
    }

    /* JADX INFO: renamed from: kk */
    private static void m74721kk(IChart iChart, C9192xf c9192xf, C14144mu c14144mu) {
        C7809gy c7809gyM31298to = c9192xf.m44321kk().m31298to();
        C14316pu.m69253k4(iChart.getPlotArea(), c7809gyM31298to, c14144mu.m67731k4().m4229k4());
        oen.m68491k4(iChart, c14144mu.m67731k4().m4229k4(), null, c9192xf);
        C14861yu.m74089k4(iChart.getChartData(), c9192xf, c14144mu);
        C14350qk.m69683k4(iChart.getAxes(), c7809gyM31298to, c14144mu);
    }

    /* JADX INFO: renamed from: to */
    private static void m74723to(IChart iChart, C9192xf c9192xf, C14786xh c14786xh) {
        C0815bf.m4163k4(((Chart) iChart).m515rv(), c9192xf, c14786xh.m73359k4().m70580k4());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74724x1(IChart iChart, C9192xf c9192xf, C14144mu c14144mu) {
        C7599et c7599etM44321kk = c9192xf.m44321kk();
        C1116fp.m6240k4(iChart.getChartTitle(), c7599etM44321kk.m31297kk(), c14144mu.m67731k4().m4229k4());
        uj2.m71707k4(iChart, c7599etM44321kk.m31295du(), c14144mu.m67731k4().m4229k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74714k4(IChart iChart, com.aspose.slides.internal.p332p7.pij pijVar, C9192xf c9192xf, C14144mu c14144mu) {
        if (c9192xf == null) {
            return;
        }
        m74715k4(iChart, c9192xf);
        C13741ko.m64063k4(iChart, pijVar, c14144mu.m67731k4());
        m74716k4(iChart, c9192xf, c14144mu.m67731k4());
        m74724x1(iChart, c9192xf, c14144mu);
        m74721kk(iChart, c9192xf, c14144mu);
        m74718k4(iChart, c9192xf, c14144mu);
    }

    /* JADX INFO: renamed from: kk */
    private static void m74722kk(IChart iChart, C9192xf c9192xf, C14786xh c14786xh) {
        C14316pu.m69254k4(iChart.getPlotArea(), c9192xf, c14786xh);
        C14861yu.m74088k4(iChart, c9192xf, c14786xh);
        C14350qk.m69685k4(iChart, c9192xf.m44321kk().m31298to(), c14786xh.m73359k4().m70580k4());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74725x1(IChart iChart, C9192xf c9192xf, C14786xh c14786xh) {
        u8s u8sVarM70580k4 = c14786xh.m73359k4().m70580k4();
        if (iChart.getFillFormat().getFillType() != -1 || !iChart.getLineFormat().isFormatNotDefined() || !iChart.getEffectFormat().isNoEffects() || b6z.m4035k4(iChart.getThreeDFormat(), true)) {
            final C8087kh c8087khM44318k4 = c9192xf.m44318k4();
            C1169h1.m6956k4(iChart.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.zp.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM44318k4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8087khM44318k4.m35390x1(str);
                }
            }, u8sVarM70580k4);
            euh.m5726k4(iChart.getLineFormat(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.zp.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM44318k4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8985uy invoke() {
                    return c8087khM44318k4.m35391x1();
                }
            });
            C1158gq.m6877k4(iChart.getEffectFormat(), new C7394ca.k4() { // from class: com.aspose.slides.zp.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM44318k4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8087khM44318k4.m35375k4(str);
                }
            }, u8sVarM70580k4);
            b6z.m4032k4(iChart.getThreeDFormat(), new AbstractC4685kk<C8820sx>() { // from class: com.aspose.slides.zp.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM44318k4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8820sx invoke() {
                    return c8087khM44318k4.m35385kk();
                }
            }, new AbstractC4685kk<C8638qy>() { // from class: com.aspose.slides.zp.5
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    new StringBuilder();
                    C8087kh c8087kh = c8087khM44318k4;
                    return StringBuffer.toString();
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8638qy invoke() {
                    return c8087khM44318k4.m35388to();
                }
            }, (AbstractC4685kk<C7317be>) null);
        }
        C14576tt.m71304k4(iChart.getThemeManager(), u8sVarM70580k4.m55433g8(), u8sVarM70580k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74715k4(IChart iChart, C9192xf c9192xf) {
        Chart chart = (Chart) iChart;
        chart.mo268du().m5170k4(c9192xf.m44322m9());
        C14349qj.m69669k4(chart, c9192xf.m44316du());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74716k4(IChart iChart, C9192xf c9192xf, bjs bjsVar) {
        gnb gnbVarM4229k4 = bjsVar.m4229k4();
        axn.m3766k4(iChart, c9192xf.m44323to(), gnbVarM4229k4);
        C14576tt.m71303k4(iChart.getThemeManager(), gnbVarM4229k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74717k4(IChart iChart, C9192xf c9192xf, com.aspose.slides.internal.p332p7.pij pijVar, C14786xh c14786xh) {
        m74719k4(iChart, c9192xf, c14786xh.m73359k4().m70580k4());
        C13741ko.m64065k4(iChart, pijVar, c14786xh.m73359k4());
        m74725x1(iChart, c9192xf, c14786xh);
        m74720k4(iChart, c9192xf, c14786xh);
        m74722kk(iChart, c9192xf, c14786xh);
        m74723to(iChart, c9192xf, c14786xh);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74718k4(IChart iChart, C9192xf c9192xf, C14144mu c14144mu) {
        if (c9192xf.m44317h4() == null) {
            return;
        }
        C0815bf.m4162k4(((Chart) iChart).m515rv(), c9192xf.m44317h4(), c14144mu.m67731k4().m4229k4());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74719k4(IChart iChart, C9192xf c9192xf, u8s u8sVar) {
        C11709bg c11709bgM55305k4;
        String strM687m9;
        C0907dn c0907dnMo268du = ((Chart) iChart).mo268du();
        c9192xf.m44319k4(c0907dnMo268du.m5165dy());
        ChartData chartData = (ChartData) iChart.getChartData();
        boolean z = chartData.m553x1().mo5710kk() == 2;
        ChartDataWorkbook chartDataWorkbook = z ? (ChartDataWorkbook) chartData.m553x1().mo5713x1() : null;
        AbstractC11812sq c11712bs = ((chartDataWorkbook == null || chartDataWorkbook.m685kk() != 1) && chartData.m553x1().mo5712to() != 1) ? ((chartDataWorkbook == null || chartDataWorkbook.m685kk() != 4) && chartData.m553x1().mo5712to() != 4) ? new C11712bs() : new C11701ai() : new C11804ri();
        if (c0907dnMo268du.m5163ck() != 1) {
            if (z) {
                strM687m9 = chartDataWorkbook.m687m9();
            } else {
                int iMo5712to = chartData.m553x1().mo5712to();
                strM687m9 = iMo5712to != 1 ? iMo5712to != 4 ? ".xlsx" : ".xlsb" : ".xlsm";
            }
            C11791os c11791osM55394k4 = u8sVar.mo4812qm().m55394k4(C14113y2.m67408k4("/ppt/embeddings/Microsoft_Excel_Worksheet", C14057f9.m66591x1(u8sVar.m71553ne()), strM687m9), (AbstractC11760jd.k4) null, c11712bs);
            if (z) {
                c11791osM55394k4.m55423k4(((ChartData) iChart.getChartData()).m549k4().toArray());
            } else {
                c11791osM55394k4.m55423k4(chartData.m553x1().mo5702dy().toArray());
            }
            c11709bgM55305k4 = u8sVar.m55433g8().m55311x1(c11791osM55394k4);
        } else {
            c11709bgM55305k4 = u8sVar.m55433g8().m55305k4(c0907dnMo268du.m5184up(), c0907dnMo268du.m5166fa(), (byte) 1);
        }
        C7887hy c7887hy = new C7887hy();
        c7887hy.m33662k4(c11709bgM55305k4.m55289du());
        c9192xf.m44324x1().m39944k4(c7887hy);
        c7887hy.m33661k4((byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74720k4(IChart iChart, C9192xf c9192xf, C14786xh c14786xh) {
        C7599et c7599etM44321kk = c9192xf.m44321kk();
        if (iChart.hasTitle()) {
            C1116fp.m6241k4(iChart.getChartTitle(), c7599etM44321kk.m31296k4(), c14786xh.m73359k4().m70580k4());
        }
        if (iChart.hasLegend()) {
            uj2.m71708k4(iChart, c7599etM44321kk.m31299x1(), c14786xh.m73359k4().m70580k4());
        }
    }
}
