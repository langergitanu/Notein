package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7220a8;
import com.aspose.slides.internal.p332p7.C7360by;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7447cx;
import com.aspose.slides.internal.p332p7.C7714fz;
import com.aspose.slides.internal.p332p7.C7919ib;
import com.aspose.slides.internal.p332p7.C8181lg;
import com.aspose.slides.internal.p332p7.C8533pm;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C8985uy;
import com.aspose.slides.internal.p332p7.C9118wk;
import com.aspose.slides.internal.p332p7.C9135ws;
import com.aspose.slides.internal.p332p7.C9178x7;
import com.aspose.slides.internal.p332p7.C9233xu;
import com.aspose.slides.internal.p332p7.C9235xv;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.jl */
/* JADX INFO: loaded from: classes3.dex */
class C13691jl {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f45520k4 = new C7017h4("noAutofit", "normAutofit", "spAutoFit", "spcPct", "spcPts", "uLnTx", "uLn", "uFillTx", "uFill");

    /* JADX INFO: renamed from: k4 */
    private static float m63389k4(C9118wk c9118wk) {
        if (c9118wk == null || c9118wk.m43740k4() == null) {
            return Float.NaN;
        }
        C7394ca c7394caM43740k4 = c9118wk.m43740k4();
        int iM27428k4 = f45520k4.m27428k4(c7394caM43740k4.m29539k4());
        if (iM27428k4 == 3) {
            C9178x7 c9178x7 = (C9178x7) c7394caM43740k4.m29542x1();
            if (C14064he.m66715kk(c9178x7.m44231k4())) {
                return 100.0f;
            }
            return c9178x7.m44231k4();
        }
        if (iM27428k4 != 4) {
            throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM43740k4.m29539k4(), "\""));
        }
        C7220a8 c7220a8 = (C7220a8) c7394caM43740k4.m29542x1();
        if (C14064he.m66715kk(c7220a8.m27984k4())) {
            return -12.0f;
        }
        return -c7220a8.m27984k4();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5 A[PHI: r3
      0x00b5: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:31:0x00a2, B:35:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9 A[PHI: r1
      0x00b9: PHI (r1v13 int) = (r1v12 int), (r1v14 int) binds: [B:29:0x009f, B:33:0x00a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: x1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m63405x1(IChartParagraphFormat iChartParagraphFormat, C9233xu c9233xu) {
        int i;
        kml kmlVarM2187c5 = ((ParagraphFormat) iChartParagraphFormat).m2187c5();
        if (m63400k4(iChartParagraphFormat) || kmlVarM2187c5.m64015x1() != null) {
            c9233xu.m44647k4(kmlVarM2187c5.m64015x1());
            if (m63400k4(iChartParagraphFormat)) {
                final C8181lg c8181lgM44646k4 = c9233xu.m44646k4();
                m63390k4(iChartParagraphFormat.getSpaceWithin(), new AbstractC4685kk<C9118wk>() { // from class: com.aspose.slides.jl.1
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8181lgM44646k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphPropertiesElementData.AddLnSpc()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C9118wk invoke() {
                        return c8181lgM44646k4.m36098k4();
                    }
                });
                m63390k4(iChartParagraphFormat.getSpaceBefore(), new AbstractC4685kk<C9118wk>() { // from class: com.aspose.slides.jl.5
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8181lgM44646k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphPropertiesElementData.AddSpcBef()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C9118wk invoke() {
                        return c8181lgM44646k4.m36122x1();
                    }
                });
                m63390k4(iChartParagraphFormat.getSpaceAfter(), new AbstractC4685kk<C9118wk>() { // from class: com.aspose.slides.jl.6
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8181lgM44646k4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphPropertiesElementData.AddSpcAft()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C9118wk invoke() {
                        return c8181lgM44646k4.m36103kk();
                    }
                });
                if (((ParagraphFormat) iChartParagraphFormat).m2188ck() > 0) {
                    C7919ib c7919ibM36113to = c8181lgM44646k4.m36113to();
                    IGenericEnumerator<ITab> it = iChartParagraphFormat.getTabs().iterator();
                    while (it.hasNext()) {
                        try {
                            ITab next = it.next();
                            C8533pm c8533pmM33995k4 = c7919ibM36113to.m33995k4();
                            c8533pmM33995k4.m38980k4(next.getAlignment());
                            c8533pmM33995k4.m38979k4(next.getPosition());
                        } finally {
                            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                                it.dispose();
                            }
                        }
                    }
                }
                int alignment = iChartParagraphFormat.getAlignment();
                if (alignment != -1) {
                    int i2 = 2;
                    if (alignment != 1) {
                        int i3 = 3;
                        if (alignment != 2) {
                            i2 = 4;
                            if (alignment != 3) {
                                i3 = 5;
                                if (alignment == 4) {
                                    c8181lgM44646k4.m36125x1(i3);
                                } else if (alignment != 5) {
                                    c8181lgM44646k4.m36125x1(1);
                                } else {
                                    i = 6;
                                }
                            } else {
                                c8181lgM44646k4.m36125x1(i2);
                            }
                        }
                    }
                    c8181lgM44646k4.m36100k4(iChartParagraphFormat.getMarginLeft());
                    c8181lgM44646k4.m36124x1(iChartParagraphFormat.getMarginRight());
                    c8181lgM44646k4.m36105kk(iChartParagraphFormat.getIndent());
                    c8181lgM44646k4.m36115to(iChartParagraphFormat.getDefaultTabSize());
                    c8181lgM44646k4.m36106kk(iChartParagraphFormat.getFontAlignment());
                    c8181lgM44646k4.m36099k4(iChartParagraphFormat.getRightToLeft());
                    c8181lgM44646k4.m36123x1(iChartParagraphFormat.getEastAsianLineBreak());
                    c8181lgM44646k4.m36104kk(iChartParagraphFormat.getLatinLineBreak());
                    c8181lgM44646k4.m36114to(iChartParagraphFormat.getHangingPunctuation());
                }
                i = 0;
                c8181lgM44646k4.m36125x1(i);
                c8181lgM44646k4.m36100k4(iChartParagraphFormat.getMarginLeft());
                c8181lgM44646k4.m36124x1(iChartParagraphFormat.getMarginRight());
                c8181lgM44646k4.m36105kk(iChartParagraphFormat.getIndent());
                c8181lgM44646k4.m36115to(iChartParagraphFormat.getDefaultTabSize());
                c8181lgM44646k4.m36106kk(iChartParagraphFormat.getFontAlignment());
                c8181lgM44646k4.m36099k4(iChartParagraphFormat.getRightToLeft());
                c8181lgM44646k4.m36123x1(iChartParagraphFormat.getEastAsianLineBreak());
                c8181lgM44646k4.m36104kk(iChartParagraphFormat.getLatinLineBreak());
                c8181lgM44646k4.m36114to(iChartParagraphFormat.getHangingPunctuation());
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63390k4(float f, AbstractC4685kk<C9118wk> abstractC4685kk) {
        if (C14064he.m66715kk(f)) {
            return;
        }
        C9118wk c9118wkInvoke = abstractC4685kk.invoke();
        if (f < 0.0f) {
            ((C7220a8) c9118wkInvoke.m43741k4("spcPts").m29542x1()).m27985k4(-f);
        } else {
            ((C9178x7) c9118wkInvoke.m43741k4("spcPct").m29542x1()).m44232k4(f);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private static void m63406x1(IChartTextBlockFormat iChartTextBlockFormat, C7360by c7360by) {
        String str;
        TextFrameFormat textFrameFormat = (TextFrameFormat) iChartTextBlockFormat;
        c7360by.m29273to(textFrameFormat.getTextVerticalType());
        c7360by.m29268m9(textFrameFormat.getAnchoringType());
        c7360by.m29246dy(textFrameFormat.getCenterText());
        c7360by.m29257k4(textFrameFormat.getRotationAngle());
        c7360by.m29264kk(textFrameFormat.m2949jd());
        c7360by.m29255k4(textFrameFormat.m2966up());
        c7360by.m29281x1(textFrameFormat.m2975yj());
        c7360by.m29240c5(textFrameFormat.m2962rv());
        c7360by.m29252jd(textFrameFormat.m2961ne());
        if (textFrameFormat.getWrapText() != -1) {
            c7360by.m29258k4(textFrameFormat.getWrapText() == 1 ? 2 : 1);
        }
        byte autofitType = textFrameFormat.getAutofitType();
        if (autofitType != 0) {
            if (autofitType != 1) {
                str = autofitType == 2 ? "spAutoFit" : "noAutofit";
            }
            c7360by.m29273to(textFrameFormat.getTextVerticalType());
            xmh xmhVarClone = textFrameFormat.m2963to().Clone();
            c7360by.m29256k4(xmhVarClone.f50160x1);
            c7360by.m29282x1(xmhVarClone.f50158kk);
            c7360by.m29265kk(xmhVarClone.f50159to);
            c7360by.m29274to(xmhVarClone.f50157du);
            c7360by.m29260k4(textFrameFormat.m2947h4().m70159k4());
        }
        c7360by.m29253k4(str);
        c7360by.m29273to(textFrameFormat.getTextVerticalType());
        xmh xmhVarClone2 = textFrameFormat.m2963to().Clone();
        c7360by.m29256k4(xmhVarClone2.f50160x1);
        c7360by.m29282x1(xmhVarClone2.f50158kk);
        c7360by.m29265kk(xmhVarClone2.f50159to);
        c7360by.m29274to(xmhVarClone2.f50157du);
        c7360by.m29260k4(textFrameFormat.m2947h4().m70159k4());
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0075 A[PHI: r4
      0x0075: PHI (r4v1 int) = (r4v0 int), (r4v2 int) binds: [B:21:0x0069, B:25:0x006f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0079 A[PHI: r3
      0x0079: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:19:0x0066, B:23:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m63391k4(IChartParagraphFormat iChartParagraphFormat, C9233xu c9233xu) {
        int i;
        C8181lg c8181lgM44648kk = c9233xu.m44648kk();
        if (c8181lgM44648kk == null) {
            return;
        }
        iChartParagraphFormat.setSpaceWithin(m63389k4(c8181lgM44648kk.m36126x6()));
        iChartParagraphFormat.setSpaceBefore(m63389k4(c8181lgM44648kk.m36109ne()));
        iChartParagraphFormat.setSpaceAfter(m63389k4(c8181lgM44648kk.m36095ix()));
        if (c8181lgM44648kk.m36088ar() != null) {
            for (C8533pm c8533pm : c8181lgM44648kk.m36088ar().m33996x1()) {
                iChartParagraphFormat.getTabs().add(C14044b3.m66437kk(c8533pm.m38978k4()) ? 0.0d : c8533pm.m38978k4(), c8533pm.m38981x1());
            }
        }
        int iM36096jd = c8181lgM44648kk.m36096jd();
        if (iM36096jd != 0) {
            int i2 = 2;
            if (iM36096jd != 2) {
                int i3 = 3;
                if (iM36096jd != 3) {
                    i2 = 4;
                    if (iM36096jd != 4) {
                        i3 = 5;
                        if (iM36096jd == 5) {
                            iChartParagraphFormat.setAlignment(i2);
                        } else if (iM36096jd != 6) {
                            iChartParagraphFormat.setAlignment(0);
                        } else {
                            iChartParagraphFormat.setAlignment(i3);
                        }
                    }
                }
                iChartParagraphFormat.setMarginLeft((float) c8181lgM44648kk.m36094h4());
                iChartParagraphFormat.setMarginRight((float) c8181lgM44648kk.m36108m9());
                iChartParagraphFormat.setIndent((float) c8181lgM44648kk.m36089c5());
                iChartParagraphFormat.setDefaultTabSize((float) c8181lgM44648kk.m36090ck());
                iChartParagraphFormat.setFontAlignment(c8181lgM44648kk.m36127yj());
                iChartParagraphFormat.setRightToLeft(c8181lgM44648kk.m36093fa());
                iChartParagraphFormat.setEastAsianLineBreak(c8181lgM44648kk.m36118up());
                iChartParagraphFormat.setLatinLineBreak(c8181lgM44648kk.m36107ks());
                iChartParagraphFormat.setHangingPunctuation(c8181lgM44648kk.m36111rv());
                ((ParagraphFormat) iChartParagraphFormat).m2187c5().m64011k4(c9233xu.m44644du());
            }
            i = 1;
        } else {
            i = -1;
        }
        iChartParagraphFormat.setAlignment(i);
        iChartParagraphFormat.setMarginLeft((float) c8181lgM44648kk.m36094h4());
        iChartParagraphFormat.setMarginRight((float) c8181lgM44648kk.m36108m9());
        iChartParagraphFormat.setIndent((float) c8181lgM44648kk.m36089c5());
        iChartParagraphFormat.setDefaultTabSize((float) c8181lgM44648kk.m36090ck());
        iChartParagraphFormat.setFontAlignment(c8181lgM44648kk.m36127yj());
        iChartParagraphFormat.setRightToLeft(c8181lgM44648kk.m36093fa());
        iChartParagraphFormat.setEastAsianLineBreak(c8181lgM44648kk.m36118up());
        iChartParagraphFormat.setLatinLineBreak(c8181lgM44648kk.m36107ks());
        iChartParagraphFormat.setHangingPunctuation(c8181lgM44648kk.m36111rv());
        ((ParagraphFormat) iChartParagraphFormat).m2187c5().m64011k4(c9233xu.m44644du());
    }

    /* JADX INFO: renamed from: x1 */
    public static void m63407x1(IChartTextFormat iChartTextFormat, AbstractC4685kk<C8952ug> abstractC4685kk, u8s u8sVar) {
        m63399k4(iChartTextFormat, abstractC4685kk.invoke(), u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63392k4(IChartPortionFormat iChartPortionFormat, C8952ug c8952ug, u8s u8sVar) {
        eth ethVarM367up = ((ChartPortionFormat) iChartPortionFormat).m367up();
        if (c8952ug.m42372du().length == 0) {
            c8952ug.m42376x1();
        }
        if (c8952ug.m42372du()[0].m44648kk() == null) {
            c8952ug.m42372du()[0].m44646k4();
        }
        final C9135ws c9135wsM36091du = c8952ug.m42372du()[0].m44648kk().m36091du();
        if (m63401k4(iChartPortionFormat)) {
            euh.m5726k4(iChartPortionFormat.getLineFormat(), new AbstractC4685kk<C8985uy>() { // from class: com.aspose.slides.jl.7
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9135wsM36091du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddLn()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C8985uy invoke() {
                    return c9135wsM36091du.m43975k4();
                }
            });
            C1169h1.m6956k4(iChartPortionFormat.getFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.jl.8
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9135wsM36091du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddFillProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c9135wsM36091du.m44005x1(str);
                }
            }, u8sVar);
            C1158gq.m6877k4(iChartPortionFormat.getEffectFormat(), new C7394ca.k4() { // from class: com.aspose.slides.jl.9
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9135wsM36091du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddEffectProperties(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c9135wsM36091du.m43974k4(str);
                }
            }, u8sVar);
            C1246ib.m7607k4(iChartPortionFormat.getHighlightColor(), new AbstractC4685kk<C7447cx>() { // from class: com.aspose.slides.jl.10
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9135wsM36091du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddHighlight()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C7447cx invoke() {
                    return c9135wsM36091du.m44006x1();
                }
            });
            if (iChartPortionFormat.isHardUnderlineLine() != -1) {
                if (iChartPortionFormat.isHardUnderlineLine() == 1) {
                    euh.m5730x1(iChartPortionFormat.getUnderlineLineFormat(), (C8985uy) c9135wsM36091du.m43993to("uLn").m29542x1());
                } else {
                    c9135wsM36091du.m43993to("uLnTx");
                }
            }
            if (iChartPortionFormat.isHardUnderlineFill() != -1) {
                if (iChartPortionFormat.isHardUnderlineFill() == 1) {
                    final C7714fz c7714fz = (C7714fz) c9135wsM36091du.m43980kk("uFill").m29542x1();
                    C1169h1.m6956k4(iChartPortionFormat.getUnderlineFillFormat(), new C7394ca.k4() { // from class: com.aspose.slides.jl.11
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c7714fz) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextUnderlineFillGroupWrapperElementData.AddFillProperties(System.String)";
                        }

                        @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                        /* JADX INFO: renamed from: k4 */
                        public C7394ca mo2788k4(String str) {
                            return c7714fz.m32182k4(str);
                        }
                    }, u8sVar);
                } else {
                    c9135wsM36091du.m43980kk("uFillTx");
                }
            }
            c9135wsM36091du.m43976k4(iChartPortionFormat.getKumimoji());
            c9135wsM36091du.m43964du(iChartPortionFormat.getLanguageId());
            c9135wsM36091du.m43971h4(iChartPortionFormat.getAlternativeLanguageId());
            c9135wsM36091du.m43977k4(iChartPortionFormat.getFontHeight());
            c9135wsM36091du.m44007x1(iChartPortionFormat.getFontBold());
            c9135wsM36091du.m43982kk(iChartPortionFormat.getFontItalic());
            c9135wsM36091du.m43995to(iChartPortionFormat.getFontUnderline());
            c9135wsM36091du.m43963du(iChartPortionFormat.getStrikethroughType());
            c9135wsM36091du.m44008x1(iChartPortionFormat.getKerningMinimalSize());
            c9135wsM36091du.m43970h4(iChartPortionFormat.getTextCapType());
            c9135wsM36091du.m43983kk(iChartPortionFormat.getSpacing());
            c9135wsM36091du.m43988m9(iChartPortionFormat.getNormaliseHeight());
            c9135wsM36091du.m43996to(iChartPortionFormat.getEscapement());
            c9135wsM36091du.m43966dy(iChartPortionFormat.getProofDisabled());
            c9135wsM36091du.m43978k4(ethVarM367up.m5689k4());
            C14215o5.m68336k4(iChartPortionFormat.getLatinFont(), new AbstractC4685kk<C9235xv>() { // from class: com.aspose.slides.jl.12
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9135wsM36091du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddLatin()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C9235xv invoke() {
                    return c9135wsM36091du.m43981kk();
                }
            });
            C14215o5.m68336k4(iChartPortionFormat.getEastAsianFont(), new AbstractC4685kk<C9235xv>() { // from class: com.aspose.slides.jl.2
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9135wsM36091du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddEa()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C9235xv invoke() {
                    return c9135wsM36091du.m43994to();
                }
            });
            C14215o5.m68336k4(iChartPortionFormat.getComplexScriptFont(), new AbstractC4685kk<C9235xv>() { // from class: com.aspose.slides.jl.3
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9135wsM36091du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddCs()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C9235xv invoke() {
                    return c9135wsM36091du.m43962du();
                }
            });
            C14215o5.m68336k4(iChartPortionFormat.getSymbolFont(), new AbstractC4685kk<C9235xv>() { // from class: com.aspose.slides.jl.4
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c9135wsM36091du) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextCharacterPropertiesElementData.AddSym()";
                }

                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                public C9235xv invoke() {
                    return c9135wsM36091du.m43969h4();
                }
            });
            if (c8952ug.m42372du()[0].m44644du() == null) {
                c8952ug.m42372du()[0].m44647k4(c9135wsM36091du);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63393k4(IChartPortionFormat iChartPortionFormat, C9135ws c9135ws, gnb gnbVar) {
        if (c9135ws == null) {
            return;
        }
        euh.m5728k4(iChartPortionFormat.getLineFormat(), c9135ws.m44002v4());
        C1169h1.m6958k4(iChartPortionFormat.getFillFormat(), c9135ws.m43986lr(), gnbVar);
        C1158gq.m6878k4(iChartPortionFormat.getEffectFormat(), c9135ws.m44012yd(), gnbVar);
        C1246ib.m7611k4(iChartPortionFormat.getHighlightColor(), c9135ws.m43955b3());
        iChartPortionFormat.setHardUnderlineLine((byte) -1);
        if (c9135ws.m44004wy() != null) {
            int iM27428k4 = f45520k4.m27428k4(c9135ws.m44004wy().m29539k4());
            if (iM27428k4 == 5) {
                iChartPortionFormat.setHardUnderlineLine((byte) 0);
            } else {
                if (iM27428k4 != 6) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c9135ws.m44004wy().m29539k4(), "\""));
                }
                euh.m5728k4(iChartPortionFormat.getUnderlineLineFormat(), (C8985uy) c9135ws.m44004wy().m29542x1());
                iChartPortionFormat.setHardUnderlineLine((byte) 1);
            }
        }
        iChartPortionFormat.setHardUnderlineFill((byte) -1);
        if (c9135ws.m44004wy() != null) {
            int iM27428k42 = f45520k4.m27428k4(c9135ws.m43953ak().m29539k4());
            if (iM27428k42 == 7) {
                iChartPortionFormat.setHardUnderlineFill((byte) 0);
            } else {
                if (iM27428k42 != 8) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c9135ws.m43953ak().m29539k4(), "\""));
                }
                C1169h1.m6958k4(iChartPortionFormat.getUnderlineFillFormat(), ((C7714fz) c9135ws.m43953ak().m29542x1()).m32181k4(), gnbVar);
                iChartPortionFormat.setHardUnderlineFill((byte) 1);
            }
        }
        iChartPortionFormat.setKumimoji(c9135ws.m43958c5());
        iChartPortionFormat.setLanguageId(c9135ws.m43973jd());
        iChartPortionFormat.setAlternativeLanguageId(c9135ws.m43960ck());
        iChartPortionFormat.setFontHeight(c9135ws.m43968fa());
        iChartPortionFormat.setFontBold(c9135ws.m44000up());
        iChartPortionFormat.setFontItalic(c9135ws.m44013yj());
        iChartPortionFormat.setFontUnderline(c9135ws.m43985ks());
        iChartPortionFormat.setStrikethroughType(c9135ws.m43992rv());
        iChartPortionFormat.setKerningMinimalSize(c9135ws.m44010x6());
        iChartPortionFormat.setTextCapType(c9135ws.m43990ne());
        iChartPortionFormat.setSpacing(c9135ws.m43972ix());
        iChartPortionFormat.setNormaliseHeight(c9135ws.m43998u4());
        iChartPortionFormat.setEscapement(c9135ws.m44001uz());
        iChartPortionFormat.setProofDisabled(c9135ws.m44003wl());
        if ((c9135ws.m43999um() & 4294967295L) != 0) {
            ((ChartPortionFormat) iChartPortionFormat).m367up().m5690k4(c9135ws.m43999um());
        }
        if (c9135ws.m43961dq() != null) {
            iChartPortionFormat.setLatinFont(C14215o5.m68334k4(c9135ws.m43961dq()));
        }
        if (c9135ws.m44011xk() != null) {
            iChartPortionFormat.setEastAsianFont(C14215o5.m68334k4(c9135ws.m44011xk()));
        }
        if (c9135ws.m43959c6() != null) {
            iChartPortionFormat.setComplexScriptFont(C14215o5.m68334k4(c9135ws.m43959c6()));
        }
        if (c9135ws.m43997ts() != null) {
            iChartPortionFormat.setSymbolFont(C14215o5.m68334k4(c9135ws.m43997ts()));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63394k4(IChartTextBlockFormat iChartTextBlockFormat, C7360by c7360by) {
        TextFrameFormat textFrameFormat = (TextFrameFormat) iChartTextBlockFormat;
        textFrameFormat.setTextVerticalType(c7360by.m29248h4());
        textFrameFormat.setAnchoringType(c7360by.m29271rv());
        textFrameFormat.setCenterText(c7360by.m29284x6());
        textFrameFormat.m2953k4(new xmh(c7360by.m29245dy(), c7360by.m29239c5(), c7360by.m29251jd(), c7360by.m29241ck()));
        if (c7360by.m29267m9() != 0) {
            textFrameFormat.setWrapText(c7360by.m29267m9() == 2 ? (byte) 1 : (byte) 0);
        }
        textFrameFormat.setRotationAngle(c7360by.m29280x1());
        textFrameFormat.m2956kk(c7360by.m29242du());
        textFrameFormat.m2964to(c7360by.m29263kk());
        textFrameFormat.m2943du(c7360by.m29272to());
        textFrameFormat.m2960m9(c7360by.m29269ne());
        textFrameFormat.m2945dy(c7360by.m29275u4());
        if (c7360by.m29279wl() != null) {
            int iM27428k4 = f45520k4.m27428k4(c7360by.m29279wl().m29539k4());
            if (iM27428k4 == 0) {
                textFrameFormat.m2950k4((byte) 0);
            } else if (iM27428k4 == 1) {
                textFrameFormat.m2950k4((byte) 1);
            } else {
                if (iM27428k4 != 2) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7360by.m29279wl().m29539k4(), "\""));
                }
                textFrameFormat.m2950k4((byte) 2);
            }
        }
        textFrameFormat.m2947h4().m70160k4(c7360by.m29276um());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63395k4(IChartTextFormat iChartTextFormat, AbstractC4685kk<C8952ug> abstractC4685kk, u8s u8sVar) {
        if (m63403k4(iChartTextFormat)) {
            m63407x1(iChartTextFormat, abstractC4685kk, u8sVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63396k4(IChartTextFormat iChartTextFormat, AbstractC4685kk<C8952ug> abstractC4685kk, u8s u8sVar, IOverridableText iOverridableText) {
        if (iOverridableText != null) {
            if (m63404k4(iOverridableText) || m63403k4(iOverridableText.getTextFormat())) {
                m63399k4(iOverridableText.getTextFormat(), abstractC4685kk.invoke(), u8sVar);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63397k4(IChartTextFormat iChartTextFormat, C7394ca.k4 k4Var, String str, u8s u8sVar) {
        if (m63403k4(iChartTextFormat)) {
            m63399k4(iChartTextFormat, (C8952ug) k4Var.mo2788k4(str).m29542x1(), u8sVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63398k4(IChartTextFormat iChartTextFormat, C8952ug c8952ug, gnb gnbVar) {
        if (c8952ug == null) {
            return;
        }
        m63394k4(iChartTextFormat.getTextBlockFormat(), c8952ug.m42374kk());
        C9233xu c9233xu = c8952ug.m42372du()[0];
        m63391k4(iChartTextFormat.getParagraphFormat(), c9233xu);
        if (c9233xu.m44648kk() != null) {
            m63393k4(iChartTextFormat.getPortionFormat(), c9233xu.m44648kk().m36117um(), gnbVar);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63399k4(IChartTextFormat iChartTextFormat, C8952ug c8952ug, u8s u8sVar) {
        m63406x1(iChartTextFormat.getTextBlockFormat(), c8952ug.m42374kk());
        m63405x1(iChartTextFormat.getParagraphFormat(), c8952ug.m42376x1());
        m63392k4(iChartTextFormat.getPortionFormat(), c8952ug, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63400k4(IChartParagraphFormat iChartParagraphFormat) {
        return !((ParagraphFormat) iChartParagraphFormat).m2193jd();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63401k4(IChartPortionFormat iChartPortionFormat) {
        return !((ChartPortionFormat) iChartPortionFormat).m715ne();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63402k4(IChartTextBlockFormat iChartTextBlockFormat) {
        return !((TextFrameFormat) iChartTextBlockFormat).m2965um();
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63403k4(IChartTextFormat iChartTextFormat) {
        if (iChartTextFormat == null) {
            return false;
        }
        return m63402k4(iChartTextFormat.getTextBlockFormat()) || m63400k4(iChartTextFormat.getParagraphFormat()) || m63401k4(iChartTextFormat.getPortionFormat()) || ((ParagraphFormat) iChartTextFormat.getParagraphFormat()).m2187c5().m64015x1() != null;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m63404k4(IOverridableText iOverridableText) {
        return (iOverridableText == null || iOverridableText.getTextFrameForOverriding() == null || iOverridableText.getTextFrameForOverriding().getTextFrameFormat().getTextVerticalType() == -1) ? false : true;
    }
}
