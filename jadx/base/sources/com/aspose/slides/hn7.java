package com.aspose.slides;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C7317be;
import com.aspose.slides.internal.p332p7.C7360by;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C7447cx;
import com.aspose.slides.internal.p332p7.C7499dn;
import com.aspose.slides.internal.p332p7.C8345ni;
import com.aspose.slides.internal.p332p7.C8491p4;
import com.aspose.slides.internal.p332p7.C8638qy;
import com.aspose.slides.internal.p332p7.C8703rr;
import com.aspose.slides.internal.p332p7.C8820sx;
import com.aspose.slides.internal.p332p7.C8952ug;
import com.aspose.slides.internal.p332p7.C9233xu;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class hn7 {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f5543k4 = new C7017h4("noAutofit", "normAutofit", "spAutoFit");

    /* JADX INFO: renamed from: k4 */
    public static void m7240k4(ITextFrame iTextFrame, AbstractC4685kk<C8952ug> abstractC4685kk, u8s u8sVar) {
        if (iTextFrame == null) {
            return;
        }
        m7242k4(iTextFrame, abstractC4685kk.invoke(), u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m7241k4(ITextFrame iTextFrame, C8952ug c8952ug, gnb gnbVar) {
        if (c8952ug == null) {
            return;
        }
        C7360by c7360byM42374kk = c8952ug.m42374kk();
        TextFrameFormat textFrameFormat = (TextFrameFormat) iTextFrame.getTextFrameFormat();
        textFrameFormat.m2947h4().m70160k4(c7360byM42374kk.m29276um());
        textFrameFormat.m2950k4((byte) -1);
        if (c7360byM42374kk.m29279wl() != null) {
            int iM27428k4 = f5543k4.m27428k4(c7360byM42374kk.m29279wl().m29539k4());
            if (iM27428k4 == 0) {
                textFrameFormat.m2950k4((byte) 0);
            } else if (iM27428k4 == 1) {
                C8703rr c8703rr = (C8703rr) c7360byM42374kk.m29279wl().m29542x1();
                textFrameFormat.m2950k4((byte) 1);
                textFrameFormat.m2951k4(c8703rr.m40184k4() / 100.0f);
                textFrameFormat.m2971x1(c8703rr.m40186x1() / 100.0f);
            } else {
                if (iM27428k4 != 2) {
                    throw new Exception(C14113y2.m67408k4("Unknown element \"", c7360byM42374kk.m29279wl().m29539k4(), "\""));
                }
                textFrameFormat.m2950k4((byte) 2);
            }
        }
        textFrameFormat.setColumnCount(c7360byM42374kk.m29247fa());
        textFrameFormat.setColumnSpacing(c7360byM42374kk.m29277up());
        textFrameFormat.m2970x1(c7360byM42374kk.m29285yj());
        textFrameFormat.setRotationAngle(c7360byM42374kk.m29280x1());
        textFrameFormat.m2956kk(c7360byM42374kk.m29242du());
        yci.m73855k4(textFrameFormat.m2944dy(), c7360byM42374kk.m29278uz());
        textFrameFormat.m2964to(c7360byM42374kk.m29263kk());
        textFrameFormat.m2943du(c7360byM42374kk.m29272to());
        textFrameFormat.m2948h4(c7360byM42374kk.m29266ks());
        textFrameFormat.m2960m9(c7360byM42374kk.m29269ne());
        textFrameFormat.m2954k4(c7360byM42374kk.m29250ix());
        textFrameFormat.m2945dy(c7360byM42374kk.m29275u4());
        textFrameFormat.setTextVerticalType(c7360byM42374kk.m29248h4());
        textFrameFormat.m2953k4(new xmh(c7360byM42374kk.m29245dy(), c7360byM42374kk.m29239c5(), c7360byM42374kk.m29251jd(), c7360byM42374kk.m29241ck()));
        if (c7360byM42374kk.m29267m9() != 0) {
            textFrameFormat.setWrapText(c7360byM42374kk.m29267m9() != 2 ? (byte) 0 : (byte) 1);
        }
        textFrameFormat.setAnchoringType(c7360byM42374kk.m29271rv());
        textFrameFormat.setCenterText(c7360byM42374kk.m29284x6());
        iq8.m63054k4(textFrameFormat.m2959m9(), c8952ug.m42375to(), gnbVar);
        odi.m68460k4(iTextFrame.getParagraphs(), c8952ug.m42372du(), gnbVar);
        b6z.m4033k4(textFrameFormat.getThreeDFormat(), c7360byM42374kk.m29270qq(), c7360byM42374kk.m29238ar() == null ? null : (C8638qy) C7019kk.m27452k4(c7360byM42374kk.m29238ar().m29541kk(), C8638qy.class), c7360byM42374kk.m29238ar() != null ? (C7317be) C7019kk.m27452k4(c7360byM42374kk.m29238ar().m29541kk(), C7317be.class) : null);
        ((TextFrame) iTextFrame).m2932x1(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0194  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m7242k4(ITextFrame iTextFrame, final C8952ug c8952ug, u8s u8sVar) {
        String str;
        if (iTextFrame == null) {
            return;
        }
        final C7360by c7360byM42374kk = c8952ug.m42374kk();
        TextFrame textFrame = (TextFrame) iTextFrame;
        rm1 rm1VarM2947h4 = textFrame.f3519k4.m2947h4();
        byte autofitType = iTextFrame.getTextFrameFormat().getAutofitType();
        if (autofitType != -1) {
            if (autofitType == 0) {
                str = "noAutofit";
            } else if (autofitType == 1) {
                C8703rr c8703rr = (C8703rr) c7360byM42374kk.m29253k4("normAutofit").m29542x1();
                if (!C14064he.m66715kk(textFrame.f3519k4.m2940ck())) {
                    c8703rr.m40185k4(textFrame.f3519k4.m2940ck() * 100.0f);
                }
                if (!C14064he.m66715kk(textFrame.f3519k4.m2946fa())) {
                    c8703rr.m40187x1(textFrame.f3519k4.m2946fa() * 100.0f);
                }
            } else {
                if (autofitType != 2) {
                    throw new Exception();
                }
                str = "spAutoFit";
            }
            c7360byM42374kk.m29253k4(str);
        }
        TextFrameFormat textFrameFormat = (TextFrameFormat) iTextFrame.getTextFrameFormat();
        c7360byM42374kk.m29273to(textFrameFormat.getTextVerticalType());
        xmh xmhVarClone = textFrameFormat.m2963to().Clone();
        c7360byM42374kk.m29256k4(xmhVarClone.f50160x1);
        c7360byM42374kk.m29282x1(xmhVarClone.f50158kk);
        c7360byM42374kk.m29265kk(xmhVarClone.f50159to);
        c7360byM42374kk.m29274to(xmhVarClone.f50157du);
        if (iTextFrame.getTextFrameFormat().getWrapText() != -1) {
            c7360byM42374kk.m29258k4(iTextFrame.getTextFrameFormat().getWrapText() != 1 ? 1 : 2);
        }
        c7360byM42374kk.m29268m9(textFrameFormat.getAnchoringType());
        c7360byM42374kk.m29246dy(textFrameFormat.getCenterText());
        iq8.m63053k4(textFrameFormat.m2959m9(), new AbstractC4685kk<C8345ni>() { // from class: com.aspose.slides.hn7.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8952ug) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextBodyElementData.AddLstStyle()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8345ni invoke() {
                return c8952ug.m42373k4();
            }
        }, u8sVar);
        odi.m68459k4(iTextFrame.getParagraphs(), new AbstractC4685kk<C9233xu>() { // from class: com.aspose.slides.hn7.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8952ug) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextBodyElementData.AddP()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C9233xu invoke() {
                return c8952ug.m42376x1();
            }
        }, u8sVar);
        if (textFrameFormat.getColumnCount() > 0) {
            c7360byM42374kk.m29283x1(textFrameFormat.getColumnCount());
            c7360byM42374kk.m29244du(textFrameFormat.getColumnSpacing());
        }
        c7360byM42374kk.m29243du(textFrameFormat.m2939c5());
        c7360byM42374kk.m29257k4(textFrameFormat.getRotationAngle());
        c7360byM42374kk.m29264kk(textFrameFormat.m2949jd());
        yci.m73854k4(textFrameFormat.m2944dy(), new AbstractC4685kk<C7499dn>() { // from class: com.aspose.slides.hn7.3
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7360byM42374kk) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_TextBodyPropertiesElementData.AddPrstTxWarp()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7499dn invoke() {
                return c7360byM42374kk.m29254k4();
            }
        }, u8sVar);
        c7360byM42374kk.m29255k4(textFrameFormat.m2966up());
        c7360byM42374kk.m29281x1(textFrameFormat.m2975yj());
        c7360byM42374kk.m29249h4(textFrameFormat.m2957ks());
        c7360byM42374kk.m29240c5(textFrameFormat.m2962rv());
        c7360byM42374kk.m29262k4(textFrameFormat.m2973x6());
        c7360byM42374kk.m29252jd(textFrameFormat.m2961ne());
        IThreeDFormat threeDFormat = textFrameFormat.getThreeDFormat();
        ThreeDFormat threeDFormat2 = (ThreeDFormat) threeDFormat;
        if (threeDFormat2.m3005h4() != -1 || threeDFormat2.m3010m9() != -1) {
            C8820sx c8820sx = new C8820sx();
            C0699a0.m3135x1(threeDFormat.getCamera(), c8820sx.m41422x1());
            jul.m63554x1(threeDFormat.getLightRig(), c8820sx.m41420kk());
            c7360byM42374kk.m29261k4(c8820sx);
        }
        if ((threeDFormat.getMaterial() == -1 || threeDFormat.getMaterial() == 14) && threeDFormat.getContourWidth() == 0.0d && threeDFormat.getExtrusionHeight() == 0.0d) {
            ThreeDFormat threeDFormat3 = (ThreeDFormat) threeDFormat;
            if (threeDFormat3.m3004dy() != -1 || threeDFormat3.m3001c5() != -1) {
                final C8638qy c8638qy = new C8638qy();
                c8638qy.m39760kk(threeDFormat.getContourWidth());
                c8638qy.m39764x1(threeDFormat.getExtrusionHeight());
                c8638qy.m39757k4(threeDFormat.getDepth());
                c8638qy.m39758k4(threeDFormat.getMaterial() != -1 ? threeDFormat.getMaterial() : 14);
                k7a.m63710k4(threeDFormat.getBevelTop(), new AbstractC4685kk<C8491p4>() { // from class: com.aspose.slides.hn7.4
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8638qy) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_Shape3DElementData.AddBevelT()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8491p4 invoke() {
                        return c8638qy.m39756k4();
                    }
                });
                k7a.m63710k4(threeDFormat.getBevelBottom(), new AbstractC4685kk<C8491p4>() { // from class: com.aspose.slides.hn7.5
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8638qy) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_Shape3DElementData.AddBevelB()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C8491p4 invoke() {
                        return c8638qy.m39763x1();
                    }
                });
                C1246ib.m7607k4(threeDFormat.getExtrusionColor(), new AbstractC4685kk<C7447cx>() { // from class: com.aspose.slides.hn7.6
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8638qy) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_Shape3DElementData.AddExtrusionClr()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7447cx invoke() {
                        return c8638qy.m39759kk();
                    }
                });
                C1246ib.m7607k4(threeDFormat.getContourColor(), new AbstractC4685kk<C7447cx>() { // from class: com.aspose.slides.hn7.7
                    @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                    public String getDelegateId() {
                        return System.identityHashCode(c8638qy) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_Shape3DElementData.AddContourClr()";
                    }

                    @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
                    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
                    public C7447cx invoke() {
                        return c8638qy.m39762to();
                    }
                });
                c7360byM42374kk.m29259k4(new C7394ca("sp3d", c8638qy));
            }
        }
        if (textFrameFormat.getKeepTextFlat()) {
            C7317be c7317be = new C7317be();
            c7317be.m28866k4(0.0d);
            c7360byM42374kk.m29259k4(new C7394ca("flatTx", c7317be));
        }
        c7360byM42374kk.m29260k4(rm1VarM2947h4.m70159k4());
    }
}
