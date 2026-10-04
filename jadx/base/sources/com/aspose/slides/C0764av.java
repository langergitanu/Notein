package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7523dy;
import com.aspose.slides.internal.p332p7.C7222a9;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7405cg;
import com.aspose.slides.internal.p332p7.C7937ik;
import com.aspose.slides.internal.p332p7.C8085kg;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p332p7.C8135ku;
import com.aspose.slides.internal.p332p7.C8372nr;
import com.aspose.slides.internal.p332p7.C8578q5;
import com.aspose.slides.internal.p332p7.C8616qo;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C9218xn;
import com.aspose.slides.internal.p332p7.C9267ya;
import com.aspose.slides.internal.p332p7.InterfaceC8632qw;
import com.aspose.slides.internal.p332p7.InterfaceC8810sv;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.huawei.hms.network.embedded.C18177fb;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.av */
/* JADX INFO: loaded from: classes3.dex */
class C0764av {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f3958k4 = new C7017h4("crosses", "crossesAt", "custUnit", "builtInUnit");

    /* JADX INFO: renamed from: k4 */
    public static void m3747k4(IAxis iAxis, int i, C8578q5 c8578q5) {
        double dM29595k4;
        List.Enumerator<C7394ca> it = c8578q5.m39346h4().iterator();
        while (it.hasNext()) {
            try {
                AbstractC7523dy abstractC7523dy = (AbstractC7523dy) it.next().m29542x1();
                if (abstractC7523dy.mo28028k4().m41464k4() == i && abstractC7523dy.mo28043um() != null) {
                    int iM27428k4 = f3958k4.m27428k4(abstractC7523dy.mo28043um().m29539k4());
                    if (iM27428k4 == 0) {
                        iAxis.setCrossType(((C8085kg) abstractC7523dy.mo28043um().m29542x1()).m35351k4());
                        if (iAxis.getCrossType() == 2 && !iAxis.isAutomaticMinValue() && !C14044b3.m66437kk(iAxis.getMinValue())) {
                            dM29595k4 = iAxis.getMinValue();
                        }
                    } else {
                        if (iM27428k4 != 1) {
                            throw new Exception(C14113y2.m67408k4("Unknown element \"", abstractC7523dy.mo28043um().m29539k4(), "\""));
                        }
                        C7405cg c7405cg = (C7405cg) abstractC7523dy.mo28043um().m29542x1();
                        iAxis.setCrossType(2);
                        dM29595k4 = c7405cg.m29595k4();
                    }
                    iAxis.setCrossAt((float) dM29595k4);
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m3751x1(IAxis iAxis, AbstractC7523dy abstractC7523dy, u8s u8sVar) {
        C14252ou c14252ouM319k4 = ((Axis) iAxis).m319k4();
        abstractC7523dy.mo28012ar().m41465k4(c14252ouM319k4.m68833c5());
        if (C7019kk.m27469x1(abstractC7523dy, C9267ya.class)) {
            final C9267ya c9267ya = (C9267ya) abstractC7523dy;
            if (iAxis.getDisplayUnit() != 0) {
                c9267ya.mo30707xw();
                if (iAxis.getDisplayUnit() == 10) {
                    ((C7405cg) c9267ya.mo30703t6().m35173k4("custUnit").m29542x1()).m29596k4(c14252ouM319k4.m68840k4());
                } else {
                    ((C8135ku) c9267ya.mo30703t6().m35173k4("builtInUnit").m29542x1()).m35722k4(iAxis.getDisplayUnit());
                }
                C14914zt.m74806k4(((Axis) iAxis).m327x1(), new AbstractC4685kk<C8372nr>() { // from class: com.aspose.slides.av.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c9267ya.mo30703t6()) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.cht_CT_DispUnitsElementData.AddDispUnitsLbl()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8372nr invoke() {
                        return c9267ya.mo30703t6().m35174k4();
                    }
                }, u8sVar);
                c9267ya.mo30703t6().m35175k4(c14252ouM319k4.m68851to());
            }
            if (c14252ouM319k4.m68850m9() != -1) {
                c9267ya.mo30701f9().m38898k4(c14252ouM319k4.m68850m9());
            }
        } else if (C7019kk.m27469x1(abstractC7523dy, C8616qo.class)) {
            C8616qo c8616qo = (C8616qo) abstractC7523dy;
            if (c14252ouM319k4.m68835du() != -1) {
                c8616qo.mo30702lr().m34423k4(c14252ouM319k4.m68835du());
            }
            c8616qo.mo30706xk().m41466k4(c14252ouM319k4.m68838h4());
        } else if (!C7019kk.m27469x1(abstractC7523dy, C7222a9.class)) {
            C7019kk.m27469x1(abstractC7523dy, C9218xn.class);
        }
        if (C7019kk.m27469x1(abstractC7523dy, InterfaceC8810sv.class)) {
            ((InterfaceC8810sv) C7019kk.m27452k4((Object) abstractC7523dy, InterfaceC8810sv.class)).mo28038s7().m41466k4(c14252ouM319k4.m68839jd());
            abstractC7523dy.mo28014bv().m41466k4(false);
        }
        abstractC7523dy.mo28028k4().m41465k4(c14252ouM319k4.m68836dy());
        abstractC7523dy.mo28048x1().m36147k4(c14252ouM319k4.m68846kk());
        abstractC7523dy.mo28029k4(c14252ouM319k4.m68855x1());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m3748k4(IAxis iAxis, AbstractC7523dy abstractC7523dy, gnb gnbVar) {
        Axis axis = (Axis) iAxis;
        C14252ou c14252ouM319k4 = axis.m319k4();
        if (abstractC7523dy.mo30703t6() != null && abstractC7523dy.mo30703t6().m35178x1() != null) {
            int iM27428k4 = f3958k4.m27428k4(abstractC7523dy.mo30703t6().m35178x1().m29539k4());
            if (iM27428k4 == 2) {
                C7405cg c7405cg = (C7405cg) abstractC7523dy.mo30703t6().m35178x1().m29542x1();
                iAxis.setDisplayUnit(10);
                c14252ouM319k4.m68841k4(c7405cg.m29595k4());
            } else {
                if (iM27428k4 != 3) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", abstractC7523dy.mo30703t6().m35178x1().m29539k4(), "\""));
                }
                iAxis.setDisplayUnit(((C8135ku) abstractC7523dy.mo30703t6().m35178x1().m29542x1()).m35721k4());
            }
            C14914zt.m74807k4(axis.m327x1(), abstractC7523dy.mo30703t6().m35176kk(), gnbVar);
            c14252ouM319k4.m68849kk(abstractC7523dy.mo30703t6().m35177to());
        }
        c14252ouM319k4.m68858x1(abstractC7523dy.mo28048x1().m36142c5());
        if (abstractC7523dy.mo28014bv() != null) {
            c14252ouM319k4.m68859x1(abstractC7523dy.mo28014bv().m41467k4());
        }
        if (C7019kk.m27469x1(abstractC7523dy, C8616qo.class)) {
            iAxis.setCategoryAxisType(0);
        } else if (C7019kk.m27469x1(abstractC7523dy, C7222a9.class)) {
            iAxis.setCategoryAxisType(1);
            iAxis.setCategoryAxisTypeAutomatically();
        }
        if (abstractC7523dy.mo30704v4() != null) {
            c14252ouM319k4.m68842k4(abstractC7523dy.mo30704v4().m34422k4());
        }
        if (abstractC7523dy.mo30700dq() != null) {
            c14252ouM319k4.m68845k4(abstractC7523dy.mo30700dq().m41467k4());
        }
        if (abstractC7523dy.aK_() != null) {
            c14252ouM319k4.m68856x1(abstractC7523dy.aK_().m38897k4());
        }
        c14252ouM319k4.m68847kk(abstractC7523dy.mo28028k4().m41464k4());
        c14252ouM319k4.m68844k4(abstractC7523dy.mo28017c6());
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0272  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3749k4(IAxis iAxis, AbstractC7523dy abstractC7523dy, C14144mu c14144mu) {
        if (abstractC7523dy == null) {
            return;
        }
        gnb gnbVarM4229k4 = c14144mu.m67731k4().m4229k4();
        m3748k4(iAxis, abstractC7523dy, gnbVarM4229k4);
        if (abstractC7523dy.mo28048x1().m36149m9() != null) {
            iAxis.setAutomaticMaxValue(false);
            iAxis.setMaxValue(abstractC7523dy.mo28048x1().m36149m9().m29595k4());
        }
        if (abstractC7523dy.mo28048x1().m36144dy() != null) {
            iAxis.setAutomaticMinValue(false);
            iAxis.setMinValue(abstractC7523dy.mo28048x1().m36144dy().m29595k4());
        }
        if (abstractC7523dy.mo28048x1().m36143du() != null) {
            iAxis.setLogarithmic(true);
            iAxis.setLogBase(abstractC7523dy.mo28048x1().m36143du().m35478k4());
        }
        if (abstractC7523dy.mo28048x1().m36145h4() != null) {
            iAxis.setPlotOrderReversed(abstractC7523dy.mo28048x1().m36145h4().m41288k4() == 1);
        }
        iAxis.setVisible(!((DocumentProperties) gnbVarM4229k4.m6801yj().getDocumentProperties()).m1344m9() ? abstractC7523dy.mo28030kk() == null || abstractC7523dy.mo28030kk().m41467k4() : abstractC7523dy.mo28030kk() != null && abstractC7523dy.mo28030kk().m41467k4());
        iAxis.setPosition(abstractC7523dy.mo28019du().m32293k4());
        C13718k9.m63721k4(iAxis.getMajorGridLinesFormat(), abstractC7523dy.mo28024h4(), gnbVarM4229k4);
        C13718k9.m63721k4(iAxis.getMinorGridLinesFormat(), abstractC7523dy.mo28020dy(), gnbVarM4229k4);
        C13725ke.m63776k4(iAxis.getTitle(), abstractC7523dy.mo28026jd(), gnbVarM4229k4);
        iAxis.setTitle(abstractC7523dy.mo28026jd() != null);
        if (abstractC7523dy.mo28021fa() != null) {
            iAxis.setNumberFormatLinkedToSource(abstractC7523dy.mo28021fa().m34185x1() != 0);
            iAxis.setNumberFormat(C13831md.m64850k4(abstractC7523dy.mo28021fa().m34182k4()));
        }
        if (abstractC7523dy.mo28051yj() != null) {
            iAxis.setMajorTickMark(abstractC7523dy.mo28051yj().m34617k4());
        }
        if (abstractC7523dy.mo28037rv() != null) {
            iAxis.setMinorTickMark(abstractC7523dy.mo28037rv().m34617k4());
        }
        if (abstractC7523dy.mo28034ne() != null) {
            iAxis.setTickLabelPosition(abstractC7523dy.mo28034ne().m43596k4());
        }
        if (abstractC7523dy.mo28050yd() != null) {
            iAxis.setLabelOffset(abstractC7523dy.mo28050yd().m37143k4());
        }
        C14616u5.m71486k4(iAxis.getFormat(), abstractC7523dy.mo28042u4(), gnbVarM4229k4);
        C13691jl.m63398k4(iAxis.getTextFormat(), abstractC7523dy.mo28046wl(), gnbVarM4229k4);
        C8578q5 c8578q5M67734kk = c14144mu.m67734kk();
        Axis axis = (Axis) iAxis;
        axis.m319k4().m68852to(abstractC7523dy.mo28012ar().m41464k4());
        m3747k4(iAxis, abstractC7523dy.mo28012ar().m41464k4(), c8578q5M67734kk);
        if (abstractC7523dy.aI_() == null) {
            if (iAxis.getCategoryAxisType() == 1) {
                iAxis.setBaseUnitScale(1);
            }
            if (abstractC7523dy.mo28015bz() != null) {
                if (C7019kk.m27469x1(abstractC7523dy, C7222a9.class) && iAxis.getCategoryAxisType() == 0) {
                    iAxis.setAutomaticTickLabelSpacing(abstractC7523dy.mo28015bz().m34427k4() == 0.0d);
                    iAxis.setTickLabelSpacing(C7019kk.m27435du(Double.valueOf(abstractC7523dy.mo28015bz().m34427k4()), 14));
                } else {
                    iAxis.setAutomaticMajorUnit(abstractC7523dy.mo28015bz().m34427k4() == 0.0d);
                    iAxis.setMajorUnit(abstractC7523dy.mo28015bz().m34427k4());
                }
            }
            if (abstractC7523dy.mo28022g8() != null) {
                iAxis.setMajorUnitScale(abstractC7523dy.mo28022g8().m42838k4());
            }
            if (abstractC7523dy.mo28047wp() != null) {
                iAxis.setAutomaticMinorUnit(abstractC7523dy.mo28047wp().m34427k4() == 0.0d);
                iAxis.setMinorUnit(abstractC7523dy.mo28047wp().m34427k4());
            }
            if (abstractC7523dy.mo28031kp() != null) {
                iAxis.setMinorUnitScale(abstractC7523dy.mo28031kp().m42838k4());
            }
            if (abstractC7523dy.mo30705wy() != null) {
                iAxis.setTickLabelSpacing(abstractC7523dy.mo30705wy().m31781k4() & 65535);
                iAxis.setAutomaticTickLabelSpacing(false);
            }
            if (abstractC7523dy.mo30699ak() != null) {
                iAxis.setTickMarksSpacing(abstractC7523dy.mo30699ak().m31781k4() & 65535);
                iAxis.setAutomaticTickMarksSpacing(false);
            }
            if (iAxis.isAutomaticMinorUnit() && !iAxis.isAutomaticMajorUnit() && C7019kk.m27469x1(abstractC7523dy, C7222a9.class) && iAxis.getMinorUnit() > iAxis.getMajorUnit() && iAxis.getMajorUnitScale() == iAxis.getMinorUnitScale()) {
                iAxis.setMajorUnitScale((iAxis.getMinorUnitScale() == 1 || iAxis.getMinorUnitScale() == 0) ? 2 : 3);
                return;
            }
            return;
        }
        iAxis.setBaseUnitScale(abstractC7523dy.aI_().m42838k4());
        axis.m322k4(false);
        if (abstractC7523dy.mo28015bz() != null) {
        }
        if (abstractC7523dy.mo28022g8() != null) {
        }
        if (abstractC7523dy.mo28047wp() != null) {
        }
        if (abstractC7523dy.mo28031kp() != null) {
        }
        if (abstractC7523dy.mo30705wy() != null) {
        }
        if (abstractC7523dy.mo30699ak() != null) {
        }
        if (iAxis.isAutomaticMinorUnit()) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m3750k4(IAxis iAxis, final AbstractC7523dy abstractC7523dy, u8s u8sVar) {
        if (iAxis == null) {
            return;
        }
        abstractC7523dy.mo28048x1().m36151x1().m41289k4(iAxis.isPlotOrderReversed() ? 1 : 2);
        if (!iAxis.isAutomaticMaxValue()) {
            abstractC7523dy.mo28048x1().m36148kk().m29596k4(iAxis.getMaxValue());
        }
        if (!iAxis.isAutomaticMinValue()) {
            abstractC7523dy.mo28048x1().m36150to().m29596k4(iAxis.getMinValue());
        }
        if (iAxis.isLogarithmic()) {
            abstractC7523dy.mo28048x1().m36146k4().m35479k4(iAxis.getLogBase());
        }
        abstractC7523dy.mo28041to().m41466k4(!iAxis.isVisible());
        abstractC7523dy.mo28019du().m32294k4(iAxis.getPosition());
        if (iAxis.getShowMajorGridLines()) {
            C13718k9.m63722k4(iAxis.getMajorGridLinesFormat(), abstractC7523dy.mo28033m9(), u8sVar);
        }
        if (iAxis.getShowMinorGridLines()) {
            C13718k9.m63722k4(iAxis.getMinorGridLinesFormat(), abstractC7523dy.mo28016c5(), u8sVar);
        }
        if (iAxis.hasTitle()) {
            C13725ke.m63777k4(iAxis.getTitle(), abstractC7523dy.mo28018ck(), u8sVar);
        }
        if (!"".equals(C14113y2.m67440x1(iAxis.getNumberFormat()))) {
            C7937ik c7937ikMo28044up = abstractC7523dy.mo28044up();
            c7937ikMo28044up.m34183k4(iAxis.isNumberFormatLinkedToSource() ? (byte) 1 : (byte) 0);
            c7937ikMo28044up.m34184k4(iAxis.getNumberFormat());
        }
        if (iAxis.getMajorTickMark() != 0) {
            abstractC7523dy.mo28032ks().m34618k4(iAxis.getMajorTickMark());
        }
        if (iAxis.getMinorTickMark() != 0) {
            abstractC7523dy.mo28049x6().m34618k4(iAxis.getMinorTickMark());
        }
        if (iAxis.getTickLabelPosition() != 2) {
            abstractC7523dy.mo28025ix().m43597k4(iAxis.getTickLabelPosition());
        }
        if (C7019kk.m27469x1(abstractC7523dy, InterfaceC8632qw.class) && !iAxis.isAutomaticTickLabelSpacing()) {
            ((InterfaceC8632qw) C7019kk.m27452k4((Object) abstractC7523dy, InterfaceC8632qw.class)).mo39627ts().m31782k4((int) (iAxis.getTickLabelSpacing() & C18177fb.f54859s));
        }
        if (C7019kk.m27469x1(abstractC7523dy, InterfaceC8632qw.class) && !iAxis.isAutomaticTickMarksSpacing()) {
            ((InterfaceC8632qw) C7019kk.m27452k4((Object) abstractC7523dy, InterfaceC8632qw.class)).mo39626e0().m31782k4((int) (iAxis.getTickMarksSpacing() & C18177fb.f54859s));
        }
        C14616u5.m71484k4(iAxis.getFormat(), new AbstractC4685kk<C8087kh>() { // from class: com.aspose.slides.av.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC7523dy) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseAxisElementData.AddSpPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8087kh invoke() {
                return abstractC7523dy.mo28045uz();
            }
        }, u8sVar);
        C13691jl.m63395k4(iAxis.getTextFormat(), new AbstractC4685kk<C8952ug>() { // from class: com.aspose.slides.av.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC7523dy) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseAxisElementData.AddTxPr()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8952ug invoke() {
                return abstractC7523dy.mo28036qq();
            }
        }, u8sVar);
        if (C7019kk.m27469x1(abstractC7523dy, C7222a9.class)) {
            C7222a9 c7222a9 = (C7222a9) abstractC7523dy;
            if (!iAxis.isAutomaticMajorUnit()) {
                if (iAxis.getMajorUnitScale() != 0) {
                    c7222a9.mo28040sv().m42839k4(iAxis.getMajorUnitScale());
                }
                c7222a9.mo28035qm().m34428k4(iAxis.getMajorUnit());
            }
            if (!iAxis.isAutomaticMinorUnit()) {
                if (iAxis.getMinorUnitScale() != 0) {
                    c7222a9.mo28023gi().m42839k4(iAxis.getMinorUnitScale());
                }
                c7222a9.mo28039ss().m34428k4(iAxis.getMinorUnit());
            }
            if (iAxis.getBaseUnitScale() != 0) {
                c7222a9.aJ_().m42839k4(iAxis.getBaseUnitScale());
            }
            c7222a9.mo28013b3().m37144k4(iAxis.getLabelOffset());
        }
        if (C7019kk.m27469x1(abstractC7523dy, C8616qo.class)) {
            ((C8616qo) abstractC7523dy).mo28013b3().m37144k4(iAxis.getLabelOffset());
        }
        if (C7019kk.m27469x1(abstractC7523dy, C9267ya.class)) {
            C9267ya c9267ya = (C9267ya) abstractC7523dy;
            if (!iAxis.isAutomaticMajorUnit()) {
                c9267ya.mo28035qm().m34428k4(iAxis.getMajorUnit());
            }
            if (!iAxis.isAutomaticMinorUnit()) {
                c9267ya.mo28039ss().m34428k4(iAxis.getMinorUnit());
            }
        }
        m3751x1(iAxis, abstractC7523dy, u8sVar);
    }
}
