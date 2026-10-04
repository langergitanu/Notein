package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7211a4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8181lg;
import com.aspose.slides.internal.p332p7.C8308n4;
import com.aspose.slides.internal.p332p7.C8416oa;
import com.aspose.slides.internal.p332p7.C8549pu;
import com.aspose.slides.internal.p332p7.C8992v2;
import com.aspose.slides.internal.p332p7.C9135ws;
import com.aspose.slides.internal.p332p7.C9233xu;
import com.aspose.slides.internal.p332p7.C9348z6;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.ControlChar;
import com.orion.notein.richeditor.utils.p606io.IOUtils;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class odi {

    /* JADX INFO: renamed from: k4 */
    static final char[] f47743k4 = {ControlChar.PARAGRAPH_BREAK_CHAR};

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f47744x1 = new C7017h4("fld", "r", "br", "m", "oMathPara", "oMath");

    /* JADX INFO: renamed from: k4 */
    private static IHyperlink m68457k4(IPortionCollection iPortionCollection, IPortion iPortion) {
        IPortionFormat portionFormat;
        if (iPortion == null || iPortion.getPortionFormat() == null) {
            return null;
        }
        if (iPortion.getPortionFormat().getHyperlinkClick() != null) {
            portionFormat = iPortion.getPortionFormat();
        } else {
            int iIndexOf = iPortionCollection.indexOf(iPortion);
            if (iIndexOf < 1) {
                return null;
            }
            portionFormat = iPortionCollection.get_Item(iIndexOf - 1).getPortionFormat();
        }
        return portionFormat.getHyperlinkClick();
    }

    /* JADX INFO: renamed from: k4 */
    public static String m68458k4(String str, int[] iArr) {
        int iM67385k4 = C14113y2.m67385k4(str, f47743k4, iArr[0]);
        if (iM67385k4 < 0) {
            return null;
        }
        int i = iArr[0];
        String strM67443x1 = C14113y2.m67443x1(str, i, iM67385k4 - i);
        if (iM67385k4 < str.length() - 1 && ((str.charAt(iM67385k4) == '\r' && str.charAt(iM67385k4 + 1) == '\n') || (str.charAt(iM67385k4) == '\n' && str.charAt(iM67385k4 + 1) == '\r'))) {
            iM67385k4++;
        }
        iArr[0] = iM67385k4 + 1;
        return strM67443x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static void m68459k4(IParagraphCollection iParagraphCollection, AbstractC4685kk<C9233xu> abstractC4685kk, u8s u8sVar) {
        IPortionFormat portionFormat;
        AbstractC4685kk<C9135ws> abstractC4685kk2;
        if (iParagraphCollection.getCount() == 0) {
            abstractC4685kk.invoke();
            return;
        }
        IGenericEnumerator<IParagraph> it = iParagraphCollection.iterator();
        Paragraph paragraph = null;
        final C9233xu c9233xuInvoke = null;
        while (it.hasNext()) {
            try {
                Paragraph paragraph2 = (Paragraph) it.next();
                if (paragraph != null && paragraph.m2155du() && paragraph.m2161k4().m2208x1((IParagraphFormat) paragraph2.m2161k4())) {
                    c9233xuInvoke.m44647k4((C9135ws) null);
                    if (paragraph.getPortions().getCount() > 0) {
                        Portion portion = (Portion) paragraph.getPortions().get_Item(paragraph.getPortions().getCount() - 1);
                        final C8549pu c8549pu = (C8549pu) c9233xuInvoke.m44645k4("r").m29542x1();
                        h1b.m6959k4(portion.getPortionFormat(), new AbstractC4685kk<C9135ws>() { // from class: com.aspose.slides.odi.1
                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                            public String getDelegateId() {
                                return System.identityHashCode(c8549pu) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_RegularTextRunElementData.AddRPr()";
                            }

                            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                            public C9135ws invoke() {
                                return c8549pu.m39135k4();
                            }
                        }, u8sVar);
                        c8549pu.m39136k4(IOUtils.LINE_SEPARATOR_WINDOWS);
                    }
                } else {
                    c9233xuInvoke = abstractC4685kk.invoke();
                    azg.m3882k4(paragraph2.getParagraphFormat(), new AbstractC4685kk<C8181lg>() { // from class: com.aspose.slides.odi.2
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9233xuInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphElementData.AddPPr()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C8181lg invoke() {
                            return c9233xuInvoke.m44646k4();
                        }
                    }, u8sVar);
                }
                IGenericEnumerator<IPortion> it2 = paragraph2.getPortions().iterator();
                while (it2.hasNext()) {
                    try {
                        IPortion next = it2.next();
                        if (C7019kk.m27469x1(next, MathPortion.class)) {
                            e3c.m5340k4((MathParagraph) ((MathPortion) C7019kk.m27452k4((Object) next, MathPortion.class)).getMathParagraph(), (C8992v2) ((C9348z6) c9233xuInvoke.m44645k4("m").m29542x1()).m45490k4("oMathPara").m29542x1(), u8sVar);
                        } else if (next.getField() != null || !"".equals(((Portion) next).m2283h4())) {
                            String[] strArrM67414k4 = C14113y2.m67414k4(((Portion) next).m2283h4(), ControlChar.LINE_BREAK_CHAR);
                            for (int i = 0; i < strArrM67414k4.length; i++) {
                                if (!"".equals(strArrM67414k4[i]) || next.getField() != null) {
                                    if (next.getField() != null) {
                                        final C8416oa c8416oa = (C8416oa) c9233xuInvoke.m44645k4("fld").m29542x1();
                                        c8416oa.m38089k4(((Field) next.getField()).m1444k4().m63304x1().Clone());
                                        if (next.getField().getType() != null && next.getField().getType().getInternalString() != null && next.getField().getType().getInternalString().length() != 0) {
                                            c8416oa.m38090k4(next.getField().getType().getInternalString());
                                        }
                                        azg.m3882k4(((Field) next.getField()).m1444k4().m63301k4(), new AbstractC4685kk<C8181lg>() { // from class: com.aspose.slides.odi.3
                                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                            public String getDelegateId() {
                                                return System.identityHashCode(c8416oa) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextFieldElementData.AddPPr()";
                                            }

                                            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                                            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                                            public C8181lg invoke() {
                                                return c8416oa.m38094x1();
                                            }
                                        }, u8sVar);
                                        h1b.m6959k4(next.getPortionFormat(), new AbstractC4685kk<C9135ws>() { // from class: com.aspose.slides.odi.4
                                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                            public String getDelegateId() {
                                                return System.identityHashCode(c8416oa) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextFieldElementData.AddRPr()";
                                            }

                                            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                                            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                                            public C9135ws invoke() {
                                                return c8416oa.m38088k4();
                                            }
                                        }, u8sVar);
                                        c8416oa.m38095x1(strArrM67414k4[i]);
                                    } else {
                                        final C8549pu c8549pu2 = (C8549pu) c9233xuInvoke.m44645k4("r").m29542x1();
                                        h1b.m6959k4(next.getPortionFormat(), new AbstractC4685kk<C9135ws>() { // from class: com.aspose.slides.odi.5
                                            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                            public String getDelegateId() {
                                                return System.identityHashCode(c8549pu2) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_RegularTextRunElementData.AddRPr()";
                                            }

                                            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                                            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                                            public C9135ws invoke() {
                                                return c8549pu2.m39135k4();
                                            }
                                        }, u8sVar);
                                        c8549pu2.m39136k4(strArrM67414k4[i]);
                                    }
                                }
                                if (i < strArrM67414k4.length - 1) {
                                    final C8308n4 c8308n4 = (C8308n4) c9233xuInvoke.m44645k4("br").m29542x1();
                                    h1b.m6959k4(next.getPortionFormat(), new AbstractC4685kk<C9135ws>() { // from class: com.aspose.slides.odi.6
                                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                        public String getDelegateId() {
                                            return System.identityHashCode(c8308n4) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextLineBreakElementData.AddRPr()";
                                        }

                                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                                        public C9135ws invoke() {
                                            return c8308n4.m37224k4();
                                        }
                                    }, u8sVar);
                                }
                            }
                        }
                    } catch (Throwable th) {
                        if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                            it2.dispose();
                        }
                        throw th;
                    }
                }
                if (C7019kk.m27456k4((Iterator) it2, (Class<IDisposable>) IDisposable.class)) {
                    it2.dispose();
                }
                if (paragraph2.getEndParagraphPortionFormat() != null) {
                    portionFormat = paragraph2.getEndParagraphPortionFormat();
                    abstractC4685kk2 = new AbstractC4685kk<C9135ws>() { // from class: com.aspose.slides.odi.7
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return System.identityHashCode(c9233xuInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphElementData.AddEndParaRPr()";
                        }

                        @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                        public C9135ws invoke() {
                            return c9233xuInvoke.m44650x1();
                        }
                    };
                } else {
                    if (paragraph2.getPortions().getCount() > 0) {
                        IPortion iPortion = paragraph2.getPortions().get_Item(paragraph2.getPortions().getCount() - 1);
                        if ("".equals(((Portion) iPortion).m2283h4())) {
                            portionFormat = iPortion.getPortionFormat();
                            abstractC4685kk2 = new AbstractC4685kk<C9135ws>() { // from class: com.aspose.slides.odi.8
                                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                                public String getDelegateId() {
                                    return System.identityHashCode(c9233xuInvoke) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextParagraphElementData.AddEndParaRPr()";
                                }

                                @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                                /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                                public C9135ws invoke() {
                                    return c9233xuInvoke.m44650x1();
                                }
                            };
                        }
                    }
                    paragraph = paragraph2;
                }
                h1b.m6959k4(portionFormat, abstractC4685kk2, u8sVar);
                paragraph = paragraph2;
            } catch (Throwable th2) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th2;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x01f3, code lost:
    
        r1 = r5.m44644du();
        r7 = (com.aspose.slides.Paragraph) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01fb, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01fd, code lost:
    
        r3 = (com.aspose.slides.PortionCollection) r7.getPortions();
        r5 = new com.aspose.slides.Portion();
        r5.m2288k4(r3);
        r6 = new com.aspose.slides.PortionFormat(r5);
        r7.m2162k4(r6);
        com.aspose.slides.h1b.m6960k4(r6, r1, r20);
        r5.m2288k4((com.aspose.slides.PortionCollection) null);
        r6.m2307k4((com.aspose.slides.Portion) null);
        r7.setEndParagraphPortionFormat(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0224, code lost:
    
        if (r3.getCount() != 0) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0226, code lost:
    
        new com.aspose.slides.Portion(r6, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0234, code lost:
    
        if ("".equals(r7.m2168to()) == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x023b, code lost:
    
        if (r18.getCount() < 2) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x023d, code lost:
    
        r1 = r18.get_Item(r18.getCount() - 2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x024e, code lost:
    
        if (r1.getPortions().getCount() <= 0) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0250, code lost:
    
        ((com.aspose.slides.PortionFormat) r8.m2297k4().getPortionFormat()).m361k4((com.aspose.slides.BasePortionFormat) r1.getPortions().get_Item(r1.getPortions().getCount() - 1).getPortionFormat());
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0277, code lost:
    
        r4 = r4 + 1;
        r1 = r19;
     */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m68460k4(IParagraphCollection iParagraphCollection, C9233xu[] c9233xuArr, gnb gnbVar) {
        C9135ws c9135wsM39138x1;
        IPortion iPortion;
        IPortion iPortion2;
        IPortion iPortion3;
        C9233xu[] c9233xuArr2 = c9233xuArr;
        if (c9233xuArr2 == null) {
            return;
        }
        iParagraphCollection.clear();
        int i = 0;
        while (i < c9233xuArr2.length) {
            C9233xu c9233xu = c9233xuArr2[i];
            ParagraphCollection paragraphCollection = (ParagraphCollection) iParagraphCollection;
            IParagraph iParagraphM2177k4 = paragraphCollection.m2177k4();
            azg.m3883k4(iParagraphM2177k4.getParagraphFormat(), c9233xu.m44648kk(), gnbVar);
            PortionCollection portionCollection = (PortionCollection) iParagraphM2177k4.getPortions();
            int i2 = 0;
            IPortion iPortion4 = null;
            while (true) {
                String strM39137kk = "";
                if (i2 >= c9233xu.m44649to().size()) {
                    break;
                }
                C7394ca c7394ca = c9233xu.m44649to().get_Item(i2);
                IPortion iPortionM2297k4 = !C14113y2.m67363du(c7394ca.m29539k4(), "m") ? portionCollection.m2297k4() : null;
                C7017h4 c7017h4 = f47744x1;
                int iM27428k4 = c7017h4.m27428k4(c7394ca.m29539k4());
                if (iM27428k4 == 0 || iM27428k4 == 1) {
                    if ("fld".equals(c7394ca.m29539k4())) {
                        C8416oa c8416oa = (C8416oa) c7394ca.m29542x1();
                        iPortionM2297k4.addField(c8416oa.m38093to());
                        azg.m3883k4(((Field) iPortionM2297k4.getField()).m1444k4().m63301k4(), c8416oa.m38087h4(), gnbVar);
                        ((Field) iPortionM2297k4.getField()).m1444k4().m63303k4(c8416oa.m38091kk().Clone());
                        c9135wsM39138x1 = c8416oa.m38086du();
                        String strM38092m9 = c8416oa.m38092m9();
                        if (strM38092m9 != null) {
                            strM39137kk = strM38092m9;
                        }
                    } else {
                        C8549pu c8549pu = (C8549pu) c7394ca.m29542x1();
                        c9135wsM39138x1 = c8549pu.m39138x1();
                        strM39137kk = c8549pu.m39137kk();
                    }
                    h1b.m6960k4(iPortionM2297k4.getPortionFormat(), c9135wsM39138x1, gnbVar);
                    int[] iArr = {0};
                    int i3 = 0;
                    IPortion iPortion5 = iPortionM2297k4;
                    IPortion iPortion6 = iPortion4;
                    while (true) {
                        String strM68458k4 = m68458k4(strM39137kk, iArr);
                        if (strM68458k4 == null) {
                            break;
                        }
                        i3 = iArr[0];
                        iPortion5.setText(strM68458k4);
                        ((Paragraph) iParagraphM2177k4).m2165k4(true);
                        iParagraphM2177k4 = paragraphCollection.m2177k4();
                        azg.m3883k4(iParagraphM2177k4.getParagraphFormat(), c9233xu.m44648kk(), gnbVar);
                        IPortion iPortionM2297k42 = portionCollection.m2297k4();
                        h1b.m6960k4(iPortionM2297k42.getPortionFormat(), c9135wsM39138x1, gnbVar);
                        iPortion6 = null;
                        iPortion5 = iPortionM2297k42;
                    }
                    if (i3 > 0) {
                        strM39137kk = C14113y2.m67422kk(strM39137kk, i3);
                    }
                    iPortion5.setText(strM39137kk);
                    iPortion2 = iPortion5;
                    iPortion = iPortion6;
                } else {
                    if (iM27428k4 == 2) {
                        C8308n4 c8308n4 = (C8308n4) c7394ca.m29542x1();
                        iPortionM2297k4.setText("\u000b");
                        iPortionM2297k4.getPortionFormat().setHyperlinkClick(m68457k4(portionCollection, iPortion4));
                        h1b.m6960k4(iPortionM2297k4.getPortionFormat(), c8308n4.m37225x1(), gnbVar);
                        iPortion3 = iPortionM2297k4;
                    } else {
                        if (iM27428k4 != 3) {
                            throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394ca.m29539k4(), "\""));
                        }
                        C7394ca c7394caM45489k4 = ((C9348z6) c7394ca.m29542x1()).m45489k4();
                        iPortion3 = iPortionM2297k4;
                        if (c7394caM45489k4 != null) {
                            MathPortion mathPortion = new MathPortion();
                            MathParagraph mathParagraph = (MathParagraph) mathPortion.getMathParagraph();
                            mathParagraph.m1998k4(false);
                            mathParagraph.setJustification(1);
                            int iM27428k42 = c7017h4.m27428k4(c7394caM45489k4.m29539k4());
                            if (iM27428k42 == 4) {
                                e3c.m5339k4(mathParagraph, (C8992v2) c7394caM45489k4.m29542x1(), gnbVar);
                            } else {
                                if (iM27428k42 != 5) {
                                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7394caM45489k4.m29539k4(), "\""));
                                }
                                C7211a4 c7211a4 = (C7211a4) c7394caM45489k4.m29542x1();
                                MathBlock mathBlock = new MathBlock();
                                uf9.m71683k4(mathBlock, c7211a4, gnbVar);
                                mathParagraph.add(mathBlock);
                            }
                            portionCollection.add(mathPortion);
                            iPortion3 = mathPortion;
                        }
                    }
                    iPortion2 = iPortion3;
                    iPortion = iPortion4;
                }
                if (iPortion == null || C7019kk.m27469x1(iPortion, MathPortion.class) || C7019kk.m27469x1(iPortion2, MathPortion.class) || !iPortion.getPortionFormat().equals(iPortion2.getPortionFormat()) || iPortion.getField() != null || iPortion2.getField() != null) {
                    iPortion = iPortion2;
                } else {
                    iPortion.setText(C14113y2.m67408k4(((Portion) iPortion).m2283h4(), ((Portion) iPortion2).m2283h4()));
                    portionCollection.m2301x1();
                }
                i2++;
                iPortion4 = iPortion;
            }
        }
    }
}
