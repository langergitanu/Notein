package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C8397nz;
import com.aspose.slides.internal.p332p7.C8515pd;
import com.aspose.slides.internal.p332p7.C8618qp;
import com.aspose.slides.internal.p464vq.AbstractC11747gf;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11849x5;
import com.aspose.slides.internal.p505xn.C12563k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13932ly;
import com.aspose.slides.p559ms.System.Xml.C13940my;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: loaded from: classes3.dex */
class it6 {
    /* JADX INFO: renamed from: k4 */
    private static C13981tl m63108k4(AbstractC7414ck abstractC7414ck) {
        XmlDocument xmlDocumentM29999k4;
        if (abstractC7414ck == null || abstractC7414ck.mo29643k4().length == 0 || (xmlDocumentM29999k4 = com.aspose.slides.internal.p332p7.d0s.m29999k4(abstractC7414ck, "{96DAC541-7B7A-43D3-8B79-37D633B846F1}")) == null || xmlDocumentM29999k4.getDocumentElement() == null) {
            return null;
        }
        return (C13981tl) fyw.m6354k4(xmlDocumentM29999k4.getDocumentElement(), "svgBlip", "http://schemas.microsoft.com/office/drawing/2016/SVG/main");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63109k4(ISlidesPicture iSlidesPicture, AbstractC7414ck abstractC7414ck, gnb gnbVar) {
        C11709bg c11709bgM55303k4;
        C11709bg c11709bgM55303k42;
        IPPImage iPPImageM1718k4;
        C13981tl c13981tlM63108k4 = m63108k4(abstractC7414ck);
        if (c13981tlM63108k4 != null) {
            if (!c13981tlM63108k4.m65901dy("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
                if (c13981tlM63108k4.m65901dy("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
                    String strM65912to = c13981tlM63108k4.m65912to("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
                    if (C14113y2.m67411k4(strM65912to) || (c11709bgM55303k4 = gnbVar.m55338u4().m55303k4(strM65912to)) == null || C14113y2.m67411k4(c11709bgM55303k4.m55292k4())) {
                        return;
                    }
                    ((Picture) iSlidesPicture).m2241x1().m63574k4(c11709bgM55303k4.m55292k4());
                    return;
                }
                return;
            }
            String strM65912to2 = c13981tlM63108k4.m65912to("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            if (strM65912to2 == null || strM65912to2.length() <= 0 || (c11709bgM55303k42 = gnbVar.m55338u4().m55303k4(strM65912to2)) == null || c11709bgM55303k42.m55296x1() == null) {
                return;
            }
            if ("image/svg+xml".equals(c11709bgM55303k42.m55296x1().m55372fa().mo55273k4()) || "image/svg".equals(c11709bgM55303k42.m55296x1().m55372fa().mo55273k4())) {
                ((Picture) iSlidesPicture).m2241x1().m63576k4(c11709bgM55303k42.m55296x1().m55426to());
                SvgImage svgImage = new SvgImage(c11709bgM55303k42.m55296x1().m55426to());
                if (iSlidesPicture.getImage() == null) {
                    iPPImageM1718k4 = iSlidesPicture.getPresentation().getImages().addImage(svgImage);
                } else {
                    SvgImage svgImage2 = (SvgImage) iSlidesPicture.getImage().getSvgImage();
                    if (svgImage2 == null || (!(svgImage.m2855k4() || svgImage2.m2855k4()) || C12563k4.m58597k4(svgImage.getSvgData(), svgImage2.getSvgData()))) {
                        iSlidesPicture.getImage().setSvgImage(svgImage);
                        c11709bgM55303k42.m55296x1().m55422k4(true);
                    }
                    iPPImageM1718k4 = ((ImageCollection) iSlidesPicture.getPresentation().getImages()).m1718k4(svgImage);
                }
                iSlidesPicture.setImage(iPPImageM1718k4);
                c11709bgM55303k42.m55296x1().m55422k4(true);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m63110k4(ISlidesPicture iSlidesPicture, jyr jyrVar, AbstractC7414ck abstractC7414ck, final u8s u8sVar) {
        String strM55427x1;
        if (iSlidesPicture.getImage() == null || iSlidesPicture.getImage().getSvgImage() == null) {
            return;
        }
        C11791os[] c11791osArrM55357ix = u8sVar.mo4812qm().m55357ix();
        int length = c11791osArrM55357ix.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                strM55427x1 = null;
                break;
            }
            C11791os c11791os = c11791osArrM55357ix[i];
            if (C7019kk.m27469x1(c11791os.m55372fa(), C11849x5.class) && C12563k4.m58597k4(c11791os.m55426to(), iSlidesPicture.getImage().getSvgImage().getSvgData())) {
                strM55427x1 = c11791os.m55427x1();
                break;
            }
            i++;
        }
        if (strM55427x1 == null) {
            C11791os c11791osM55394k4 = u8sVar.mo4812qm().m55394k4("/ppt/media/image{0}.svg", new AbstractC11760jd.k4() { // from class: com.aspose.slides.it6.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextImageFileNumber()");
                }

                @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                /* JADX INFO: renamed from: k4 */
                public int mo5039k4() {
                    return u8sVar.m71558u4();
                }
            }, new C11849x5());
            c11791osM55394k4.m55423k4(iSlidesPicture.getImage().getSvgImage().getSvgData());
            strM55427x1 = c11791osM55394k4.m55427x1();
        }
        C11709bg c11709bgM55304k4 = u8sVar.m55433g8().m55304k4(AbstractC11747gf.f39744k4.m55382k4(), strM55427x1);
        if (jyrVar.m63572k4() == null) {
            jyrVar.m63573k4(new C8397nz());
        }
        C13981tl c13981tlM63108k4 = m63108k4(jyrVar.m63572k4());
        if (c13981tlM63108k4 != null) {
            if (c13981tlM63108k4.m65901dy("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
                c13981tlM63108k4.m65907k4("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", c11709bgM55304k4.m55289du());
            }
            Picture picture = (Picture) iSlidesPicture;
            if (!C14113y2.m67411k4(picture.m2241x1().m63580x1())) {
                c13981tlM63108k4.m65907k4("link", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", u8sVar.m55433g8().m55305k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships/image", picture.m2241x1().m63580x1(), (byte) 1).m55289du());
            }
            com.aspose.slides.internal.p332p7.d0s.m30000k4(jyrVar.m63572k4(), abstractC7414ck, "{96DAC541-7B7A-43D3-8B79-37D633B846F1}");
            return;
        }
        C8618qp c8618qpM38878x1 = C8515pd.m38878x1(abstractC7414ck, "{96DAC541-7B7A-43D3-8B79-37D633B846F1}");
        XmlDocument xmlDocument = new XmlDocument();
        xmlDocument.setXmlResolver(null);
        C13932ly c13932lyCreateDocumentFragment = xmlDocument.createDocumentFragment();
        c13932lyCreateDocumentFragment.setInnerXml(c8618qpM38878x1.mo28309k4());
        C13981tl c13981tlCreateElement = c13932lyCreateDocumentFragment.getChildNodes().m65457kk(0).getOwnerDocument().createElement("asvg", "svgBlip", "http://schemas.microsoft.com/office/drawing/2016/SVG/main");
        C13940my c13940myCreateAttribute = xmlDocument.createAttribute("r", "embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        c13940myCreateAttribute.setValue(c11709bgM55304k4.m55289du());
        c13981tlCreateElement.getAttributes().m65175x1(c13940myCreateAttribute);
        c13932lyCreateDocumentFragment.getChildNodes().m65457kk(0).appendChild(c13981tlCreateElement);
        c8618qpM38878x1.mo28310k4(c13932lyCreateDocumentFragment.getOuterXml());
    }
}
