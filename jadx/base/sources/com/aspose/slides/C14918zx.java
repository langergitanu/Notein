package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p172hu.AbstractC4685kk;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.AbstractC7414ck;
import com.aspose.slides.internal.p332p7.C7473dd;
import com.aspose.slides.internal.p332p7.C8397nz;
import com.aspose.slides.internal.p332p7.C8515pd;
import com.aspose.slides.internal.p332p7.C8528pk;
import com.aspose.slides.internal.p332p7.C8618qp;
import com.aspose.slides.internal.p464vq.C11709bg;
import com.aspose.slides.internal.p464vq.C11723d3;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.C13932ly;
import com.aspose.slides.p559ms.System.Xml.C13981tl;
import com.aspose.slides.p559ms.System.Xml.XmlDocument;
import com.huawei.hms.network.embedded.C18358t1;
import java.net.URI;
import java.net.URISyntaxException;

/* JADX INFO: renamed from: com.aspose.slides.zx */
/* JADX INFO: loaded from: classes3.dex */
class C14918zx {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f50762k4 = new C7017h4("tx", "hlink");

    /* JADX INFO: renamed from: k4 */
    public static ISlide m74864k4(String str, gnb gnbVar) {
        return gnbVar.m6801yj().getSlides().get_Item(C14080ne.m67015to(C14113y2.m67401k4(str, "slide", "")));
    }

    /* JADX INFO: renamed from: k4 */
    public static Slide m74865k4(String str, ISlideCollection iSlideCollection) {
        if (!C14113y2.m67448x1(str, "slide")) {
            return null;
        }
        int[] iArr = {0};
        boolean zM66590k4 = C14057f9.m66590k4(OooO0OO.OooO00o(5, 5, str, str), iArr);
        int i = iArr[0];
        if (!zM66590k4 || iSlideCollection.size() <= i || i < 0) {
            return null;
        }
        return (Slide) iSlideCollection.get_Item(i);
    }

    /* JADX INFO: renamed from: k4 */
    public static C13981tl m74866k4(AbstractC7414ck abstractC7414ck) {
        XmlDocument xmlDocumentM29999k4;
        C13981tl documentElement;
        if (abstractC7414ck == null || abstractC7414ck.mo29643k4().length == 0 || (xmlDocumentM29999k4 = com.aspose.slides.internal.p332p7.d0s.m29999k4(abstractC7414ck, "{A12FA001-AC4F-418D-AE19-62706E023703}")) == null || (documentElement = xmlDocumentM29999k4.getDocumentElement()) == null) {
            return null;
        }
        return (C13981tl) fyw.m6354k4(documentElement, "hlinkClr", "http://schemas.microsoft.com/office/drawing/2018/hyperlinkcolor");
    }

    /* JADX INFO: renamed from: k4 */
    public static String m74867k4(IHyperlink iHyperlink) {
        return C14113y2.m67408k4("slide", C14057f9.m66591x1(((Slide) iHyperlink.getTargetSlide()).m2709qq()));
    }

