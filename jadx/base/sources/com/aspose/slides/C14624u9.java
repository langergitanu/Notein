package com.aspose.slides;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7943in;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8093kj;
import com.aspose.slides.internal.p332p7.C8599qf;
import com.aspose.slides.internal.p332p7.C8828t1;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8970uq;
import com.aspose.slides.internal.p332p7.C9342z4;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.u9 */
/* JADX INFO: loaded from: classes3.dex */
class C14624u9 {
    /* JADX INFO: renamed from: k4 */
    private static C14093tq<Integer> m71574k4(IDataLabel iDataLabel, C9342z4 c9342z4) {
        if (iDataLabel == null) {
            throw new ArgumentNullException("dataLabel");
        }
        if (c9342z4 == null) {
            throw new ArgumentNullException("dLblElementData");
        }
        if (c9342z4.m45417u4() != null) {
            return new C14093tq<>(Integer.valueOf(c9342z4.m45417u4().m37199k4()));
        }
        if (!ChartTypeCharacterizer.is3DChart(iDataLabel.getChart().getType()) && !ChartTypeCharacterizer.m767to(iDataLabel.getChart().getType()) && c9342z4.m45409ks() != null && c9342z4.m45409ks().m34316x1() != null && c9342z4.m45409ks().m34316x1().m29941ck() != null && c9342z4.m45409ks().m34316x1().m29944fa() != null) {
            return new C14093tq<>(-1);
        }
        return new C14093tq<>();
    }

