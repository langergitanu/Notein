package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.AbstractC9177x6;
import com.aspose.slides.internal.p332p7.AbstractC9290yj;
import com.aspose.slides.internal.p332p7.C7322bh;
import com.aspose.slides.internal.p332p7.C7473dd;
import com.aspose.slides.internal.p332p7.C7639f6;
import com.aspose.slides.internal.p332p7.C7850hh;
import com.aspose.slides.internal.p332p7.C7952iq;
import com.aspose.slides.internal.p332p7.C8629qv;
import com.aspose.slides.internal.p332p7.C9130wq;
import com.aspose.slides.internal.p332p7.C9365zg;
import com.aspose.slides.internal.p332p7.C9373zi;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class mbn {
    /* JADX INFO: renamed from: k4 */
    public static void m64816k4(SectionZoomFrame sectionZoomFrame, com.aspose.slides.internal.p332p7.pij pijVar, bjs bjsVar) {
        if (pijVar == null) {
            return;
        }
        com.aspose.slides.internal.p332p7.rm1 rm1VarM43895ix = pijVar.mo31678kk().m33836k4().m43895ix();
        axn.m3766k4(sectionZoomFrame, rm1VarM43895ix.m40062k4().m40825x1().m38486m9(), bjsVar.m4229k4());
        C14297pp.m69181k4(sectionZoomFrame, pijVar, bjsVar);
        sectionZoomFrame.m3132x1(rm1VarM43895ix.m40062k4().m40825x1().m38480k4().Clone());
        sectionZoomFrame.m2527k4(rm1VarM43895ix.m40062k4().m40823k4().Clone());
        sectionZoomFrame.m3121k4(rm1VarM43895ix.m40062k4().m40825x1().m38485kk());
        sectionZoomFrame.setReturnToParent(rm1VarM43895ix.m40062k4().m40825x1().m38489x1());
        sectionZoomFrame.m3124k4(rm1VarM43895ix.m40062k4().m40825x1().m38478du());
        sectionZoomFrame.setTransitionDuration(C13670j2.m63183k4(rm1VarM43895ix.m40062k4().m40825x1().m38487to()));
        xps.m73532k4(sectionZoomFrame.m3125qq(), rm1VarM43895ix.m40062k4().m40825x1().m38479h4(), bjsVar.m4229k4());
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64817k4(SectionZoomFrame sectionZoomFrame, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        com.aspose.slides.internal.p332p7.s8c s8cVarM40062k4 = pijVar.mo31678kk().m33836k4().m43903m9().m40062k4();
        s8cVarM40062k4.m40824k4(sectionZoomFrame.m2525k4().Clone());
        s8cVarM40062k4.m40825x1().m38482k4(sectionZoomFrame.m3133yj().Clone());
        s8cVarM40062k4.m40825x1().m38484k4(sectionZoomFrame.getReturnToParent());
        s8cVarM40062k4.m40825x1().m38488x1(sectionZoomFrame.m3128vh());
        if (C14064he.m66715kk(sectionZoomFrame.getTransitionDuration())) {
            sectionZoomFrame.setTransitionDuration(1.0f);
        }
        s8cVarM40062k4.m40825x1().m38483k4(C13670j2.m63187k4(sectionZoomFrame.getTransitionDuration()));
        s8cVarM40062k4.m40825x1().m38481k4(sectionZoomFrame.m3126qw());
        s8cVarM40062k4.m40825x1().m38479h4().m44550k4().m37972x1(u8sVarM70580k4.m55433g8().m55311x1(u8sVarM70580k4.m71567x1(sectionZoomFrame.m3125qq().getPicture().getImage())).m55289du());
        s8cVarM40062k4.m40825x1().m38479h4().m44552k4(sectionZoomFrame.m3125qq().getDpi() != 96 ? 4294967295L & ((long) sectionZoomFrame.m3125qq().getDpi()) : 4294967295L);
        final C9373zi c9373zi = (C9373zi) s8cVarM40062k4.m40825x1().m38479h4().m44549k4("stretch").m29542x1();
        ht5.m7292k4(sectionZoomFrame.m3125qq().m2255m9().m74642k4().Clone(), new AbstractC4685kk<C8629qv>() { // from class: com.aspose.slides.mbn.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c9373zi) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_StretchInfoPropertiesElementData.AddFillRect()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8629qv invoke() {
                return c9373zi.m45631k4();
            }
        });
        axn.m3767k4(sectionZoomFrame, s8cVarM40062k4.m40825x1().m38486m9(), u8sVarM70580k4);
        C9365zg c9365zg = (C9365zg) s8cVarM40062k4.m40825x1().m38486m9().m35384kk("prstGeom").m29542x1();
        c9365zg.m45599k4(5);
        c9365zg.m45598k4();
        C14297pp.m69182k4(sectionZoomFrame, pijVar, u8sVarM70580k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m64818k4(SectionZoomFrame sectionZoomFrame, C9130wq c9130wq, sdp sdpVar) {
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        com.aspose.slides.internal.p332p7.ks0 ks0Var = (com.aspose.slides.internal.p332p7.ks0) c9130wq.m43855k4("pic").m29542x1();
        AbstractC9177x6 abstractC9177x6Mo35656k4 = ks0Var.mo35656k4();
        axn.m3765k4(sectionZoomFrame, abstractC9177x6Mo35656k4.mo44221kk(), u8sVarM70580k4);
        axn.m3763k4(sectionZoomFrame, abstractC9177x6Mo35656k4.mo42132k4(), u8sVarM70580k4);
        if (sectionZoomFrame.m3120ar() != null) {
            C7473dd c7473ddM31574k4 = abstractC9177x6Mo35656k4.mo42132k4().m31574k4();
            c7473ddM31574k4.m30289k4(u8sVarM70580k4.m55433g8().m55305k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide", u8sVarM70580k4.m71565x1().get_Item(sectionZoomFrame.m3120ar()), (byte) 0).m55289du());
            c7473ddM31574k4.m30292kk(C14113y2.m67408k4("ppaction://hlinksldjump?num=", C14057f9.m66591x1(((Slide) sectionZoomFrame.m3120ar()).m2709qq() + 1)));
        }
        PictureFrameLock pictureFrameLock = new PictureFrameLock();
        pictureFrameLock.setAdjustHandlesLocked(true);
        pictureFrameLock.setArrowheadsLocked(true);
        pictureFrameLock.setAspectRatioLocked(true);
        pictureFrameLock.setEditPointsLocked(true);
        pictureFrameLock.setGroupingLocked(true);
        pictureFrameLock.setPositionLocked(true);
        pictureFrameLock.setRotationLocked(true);
        pictureFrameLock.setSelectLocked(true);
        pictureFrameLock.setShapeTypeLocked(true);
        pictureFrameLock.setSizeLocked(true);
        final C7952iq c7952iqMo42133x1 = abstractC9177x6Mo35656k4.mo42133x1();
        jmg.m63442k4(pictureFrameLock, new AbstractC4685kk<C7850hh>() { // from class: com.aspose.slides.mbn.2
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c7952iqMo42133x1) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_NonVisualPicturePropertiesElementData.AddPicLocks()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C7850hh invoke() {
                return c7952iqMo42133x1.m34391k4();
            }
        });
        axn.m3767k4(sectionZoomFrame, ks0Var.mo35657kk(), u8sVarM70580k4);
        C9365zg c9365zg = (C9365zg) ks0Var.mo35657kk().m35384kk("prstGeom").m29542x1();
        c9365zg.m45599k4(5);
        c9365zg.m45598k4();
        xps.m73533k4(sectionZoomFrame.m3125qq(), ks0Var.mo35659x1(), u8sVarM70580k4);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m64819k4(SectionZoomFrame sectionZoomFrame, AbstractC9290yj abstractC9290yj, sdp sdpVar) {
        C7639f6 c7639f6 = (C7639f6) abstractC9290yj.mo28598k4("AlternateContent").m29542x1();
        c7639f6.m31638k4("psez", "http://schemas.microsoft.com/office/powerpoint/2016/sectionzoom");
        c7639f6.m31638k4("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        C7322bh c7322bhM31637k4 = c7639f6.m31637k4();
        c7322bhM31637k4.m28902x1("psez");
        com.aspose.slides.internal.p332p7.pij pijVar = (com.aspose.slides.internal.p332p7.pij) c7322bhM31637k4.m28901k4("graphicFrame").m29542x1();
        pijVar.mo31678kk().m33836k4().m43900k4("http://schemas.microsoft.com/office/powerpoint/2016/sectionzoom");
        m64817k4(sectionZoomFrame, pijVar, sdpVar);
        C9130wq c9130wqM31641x1 = c7639f6.m31641x1();
        if (sdpVar.m70580k4().m71552m9() == 0) {
            m64818k4(sectionZoomFrame, c9130wqM31641x1, sdpVar);
        }
    }
}
