package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7321bg;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class s1a {
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
    
        r2 = (com.aspose.slides.internal.p332p7.nk7) r2.m29541kk();
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m70420k4(IBaseSlide iBaseSlide, com.aspose.slides.internal.p332p7.lzc lzcVar, OdpSerializationContext odpSerializationContext) {
        com.aspose.slides.internal.p332p7.nk7 nk7Var;
        IBackground background = iBaseSlide.getBackground();
        if (C7019kk.m27469x1(iBaseSlide, ILayoutSlide.class) && background.getType() == -1) {
            ILayoutSlide iLayoutSlide = (ILayoutSlide) iBaseSlide;
            if (iLayoutSlide.getMasterSlide() != null) {
                background = iLayoutSlide.getMasterSlide().getBackground();
            }
        }
        List.Enumerator<C7394ca> it = lzcVar.m36550to().iterator();
        while (true) {
            try {
                if (!it.hasNext()) {
                    nk7Var = null;
                    break;
                } else {
                    C7394ca next = it.next();
                    if ("drawing-page-properties".equals(next.m29539k4())) {
                        break;
                    }
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (nk7Var == null) {
            nk7Var = (com.aspose.slides.internal.p332p7.nk7) lzcVar.m36545k4("drawing-page-properties").m29542x1();
        }
        nk7Var.m37643k4((byte) 0);
        nk7Var.m37660x1((byte) 0);
        C14909zq.m74729k4(background.getEffective().getFillFormat(), new jlf(nk7Var), odpSerializationContext);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70421k4(MasterSlide masterSlide, com.aspose.slides.internal.p332p7.yq7 yq7Var, com.aspose.slides.internal.p332p7.xgo xgoVar, sm2 sm2Var, pkv pkvVar) {
        masterSlide.setName(C14113y2.m67402k4("Master{0}", Integer.valueOf(sm2Var.m70675jd())));
        final com.aspose.slides.internal.p332p7.kia kiaVar = (com.aspose.slides.internal.p332p7.kia) yq7Var.m45095k4("master-page").m29542x1();
        kiaVar.m35426kk(sm2Var.m70673dy());
        kiaVar.m35430x1(C14113y2.m67402k4("{0}-Slide", masterSlide.getName()));
        com.aspose.slides.internal.p332p7.lzc lzcVarM70674h4 = sm2Var.m70674h4();
        kiaVar.m35428to(lzcVarM70674h4.m36546k4());
        m70422k4(lzcVarM70674h4);
        m70420k4(masterSlide, lzcVarM70674h4, pkvVar.m69130x1());
        ov2.m68881k4(masterSlide.getShapes(), new C7394ca.k4() { // from class: com.aspose.slides.s1a.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(kiaVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_MasterPageElementData.AddShape(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return kiaVar.m35423k4(str);
            }
        }, pkvVar);
        for (int i = 0; i < masterSlide.getLayoutSlides().size(); i++) {
            ILayoutSlide iLayoutSlide = masterSlide.getLayoutSlides().get_Item(i);
            sm2Var.m70678x1().m2044c5().throwIfInterruptionRequested();
            if (m70423k4(masterSlide, iLayoutSlide, sm2Var)) {
                final com.aspose.slides.internal.p332p7.kia kiaVar2 = (com.aspose.slides.internal.p332p7.kia) yq7Var.m45095k4("master-page").m29542x1();
                kiaVar2.m35426kk(kiaVar.m35429x1());
                int iM67364dy = C14113y2.m67364dy(iLayoutSlide.getName(), CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR);
                if (iM67364dy > 0) {
                    iLayoutSlide.setName(C14113y2.m67422kk(iLayoutSlide.getName(), iM67364dy + 1));
                }
                iLayoutSlide.setName(C14113y2.m67402k4("Layout{0}-{1}-{2}", Integer.valueOf(i + 1), C7321bg.m28892k4(iLayoutSlide.getLayoutType()), C14113y2.m67401k4(iLayoutSlide.getName(), " ", CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR)));
                kiaVar2.m35430x1(C14113y2.m67402k4("{0}-{1}", masterSlide.getName(), iLayoutSlide.getName()));
                com.aspose.slides.internal.p332p7.lzc lzcVarM70674h42 = sm2Var.m70674h4();
                kiaVar2.m35428to(lzcVarM70674h42.m36546k4());
                m70422k4(lzcVarM70674h42);
                m70420k4(iLayoutSlide, lzcVarM70674h42, pkvVar.m69130x1());
                if (iLayoutSlide.getShowMasterShapes()) {
                    IGenericEnumerator<IShape> it = masterSlide.getShapes().iterator();
                    while (it.hasNext()) {
                        try {
                            IShape next = it.next();
                            pkvVar.m69130x1().m2044c5().throwIfInterruptionRequested();
                            if (next.getPlaceholder() == null) {
                                xky.m73463k4(next, new C7394ca.k4() { // from class: com.aspose.slides.s1a.2
                                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                    public String getDelegateId() {
                                        return System.identityHashCode(kiaVar2) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_MasterPageElementData.AddShape(System.String)";
                                    }

                                    @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                    /* JADX INFO: renamed from: k4 */
                                    public C7394ca mo2788k4(String str) {
                                        return kiaVar2.m35423k4(str);
                                    }
                                }, pkvVar);
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                }
                ov2.m68881k4(iLayoutSlide.getShapes(), new C7394ca.k4() { // from class: com.aspose.slides.s1a.3
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(kiaVar2) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.odfstyle_CT_MasterPageElementData.AddShape(System.String)";
                    }

                    @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                    /* JADX INFO: renamed from: k4 */
                    public C7394ca mo2788k4(String str) {
                        return kiaVar2.m35423k4(str);
                    }
                }, pkvVar);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70422k4(com.aspose.slides.internal.p332p7.lzc lzcVar) {
        com.aspose.slides.internal.p332p7.nk7 nk7Var = (com.aspose.slides.internal.p332p7.nk7) lzcVar.m36545k4("drawing-page-properties").m29542x1();
        nk7Var.m37633du((byte) 0);
        nk7Var.m37639h4((byte) 0);
        nk7Var.m37655to((byte) 0);
        nk7Var.m37647kk((byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    private static boolean m70423k4(MasterSlide masterSlide, ILayoutSlide iLayoutSlide, sm2 sm2Var) {
        IGenericEnumerator<ISlide> it = sm2Var.m70678x1().m2051k4().getSlides().iterator();
        while (it.hasNext()) {
            try {
                Slide slide = (Slide) it.next();
                if (slide.m2713v4() == masterSlide && slide.m2687bv() == iLayoutSlide) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return true;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }
}
