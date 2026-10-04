package com.aspose.slides;

import com.aspose.slides.C1158gq;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7447cx;
import com.aspose.slides.internal.p332p7.C7473dd;
import com.aspose.slides.internal.p332p7.C7714fz;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9135ws;
import com.aspose.slides.internal.p332p7.C9235xv;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class h1b {

    /* JADX INFO: renamed from: k4 */
    private static final Object f5375k4 = new Object();

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f5376x1 = new C7017h4("uLnTx", "uLn", "uFillTx", "uFill");

    /* JADX INFO: renamed from: k4 */
    public static void m6959k4(IPortionFormat iPortionFormat, AbstractC4685kk<C9135ws> abstractC4685kk, u8s u8sVar) {
        PortionFormat portionFormat = (PortionFormat) iPortionFormat;
        synchronized (f5375k4) {
            if (iPortionFormat != null) {
                if (!portionFormat.m2310lr()) {
                    if (u8sVar.m71531dy() && C7019kk.m27469x1(portionFormat.getParent_Immediate(), Portion.class) && portionFormat.getPresentation() != null && portionFormat.getParent_Immediate().getParent_Immediate() != null && portionFormat.getParent_ISlideComponent() != null && portionFormat.getParent_IPresentationComponent() != null) {
                        lrb lrbVarM2305bv = portionFormat.m2305bv();
                        PortionFormat portionFormat2 = new PortionFormat();
                        portionFormat2.m369x1((BasePortionFormat) iPortionFormat);
                        portionFormat2.m2315x1(lrbVarM2305bv);
                        portionFormat = portionFormat2;
                    }
                    final C9135ws c9135wsInvoke = abstractC4685kk.invoke();
                    euh.m5726k4(portionFormat.getLineFormat(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.h1b.5
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddLn()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C8985uy invoke() {
                            return c9135wsInvoke.m43975k4();
                        }
                    });
                    C1169h1.m6956k4(portionFormat.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.h1b.6
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddFillProperties(System.String)";
                        }

                        @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                        /* JADX INFO: renamed from: k4 */
                        public C7394ca mo2788k4(String str) {
                            return c9135wsInvoke.m44005x1(str);
                        }
                    }, u8sVar);
                    C1158gq.m6877k4(portionFormat.getEffectFormat(), new C7394ca.k4() { // from class: com.aspose.slides.h1b.7
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddEffectProperties(System.String)";
                        }

                        @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                        /* JADX INFO: renamed from: k4 */
                        public C7394ca mo2788k4(String str) {
                            return c9135wsInvoke.m43974k4(str);
                        }
                    }, u8sVar);
                    C1246ib.m7607k4(portionFormat.getHighlightColor(), new AbstractC4685kk<C7447cx>() { // from class: com.aspose.slides.h1b.8
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddHighlight()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C7447cx invoke() {
                            return c9135wsInvoke.m44006x1();
                        }
                    });
                    byte bIsHardUnderlineLine = portionFormat.isHardUnderlineLine();
                    if (bIsHardUnderlineLine != -1) {
                        if (bIsHardUnderlineLine == 0) {
                            c9135wsInvoke.m43993to("uLnTx");
                        } else {
                            if (bIsHardUnderlineLine != 1) {
                                throw new Exception();
                            }
                            euh.m5730x1(portionFormat.getUnderlineLineFormat(), (C8985uy) c9135wsInvoke.m43993to("uLn").m29542x1());
                        }
                    }
                    byte bIsHardUnderlineFill = portionFormat.isHardUnderlineFill();
                    if (bIsHardUnderlineFill != -1) {
                        if (bIsHardUnderlineFill == 0) {
                            c9135wsInvoke.m43980kk("uFillTx");
                        } else {
                            if (bIsHardUnderlineFill != 1) {
                                throw new Exception();
                            }
                            final C7714fz c7714fz = (C7714fz) c9135wsInvoke.m43980kk("uFill").m29542x1();
                            C1169h1.m6957k4(portionFormat.getUnderlineFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.h1b.9
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c7714fz) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextUnderlineFillGroupWrapperElementData.AddFillProperties(System.String)";
                                }

                                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                                /* JADX INFO: renamed from: k4 */
                                public C7394ca mo2788k4(String str) {
                                    return c7714fz.m32182k4(str);
                                }
                            }, true, u8sVar);
                        }
                    }
                    c9135wsInvoke.m43976k4(portionFormat.getKumimoji());
                    c9135wsInvoke.m43964du(portionFormat.getLanguageId());
                    c9135wsInvoke.m43971h4(portionFormat.getAlternativeLanguageId());
                    c9135wsInvoke.m43977k4(portionFormat.getFontHeight());
                    c9135wsInvoke.m44007x1(portionFormat.getFontBold());
                    c9135wsInvoke.m43982kk(portionFormat.getFontItalic());
                    c9135wsInvoke.m43995to(portionFormat.getFontUnderline());
                    c9135wsInvoke.m43963du(portionFormat.getStrikethroughType());
                    c9135wsInvoke.m44008x1(portionFormat.getKerningMinimalSize());
                    c9135wsInvoke.m43970h4(portionFormat.getTextCapType());
                    c9135wsInvoke.m43983kk(portionFormat.getSpacing());
                    c9135wsInvoke.m43988m9(portionFormat.getNormaliseHeight());
                    c9135wsInvoke.m43996to(portionFormat.getEscapement());
                    c9135wsInvoke.m43966dy(portionFormat.getProofDisabled());
                    c9135wsInvoke.m43984kk(portionFormat.getSmartTagClean());
                    if ((portionFormat.m367up().m5689k4() & 4294967295L) != 4294967295L) {
                        c9135wsInvoke.m43978k4(portionFormat.m367up().m5689k4());
                    }
                    c9135wsInvoke.m43989m9(portionFormat.getBookmarkId());
                    c9135wsInvoke.m44009x1(portionFormat.m355ck());
                    C14215o5.m68336k4(portionFormat.getLatinFont(), new AbstractC4685kk<C9235xv>() { // from class: com.aspose.slides.h1b.10
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddLatin()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C9235xv invoke() {
                            return c9135wsInvoke.m43981kk();
                        }
                    });
                    C14215o5.m68336k4(portionFormat.getEastAsianFont(), new AbstractC4685kk<C9235xv>() { // from class: com.aspose.slides.h1b.11
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddEa()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C9235xv invoke() {
                            return c9135wsInvoke.m43994to();
                        }
                    });
                    C14215o5.m68336k4(portionFormat.getComplexScriptFont(), new AbstractC4685kk<C9235xv>() { // from class: com.aspose.slides.h1b.12
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddCs()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C9235xv invoke() {
                            return c9135wsInvoke.m43962du();
                        }
                    });
                    C14215o5.m68336k4(portionFormat.getSymbolFont(), new AbstractC4685kk<C9235xv>() { // from class: com.aspose.slides.h1b.2
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddSym()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C9235xv invoke() {
                            return c9135wsInvoke.m43969h4();
                        }
                    });
                    C14918zx.m74871k4(portionFormat, new AbstractC4685kk<C7473dd>() { // from class: com.aspose.slides.h1b.3
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddHlinkClick()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C7473dd invoke() {
                            return c9135wsInvoke.m43987m9();
                        }
                    }, new AbstractC4685kk<C7473dd>() { // from class: com.aspose.slides.h1b.4
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9135wsInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddHlinkMouseOver()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C7473dd invoke() {
                            return c9135wsInvoke.m43965dy();
                        }
                    }, u8sVar);
                }
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m6960k4(final IPortionFormat iPortionFormat, C9135ws c9135ws, gnb gnbVar) {
        if (c9135ws == null) {
            return;
        }
        if (c9135ws.m44002v4() != null) {
            euh.m5728k4(iPortionFormat.getLineFormat(), c9135ws.m44002v4());
        }
        C1169h1.m6958k4(iPortionFormat.getFillFormat(), c9135ws.m43986lr(), gnbVar);
        C1158gq.m6880k4(new C1158gq.k4() { // from class: com.aspose.slides.h1b.1
            @Override // com.aspose.slides.C1158gq.k4
            /* JADX INFO: renamed from: k4 */
            public IEffectFormat mo3774k4() {
                return iPortionFormat.getEffectFormat();
            }
        }, c9135ws.m44012yd(), gnbVar);
        C1246ib.m7611k4(iPortionFormat.getHighlightColor(), c9135ws.m43955b3());
        if (c9135ws.m44004wy() != null) {
            int iM27428k4 = f5376x1.m27428k4(c9135ws.m44004wy().m29539k4());
            if (iM27428k4 == 0) {
                iPortionFormat.setHardUnderlineLine((byte) 0);
            } else {
                if (iM27428k4 != 1) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c9135ws.m44004wy().m29539k4(), "\""));
                }
                euh.m5728k4(iPortionFormat.getUnderlineLineFormat(), (C8985uy) c9135ws.m44004wy().m29542x1());
                iPortionFormat.setHardUnderlineLine((byte) 1);
            }
        }
        if (c9135ws.m43953ak() != null) {
            int iM27428k42 = f5376x1.m27428k4(c9135ws.m43953ak().m29539k4());
            if (iM27428k42 == 2) {
                iPortionFormat.setHardUnderlineFill((byte) 0);
            } else {
                if (iM27428k42 != 3) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c9135ws.m43953ak().m29539k4(), "\""));
                }
                C1169h1.m6958k4(iPortionFormat.getUnderlineFillFormat(), ((C7714fz) c9135ws.m43953ak().m29542x1()).m32181k4(), gnbVar);
                iPortionFormat.setHardUnderlineFill((byte) 1);
            }
        }
        iPortionFormat.setKumimoji(c9135ws.m43958c5());
        iPortionFormat.setLanguageId(c9135ws.m43973jd());
        iPortionFormat.setAlternativeLanguageId(c9135ws.m43960ck());
        iPortionFormat.setFontHeight(c9135ws.m43968fa());
        iPortionFormat.setFontBold(c9135ws.m44000up());
        iPortionFormat.setFontItalic(c9135ws.m44013yj());
        iPortionFormat.setFontUnderline(c9135ws.m43985ks());
        iPortionFormat.setStrikethroughType(c9135ws.m43992rv());
        iPortionFormat.setKerningMinimalSize(c9135ws.m44010x6());
        iPortionFormat.setTextCapType(c9135ws.m43990ne());
        iPortionFormat.setSpacing(c9135ws.m43972ix());
        iPortionFormat.setNormaliseHeight(c9135ws.m43998u4());
        iPortionFormat.setEscapement(c9135ws.m44001uz());
        iPortionFormat.setProofDisabled(c9135ws.m44003wl());
        iPortionFormat.setSmartTagClean(c9135ws.m43954ar());
        iPortionFormat.setBookmarkId(c9135ws.m43956bv());
        PortionFormat portionFormat = (PortionFormat) iPortionFormat;
        portionFormat.m364k4(c9135ws.m43991qq());
        if ((c9135ws.m43999um() & 4294967295L) != 4294967295L) {
            portionFormat.m367up().m5690k4(c9135ws.m43999um());
        }
        if (c9135ws.m43961dq() != null) {
            iPortionFormat.setLatinFont(C14215o5.m68334k4(c9135ws.m43961dq()));
        }
        if (c9135ws.m44011xk() != null) {
            iPortionFormat.setEastAsianFont(C14215o5.m68334k4(c9135ws.m44011xk()));
        }
        if (c9135ws.m43959c6() != null) {
            iPortionFormat.setComplexScriptFont(C14215o5.m68334k4(c9135ws.m43959c6()));
        }
        if (c9135ws.m43997ts() != null) {
            iPortionFormat.setSymbolFont(C14215o5.m68334k4(c9135ws.m43997ts()));
        }
        C14918zx.m74872k4(iPortionFormat, c9135ws.m43967e0(), c9135ws.m43957bz(), gnbVar);
    }
}
