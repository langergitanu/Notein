package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C8397nz;
import com.aspose.slides.internal.p332p7.C8401o2;
import com.aspose.slides.internal.p464vq.AbstractC11747gf;
import com.aspose.slides.internal.p464vq.AbstractC11760jd;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.internal.p464vq.C11791os;
import com.aspose.slides.internal.p464vq.C11845wz;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;

/* JADX INFO: loaded from: classes3.dex */
class dr1 {
    /* JADX INFO: renamed from: k4 */
    private static C13981tl m5216k4(AbstractC7414ck abstractC7414ck) {
        C13981tl c13981tlM5217k4 = m5217k4(abstractC7414ck, "imgProps", "{BEBA8EAE-BF5A-486C-A8C5-ECC9F3942E4B}", "http://schemas.microsoft.com/office/drawing/2010/main");
        if (c13981tlM5217k4 == null) {
            return null;
        }
        return (C13981tl) fyw.m6354k4(c13981tlM5217k4, "imgLayer", "http://schemas.microsoft.com/office/drawing/2010/main");
    }

    /* JADX INFO: renamed from: x1 */
    private static C13981tl m5223x1(AbstractC7414ck abstractC7414ck) {
        return m5217k4(abstractC7414ck, "picAttrSrcUrl", "{837473B0-CC2E-450A-ABE3-18F120FF3D39}", "http://schemas.microsoft.com/office/drawing/2016/11/main");
    }

