package com.aspose.slides;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7937ik;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8093kj;
import com.aspose.slides.internal.p332p7.C8599qf;
import com.aspose.slides.internal.p332p7.C8828t1;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9115wi;
import com.aspose.slides.internal.p332p7.C9342z4;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.vu */
/* JADX INFO: loaded from: classes3.dex */
class C14711vu {
    /* JADX INFO: renamed from: k4 */
    public static void m72546k4(IDataLabelCollection iDataLabelCollection, AbstractC4685kk<C9115wi> abstractC4685kk, u8s u8sVar) {
        if (abstractC4685kk == null || !m72548k4(iDataLabelCollection)) {
            return;
        }
        final C9115wi c9115wiInvoke = abstractC4685kk.invoke();
        IDataLabelFormat defaultDataLabelFormat = iDataLabelCollection.getDefaultDataLabelFormat();
        c9115wiInvoke.m43702h4().m41466k4(defaultDataLabelFormat.getShowLegendKey());
        c9115wiInvoke.m43713m9().m41466k4(defaultDataLabelFormat.getShowValue());
        c9115wiInvoke.m43700dy().m41466k4(defaultDataLabelFormat.getShowCategoryName());
        c9115wiInvoke.m43696c5().m41466k4(defaultDataLabelFormat.getShowSeriesName());
        c9115wiInvoke.m43705jd().m41466k4(defaultDataLabelFormat.getShowPercentage());
        c9115wiInvoke.m43697ck().m41466k4(defaultDataLabelFormat.getShowBubbleSize());
        c9115wiInvoke.m43701fa().m41466k4(defaultDataLabelFormat.getShowLeaderLines());
        DataLabelCollection dataLabelCollection = (DataLabelCollection) iDataLabelCollection;
        if (ChartTypeCharacterizer.isChartTypePie(dataLabelCollection.getParentSeries().getType())) {
            C13718k9.m63722k4(dataLabelCollection.getLeaderLinesFormat(), c9115wiInvoke.m43722up(), u8sVar);
        }
        if (!"".equals(defaultDataLabelFormat.getSeparator())) {
            c9115wiInvoke.m43728x1(defaultDataLabelFormat.getSeparator());
        }
        if (defaultDataLabelFormat.getPosition() != -1) {
            c9115wiInvoke.m43698du().m37200k4(defaultDataLabelFormat.getPosition());
        }
        DataLabelFormat dataLabelFormat = (DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat();
        C8087kh c8087kh = null;
        boolean showLeaderLines = false;
        C14864yx.m74127k4(dataLabelFormat.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.vu.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9115wiInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DLblsElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return c9115wiInvoke.m43709kk();
            }
        }, u8sVar, null, false);
        C13691jl.m63395k4(dataLabelFormat.m1319to(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.vu.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9115wiInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DLblsElementData.AddTxPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8952ug invoke() {
                return c9115wiInvoke.m43718to();
            }
        }, u8sVar);
        if (!"".equals(defaultDataLabelFormat.getNumberFormat())) {
            C7937ik c7937ikM43726x1 = c9115wiInvoke.m43726x1();
            c7937ikM43726x1.m34184k4(defaultDataLabelFormat.getNumberFormat());
            c7937ikM43726x1.m34183k4(defaultDataLabelFormat.isNumberFormatLinkedToSource() ? (byte) 1 : (byte) 0);
        }
        if (c9115wiInvoke.m43695bv() == null && c9115wiInvoke.m43704ix() == null && c9115wiInvoke.m43729x6() == null && c9115wiInvoke.m43715ne() == null && c9115wiInvoke.m43717rv() == null && !iDataLabelCollection.isVisible()) {
            ((C8828t1) c9115wiInvoke.m43706k4(RequestParameters.SUBRESOURCE_DELETE).m29542x1()).m41466k4(true);
            c9115wiInvoke.m43708k4((C8828t1) null);
            c9115wiInvoke.m43727x1((C8828t1) null);
            c9115wiInvoke.m43710kk((C8828t1) null);
            c9115wiInvoke.m43719to(null);
            c9115wiInvoke.m43699du(null);
            c9115wiInvoke.m43703h4(null);
            c9115wiInvoke.m43714m9(null);
        }
        for (int i = 0; i < iDataLabelCollection.getCount(); i++) {
            C14624u9.m71575k4(iDataLabelCollection.get_Item(i), new AbstractC4685kk<C9342z4>() { // from class: com.aspose.slides.vu.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9115wiInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DLblsElementData.AddDLbl()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C9342z4 invoke() {
                    return c9115wiInvoke.m43707k4();
                }
            }, ((long) i) & 4294967295L, iDataLabelCollection.getDefaultDataLabelFormat(), u8sVar);
        }
        final C8599qf c8599qf = new C8599qf(null);
        if (!ChartTypeCharacterizer.isChartTypePie(dataLabelCollection.getParentSeries().getType()) && iDataLabelCollection.getDefaultDataLabelFormat().getShowLeaderLines()) {
            showLeaderLines = iDataLabelCollection.getDefaultDataLabelFormat().getShowLeaderLines();
            c8599qf.m39475k4(new C8087kh());
            if (!dataLabelCollection.getLeaderLinesFormat().getLine().isFormatNotDefined()) {
                euh.m5726k4(dataLabelCollection.getLeaderLinesFormat().getLine(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.vu.4
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8599qf.m39482x1()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_ShapePropertiesElementData.AddLn()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8985uy invoke() {
                        return c8599qf.m39482x1().m35391x1();
                    }
                });
            }
        }
        boolean z = showLeaderLines;
        if (iDataLabelCollection.getDefaultDataLabelFormat().getShowLabelAsDataCallout()) {
            c8087kh = new C8087kh();
            C13677j9.m63255k4(dataLabelCollection.m1310to(), c8087kh, u8sVar);
        }
        c8599qf.m39473k4(iDataLabelCollection.getDefaultDataLabelFormat(), c8087kh, z, dataLabelCollection.m1311x1().m63962k4(), c9115wiInvoke.m43731yj());
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00e9 A[PHI: r2
      0x00e9: PHI (r2v40 com.aspose.slides.IDataLabelFormat) = 
      (r2v11 com.aspose.slides.IDataLabelFormat)
      (r2v11 com.aspose.slides.IDataLabelFormat)
      (r2v44 com.aspose.slides.IDataLabelFormat)
     binds: [B:69:0x014a, B:71:0x0154, B:43:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00eb A[PHI: r2
      0x00eb: PHI (r2v12 com.aspose.slides.IDataLabelFormat) = 
      (r2v11 com.aspose.slides.IDataLabelFormat)
      (r2v44 com.aspose.slides.IDataLabelFormat)
      (r2v44 com.aspose.slides.IDataLabelFormat)
     binds: [B:71:0x0154, B:41:0x00dd, B:43:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m72547k4(IDataLabelCollection iDataLabelCollection, C9115wi c9115wi, gnb gnbVar) {
        IDataLabelFormat defaultDataLabelFormat;
        boolean z;
        if (c9115wi == null) {
            return;
        }
        DataLabelCollection dataLabelCollection = (DataLabelCollection) iDataLabelCollection;
        C13735kl c13735klM1311x1 = dataLabelCollection.m1311x1();
        if (c9115wi.m43717rv() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setNumberFormat(c9115wi.m43717rv().m34182k4());
            iDataLabelCollection.getDefaultDataLabelFormat().setNumberFormatLinkedToSource(c9115wi.m43717rv().m34185x1() == 1);
        }
        if (c9115wi.m43729x6() != null) {
            C14864yx.m74128k4(iDataLabelCollection.getDefaultDataLabelFormat().getFormat(), c9115wi.m43729x6(), gnbVar);
        }
        if (c9115wi.m43715ne() != null) {
            C13691jl.m63398k4(iDataLabelCollection.getDefaultDataLabelFormat().getTextFormat(), c9115wi.m43715ne(), gnbVar);
        }
        if (c9115wi.m43704ix() != null) {
            ((DataLabelFormat) iDataLabelCollection.getDefaultDataLabelFormat()).m1316k4(c9115wi.m43704ix().m37199k4());
        }
        if (((DocumentProperties) gnbVar.m6801yj().getDocumentProperties()).m1344m9()) {
            iDataLabelCollection.getDefaultDataLabelFormat().setShowLegendKey(c9115wi.m43720u4() != null && c9115wi.m43720u4().m41467k4());
            iDataLabelCollection.getDefaultDataLabelFormat().setShowValue(c9115wi.m43723uz() != null && c9115wi.m43723uz().m41467k4());
            iDataLabelCollection.getDefaultDataLabelFormat().setShowCategoryName(c9115wi.m43725wl() != null && c9115wi.m43725wl().m41467k4());
            defaultDataLabelFormat = iDataLabelCollection.getDefaultDataLabelFormat();
            z = c9115wi.m43716qq() != null && c9115wi.m43716qq().m41467k4();
        } else {
            iDataLabelCollection.getDefaultDataLabelFormat().setShowLegendKey(c9115wi.m43720u4() == null || c9115wi.m43720u4().m41467k4());
            iDataLabelCollection.getDefaultDataLabelFormat().setShowValue(c9115wi.m43723uz() == null || c9115wi.m43723uz().m41467k4());
            iDataLabelCollection.getDefaultDataLabelFormat().setShowCategoryName(c9115wi.m43725wl() == null || c9115wi.m43725wl().m41467k4());
            defaultDataLabelFormat = iDataLabelCollection.getDefaultDataLabelFormat();
            if (c9115wi.m43716qq() == null || c9115wi.m43716qq().m41467k4()) {
            }
        }
        defaultDataLabelFormat.setShowSeriesName(z);
        if (c9115wi.m43693ar() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setShowPercentage(c9115wi.m43693ar().m41467k4());
        }
        if (c9115wi.m43721um() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setShowBubbleSize(c9115wi.m43721um().m41467k4());
        }
        if (c9115wi.m43724v4() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setShowLeaderLines(c9115wi.m43724v4().m41467k4());
        }
        if (c9115wi.m43712lr() != null) {
            C13718k9.m63721k4(dataLabelCollection.getLeaderLinesFormat(), c9115wi.m43712lr(), gnbVar);
        }
        if (c9115wi.m43695bv() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setSeparator(c9115wi.m43695bv());
        }
        if (c9115wi.m43730yd() != null && ((C8828t1) c9115wi.m43730yd().m29542x1()).m41467k4()) {
            iDataLabelCollection.hide();
        }
        C8599qf c8599qf = new C8599qf(c9115wi.m43694b3());
        c13735klM1311x1.m63961k4(c8599qf.m39480m9().toArray(new C8093kj[0]));
        if (c8599qf.m39479kk() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setShowLabelAsDataCallout(true);
            C13677j9.m63254k4(((DataLabelCollection) iDataLabelCollection).m1310to(), c8599qf.m39479kk(), gnbVar);
        }
        if (c8599qf.m39470k4() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setShowLeaderLines(c8599qf.m39470k4().m41467k4());
        }
        if (c8599qf.m39482x1() != null) {
            euh.m5728k4(dataLabelCollection.getLeaderLinesFormat().getLine(), c8599qf.m39482x1().m35368c5());
        }
        if (c8599qf.m39468h4() != null) {
            iDataLabelCollection.getDefaultDataLabelFormat().setShowLabelValueFromCell(c8599qf.m39468h4().m41467k4());
        }
        if (c9115wi.m43711ks() != null) {
            for (C9342z4 c9342z4 : c9115wi.m43711ks()) {
                if ((c9342z4.m45428yj().m38332k4() & 4294967295L) <= iDataLabelCollection.getParentSeries().getDataPoints().size() - 1) {
                    C14624u9.m71576k4(iDataLabelCollection.getParentSeries().getDataPoints().get_Item((int) c9342z4.m45428yj().m38332k4()).getLabel(), c9342z4, gnbVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m72548k4(IDataLabelCollection iDataLabelCollection) {
        boolean z;
        IGenericEnumerator<IDataLabel> it = iDataLabelCollection.iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                if (C14624u9.m71577k4(it.next(), iDataLabelCollection.getDefaultDataLabelFormat())) {
                    z = true;
                    break;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        IDataLabelFormat defaultDataLabelFormat = iDataLabelCollection.getDefaultDataLabelFormat();
        return z || defaultDataLabelFormat.getShowBubbleSize() || defaultDataLabelFormat.getShowCategoryName() || defaultDataLabelFormat.getShowLegendKey() || defaultDataLabelFormat.getShowPercentage() || defaultDataLabelFormat.getShowSeriesName() || defaultDataLabelFormat.getShowValue() || defaultDataLabelFormat.getShowLeaderLines() || defaultDataLabelFormat.getShowLabelValueFromCell();
    }
}
