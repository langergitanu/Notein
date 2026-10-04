package com.aspose.slides;

import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p332p7.AbstractC8714rv;
import com.aspose.slides.internal.p332p7.AbstractC9177x6;
import com.aspose.slides.internal.p332p7.C7850hh;
import com.aspose.slides.internal.p332p7.C7952iq;
import com.aspose.slides.internal.p332p7.C8601qh;

/* JADX INFO: loaded from: classes3.dex */
class r3b {
    /* JADX INFO: renamed from: k4 */
    private static void m70017k4(IPictureFrame iPictureFrame, AbstractC8714rv abstractC8714rv) {
        ((PictureFrame) iPictureFrame).mo272to().m63112x1(abstractC8714rv.mo35656k4().mo42133x1().m34396x1());
    }

    /* JADX INFO: renamed from: x1 */
    private static void m70020x1(IPictureFrame iPictureFrame, AbstractC8714rv abstractC8714rv) {
        abstractC8714rv.mo35656k4().mo42133x1().m34393k4(((PictureFrame) iPictureFrame).mo272to().m63111kk());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70018k4(IPictureFrame iPictureFrame, AbstractC8714rv abstractC8714rv, bjs bjsVar) {
        if (abstractC8714rv == null) {
            return;
        }
        itd itdVarMo272to = ((PictureFrame) iPictureFrame).mo272to();
        C13677j9.m63254k4(iPictureFrame, abstractC8714rv.mo35657kk(), bjsVar.m4229k4());
        xps.m73532k4((PictureFillFormat) iPictureFrame.getPictureFormat(), abstractC8714rv.mo35659x1(), bjsVar.m4229k4());
        AbstractC9177x6 abstractC9177x6Mo35656k4 = abstractC8714rv.mo35656k4();
        axn.m3764k4(iPictureFrame, abstractC9177x6Mo35656k4.mo44221kk(), bjsVar);
        axn.m3762k4(iPictureFrame, abstractC9177x6Mo35656k4.mo42132k4(), bjsVar);
        tgm.m71152k4(iPictureFrame, abstractC8714rv.mo35658to());
        C7952iq c7952iqMo42133x1 = abstractC9177x6Mo35656k4.mo42133x1();
        if (c7952iqMo42133x1 != null) {
            jmg.m63443k4(iPictureFrame.getPictureFrameLock(), c7952iqMo42133x1.m34394kk());
            itdVarMo272to.m70450x1(c7952iqMo42133x1.m34395to());
            m70017k4(iPictureFrame, abstractC8714rv);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m70019k4(IPictureFrame iPictureFrame, final AbstractC8714rv abstractC8714rv, u8s u8sVar) {
        itd itdVarMo272to = ((PictureFrame) iPictureFrame).mo272to();
        C13677j9.m63255k4(iPictureFrame, abstractC8714rv.mo35657kk(), u8sVar);
        xps.m73533k4((PictureFillFormat) iPictureFrame.getPictureFormat(), abstractC8714rv.mo35659x1(), u8sVar);
        tgm.m71153k4(iPictureFrame.getShapeStyle(), new AbstractC4685kk<C8601qh>() { // from class: com.aspose.slides.r3b.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(abstractC8714rv) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.BaseCT_PictureElementData.AddStyle()";
            }

            @Override // com.aspose.slides.internal.p172hu.AbstractC4685kk
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public C8601qh invoke() {
                return abstractC8714rv.mo35655du();
            }
        });
        AbstractC9177x6 abstractC9177x6Mo35656k4 = abstractC8714rv.mo35656k4();
        axn.m3765k4(iPictureFrame, abstractC9177x6Mo35656k4.mo44221kk(), u8sVar);
        axn.m3763k4(iPictureFrame, abstractC9177x6Mo35656k4.mo42132k4(), u8sVar);
        final C7952iq c7952iqMo42133x1 = abstractC9177x6Mo35656k4.mo42133x1();
        jmg.m63442k4(iPictureFrame.getPictureFrameLock(), new AbstractC4685kk<C7850hh>() { // from class: com.aspose.slides.r3b.2
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
        c7952iqMo42133x1.m34392k4(itdVarMo272to.m70447ck());
        m70020x1(iPictureFrame, abstractC8714rv);
    }
}
