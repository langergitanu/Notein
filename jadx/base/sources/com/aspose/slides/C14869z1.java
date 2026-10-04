package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C7971j0;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11827ub;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.slides.p559ms.System.Xml.C13850af;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.z1 */
/* JADX INFO: loaded from: classes3.dex */
class C14869z1 {
    /* JADX INFO: renamed from: k4 */
    private static C13981tl m74185k4(AbstractC7414ck abstractC7414ck) {
        return m74186k4(abstractC7414ck, "creationId", "{BB962C8B-B14F-4D97-AF65-F5344CB8AC3E}", "http://schemas.microsoft.com/office/powerpoint/2010/main");
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74190x1(IBaseSlide iBaseSlide, com.aspose.slides.internal.p332p7.jqo jqoVar, bjs bjsVar) {
        AbstractC0919dx abstractC0919dxMo400kk = ((BaseSlide) iBaseSlide).mo400kk();
        gnb gnbVarM4229k4 = bjsVar.m4229k4();
        C0756an.m3680k4(iBaseSlide.getControls(), jqoVar.m34898dy(), bjsVar);
        C14537t9.m71034k4(iBaseSlide.getCustomData(), jqoVar.m34904m9(), gnbVarM4229k4);
        abstractC0919dxMo400kk.m5307kk(jqoVar.m34896c5());
        m74187k4(iBaseSlide, jqoVar.m34896c5(), bjsVar);
        C11709bg[] c11709bgArrM55309k4 = gnbVarM4229k4.m55338u4().m55309k4(C11827ub.f39880k4);
        if (c11709bgArrM55309k4.length > 0) {
            for (int i = 0; i < c11709bgArrM55309k4.length; i++) {
                C11791os c11791osM55296x1 = c11709bgArrM55309k4[i].m55296x1();
                if (i == 0) {
                    new smo(c11791osM55296x1, gnbVarM4229k4).m70690k4(iBaseSlide, bjsVar);
                } else if (gnbVarM4229k4.m6792ne()) {
                    c11791osM55296x1.m55422k4(true);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static C13981tl m74186k4(AbstractC7414ck abstractC7414ck, String str, String str2, String str3) {
        XmlDocument xmlDocumentM29999k4;
        if (abstractC7414ck == null || abstractC7414ck.mo29643k4().length == 0 || (xmlDocumentM29999k4 = com.aspose.slides.internal.p332p7.d0s.m29999k4(abstractC7414ck, str2)) == null || xmlDocumentM29999k4.getDocumentElement() == null) {
            return null;
        }
        return (C13981tl) fyw.m6354k4(xmlDocumentM29999k4.getDocumentElement(), str, str3);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m74191x1(IBaseSlide iBaseSlide, final com.aspose.slides.internal.p332p7.jqo jqoVar, sdp sdpVar) {
        AbstractC0919dx abstractC0919dxMo400kk = ((BaseSlide) iBaseSlide).mo400kk();
        final u8s u8sVarM70580k4 = sdpVar.m70580k4();
        C0756an.m3679k4(iBaseSlide.getControls(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.lpe>() { // from class: com.aspose.slides.z1.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(jqoVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_CommonSlideDataElementData.AddControls()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.lpe invoke() {
                return jqoVar.m34903kk();
            }
        }, sdpVar);
        C14537t9.m71033k4(iBaseSlide.getCustomData(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.fbr>() { // from class: com.aspose.slides.z1.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(jqoVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_CommonSlideDataElementData.AddCustDataLst()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.fbr invoke() {
                return jqoVar.m34906x1();
            }
        }, u8sVarM70580k4);
        if (!sdpVar.m70580k4().m71531dy()) {
            jqoVar.m34901k4(abstractC0919dxMo400kk.m5300h4());
        }
        if (sdpVar.m70578h4().size() > 0) {
            C11791os c11791osM55394k4 = u8sVarM70580k4.mo4812qm().m55394k4("/ppt/drawings/vmlDrawing{0}.vml", new AbstractC11760jd.k4() { // from class: com.aspose.slides.z1.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(u8sVarM70580k4, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextVmlDrawingFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return u8sVarM70580k4.m71550ks();
                }
            }, new C11827ub());
            new smo(c11791osM55394k4, u8sVarM70580k4).m70691k4(sdpVar);
            u8sVarM70580k4.m55433g8().m55311x1(c11791osM55394k4);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74187k4(IBaseSlide iBaseSlide, AbstractC7414ck abstractC7414ck, bjs bjsVar) {
        C13981tl c13981tlM74185k4 = m74185k4(abstractC7414ck);
        if (c13981tlM74185k4 != null) {
            ((BaseSlide) iBaseSlide).m394k4(C14114y9.m67456k4(c13981tlM74185k4.m65906k4("val")));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74188k4(IBaseSlide iBaseSlide, com.aspose.slides.internal.p332p7.jqo jqoVar, bjs bjsVar) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        if (jqoVar == null) {
            return;
        }
        C14490t8.m70985k4(iBaseSlide.getShapes().getParentGroup(), jqoVar.m34899h4(), bjsVar);
        C0931e8.m5379k4(iBaseSlide.getBackground(), jqoVar.m34897du(), bjsVar.m4229k4());
        IGenericEnumerator<Long> it = bjsVar.m4237to().getKeys().iterator();
        long j7 = 0;
        long j8 = 0;
        while (true) {
            try {
                j = 4294967295L;
                if (!it.hasNext()) {
                    break;
                }
                long[] jArr = {0};
                boolean z = C14114y9.m67463k4(it.next(), jArr) && (j8 & 4294967295L) < (jArr[0] & 4294967295L);
                long j9 = jArr[0];
                if (z) {
                    j8 = j9;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        ((BaseSlide) iBaseSlide).m395k4(((j8 & 4294967295L) + 1) & 4294967295L, false);
        List.Enumerator<IPlaceholder> it2 = bjsVar.m4226du().iterator();
        while (it2.hasNext()) {
            try {
                ISlideComponent next = it2.next();
                if (C7019kk.m27469x1(next, Shape.class)) {
                    ((Shape) next).m2574ss();
                    bjsVar.m4234k4(C13850af.m65147x1(((Shape) next).mo272to().m69039ix()), next);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
            it2.dispose();
        }
        bjsVar.m4226du().clear();
        if (bjsVar.m4236m9().size() <= 0) {
            j2 = 0;
            j3 = 4294967295L;
        } else {
            if (C7019kk.m27469x1(iBaseSlide, MasterSlide.class) || C7019kk.m27469x1(iBaseSlide, MasterNotesSlide.class) || C7019kk.m27469x1(iBaseSlide, MasterHandoutSlide.class)) {
                j2 = 0;
                j3 = 4294967295L;
                it = bjsVar.m4228h4().getKeys().iterator();
                long j10 = 0;
                while (it.hasNext()) {
                    try {
                        long jLongValue = ((Long) C7019kk.m27464to(it.next(), Long.TYPE)).longValue();
                        long j11 = jLongValue & 4294967295L;
                        if ((j10 & 4294967295L) < j11 && j11 != 4294967295L) {
                            j10 = jLongValue;
                        }
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                for (IPlaceholder iPlaceholder : bjsVar.m4236m9().toArray(new IPlaceholder[0])) {
                    Placeholder placeholder = (Placeholder) iPlaceholder;
                    j10++;
                    placeholder.m2270k4(j10);
                    bjsVar.m4232k4(placeholder.m2269k4(), placeholder);
                }
            } else {
                if (C7019kk.m27469x1(iBaseSlide, LayoutSlide.class) || C7019kk.m27469x1(iBaseSlide, NotesSlide.class)) {
                    IGenericEnumerator<KeyValuePair<Long, IPlaceholder>> it3 = bjsVar.m4228h4().iterator();
                    long j12 = 0;
                    while (true) {
                        try {
                            j4 = 10;
                            if (!it3.hasNext()) {
                                break;
                            }
                            KeyValuePair<Long, IPlaceholder> next2 = it3.next();
                            long jLongValue2 = next2.getKey().longValue();
                            IPlaceholder value = next2.getValue();
                            long j13 = jLongValue2 & 4294967295L;
                            if ((j12 & 4294967295L) < j13 && j13 != 4294967295L && (value.getIndex() & 4294967295L) != 10 && (value.getIndex() & 4294967295L) != 11 && (value.getIndex() & 4294967295L) != 12) {
                                j12 = jLongValue2;
                            }
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it3, (Class<IDisposable>) IDisposable.class)) {
                                it3.dispose();
                            }
                        }
                    }
                    it2 = bjsVar.m4236m9().iterator();
                    while (it2.hasNext()) {
                        try {
                            Placeholder placeholder2 = (Placeholder) it2.next();
                            if ((j12 & j) == 9) {
                                j12 = 12;
                            }
                            long j14 = j7;
                            if (placeholder2.getType() == 4 || placeholder2.getType() == 6 || placeholder2.getType() == 5) {
                                long j15 = j4;
                                while (true) {
                                    j5 = j;
                                    if (!bjsVar.m4228h4().containsKey(Long.valueOf(j15))) {
                                        break;
                                    }
                                    j15++;
                                    j = j5;
                                }
                                j6 = j15 + 1;
                                placeholder2.m2270k4(j15);
                            } else {
                                j12++;
                                placeholder2.m2270k4(j12);
                                long j16 = j4;
                                j5 = j;
                                j6 = j16;
                            }
                            bjsVar.m4233k4(placeholder2.m2269k4(), placeholder2, false);
                            long j17 = j5;
                            j4 = j6;
                            j = j17;
                            j7 = j14;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    j2 = j7;
                    j3 = j;
                    if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                        it2.dispose();
                    }
                }
                j2 = 0;
                j3 = 4294967295L;
            }
            bjsVar.m4236m9().clear();
        }
        Dictionary.Enumerator<IConnector, C7971j0> it4 = bjsVar.m4227dy().iterator();
        while (it4.hasNext()) {
            try {
                KeyValuePair next3 = it4.next();
                bjsVar.m4229k4().m6790ks().throwIfInterruptionRequested();
                Connector connector = (Connector) next3.getKey();
                C7971j0 c7971j0 = (C7971j0) next3.getValue();
                if (c7971j0.m34528du() != null) {
                    String strM65147x1 = C13850af.m65147x1(c7971j0.m34528du().m34596k4());
                    if (bjsVar.m4237to().containsKey(strM65147x1)) {
                        IShape iShape = (IShape) bjsVar.m4237to().get_Item(strM65147x1);
                        long jM34598x1 = c7971j0.m34528du().m34598x1();
                        long j18 = jM34598x1 & j3;
                        if (j18 >= j2 && j18 < iShape.getConnectionSiteCount()) {
                            connector.m1219k4(iShape);
                            connector.m1218k4(jM34598x1);
                        }
                    }
                }
                if (c7971j0.m34529h4() != null) {
                    String strM65147x12 = C13850af.m65147x1(c7971j0.m34529h4().m34596k4());
                    if (bjsVar.m4237to().containsKey(strM65147x12)) {
                        IShape iShape2 = (IShape) bjsVar.m4237to().get_Item(strM65147x12);
                        long jM34598x12 = c7971j0.m34529h4().m34598x1();
                        long j19 = jM34598x12 & j3;
                        if (j19 >= j2 && j19 < iShape2.getConnectionSiteCount()) {
                            connector.m1222x1(iShape2);
                            connector.m1221x1(jM34598x12);
                        }
                    }
                }
                connector.m1220kk();
            } finally {
                if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
                    it4.dispose();
                }
            }
        }
        if (C7019kk.m27456k4((Iterator) it4, (Class<IDisposable>) IDisposable.class)) {
            it4.dispose();
        }
        if (!C14113y2.m67411k4(jqoVar.m34905to())) {
            iBaseSlide.setName(jqoVar.m34905to());
        }
        m74190x1(iBaseSlide, jqoVar, bjsVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74189k4(IBaseSlide iBaseSlide, final com.aspose.slides.internal.p332p7.jqo jqoVar, sdp sdpVar) {
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        C14490t8.m70986k4(iBaseSlide.getShapes().getParentGroup(), jqoVar.m34899h4(), sdpVar, (C14786xh) null);
        C0931e8.m5378k4(iBaseSlide.getBackground(), new AbstractC4685kk<com.aspose.slides.internal.p332p7.e7g>() { // from class: com.aspose.slides.z1.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(jqoVar) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.p_CT_CommonSlideDataElementData.AddBg()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public com.aspose.slides.internal.p332p7.e7g invoke() {
                return jqoVar.m34900k4();
            }
        }, u8sVarM70580k4);
        if (!C7019kk.m27469x1(iBaseSlide, MasterSlide.class)) {
            jqoVar.m34902k4(iBaseSlide.getName());
        }
        m74191x1(iBaseSlide, jqoVar, sdpVar);
    }
}
