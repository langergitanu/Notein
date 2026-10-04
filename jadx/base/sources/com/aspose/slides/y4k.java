package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.SortedList;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7224aa;
import com.aspose.slides.internal.p332p7.C8345ni;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class y4k extends C14665v6 {
    public y4k(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: x1 */
    private void m73737x1(IMasterSlide iMasterSlide, C7224aa c7224aa) {
        wzi wziVarM1944x6 = ((MasterSlide) iMasterSlide).m1944x6();
        wziVarM1944x6.m5304k4(c7224aa.m28071ck());
        C13670j2.m63196k4(iMasterSlide.getTimeline(), c7224aa.m28071ck(), new yqd(m72077k4().m4229k4(), m72077k4().m4237to()));
        C14189nn.m68099k4(wziVarM1944x6.m72984dy(), c7224aa.m28074fa());
        wziVarM1944x6.m72986to(c7224aa.m28085yj());
        com.aspose.slides.internal.p332p7.i0a i0aVarM28083up = c7224aa.m28083up();
        if (i0aVarM28083up != null) {
            wziVarM1944x6.m72983du(i0aVarM28083up.m33794m9());
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73738k4(IMasterSlide iMasterSlide) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1 && "sldMaster".equals(m55443jd().mo65023fa())) {
                C7224aa c7224aa = new C7224aa(m55443jd());
                C14349qj.m69670k4(iMasterSlide.getThemeManager(), c7224aa.m28073dy());
                m72078k4(iMasterSlide.getThemeManager());
                C14869z1.m74188k4(iMasterSlide, c7224aa.m28081m9(), m72077k4());
                qas.m69498k4(iMasterSlide.getSlideShowTransition(), c7224aa.m28076jd(), mo3471m9());
                com.aspose.slides.internal.p332p7.i0a i0aVarM28083up = c7224aa.m28083up();
                if (i0aVarM28083up != null) {
                    iq8.m63054k4(iMasterSlide.getTitleStyle(), i0aVarM28083up.m33795to(), mo3471m9());
                    iq8.m63054k4(iMasterSlide.getBodyStyle(), i0aVarM28083up.m33789du(), mo3471m9());
                    iq8.m63054k4(iMasterSlide.getOtherStyle(), i0aVarM28083up.m33790h4(), mo3471m9());
                }
                iMasterSlide.setPreserve(c7224aa.m28075h4());
                m73737x1(iMasterSlide, c7224aa);
                m73736k4(iMasterSlide, c7224aa);
            }
        }
        mo55330fa();
    }

    public y4k(C11791os c11791os, u8s u8sVar, IBaseSlide iBaseSlide) {
        super(c11791os, u8sVar, iBaseSlide);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ca A[SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m73736k4(IMasterSlide iMasterSlide, C7224aa c7224aa) {
        tgu tguVarM1849x6;
        long jM37408k4;
        SortedList[] sortedListArr = {null};
        mo3471m9().m6777fa().tryGetValue(mo3467du().m55427x1(), sortedListArr);
        SortedList sortedList = sortedListArr[0];
        if (c7224aa.m28070c5() != null) {
            for (com.aspose.slides.internal.p332p7.nc9 nc9Var : c7224aa.m28070c5().m39950x1()) {
                C11791os c11791osM55296x1 = mo3471m9().m55338u4().m55303k4(nc9Var.m37413x1()).m55296x1();
                ILayoutSlide[] iLayoutSlideArr = {null};
                new q7e(c11791osM55296x1, mo3471m9()).m69458k4(iMasterSlide, iLayoutSlideArr);
                ILayoutSlide iLayoutSlide = iLayoutSlideArr[0];
                int iM6775du = mo3471m9().m6775du();
                if (iM6775du == 0) {
                    tguVarM1849x6 = ((LayoutSlide) iLayoutSlide).m1849x6();
                    jM37408k4 = nc9Var.m37408k4();
                } else if (iM6775du != 1) {
                    if (iM6775du != 2 && iM6775du != 3) {
                        throw new ArgumentOutOfRangeException();
                    }
                    ((Presentation) iMasterSlide.getPresentation()).m2351fa().m68396x1(nc9Var.m37408k4());
                    mo3471m9().m6780jd().addItem(c11791osM55296x1.m55427x1(), iLayoutSlide);
                    ((LayoutSlide) iLayoutSlide).m1849x6().m5311x1(nc9Var.m37412kk());
                    if (sortedList == null) {
                        sortedList.removeItemByKey(c11791osM55296x1.m55427x1());
                    }
                } else {
                    tguVarM1849x6 = ((LayoutSlide) iLayoutSlide).m1849x6();
                    jM37408k4 = ((Presentation) iMasterSlide.getPresentation()).m2351fa().m68390um();
                }
                tguVarM1849x6.m5302k4(jM37408k4);
                ((Presentation) iMasterSlide.getPresentation()).m2351fa().m68396x1(nc9Var.m37408k4());
                mo3471m9().m6780jd().addItem(c11791osM55296x1.m55427x1(), iLayoutSlide);
                ((LayoutSlide) iLayoutSlide).m1849x6().m5311x1(nc9Var.m37412kk());
                if (sortedList == null) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m73739k4(IMasterSlide iMasterSlide, boolean z) {
        mo55332up();
        final C7224aa c7224aa = new C7224aa();
        wzi wziVarM1944x6 = ((MasterSlide) iMasterSlide).m1944x6();
        mo3468h4().m71548kk().addItem(iMasterSlide, mo3467du());
        m72079k4(iMasterSlide.getShapes(), m72080x1());
        if (c7224aa.m28071ck() == null) {
            c7224aa.m28080kk();
        }
        C13670j2.m63195k4(iMasterSlide.getTimeline(), iMasterSlide.getShapes(), c7224aa.m28071ck(), new gi8(m72080x1().m70580k4(), m72080x1().m70576du()));
        C14869z1.m74189k4(iMasterSlide, c7224aa.m28081m9(), m72080x1());
        C14349qj.m69675x1(iMasterSlide.getThemeManager(), c7224aa.m28073dy());
        if (iMasterSlide.getLayoutSlides().size() > 0 && z) {
            com.aspose.slides.internal.p332p7.rbg rbgVarM28077k4 = c7224aa.m28077k4();
            IGenericEnumerator<ILayoutSlide> it = iMasterSlide.getLayoutSlides().iterator();
            while (it.hasNext()) {
                try {
                    LayoutSlide layoutSlide = (LayoutSlide) it.next();
                    com.aspose.slides.internal.p332p7.nc9 nc9VarM39949k4 = rbgVarM28077k4.m39949k4();
                    nc9VarM39949k4.m37409k4(layoutSlide.m1849x6().m5309to());
                    nc9VarM39949k4.m37411k4(mo3467du().m55377up().m55302k4(mo3468h4().m71548kk().get_Item(layoutSlide)).m55289du());
                    nc9VarM39949k4.m37410k4(layoutSlide.m1849x6().m5299du());
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
        }
        qas.m69499k4(iMasterSlide.getSlideShowTransition(), c7224aa.m28084x1(), mo3468h4());
        final com.aspose.slides.internal.p332p7.i0a i0aVarM28072du = c7224aa.m28072du();
        iq8.m63053k4(iMasterSlide.getTitleStyle(), new AbstractC4685kk<C8345ni>() { // from class: com.aspose.slides.y4k.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(i0aVarM28072du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_SlideMasterTextStylesElementData.AddTitleStyle()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8345ni invoke() {
                return i0aVarM28072du.m33791k4();
            }
        }, mo3468h4());
        iq8.m63053k4(iMasterSlide.getBodyStyle(), new AbstractC4685kk<C8345ni>() { // from class: com.aspose.slides.y4k.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(i0aVarM28072du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_SlideMasterTextStylesElementData.AddBodyStyle()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8345ni invoke() {
                return i0aVarM28072du.m33796x1();
            }
        }, mo3468h4());
        iq8.m63053k4(iMasterSlide.getOtherStyle(), new AbstractC4685kk<C8345ni>() { // from class: com.aspose.slides.y4k.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(i0aVarM28072du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_SlideMasterTextStylesElementData.AddOtherStyle()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8345ni invoke() {
                return i0aVarM28072du.m33793kk();
            }
        }, mo3468h4());
        c7224aa.m28079k4(iMasterSlide.getPreserve());
        C14189nn.m68098k4(wziVarM1944x6.m72984dy(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.qvp>() { // from class: com.aspose.slides.y4k.4
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7224aa) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.SlideMasterElementData.AddHf()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.qvp invoke() {
                return c7224aa.m28082to();
            }
        });
        c7224aa.m28078k4(wziVarM1944x6.m72982c5());
        c7224aa.m28083up().m33792k4(wziVarM1944x6.m72985jd());
        c7224aa.mo6846k4(null, m55442ck(), "sldMaster");
        mo55333yj();
    }
}