    /* JADX INFO: renamed from: k4 */
    public static String m74868k4(String str) {
        C14062gk[] c14062gkArr = {null};
        boolean zM66650k4 = C14062gk.m66650k4(str, 1, c14062gkArr);
        C14062gk c14062gk = c14062gkArr[0];
        if (!zM66650k4) {
            return str;
        }
        if (!C14113y2.m67411k4(c14062gk.m66689ks())) {
            return (!C14113y2.m67363du("file", c14062gk.m66689ks()) || C14113y2.m67448x1(str, "file")) ? str : C14113y2.m67408k4("file:///", C14113y2.m67401k4(str, " ", "%20"));
        }
        try {
            return C14062gk.m66638k4(new URI(C14062gk.f47220x1, C14062gk.m66672x1(c14062gk).getSchemeSpecificPart(), C14062gk.m66672x1(c14062gk).getFragment())).m66697x1();
        } catch (URISyntaxException e) {
            C3085sv.m13082k4(e);
            return c14062gk.m66697x1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0248  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m74869k4(Hyperlink hyperlink, AbstractC4685kk<C7473dd> abstractC4685kk, u8s u8sVar) {
        C11723d3 c11723d3M55433g8;
        String strM1698m9;
        C11709bg c11709bgM55305k4;
        int i;
        C13981tl c13981tlM74866k4;
        int colorSource;
        String str;
        if (hyperlink == null) {
            return;
        }
        C7473dd c7473ddInvoke = abstractC4685kk.invoke();
        C0867cr c0867crM1699to = hyperlink.m1699to();
        if (C18358t1.g.f56183c.equals(hyperlink.m1698m9())) {
            c7473ddInvoke.m30292kk("ppaction://noaction");
            return;
        }
        if (hyperlink.getTargetFrame() != null) {
            c7473ddInvoke.m30296to(hyperlink.getTargetFrame());
        }
        if (hyperlink.getTooltip() != null) {
            c7473ddInvoke.m30283du(hyperlink.getTooltip());
        }
        c7473ddInvoke.m30290k4(hyperlink.getHistory());
        c7473ddInvoke.m30299x1(hyperlink.getHighlightClick());
        c7473ddInvoke.m30293kk(hyperlink.getStopSoundOnClick());
        if (hyperlink.getSound() != null) {
            C11709bg c11709bgM55311x1 = u8sVar.m55433g8().m55311x1(u8sVar.m71538k4(hyperlink.getSound()));
            C8528pk c8528pkM30287k4 = c7473ddInvoke.m30287k4();
            c8528pkM30287k4.m38952k4(c11709bgM55311x1.m55289du());
            c8528pkM30287k4.m38956x1(((Audio) hyperlink.getSound()).m255k4().m72978k4());
        }
        String str2 = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink";
        if (C14113y2.m67411k4(hyperlink.getExternalUrlOriginal())) {
            if (hyperlink.getActionType() != 8) {
                if (!C14113y2.m67411k4(hyperlink.m1698m9())) {
                    c11723d3M55433g8 = u8sVar.m55433g8();
                    strM1698m9 = hyperlink.m1698m9();
                    c11709bgM55305k4 = c11723d3M55433g8.m55305k4(str2, strM1698m9, (byte) 0);
                }
                if (hyperlink.m1689c5() != null) {
                }
                if (u8sVar.m71552m9() == 2) {
                    if (hyperlink.m1690du() != null) {
                    }
                }
                if (hyperlink.getColorSource() == 1) {
                }
                c13981tlM74866k4 = m74866k4(c0867crM1699to.m4798x1());
                if (c13981tlM74866k4 != null) {
                    colorSource = hyperlink.getColorSource();
                    if (colorSource != 0) {
                    }
                    c13981tlM74866k4.m65910kk("val", str);
                }
                c7473ddInvoke.m30288k4(c0867crM1699to.m4798x1());
            }
            if (hyperlink.getTargetSlide() == null && u8sVar.m71552m9() == 0) {
                int[] iArr = {0};
                boolean zM66590k4 = C14057f9.m66590k4(C14113y2.m67401k4(hyperlink.m1690du(), "ppaction://hlinksldjump?num=", ""), iArr);
                int i2 = iArr[0];
                if (!zM66590k4) {
                    hyperlink.m1695k4("ppaction://noaction");
                } else if (i2 > 0 && (i = i2 - 1) < u8sVar.m71526c5().getSlides().size()) {
                    hyperlink.m1695k4("ppaction://hlinksldjump");
                    hyperlink.m1699to().m4794k4(u8sVar.m71526c5().getSlides().get_Item(i));
                }
            }
            if (hyperlink.getTargetSlide() != null) {
                if (hyperlink.getTargetSlide().getPresentation() != u8sVar.m71526c5() || u8sVar.m71552m9() == 2) {
                    hyperlink.m1695k4(C14113y2.m67408k4("ppaction://hlinksldjump?num=", C14057f9.m66591x1(((Slide) hyperlink.getTargetSlide()).m2709qq() + 1)));
                } else {
                    str2 = "http://schemas.openxmlformats.org/officeDocument/2006/relationships/slide";
                    if (u8sVar.m71552m9() == 1) {
                        c11723d3M55433g8 = u8sVar.m55433g8();
                        strM1698m9 = m74867k4(hyperlink);
                    } else {
                        c11723d3M55433g8 = u8sVar.m55433g8();
                        strM1698m9 = u8sVar.m71565x1().get_Item(hyperlink.getTargetSlide());
                    }
                    c11709bgM55305k4 = c11723d3M55433g8.m55305k4(str2, strM1698m9, (byte) 0);
                }
            }
            if (hyperlink.m1689c5() != null) {
                c7473ddInvoke.m30298x1(hyperlink.m1689c5());
            }
            if (u8sVar.m71552m9() == 2 && hyperlink.m1690du() != null && C14113y2.m67448x1(hyperlink.m1690du(), "ppaction://customshow")) {
                c7473ddInvoke.m30292kk("ppaction://noaction");
            } else if (hyperlink.m1690du() != null) {
                c7473ddInvoke.m30292kk(hyperlink.m1690du());
            }
            if (hyperlink.getColorSource() == 1) {
                if (c0867crM1699to.m4798x1() == null) {
                    c0867crM1699to.m4795k4(new C8397nz());
                }
                if (m74866k4(c0867crM1699to.m4798x1()) == null) {
                    C8618qp c8618qpM38878x1 = C8515pd.m38878x1(c0867crM1699to.m4798x1(), "{A12FA001-AC4F-418D-AE19-62706E023703}");
                    C13932ly c13932lyCreateDocumentFragment = new XmlDocument().createDocumentFragment();
                    c13932lyCreateDocumentFragment.setInnerXml(c8618qpM38878x1.mo28309k4());
                    c13932lyCreateDocumentFragment.getChildNodes().m65457kk(0).appendChild(c13932lyCreateDocumentFragment.getChildNodes().m65457kk(0).getOwnerDocument().createElement("ahyp", "hlinkClr", "http://schemas.microsoft.com/office/drawing/2018/hyperlinkcolor"));
                    c8618qpM38878x1.mo28310k4(c13932lyCreateDocumentFragment.getOuterXml());
                }
            }
            c13981tlM74866k4 = m74866k4(c0867crM1699to.m4798x1());
            if (c13981tlM74866k4 != null && c13981tlM74866k4.m65901dy("ahyp", "http://www.w3.org/2000/xmlns/")) {
                colorSource = hyperlink.getColorSource();
                if (colorSource != 0) {
                    str = "hlink";
                } else {
                    if (colorSource != 1) {
                        throw new PptxReadException("Unknown value of 'val' attribute in hlinkClr extension.");
                    }
                    str = "tx";
                }
                c13981tlM74866k4.m65910kk("val", str);
            }
            c7473ddInvoke.m30288k4(c0867crM1699to.m4798x1());
        }
        if (C14113y2.m67448x1(hyperlink.getExternalUrlOriginal(), "#")) {
            c7473ddInvoke.m30292kk("ppaction://noaction");
            c7473ddInvoke.m30289k4(C14113y2.f47374k4);
            return;
        }
        c11709bgM55305k4 = u8sVar.m55433g8().m55305k4("http://schemas.openxmlformats.org/officeDocument/2006/relationships/hyperlink", m74868k4(hyperlink.getExternalUrlOriginal()), (byte) 1);
        c7473ddInvoke.m30289k4(c11709bgM55305k4.m55289du());
        if (hyperlink.m1689c5() != null) {
        }
        if (u8sVar.m71552m9() == 2) {
        }
        if (hyperlink.getColorSource() == 1) {
        }
        c13981tlM74866k4 = m74866k4(c0867crM1699to.m4798x1());
        if (c13981tlM74866k4 != null) {
        }
        c7473ddInvoke.m30288k4(c0867crM1699to.m4798x1());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021  */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void m74870k4(IHyperlink iHyperlink, C7473dd c7473dd, gnb gnbVar) {
        List<IHyperlink> list;
        String strM65906k4;
        Hyperlink hyperlink = (Hyperlink) iHyperlink;
        C0867cr c0867crM1699to = hyperlink.m1699to();
        String strM30297x1 = c7473dd.m30297x1();
        if (!C14113y2.m67411k4(strM30297x1)) {
            C11709bg c11709bgM55303k4 = gnbVar.m55338u4().m55303k4(strM30297x1);
            if (c11709bgM55303k4.m55294m9() != 1) {
                if (gnbVar.m55338u4().m55310kk().m55392h4(c11709bgM55303k4.m55292k4()) != null) {
                    if (!gnbVar.m6778h4().containsKey(c11709bgM55303k4.m55292k4())) {
                        gnbVar.m6778h4().addItem(c11709bgM55303k4.m55292k4(), new List<>());
                    }
                    list = gnbVar.m6778h4().get_Item(c11709bgM55303k4.m55292k4());
                    list.addItem(iHyperlink);
                } else if (gnbVar.m6775du() == 1) {
                    hyperlink.m1699to().m4794k4(m74865k4(c11709bgM55303k4.m55292k4(), gnbVar.m6801yj().getSlides()));
                } else {
                    hyperlink.m1697kk(c11709bgM55303k4.m55292k4());
                }
            }
        } else if (!C14113y2.m67411k4(c7473dd.m30295to()) && C14113y2.m67448x1(c7473dd.m30295to(), "ppaction://hlinksldjump?num=")) {
            int[] iArr = {0};
            boolean zM66590k4 = C14057f9.m66590k4(C14113y2.m67422kk(c7473dd.m30295to(), 28), iArr);
            int i = iArr[0];
            if (zM66590k4) {
                int i2 = i - 1;
                if (!gnbVar.m6791m9().containsKey(Integer.valueOf(i2))) {
                    gnbVar.m6791m9().addItem(Integer.valueOf(i2), new List<>());
                }
                list = gnbVar.m6791m9().get_Item(Integer.valueOf(i2));
                list.addItem(iHyperlink);
            }
        }
        iHyperlink.setTargetFrame(c7473dd.m30282du());
        iHyperlink.setTooltip(c7473dd.m30285h4());
        iHyperlink.setHistory(c7473dd.m30294m9());
        iHyperlink.setHighlightClick(c7473dd.m30284dy());
        iHyperlink.setStopSoundOnClick(c7473dd.m30280c5());
        if (c7473dd.m30286jd() != null) {
            String strM38951k4 = c7473dd.m30286jd().m38951k4();
            if (!C14113y2.m67411k4(strM38951k4)) {
                iHyperlink.setSound(gnbVar.m6798x1(gnbVar.m55338u4().m55303k4(strM38951k4).m55296x1()));
                ((Audio) iHyperlink.getSound()).m255k4().m72979k4(c7473dd.m30286jd().m38955x1());
            }
        }
        c0867crM1699to.m4795k4(c7473dd.m30281ck());
        Hyperlink hyperlink2 = (Hyperlink) iHyperlink;
        hyperlink2.m1700to(c7473dd.m30291kk());
        hyperlink2.m1695k4(c7473dd.m30295to());
        C13981tl c13981tlM74866k4 = m74866k4(c7473dd.m30281ck());
        if (c13981tlM74866k4 == null || !c13981tlM74866k4.m65901dy("ahyp", "http://www.w3.org/2000/xmlns/") || !c13981tlM74866k4.m65913to("val") || (strM65906k4 = c13981tlM74866k4.m65906k4("val")) == null) {
            return;
        }
        int iM27428k4 = f50762k4.m27428k4(strM65906k4);
        if (iM27428k4 == 0) {
            iHyperlink.setColorSource(1);
        } else {
            if (iM27428k4 != 1) {
                throw new PptxReadException("Unknown value of 'val' attribute in hlinkClr extension.");
            }
            iHyperlink.setColorSource(0);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74871k4(IHyperlinkContainer iHyperlinkContainer, AbstractC4685kk<C7473dd> abstractC4685kk, AbstractC4685kk<C7473dd> abstractC4685kk2, u8s u8sVar) {
        if (iHyperlinkContainer == null) {
            return;
        }
        m74869k4((Hyperlink) iHyperlinkContainer.getHyperlinkClick(), abstractC4685kk, u8sVar);
        m74869k4((Hyperlink) iHyperlinkContainer.getHyperlinkMouseOver(), abstractC4685kk2, u8sVar);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m74872k4(IHyperlinkContainer iHyperlinkContainer, C7473dd c7473dd, C7473dd c7473dd2, gnb gnbVar) {
        if (c7473dd != null) {
            iHyperlinkContainer.setHyperlinkClick(new Hyperlink(true, null, 1));
            m74870k4(iHyperlinkContainer.getHyperlinkClick(), c7473dd, gnbVar);
        }
        if (c7473dd2 != null) {
            iHyperlinkContainer.setHyperlinkMouseOver(new Hyperlink(true, null, 1));
            m74870k4(iHyperlinkContainer.getHyperlinkMouseOver(), c7473dd2, gnbVar);
        }
    }
}