    /* JADX INFO: renamed from: k4 */
    private static C13981tl m5217k4(AbstractC7414ck abstractC7414ck, String str, String str2, String str3) {
        XmlDocument xmlDocumentM29999k4;
        if (abstractC7414ck == null || abstractC7414ck.mo29643k4().length == 0 || (xmlDocumentM29999k4 = com.aspose.slides.internal.p332p7.d0s.m29999k4(abstractC7414ck, str2)) == null || xmlDocumentM29999k4.getDocumentElement() == null) {
            return null;
        }
        return (C13981tl) fyw.m6354k4(xmlDocumentM29999k4.getDocumentElement(), str, str3);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5218k4(ISlidesPicture iSlidesPicture, AbstractC4685kk<C8401o2> abstractC4685kk, u8s u8sVar) {
        if (iSlidesPicture == null) {
            return;
        }
        m5222k4(iSlidesPicture, abstractC4685kk.invoke(), u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5219k4(ISlidesPicture iSlidesPicture, AbstractC7414ck abstractC7414ck, gnb gnbVar) {
        C11709bg c11709bgM55303k4;
        C11709bg c11709bgM55303k42;
        it6.m63109k4(iSlidesPicture, abstractC7414ck, gnbVar);
        C13981tl c13981tlM5216k4 = m5216k4(abstractC7414ck);
        if (c13981tlM5216k4 != null && c13981tlM5216k4.m65901dy("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
            String strM65912to = c13981tlM5216k4.m65912to("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
            if (!C14113y2.m67411k4(strM65912to) && (c11709bgM55303k42 = gnbVar.m55338u4().m55303k4(strM65912to)) != null && c11709bgM55303k42.m55296x1() != null) {
                ((Picture) iSlidesPicture).m2241x1().m63582x1(c11709bgM55303k42.m55296x1().m55426to());
                c11709bgM55303k42.m55296x1().m55422k4(true);
            }
        }
        C13981tl c13981tlM5223x1 = m5223x1(abstractC7414ck);
        if (c13981tlM5223x1 == null || !c13981tlM5223x1.m65901dy("id", "http://schemas.openxmlformats.org/officeDocument/2006/relationships")) {
            return;
        }
        String strM65912to2 = c13981tlM5223x1.m65912to("id", "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
        if (C14113y2.m67411k4(strM65912to2) || (c11709bgM55303k4 = gnbVar.m55338u4().m55303k4(strM65912to2)) == null || C14113y2.m67411k4(c11709bgM55303k4.m55292k4())) {
            return;
        }
        ((Picture) iSlidesPicture).m2241x1().m63581x1(c11709bgM55303k4.m55292k4());
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5220k4(ISlidesPicture iSlidesPicture, AbstractC7414ck abstractC7414ck, C8397nz c8397nz, final u8s u8sVar) {
        String strM55289du;
        String strM55427x1;
        C13981tl c13981tlM5216k4 = m5216k4(abstractC7414ck);
        if (c13981tlM5216k4 != null) {
            byte[] bArrM63578kk = ((Picture) iSlidesPicture).m2241x1().m63578kk();
            if (bArrM63578kk != null) {
                C11845wz c11845wz = new C11845wz();
                C11791os[] c11791osArrM55357ix = u8sVar.mo4812qm().m55357ix();
                int length = c11791osArrM55357ix.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        strM55427x1 = null;
                        break;
                    }
                    C11791os c11791os = c11791osArrM55357ix[i];
                    if (C7019kk.m27469x1(c11791os.m55372fa(), C11845wz.class) && c11791os.m55426to() == bArrM63578kk) {
                        strM55427x1 = c11791os.m55427x1();
                        break;
                    }
                    i++;
                }
                if (strM55427x1 == null) {
                    C11791os c11791osM55394k4 = u8sVar.mo4812qm().m55394k4("/ppt/media/image{0}.wdp", new AbstractC11760jd.k4() { // from class: com.aspose.slides.dr1.2
                        @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                        public String getDelegateId() {
                            return C22209OooOo0O.OooO00o(u8sVar, new StringBuilder(), "Aspose.Slides.PptxSerialization.PptxSerializationContext.GetNextImageFileNumber()");
                        }

                        @Override // com.aspose.slides.internal.p464vq.AbstractC11760jd.k4
                        /* JADX INFO: renamed from: k4 */
                        public int mo5039k4() {
                            return u8sVar.m71558u4();
                        }
                    }, c11845wz);
                    c11791osM55394k4.m55423k4(bArrM63578kk);
                    strM55427x1 = c11791osM55394k4.m55427x1();
                }
                strM55289du = u8sVar.m55433g8().m55304k4(c11845wz.mo55275x1().m55382k4(), strM55427x1).m55289du();
            } else {
                strM55289du = C14113y2.f47374k4;
            }
            c13981tlM5216k4.m65907k4("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", strM55289du);
            com.aspose.slides.internal.p332p7.d0s.m30000k4(abstractC7414ck, c8397nz, "{BEBA8EAE-BF5A-486C-A8C5-ECC9F3942E4B}");
        }
        C13981tl c13981tlM5223x1 = m5223x1(abstractC7414ck);
        if (c13981tlM5223x1 != null) {
            String strM63579to = ((Picture) iSlidesPicture).m2241x1().m63579to();
            c13981tlM5223x1.m65907k4("embed", "http://schemas.openxmlformats.org/officeDocument/2006/relationships", !C14113y2.m67411k4(strM63579to) ? u8sVar.m55433g8().m55305k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", strM63579to, (byte) 1).m55289du() : C14113y2.f47374k4);
            com.aspose.slides.internal.p332p7.d0s.m30000k4(abstractC7414ck, c8397nz, "{837473B0-CC2E-450A-ABE3-18F120FF3D39}");
        }
        if (abstractC7414ck != null) {
            com.aspose.slides.internal.p332p7.d0s.m30000k4(abstractC7414ck, c8397nz, "{28A0092B-C50C-407E-A947-70E740481C1C}");
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5221k4(ISlidesPicture iSlidesPicture, C8401o2 c8401o2, gnb gnbVar) {
        IPPImage iPPImageM6782k4;
        C11709bg c11709bgM55303k4;
        if (c8401o2 == null) {
            return;
        }
        Picture picture = (Picture) iSlidesPicture;
        jyr jyrVarM2241x1 = picture.m2241x1();
        C11723d3 c11723d3M55338u4 = gnbVar.m55338u4();
        if (c8401o2.m37966k4() != null && c8401o2.m37966k4().length() > 0 && (c11709bgM55303k4 = c11723d3M55338u4.m55303k4(c8401o2.m37966k4())) != null) {
            C11791os c11791osM55296x1 = c11709bgM55303k4.m55296x1();
            iSlidesPicture.setImage(gnbVar.m6781k4(c11791osM55296x1));
            jyrVarM2241x1.m63575k4(true);
            if (iSlidesPicture.getImage() == null && c11791osM55296x1 != null && !C14113y2.m67424kk(C14113y2.m67368h4(c11791osM55296x1.m55427x1()), ".svg")) {
                jyrVarM2241x1.m63577kk(c11791osM55296x1.m55427x1());
            }
        }
        if (!C14113y2.m67411k4(c8401o2.m37971x1())) {
            picture.m2239k4(c8401o2.m37971x1());
            try {
                C14062gk c14062gk = new C14062gk(c11723d3M55338u4.m55303k4(iSlidesPicture.getLinkPathLong()).m55292k4());
                ((Picture) iSlidesPicture).m2239k4(c14062gk.m66679dy() ? c14062gk.m66677ck() : c14062gk.m66697x1());
            } catch (RuntimeException e) {
                picture.m2239k4(c11723d3M55338u4.m55303k4(iSlidesPicture.getLinkPathLong()).m55292k4());
                C3085sv.m13082k4(e);
            }
            if (jyrVarM2241x1.m63570du() && (iPPImageM6782k4 = gnbVar.m6782k4(iSlidesPicture.getLinkPathLong())) != null && iPPImageM6782k4 != ((ImageCollection) iSlidesPicture.getPresentation().getImages()).m1717k4()) {
                iSlidesPicture.setImage(iPPImageM6782k4);
            }
        }
        rgw.m70095k4(iSlidesPicture.getImageTransform(), c8401o2.m37968kk(), gnbVar);
        jyrVarM2241x1.m63573k4(c8401o2.m37970to());
        m5219k4(iSlidesPicture, c8401o2.m37970to(), gnbVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        if (r6.getImage() != null) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5222k4(ISlidesPicture iSlidesPicture, final C8401o2 c8401o2, u8s u8sVar) {
        C11709bg c11709bgM55311x1;
        C11791os c11791osM55392h4;
        C8397nz c8397nz;
        C11791os c11791osM71540k4;
        if (iSlidesPicture == null) {
            return;
        }
        Picture picture = (Picture) iSlidesPicture;
        jyr jyrVarM2241x1 = picture.m2241x1();
        if (!C14113y2.m67411k4(iSlidesPicture.getLinkPathLong())) {
            c8401o2.m37969kk(u8sVar.m55433g8().m55305k4(AbstractC11747gf.f39744k4.m55382k4(), C3085sv.m13080k4(iSlidesPicture.getLinkPathLong()), (byte) 1).m55289du());
            if (jyrVarM2241x1.m63570du()) {
            }
            rgw.m70096k4(iSlidesPicture.getImageTransform(), new C7394ca.k4() { // from class: com.aspose.slides.dr1.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8401o2) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_BlipElementData.AddEffect(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8401o2.m37965k4(str);
                }
            }, u8sVar);
            c8397nz = new C8397nz();
            it6.m63110k4(iSlidesPicture, picture.m2241x1(), c8397nz, u8sVar);
            m5220k4(iSlidesPicture, picture.m2241x1().m63572k4(), c8397nz, u8sVar);
            if (c8397nz.mo29643k4().length > 0) {
                c8401o2.m37967k4(c8397nz);
                return;
            }
            return;
        }
        if (iSlidesPicture.getImage() != null) {
            c11791osM71540k4 = iSlidesPicture.getImage().getSvgImage() != null ? u8sVar.m71540k4(iSlidesPicture) : u8sVar.m71567x1(iSlidesPicture.getImage());
        } else {
            if (!C14113y2.m67411k4(jyrVarM2241x1.m63571h4()) && (c11791osM55392h4 = u8sVar.mo4812qm().m55392h4(jyrVarM2241x1.m63571h4())) != null) {
                c8401o2.m37972x1(u8sVar.m55433g8().m55311x1(c11791osM55392h4).m55289du());
            }
            if (C14113y2.m67411k4(c8401o2.m37966k4()) && u8sVar.m71552m9() != 1) {
                c11709bgM55311x1 = u8sVar.m55433g8().m55311x1(u8sVar.m71539k4(((ImageCollection) iSlidesPicture.getPresentation().getImages()).m1717k4()));
                c8401o2.m37972x1(c11709bgM55311x1.m55289du());
            }
            rgw.m70096k4(iSlidesPicture.getImageTransform(), new C7394ca.k4() { // from class: com.aspose.slides.dr1.1
                @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
                public String getDelegateId() {
                    return System.identityHashCode(c8401o2) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_BlipElementData.AddEffect(System.String)";
                }

                @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
                /* JADX INFO: renamed from: k4 */
                public C7394ca mo2788k4(String str) {
                    return c8401o2.m37965k4(str);
                }
            }, u8sVar);
            c8397nz = new C8397nz();
            it6.m63110k4(iSlidesPicture, picture.m2241x1(), c8397nz, u8sVar);
            m5220k4(iSlidesPicture, picture.m2241x1().m63572k4(), c8397nz, u8sVar);
            if (c8397nz.mo29643k4().length > 0) {
            }
        }
        c11709bgM55311x1 = u8sVar.m55433g8().m55311x1(c11791osM71540k4);
        c8401o2.m37972x1(c11709bgM55311x1.m55289du());
        rgw.m70096k4(iSlidesPicture.getImageTransform(), new C7394ca.k4() { // from class: com.aspose.slides.dr1.1
            @Override // com.aspose.slides.p559ms.System.AbstractC14085qw
            public String getDelegateId() {
                return System.identityHashCode(c8401o2) + "Aspose.Slides.PptxSerialization.PartParser.XmlParser.a_CT_BlipElementData.AddEffect(System.String)";
            }

            @Override // com.aspose.slides.internal.p332p7.C7394ca.k4
            /* JADX INFO: renamed from: k4 */
            public C7394ca mo2788k4(String str) {
                return c8401o2.m37965k4(str);
            }
        }, u8sVar);
        c8397nz = new C8397nz();
        it6.m63110k4(iSlidesPicture, picture.m2241x1(), c8397nz, u8sVar);
        m5220k4(iSlidesPicture, picture.m2241x1().m63572k4(), c8397nz, u8sVar);
        if (c8397nz.mo29643k4().length > 0) {
        }
    }
}
