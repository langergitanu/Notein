package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7361bz;
import com.aspose.slides.internal.p332p7.AbstractC8125ks;
import com.aspose.slides.internal.p332p7.AbstractC8714rv;
import com.aspose.slides.internal.p332p7.AbstractC9177x6;
import com.aspose.slides.internal.p332p7.AbstractC9290yj;
import com.aspose.slides.internal.p332p7.C7258al;
import com.aspose.slides.internal.p332p7.C7322bh;
import com.aspose.slides.internal.p332p7.C7473dd;
import com.aspose.slides.internal.p332p7.C7513du;
import com.aspose.slides.internal.p332p7.C7639f6;
import com.aspose.slides.internal.p332p7.C7850hh;
import com.aspose.slides.internal.p332p7.C7952iq;
import com.aspose.slides.internal.p332p7.C8150l0;
import com.aspose.slides.internal.p332p7.C8629qv;
import com.aspose.slides.internal.p332p7.C9096w8;
import com.aspose.slides.internal.p332p7.C9130wq;
import com.aspose.slides.internal.p332p7.C9220xo;
import com.aspose.slides.internal.p332p7.C9365zg;
import com.aspose.slides.internal.p332p7.C9373zi;
import com.aspose.slides.internal.p332p7.C9391zp;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class kaf {
    /* JADX INFO: renamed from: k4 */
    public static void m63735k4(SummaryZoomFrame summaryZoomFrame, com.aspose.slides.internal.p332p7.pij pijVar, bjs bjsVar) {
        if (pijVar == null) {
            return;
        }
        C14297pp.m69181k4(summaryZoomFrame, pijVar, bjsVar);
        com.aspose.slides.internal.p332p7.uih uihVarM43904ne = pijVar.mo31678kk().m33836k4().m43904ne();
        summaryZoomFrame.m2841k4(!C7019kk.m27469x1(uihVarM43904ne.m42407kk().m29541kk(), com.aspose.slides.internal.p332p7.x8n.class) ? 1 : 0);
        for (com.aspose.slides.internal.p332p7.zxr zxrVar : uihVarM43904ne.m42408x1()) {
            SummaryZoomSection summaryZoomSection = new SummaryZoomSection(summaryZoomFrame);
            summaryZoomSection.m2846kk(zxrVar.m46041to());
            summaryZoomSection.m2848to(zxrVar.m46031du());
            summaryZoomSection.m2843du(zxrVar.m46033h4());
            summaryZoomSection.m2844h4(zxrVar.m46040m9());
            summaryZoomSection.setDescription(zxrVar.m46038kk());
            summaryZoomSection.setTitle(zxrVar.m46043x1());
            summaryZoomSection.m3132x1(zxrVar.m46032dy().m38480k4().Clone());
            summaryZoomSection.m2527k4(zxrVar.m46034k4().Clone());
            summaryZoomSection.m3121k4(zxrVar.m46032dy().m38485kk());
            summaryZoomSection.setReturnToParent(zxrVar.m46032dy().m38489x1());
            summaryZoomSection.m3124k4(zxrVar.m46032dy().m38478du());
            summaryZoomSection.setTransitionDuration(C13670j2.m63183k4(zxrVar.m46032dy().m38487to()));
            xps.m73532k4(summaryZoomSection.m3125qq(), zxrVar.m46032dy().m38479h4(), bjsVar.m4229k4());
            axn.m3766k4(summaryZoomSection, zxrVar.m46032dy().m38486m9(), bjsVar.m4229k4());
            ((SummaryZoomSectionCollection) summaryZoomFrame.getSummaryZoomCollection()).m2852k4(summaryZoomSection);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63736k4(SummaryZoomFrame summaryZoomFrame, com.aspose.slides.internal.p332p7.pij pijVar, sdp sdpVar) {
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        com.aspose.slides.internal.p332p7.uih uihVarM43892dy = pijVar.mo31678kk().m33836k4().m43892dy();
        uihVarM43892dy.m42405k4(summaryZoomFrame.getLayout() == 0 ? "gridLayout" : "fixedLayout");
        IGenericEnumerator<ISummaryZoomSection> it = summaryZoomFrame.getSummaryZoomCollection().iterator();
        while (it.hasNext()) {
            try {
                ISummaryZoomSection next = it.next();
                com.aspose.slides.internal.p332p7.zxr zxrVarM42406k4 = uihVarM43892dy.m42406k4();
                SummaryZoomSection summaryZoomSection = (SummaryZoomSection) next;
                zxrVarM42406k4.m46035k4(summaryZoomSection.m2845kk());
                zxrVarM42406k4.m46044x1(summaryZoomSection.m2847to());
                zxrVarM42406k4.m46039kk(summaryZoomSection.m2842ck());
                zxrVarM42406k4.m46042to(summaryZoomSection.m2849up());
                zxrVarM42406k4.m46045x1(summaryZoomSection.getDescription());
                zxrVarM42406k4.m46037k4(summaryZoomSection.getTitle());
                zxrVarM42406k4.m46036k4(summaryZoomSection.m2525k4().Clone());
                zxrVarM42406k4.m46032dy().m38482k4(summaryZoomSection.m3133yj().Clone());
                zxrVarM42406k4.m46032dy().m38484k4(summaryZoomSection.getReturnToParent());
                zxrVarM42406k4.m46032dy().m38488x1(summaryZoomSection.m3128vh());
                if (C14064he.m66715kk(summaryZoomSection.getTransitionDuration())) {
                    summaryZoomSection.setTransitionDuration(1.0f);
                }
                zxrVarM42406k4.m46032dy().m38483k4(C13670j2.m63187k4(summaryZoomSection.getTransitionDuration()));
                zxrVarM42406k4.m46032dy().m38481k4(summaryZoomSection.m3126qw());
                zxrVarM42406k4.m46032dy().m38479h4().m44550k4().m37972x1(u8sVarM70580k4.m55433g8().m55311x1(u8sVarM70580k4.m71567x1(summaryZoomSection.m3125qq().getPicture().getImage())).m55289du());
                C9220xo c9220xoM38479h4 = zxrVarM42406k4.m46032dy().m38479h4();
                long dpi = 4294967295L;
                if (summaryZoomSection.m3125qq().getDpi() != 96) {
                    dpi = 4294967295L & ((long) summaryZoomSection.m3125qq().getDpi());
                }
                c9220xoM38479h4.m44552k4(dpi);
                final C9373zi c9373zi = (C9373zi) zxrVarM42406k4.m46032dy().m38479h4().m44549k4("stretch").m29542x1();
                ht5.m7292k4(summaryZoomSection.m3125qq().m2255m9().m74642k4().Clone(), new AbstractC4685kk<C8629qv>() { // from class: com.aspose.slides.kaf.1
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
                axn.m3767k4(summaryZoomSection, zxrVarM42406k4.m46032dy().m38486m9(), u8sVarM70580k4);
                C9365zg c9365zg = (C9365zg) zxrVarM42406k4.m46032dy().m38486m9().m35384kk("prstGeom").m29542x1();
                c9365zg.m45599k4(5);
                c9365zg.m45598k4();
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
        C14297pp.m69182k4(summaryZoomFrame, pijVar, u8sVarM70580k4);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m63737k4(SummaryZoomFrame summaryZoomFrame, C9130wq c9130wq, sdp sdpVar) {
        u8s u8sVarM70580k4 = sdpVar.m70580k4();
        com.aspose.slides.internal.p332p7.hc1 hc1Var = (com.aspose.slides.internal.p332p7.hc1) c9130wq.m43855k4("grpSp").m29542x1();
        AbstractC8125ks abstractC8125ksMo28599k4 = hc1Var.mo28599k4();
        abstractC8125ksMo28599k4.mo29447k4().m31584x1(summaryZoomFrame.getAlternativeText());
        abstractC8125ksMo28599k4.mo29447k4().m31580kk(summaryZoomFrame.getAlternativeTextTitle());
        abstractC8125ksMo28599k4.mo29447k4().m31577k4(summaryZoomFrame.getName());
        abstractC8125ksMo28599k4.mo29447k4().m31575k4(summaryZoomFrame.m2584wp());
        C9096w8 c9096w8M44196k4 = abstractC8125ksMo28599k4.mo29448x1().m44196k4();
        c9096w8M44196k4.m43564k4(true);
        c9096w8M44196k4.m43572x1(true);
        c9096w8M44196k4.m43570to(true);
        c9096w8M44196k4.m43558du(true);
        c9096w8M44196k4.m43561h4(true);
        c9096w8M44196k4.m43568m9(true);
        C8150l0 c8150l0M31759k4 = hc1Var.mo28603x1().m31759k4();
        IShapeFrame frame = summaryZoomFrame.getFrame();
        C9391zp c9391zpM35802k4 = c8150l0M31759k4.m35802k4();
        c9391zpM35802k4.m45890k4(C14044b3.m66437kk((double) frame.getX()) ? 0.0d : frame.getX());
        c9391zpM35802k4.m45892x1(C14044b3.m66437kk((double) frame.getY()) ? 0.0d : frame.getY());
        C7258al c7258alM35808x1 = c8150l0M31759k4.m35808x1();
        c7258alM35808x1.m28297k4(C14044b3.m66437kk((double) frame.getWidth()) ? 0.0d : frame.getWidth());
        c7258alM35808x1.m28299x1(C14044b3.m66437kk((double) frame.getHeight()) ? 0.0d : frame.getHeight());
        c8150l0M31759k4.m35803k4(C14064he.m66715kk(frame.getRotation()) ? 0.0f : frame.getRotation());
        c8150l0M31759k4.m35804k4(frame.getFlipH() == 1);
        c8150l0M31759k4.m35809x1(frame.getFlipV() == 1);
        IGenericEnumerator<ISummaryZoomSection> it = summaryZoomFrame.getSummaryZoomCollection().iterator();
        while (it.hasNext()) {
            try {
                SummaryZoomSection summaryZoomSection = (SummaryZoomSection) it.next();
                AbstractC7361bz abstractC7361bzM29542x1 = hc1Var.mo28598k4("pic").m29542x1();
                AbstractC8714rv abstractC8714rvM30642k4 = C7019kk.m27469x1(abstractC7361bzM29542x1, C7513du.class) ? ((C7513du) abstractC7361bzM29542x1).m30642k4() : (AbstractC8714rv) abstractC7361bzM29542x1;
                AbstractC9177x6 abstractC9177x6Mo35656k4 = abstractC8714rvM30642k4.mo35656k4();
                axn.m3765k4(summaryZoomSection, abstractC9177x6Mo35656k4.mo44221kk(), u8sVarM70580k4);
                axn.m3763k4(summaryZoomSection, abstractC9177x6Mo35656k4.mo42132k4(), u8sVarM70580k4);
                C7473dd c7473ddM31574k4 = abstractC9177x6Mo35656k4.mo42132k4().m31574k4();
                c7473ddM31574k4.m30289k4(u8sVarM70580k4.m55433g8().m55305k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide", u8sVarM70580k4.m71565x1().get_Item(summaryZoomSection.m3120ar()), (byte) 0).m55289du());
                c7473ddM31574k4.m30292kk(C14113y2.m67408k4("ppaction://hlinksldjump?num=", C14057f9.m66591x1(((Slide) summaryZoomSection.m3120ar()).m2709qq() + 1)));
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
                jmg.m63442k4(pictureFrameLock, new AbstractC4685kk<C7850hh>() { // from class: com.aspose.slides.kaf.2
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
                axn.m3767k4(summaryZoomSection, abstractC8714rvM30642k4.mo35657kk(), u8sVarM70580k4);
                C9365zg c9365zg = (C9365zg) abstractC8714rvM30642k4.mo35657kk().m35384kk("prstGeom").m29542x1();
                c9365zg.m45599k4(5);
                c9365zg.m45598k4();
                xps.m73533k4(summaryZoomSection.m3125qq(), abstractC8714rvM30642k4.mo35659x1(), u8sVarM70580k4);
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

    /* JADX INFO: renamed from: k4 */
    public static void m63738k4(SummaryZoomFrame summaryZoomFrame, AbstractC9290yj abstractC9290yj, sdp sdpVar) {
        C7639f6 c7639f6 = (C7639f6) abstractC9290yj.mo28598k4("AlternateContent").m29542x1();
        c7639f6.m31638k4("psuz", "http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom");
        c7639f6.m31638k4("mc", "http://schemas.openxmlformats.org/markup-compatibility/2006");
        C7322bh c7322bhM31637k4 = c7639f6.m31637k4();
        c7322bhM31637k4.m28902x1("psuz");
        com.aspose.slides.internal.p332p7.pij pijVar = (com.aspose.slides.internal.p332p7.pij) c7322bhM31637k4.m28901k4("graphicFrame").m29542x1();
        pijVar.mo31678kk().m33836k4().m43900k4("http://schemas.microsoft.com/office/powerpoint/2016/summaryzoom");
        m63736k4(summaryZoomFrame, pijVar, sdpVar);
        C9130wq c9130wqM31641x1 = c7639f6.m31641x1();
        if (sdpVar.m70580k4().m71552m9() == 0) {
            m63737k4(summaryZoomFrame, c9130wqM31641x1, sdpVar);
        }
    }
}