    /* JADX INFO: renamed from: x1 */
    private static void m71578x1(IDataLabel iDataLabel, C9342z4 c9342z4, gnb gnbVar) {
        C0799b6 c0799b6M1305x1 = ((DataLabel) iDataLabel).m1305x1();
        C8599qf c8599qf = new C8599qf(c9342z4.m45427yd());
        if (c9342z4.m45409ks() != null) {
            rrr.m70334k4(c0799b6M1305x1, c8599qf.m39481to());
            rrr.m70334k4(c0799b6M1305x1, c9342z4.m45409ks());
        }
        shm.m70628k4(iDataLabel, c9342z4.m45414rv(), c9342z4.m45402ix(), gnbVar);
        c0799b6M1305x1.m4026k4(c8599qf.m39480m9().toArray(new C8093kj[0]));
        if (c8599qf.m39467dy() == null || c8599qf.m39478k4(c8599qf.m39467dy())) {
            iDataLabel.getDataLabelFormat().setShowLabelAsDataCallout(false);
        } else if (c8599qf.m39479kk() != null) {
            iDataLabel.getDataLabelFormat().setShowLabelAsDataCallout(true);
            C13677j9.m63254k4(((DataLabel) iDataLabel).m1292c5(), c8599qf.m39479kk(), gnbVar);
        }
        if (c8599qf.m39481to() != null) {
            rrr.m70334k4(c0799b6M1305x1, c8599qf.m39481to());
        }
        if (c8599qf.m39466du() != null) {
            c0799b6M1305x1.m4025k4(c8599qf.m39466du());
        }
        if (c8599qf.m39468h4() == null || !c8599qf.m39468h4().m41467k4()) {
            iDataLabel.getDataLabelFormat().setShowLabelValueFromCell(false);
        } else {
            iDataLabel.getDataLabelFormat().setShowLabelValueFromCell(true);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71575k4(IDataLabel iDataLabel, AbstractC4685kk<C9342z4> abstractC4685kk, long j, IDataLabelFormat iDataLabelFormat, u8s u8sVar) {
        C8087kh c8087kh;
        C8087kh c8087kh2;
        if (m71577k4(iDataLabel, iDataLabelFormat)) {
            final C9342z4 c9342z4Invoke = abstractC4685kk.invoke();
            C0799b6 c0799b6M1305x1 = ((DataLabel) iDataLabel).m1305x1();
            c9342z4Invoke.m45428yj().m38333k4(j);
            IDataLabelCollection labels = ((DataLabel) C7019kk.m27452k4((Object) iDataLabel, DataLabel.class)).m1294dy().getLabels();
            if (!C14113y2.m67411k4(iDataLabel.getDataLabelFormat().getNumberFormat()) && !C14113y2.m67363du(iDataLabel.getDataLabelFormat().getNumberFormat(), labels.getDefaultDataLabelFormat().getNumberFormat())) {
                c9342z4Invoke.m45407kk().m34184k4(iDataLabel.getDataLabelFormat().getNumberFormat());
                c9342z4Invoke.m45426x6().m34183k4(iDataLabel.getDataLabelFormat().isNumberFormatLinkedToSource() ? (byte) 1 : (byte) 0);
                if (!C13691jl.m63403k4(iDataLabel.getTextFormat()) && !C13691jl.m63404k4(iDataLabel)) {
                    C13691jl.m63395k4(labels.getDefaultDataLabelFormat().getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.u9.1
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9342z4Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DLblElementData.AddTxPr()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C8952ug invoke() {
                            return c9342z4Invoke.m45396du();
                        }
                    }, u8sVar);
                }
            }
            C14864yx.m74127k4(iDataLabel.getDataLabelFormat().getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.u9.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9342z4Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DLblElementData.AddSpPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8087kh invoke() {
                    return c9342z4Invoke.m45415to();
                }
            }, u8sVar, iDataLabel, false);
            if (c9342z4Invoke.m45412ne() == null && ((DataLabelFormat) iDataLabel.getDataLabelFormat()).m1314du()) {
                c9342z4Invoke.m45415to();
            }
            if (iDataLabel.getDataLabelFormat().getPosition() != -1) {
                c9342z4Invoke.m45400h4().m37200k4(iDataLabel.getDataLabelFormat().getPosition());
            }
            c9342z4Invoke.m45411m9().m41466k4(iDataLabel.getDataLabelFormat().getShowLegendKey());
            c9342z4Invoke.m45398dy().m41466k4(iDataLabel.getDataLabelFormat().getShowValue());
            c9342z4Invoke.m45394c5().m41466k4(iDataLabel.getDataLabelFormat().getShowCategoryName());
            c9342z4Invoke.m45403jd().m41466k4(iDataLabel.getDataLabelFormat().getShowSeriesName());
            c9342z4Invoke.m45395ck().m41466k4(iDataLabel.getDataLabelFormat().getShowPercentage());
            c9342z4Invoke.m45399fa().m41466k4(iDataLabel.getDataLabelFormat().getShowBubbleSize());
            if (!"".equals(iDataLabel.getDataLabelFormat().getSeparator())) {
                c9342z4Invoke.m45425x1(iDataLabel.getDataLabelFormat().getSeparator());
            }
            rrr.m70333k4(c0799b6M1305x1, new AbstractC4685kk<C7943in>() { // from class: com.aspose.slides.u9.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9342z4Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DLblElementData.AddLayout()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C7943in invoke() {
                    return c9342z4Invoke.m45405k4();
                }
            });
            DataLabel dataLabel = (DataLabel) iDataLabel;
            if (dataLabel.m1302m9() != null) {
                IGenericEnumerator<IParagraph> it = iDataLabel.getTextFrameForOverriding().getParagraphs().iterator();
                while (it.hasNext()) {
                    try {
                        ((ParagraphFormat) it.next().getParagraphFormat()).m2187c5().m64012k4(true);
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            shm.m70626k4(iDataLabel, new AbstractC4685kk<C8970uq>() { // from class: com.aspose.slides.u9.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9342z4Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DLblElementData.AddTx()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8970uq invoke() {
                    return c9342z4Invoke.m45423x1();
                }
            }, new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.u9.5
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9342z4Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DLblElementData.AddTxPr()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8952ug invoke() {
                    return c9342z4Invoke.m45396du();
                }
            }, u8sVar);
            if (c9342z4Invoke.m45426x6() == null && c9342z4Invoke.m45412ne() == null && c9342z4Invoke.m45417u4() == null && c9342z4Invoke.m45421v4() == null && c9342z4Invoke.m45409ks() == null && c9342z4Invoke.m45414rv() == null && !iDataLabel.isVisible()) {
                c9342z4Invoke.m45404k4(RequestParameters.SUBRESOURCE_DELETE);
                c9342z4Invoke.m45406k4((C8828t1) null);
                c9342z4Invoke.m45424x1((C8828t1) null);
                c9342z4Invoke.m45408kk((C8828t1) null);
                c9342z4Invoke.m45416to(null);
                c9342z4Invoke.m45397du(null);
                c9342z4Invoke.m45401h4(null);
            }
            if (c9342z4Invoke.m45427yd() == null) {
                c9342z4Invoke.m45419up();
            }
            boolean z = (C14064he.m66715kk(iDataLabel.getWidth()) || C14064he.m66715kk(iDataLabel.getHeight())) ? false : true;
            if (labels.getDefaultDataLabelFormat().getShowLabelAsDataCallout() != iDataLabel.getDataLabelFormat().getShowLabelAsDataCallout()) {
                if (iDataLabel.getDataLabelFormat().getShowLabelAsDataCallout()) {
                    c8087kh2 = new C8087kh();
                    C13677j9.m63255k4(dataLabel.m1292c5(), c8087kh2, u8sVar);
                } else {
                    c8087kh2 = null;
                }
                if (c9342z4Invoke.m45402ix() == null) {
                    C13691jl.m63407x1(labels.getDefaultDataLabelFormat().getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.u9.6
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9342z4Invoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DLblElementData.AddTxPr()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C8952ug invoke() {
                            return c9342z4Invoke.m45396du();
                        }
                    }, u8sVar);
                }
                c8087kh = c8087kh2;
            } else {
                c8087kh = null;
            }
            new C8599qf(null).m39472k4(iDataLabel, c8087kh, z, ((DataLabel) C7019kk.m27452k4((Object) iDataLabel, DataLabel.class)).m1305x1().m4027k4(), c9342z4Invoke.m45427yd());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m71576k4(IDataLabel iDataLabel, C9342z4 c9342z4, gnb gnbVar) {
        if (c9342z4 == null) {
            return;
        }
        m71578x1(iDataLabel, c9342z4, gnbVar);
        if (c9342z4.m45410lr() != null && ((C8828t1) c9342z4.m45410lr().m29542x1()).m41467k4()) {
            iDataLabel.hide();
        }
        if (c9342z4.m45426x6() != null) {
            iDataLabel.getDataLabelFormat().setNumberFormat(c9342z4.m45426x6().m34182k4());
            iDataLabel.getDataLabelFormat().setNumberFormatLinkedToSource(c9342z4.m45426x6().m34185x1() == 1);
        }
        if (c9342z4.m45412ne() != null) {
            if (c9342z4.m45412ne().m35373h4() != null) {
                tbp tbpVar = new tbp();
                tbp tbpVar2 = new tbp();
                C1258im c1258im = new C1258im();
                tbp[] tbpVarArr = {tbpVar};
                tbp[] tbpVarArr2 = {tbpVar2};
                C1258im[] c1258imArr = {c1258im};
                ai9.m3628k4(c9342z4.m45412ne().m35373h4(), tbpVarArr, tbpVarArr2, c1258imArr);
                tbpVarArr[0].CloneTo(tbpVar);
                tbpVarArr2[0].CloneTo(tbpVar2);
                c1258imArr[0].CloneTo(c1258im);
                if (!C14044b3.m66437kk(tbpVar.f49090k4) && !C14044b3.m66437kk(tbpVar.f49091x1) && !C14044b3.m66437kk(tbpVar2.f49090k4) && !C14044b3.m66437kk(tbpVar2.f49091x1)) {
                    if (C14064he.m66715kk(iDataLabel.getX())) {
                        iDataLabel.setX((float) tbpVar.f49090k4);
                    }
                    if (C14064he.m66715kk(iDataLabel.getY())) {
                        iDataLabel.setY((float) tbpVar.f49091x1);
                    }
                    if (C14064he.m66715kk(iDataLabel.getWidth())) {
                        iDataLabel.setWidth((float) tbpVar2.f49090k4);
                    }
                    if (C14064he.m66715kk(iDataLabel.getHeight())) {
                        iDataLabel.setHeight((float) tbpVar2.f49091x1);
                    }
                }
            }
            C14864yx.m74128k4(iDataLabel.getDataLabelFormat().getFormat(), c9342z4.m45412ne(), gnbVar);
            if (c9342z4.m45412ne().m35371dy() == null && c9342z4.m45412ne().m35368c5() == null && c9342z4.m45412ne().m35374jd() == null && c9342z4.m45412ne().m35369ck() == null && c9342z4.m45412ne().m35389up() == null) {
                ((DataLabelFormat) iDataLabel.getDataLabelFormat()).m1318k4(true);
            }
        }
        C14093tq<Integer> c14093tqClone = m71574k4(iDataLabel, c9342z4).Clone();
        if (c14093tqClone.m67302x1()) {
            ((DataLabelFormat) iDataLabel.getDataLabelFormat()).m1316k4(c14093tqClone.m67297k4().intValue());
        }
        if (c9342z4.m45420uz() != null) {
            iDataLabel.getDataLabelFormat().setShowLegendKey(c9342z4.m45420uz().m41467k4());
        }
        if (c9342z4.m45422wl() != null) {
            iDataLabel.getDataLabelFormat().setShowValue(c9342z4.m45422wl().m41467k4());
        }
        if (c9342z4.m45413qq() != null) {
            iDataLabel.getDataLabelFormat().setShowCategoryName(c9342z4.m45413qq().m41467k4());
        }
        if (c9342z4.m45392ar() != null) {
            iDataLabel.getDataLabelFormat().setShowSeriesName(c9342z4.m45392ar().m41467k4());
        }
        if (c9342z4.m45418um() != null) {
            iDataLabel.getDataLabelFormat().setShowPercentage(c9342z4.m45418um().m41467k4());
        }
        if (c9342z4.m45393bv() != null) {
            iDataLabel.getDataLabelFormat().setShowBubbleSize(c9342z4.m45393bv().m41467k4());
        }
        if (c9342z4.m45421v4() != null) {
            iDataLabel.getDataLabelFormat().setSeparator(c9342z4.m45421v4());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m71577k4(IDataLabel iDataLabel, IDataLabelFormat iDataLabelFormat) {
        DataLabel dataLabel = (DataLabel) iDataLabel;
        C0799b6 c0799b6M1300kk = dataLabel.m1300kk();
        DataLabelFormat dataLabelFormat = (DataLabelFormat) iDataLabel.getDataLabelFormat();
        if (((PVIObject) C7019kk.m27452k4((Object) iDataLabel.getDataLabelFormat(), PVIObject.class)).m2138ix() && (!dataLabelFormat.getFormat().getEffect().equals(iDataLabelFormat.getFormat().getEffect()) || !dataLabelFormat.getFormat().getEffect3D().equals(iDataLabelFormat.getFormat().getEffect3D()) || !dataLabelFormat.getFormat().getFill().equals(iDataLabelFormat.getFormat().getFill()) || !dataLabelFormat.getFormat().getLine().equals(iDataLabelFormat.getFormat().getLine()) || dataLabelFormat.isNumberFormatLinkedToSource() != iDataLabelFormat.isNumberFormatLinkedToSource() || !C14113y2.m67363du(dataLabelFormat.getNumberFormat(), iDataLabelFormat.getNumberFormat()) || dataLabelFormat.getPosition() != iDataLabelFormat.getPosition() || !C14113y2.m67363du(dataLabelFormat.getSeparator(), iDataLabelFormat.getSeparator()) || dataLabelFormat.getShowBubbleSize() != iDataLabelFormat.getShowBubbleSize() || dataLabelFormat.getShowCategoryName() != iDataLabelFormat.getShowCategoryName() || dataLabelFormat.getShowLegendKey() != iDataLabelFormat.getShowLegendKey() || dataLabelFormat.getShowPercentage() != iDataLabelFormat.getShowPercentage() || dataLabelFormat.getShowSeriesName() != iDataLabelFormat.getShowSeriesName() || dataLabelFormat.getShowValue() != iDataLabelFormat.getShowValue() || dataLabelFormat.getShowLabelAsDataCallout() != iDataLabelFormat.getShowLabelAsDataCallout() || dataLabelFormat.getShowLabelValueFromCell() != iDataLabelFormat.getShowLabelValueFromCell())) {
            return true;
        }
        if (c0799b6M1300kk != null && rrr.m70335k4(c0799b6M1300kk)) {
            return true;
        }
        if (dataLabelFormat.m1319to() == null || !C13691jl.m63403k4(dataLabelFormat.m1319to())) {
            return dataLabel.m1302m9() != null && shm.m70629k4(dataLabel.m1302m9());
        }
        return true;
    }
}
