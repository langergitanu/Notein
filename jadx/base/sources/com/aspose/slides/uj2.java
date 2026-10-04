package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.C7245ag;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8952ug;

/* JADX INFO: loaded from: classes3.dex */
class uj2 {
    /* JADX INFO: renamed from: k4 */
    public static void m71707k4(IChart iChart, C7245ag c7245ag, gnb gnbVar) {
        if (c7245ag == null) {
            iChart.setLegend(false);
            return;
        }
        iChart.setLegend(true);
        ffv ffvVarM1859k4 = ((Legend) iChart.getLegend()).m1859k4();
        ILegend legend = iChart.getLegend();
        legend.setOverlay(c7245ag.m28228du());
        int iM28235kk = c7245ag.m28235kk();
        if (iM28235kk == 1) {
            legend.setPosition(1);
        } else if (iM28235kk == 2) {
            legend.setPosition(3);
        } else if (iM28235kk != 3) {
            if (iM28235kk != 4) {
                throw new NotImplementedException();
            }
            legend.setPosition(0);
        } else if (c7245ag.m28237to() == 1) {
            legend.setPosition(4);
        } else {
            legend.setPosition(2);
        }
        C14864yx.m74128k4(legend.getFormat(), c7245ag.m28230h4(), gnbVar);
        C13691jl.m63398k4(legend.getTextFormat(), c7245ag.m28236m9(), gnbVar);
        ffvVarM1859k4.m6152k4(c7245ag.m28237to());
        ffvVarM1859k4.m6153k4(c7245ag.m28229dy());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71708k4(IChart iChart, final C7245ag c7245ag, u8s u8sVar) {
        ffv ffvVarM1859k4 = ((Legend) iChart.getLegend()).m1859k4();
        ILegend legend = iChart.getLegend();
        C14864yx.m74127k4(legend.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.uj2.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7245ag) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_LegendElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c7245ag.m28231k4();
            }
        }, u8sVar, null, false);
        C13691jl.m63395k4(legend.getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.uj2.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7245ag) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cx_CT_LegendElementData.AddTxPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8952ug invoke() {
                return c7245ag.m28238x1();
            }
        }, u8sVar);
        c7245ag.m28239x1(ffvVarM1859k4.m6155x1());
        c7245ag.m28234k4(legend.getOverlay());
        int position = legend.getPosition();
        if (position == 0) {
            c7245ag.m28232k4(4);
        } else if (position == 1) {
            c7245ag.m28232k4(1);
        } else if (position == 2) {
            c7245ag.m28232k4(3);
        } else if (position == 3) {
            c7245ag.m28232k4(2);
        } else if (position == 4) {
            c7245ag.m28232k4(3);
            c7245ag.m28239x1(1);
        }
        c7245ag.m28233k4(ffvVarM1859k4.m6151k4());
    }
}
