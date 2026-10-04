package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p172hu.AbstractC4687to;
import com.aspose.slides.internal.p172hu.C4684k4;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p407st.C10434f9;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14080ne;
import com.aspose.slides.p559ms.System.C14088s7;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.ControlChar;
import com.facebook.common.callercontext.ContextChain;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.vertexai.common.util.KtorKt;
import com.huawei.hms.network.embedded.C18358t1;
import com.orion.notein.richeditor.utils.p606io.IOUtils;

/* JADX INFO: loaded from: classes3.dex */
class zqo {

    /* JADX INFO: renamed from: du */
    private TextToHtmlConversionOptions f50699du;

    /* JADX INFO: renamed from: kk */
    private boolean f50702kk;

    /* JADX INFO: renamed from: x1 */
    private C6765kp f50704x1;

    /* JADX INFO: renamed from: k4 */
    private List<String> f50701k4 = new List<>();

    /* JADX INFO: renamed from: to */
    private int f50703to = 0;

    /* JADX INFO: renamed from: h4 */
    private boolean f50700h4 = true;

    private zqo(C6765kp c6765kp, TextToHtmlConversionOptions textToHtmlConversionOptions) {
        this.f50704x1 = c6765kp;
        this.f50699du = textToHtmlConversionOptions;
    }

    /* JADX INFO: renamed from: k4 */
    public static String m74750k4(Paragraph[] paragraphArr, TextToHtmlConversionOptions textToHtmlConversionOptions, BaseSlide baseSlide, C14321pz c14321pz) {
        C6765kp c6765kp;
        C14726w7 c14726w7;
        int i;
        String str;
        String str2;
        int i2;
        C6765kp c6765kp2;
        int i3;
        Paragraph paragraph;
        int i4;
        int i5;
        int i6;
        String linkPathLong;
        Paragraph[] paragraphArr2 = paragraphArr;
        ILinkEmbedController linkEmbedController = textToHtmlConversionOptions.getLinkEmbedController();
        C14726w7 c14726w72 = new C14726w7();
        if (linkEmbedController == null) {
            linkEmbedController = C10434f9.f36986k4;
        }
        ILinkEmbedController iLinkEmbedController = linkEmbedController;
        int i7 = 0;
        String[] strArrM70968k4 = t5o.m70968k4(new C4684k4(AbstractC14092to.m67204k4((Object[]) paragraphArr2), new AbstractC4687to<Paragraph, InterfaceC0901dh>() { // from class: com.aspose.slides.zqo.1
            @Override // com.aspose.slides.internal.p172hu.AbstractC4687to
            /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
            public InterfaceC0901dh invoke(Paragraph paragraph2) {
                return new ihc(paragraph2);
            }
        }), paragraphArr2.length, false);
        C6765kp c6765kp3 = new C6765kp();
        if (textToHtmlConversionOptions.getAddClipboardFragmentHeader()) {
            c6765kp3.m26792k4("Version:1.0\r\nStartHTML:!HTMLSTART\r\nEndHTML:!HTMLEND!!\r\nStartFragment:!FRAGSTART\r\nEndFragment:!FRAGEND!!\r\n\r\n");
        }
        zqo zqoVar = new zqo(c6765kp3, textToHtmlConversionOptions);
        int iM26807x1 = zqoVar.f50704x1.m26807x1();
        zqoVar.m74754k4("html");
        zqoVar.m74754k4("head");
        String str3 = "";
        zqoVar.m74764x1("Content-Type", (textToHtmlConversionOptions.getEncodingName() == null || "".equals(textToHtmlConversionOptions.getEncodingName())) ? "text/html" : C14113y2.m67402k4("text/html; charset={0}", textToHtmlConversionOptions.getEncodingName()));
        zqoVar.m74756k4("ProgId", "PowerPoint.Slide");
        zqoVar.m74756k4("Generator", "Aspose.Slides");
        zqoVar.m74762x1();
        zqoVar.m74754k4("body");
        boolean addClipboardFragmentHeader = textToHtmlConversionOptions.getAddClipboardFragmentHeader();
        String str4 = KtorKt.SSE_SEPARATOR;
        if (addClipboardFragmentHeader) {
            zqoVar.m74761to("StartFragment");
            zqoVar.f50704x1.m26792k4(KtorKt.SSE_SEPARATOR);
            zqoVar.f50703to = 0;
        }
        int iM26807x12 = zqoVar.f50704x1.m26807x1();
        int i8 = 0;
        while (i8 < paragraphArr2.length) {
            Paragraph paragraph2 = paragraphArr2[i8];
            IParagraphFormat paragraphFormat = paragraph2.getParagraphFormat();
            int i9 = i7;
            String[] strArr = strArrM70968k4;
            int i10 = (paragraphFormat.getBullet().getType() == -1 || paragraphFormat.getBullet().getType() == 0 || paragraph2.m2168to().length() <= 0) ? i9 : 1;
            zqoVar.m74754k4(i10 != 0 ? "div" : ContextChain.TAG_PRODUCT);
            zqoVar.m74760kk("style", yc7.m73809k4(paragraphFormat));
            if (paragraphFormat.getDepth() > 0) {
                c14726w7 = c14726w72;
                zqoVar.m74760kk("class", C14113y2.m67408k4("O", C14088s7.m67180x1(paragraphFormat.getDepth())));
            } else {
                c14726w7 = c14726w72;
            }
            if (i10 != 0) {
                if (paragraphFormat.getBullet().getType() == 3) {
                    if (((BulletFormat) paragraphFormat.getBullet()).getPicture().getImage() != null) {
                        IPPImage image = ((BulletFormat) paragraphFormat.getBullet()).getPicture().getImage();
                        int i11 = iM26807x12;
                        byte[] binaryData = image.getBinaryData();
                        int[] iArr = {i9};
                        String str5 = str4;
                        String contentType = image.getContentType();
                        i2 = i8;
                        c14726w72 = c14726w7;
                        i3 = iM26807x1;
                        i = i11;
                        str2 = str5;
                        str = str3;
                        c6765kp2 = c6765kp3;
                        paragraph = paragraph2;
                        int iM72644k4 = c14726w72.m72644k4(iLinkEmbedController, image, binaryData, "pictureBullet", contentType, "image", iArr);
                        int i12 = iArr[i9];
                        linkPathLong = i12 != 2 ? i12 == 0 ? iLinkEmbedController.getUrl(iM72644k4, i9) : C14113y2.m67402k4("data:{0};base64,{1}", image.getContentType(), C14080ne.m66952k4(binaryData)) : null;
                    } else {
                        i = iM26807x12;
                        str = str3;
                        str2 = str4;
                        i2 = i8;
                        c6765kp2 = c6765kp3;
                        c14726w72 = c14726w7;
                        i3 = iM26807x1;
                        paragraph = paragraph2;
                        linkPathLong = ((BulletFormat) paragraphFormat.getBullet()).getPicture().getLinkPathLong();
                    }
                    if (linkPathLong != null) {
                        if (zqoVar.f50700h4) {
                            zqoVar.m74754k4("span");
                            zqoVar.m74760kk("style", "mso-special-format: bullet");
                        }
                        zqoVar.m74754k4("img");
                        zqoVar.m74760kk("src", linkPathLong);
                        zqoVar.m74760kk("alt", C18358t1.g.f56183c);
                        zqoVar.m74762x1();
                        if (zqoVar.f50700h4) {
                        }
                    }
                    i4 = 0;
                    i5 = 1;
                } else {
                    i = iM26807x12;
                    str = str3;
                    str2 = str4;
                    i2 = i8;
                    c6765kp2 = c6765kp3;
                    c14726w72 = c14726w7;
                    i3 = iM26807x1;
                    paragraph = paragraph2;
                    zqoVar.m74754k4("span");
                    zqoVar.m74760kk("style", yc7.m73811k4(paragraph, zqoVar.f50700h4, baseSlide, c14321pz));
                    zqoVar.m74763x1(strArr[i2]);
                }
                zqoVar.m74762x1();
                i4 = 0;
                i5 = 1;
            } else {
                i = iM26807x12;
                str = str3;
                str2 = str4;
                i2 = i8;
                c6765kp2 = c6765kp3;
                c14726w72 = c14726w7;
                i3 = iM26807x1;
                paragraph = paragraph2;
                String strM2168to = paragraph.m2168to();
                if (str.equals(strM2168to)) {
                    i4 = 0;
                    i5 = 1;
                } else {
                    i5 = 1;
                    if (strM2168to.length() == 1) {
                        i4 = 0;
                        if (strM2168to.charAt(0) <= ' ' && strM2168to.charAt(0) != '\t' && strM2168to.charAt(0) != 11 && strM2168to.charAt(0) != '\n' && strM2168to.charAt(0) != '\r') {
                        }
                    } else {
                        i4 = 0;
                    }
                }
                zqoVar.m74763x1(" ");
            }
            int i13 = i4;
            while (i13 < paragraph.getPortions().getCount()) {
                Portion portion = (Portion) paragraph.getPortions().get_Item(i13);
                zqoVar.m74754k4("span");
                zqoVar.m74760kk("style", yc7.m73810k4(portion.getPortionFormat(), zqoVar.f50700h4, baseSlide, c14321pz));
                if (portion.getPortionFormat().getStrikethroughType() == -1 || portion.getPortionFormat().getStrikethroughType() == 0) {
                    i6 = i4;
                } else {
                    zqoVar.m74754k4("s");
                    i6 = i5;
                }
                if (portion.getPortionFormat().getFontUnderline() != -1 && portion.getPortionFormat().getFontUnderline() != 0) {
                    zqoVar.m74754k4("u");
                    i6++;
                }
                if (portion.getPortionFormat().getHyperlinkClick() != null && portion.getPortionFormat().getHyperlinkClick().getExternalUrl() != null) {
                    zqoVar.m74754k4("a");
                    zqoVar.m74760kk("href", portion.getPortionFormat().getHyperlinkClick().getExternalUrl());
                    i6++;
                }
                zqoVar.m74763x1(portion.m2283h4());
                while (true) {
                    int i14 = i6 - 1;
                    zqoVar.m74762x1();
                    if (i6 > 0) {
                        i6 = i14;
                    }
                }
                i13++;
                i4 = 0;
            }
            zqoVar.m74762x1();
            i8 = i2 + 1;
            paragraphArr2 = paragraphArr;
            str4 = str2;
            str3 = str;
            strArrM70968k4 = strArr;
            iM26807x1 = i3;
            c6765kp3 = c6765kp2;
            iM26807x12 = i;
            i7 = 0;
        }
        int i15 = iM26807x1;
        int i16 = iM26807x12;
        String str6 = str4;
        C6765kp c6765kp4 = c6765kp3;
        int iM26807x13 = zqoVar.f50704x1.m26807x1();
        if (textToHtmlConversionOptions.getAddClipboardFragmentHeader()) {
            zqoVar.f50704x1.m26792k4(str6);
            zqoVar.m74761to("EndFragment");
        }
        zqoVar.m74762x1();
        zqoVar.m74762x1();
        int iM26807x14 = zqoVar.f50704x1.m26807x1();
        if (textToHtmlConversionOptions.getAddClipboardFragmentHeader()) {
            c6765kp = c6765kp4;
            m74753k4(c6765kp, 23, i15);
            m74753k4(c6765kp, 43, iM26807x14);
            m74753k4(c6765kp, 69, i16);
            m74753k4(c6765kp, 93, iM26807x13);
        } else {
            c6765kp = c6765kp4;
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: kk */
    private String m74758kk(String str) {
        String str2;
        C6765kp c6765kp = new C6765kp((str.length() / 8) + str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '&') {
                str2 = "&amp;";
            } else if (str.charAt(i) == '\"') {
                str2 = "&quot;";
            } else {
                c6765kp.m26780k4(str.charAt(i));
            }
            c6765kp.m26792k4(str2);
        }
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: to */
    private void m74761to(String str) {
        if (this.f50702kk) {
            m74751k4();
        }
        if (C14113y2.m67364dy(str, "--") >= 0) {
            str = C14113y2.m67401k4(str, "--", "-- -->\r\n<!-- ");
        }
        this.f50704x1.m26792k4("\r\n<!-- ");
        this.f50704x1.m26792k4(str);
        this.f50704x1.m26792k4("-->\r\n");
        this.f50703to = 0;
    }

    /* JADX INFO: renamed from: x1 */
    private void m74762x1() {
        if (this.f50702kk) {
            m74757k4("/>", false, false);
        } else {
            m74757k4(C14113y2.m67402k4("</{0}>", OooO0O0.OooO00o(this.f50701k4, 1)), false, false);
        }
        List<String> list = this.f50701k4;
        list.removeAt(list.size() - 1);
        this.f50702kk = false;
    }

    /* JADX INFO: renamed from: k4 */
    private void m74751k4() {
        this.f50702kk = false;
        m74757k4(">", false, false);
    }

    /* JADX INFO: renamed from: kk */
    private void m74759kk() {
        int i;
        if (this.f50703to >= 80) {
            this.f50704x1.m26792k4(IOUtils.LINE_SEPARATOR_WINDOWS);
            i = 0;
        } else {
            this.f50704x1.m26780k4(ControlChar.SPACE_CHAR);
            i = this.f50703to + 1;
        }
        this.f50703to = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m74752k4(char c, boolean z, boolean z2) {
        if (z && this.f50703to >= 80) {
            this.f50704x1.m26792k4(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f50703to = 0;
        }
        this.f50704x1.m26780k4(c);
        int i = this.f50703to + 1;
        this.f50703to = i;
        if (!z2 || i < 80) {
            return;
        }
        this.f50704x1.m26792k4(IOUtils.LINE_SEPARATOR_WINDOWS);
        this.f50703to = 0;
    }

    /* JADX INFO: renamed from: kk */
    private void m74760kk(String str, String str2) {
        if (!this.f50702kk) {
            throw new InvalidOperationException("Trying to write element without element tag opening");
        }
        if (str == null || str2 == null) {
            return;
        }
        m74759kk();
        m74757k4(str, true, false);
        m74757k4("=\"", true, false);
        m74757k4(m74758kk(str2), false, false);
        m74752k4('\"', false, false);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m74753k4(C6765kp c6765kp, int i, int i2) {
        String strM66587k4 = C14057f9.m66587k4(i2, "d10");
        for (int i3 = 0; i3 < strM66587k4.length(); i3++) {
            c6765kp.m26802k4(i + i3, strM66587k4.charAt(i3));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74754k4(String str) {
        if (this.f50702kk) {
            m74751k4();
        }
        this.f50704x1.m26796k4("<{0}", str);
        this.f50702kk = true;
        this.f50701k4.addItem(str);
    }

    /* JADX INFO: renamed from: x1 */
    private void m74763x1(String str) {
        String str2;
        String str3;
        if (this.f50702kk) {
            m74751k4();
        }
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '<') {
                if (i2 < i) {
                    str2 = str;
                    m74755k4(str2, i2, i - i2, false, false);
                } else {
                    str2 = str;
                }
                str3 = "&lt;";
            } else {
                str2 = str;
                if (cCharAt == '>') {
                    if (i2 < i) {
                        m74755k4(str2, i2, i - i2, false, false);
                    }
                    str3 = "&gt;";
                } else if (cCharAt == '&') {
                    if (i2 < i) {
                        m74755k4(str2, i2, i - i2, false, false);
                    }
                    str3 = "&amp;";
                } else {
                    if (cCharAt <= ' ') {
                        if (i2 < i) {
                            m74755k4(str2, i2, i - i2, false, false);
                        }
                        if (cCharAt == '\n' || cCharAt == '\r' || cCharAt == 11) {
                            m74754k4("br");
                            m74762x1();
                        } else {
                            if (cCharAt == '\t') {
                                int i3 = i + 1;
                                while (i3 < str2.length() && str2.charAt(i3) == '\t') {
                                    i3++;
                                }
                                if (this.f50700h4) {
                                    m74754k4("span");
                                    m74760kk("style", C14113y2.m67402k4("mso-tab-count:{0}", Integer.valueOf(i3 - i)));
                                    m74751k4();
                                }
                                while (i < i3) {
                                    i++;
                                    m74757k4("  ", true, true);
                                }
                                if (this.f50700h4) {
                                    m74762x1();
                                }
                                i2 = i;
                            } else {
                                int i4 = i + 1;
                                int i5 = i4;
                                while (i5 < str2.length() && str2.charAt(i5) <= ' ' && str2.charAt(i5) != '\t' && str2.charAt(i5) != '\n' && str2.charAt(i5) != '\r' && str2.charAt(i5) != 11) {
                                    i5++;
                                }
                                boolean z = this.f50700h4 && i4 < i5;
                                if (z) {
                                    m74754k4("span");
                                    m74760kk("style", "mso-spacerun:yes");
                                    m74751k4();
                                }
                                while (i < i5 - 1) {
                                    i++;
                                    m74752k4(ControlChar.NON_BREAKING_SPACE_CHAR, false, false);
                                }
                                if (z) {
                                    m74762x1();
                                }
                                m74759kk();
                            }
                        }
                        i2 = i + 1;
                        i = i2;
                    } else {
                        i++;
                    }
                    str = str2;
                }
            }
            m74757k4(str3, false, false);
            i2 = i + 1;
            i = i2;
            str = str2;
        }
        String str4 = str;
        if (i2 < i) {
            m74755k4(str4, i2, i - i2, false, false);
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m74755k4(String str, int i, int i2, boolean z, boolean z2) {
        int i3;
        if (z && ((i3 = this.f50703to) >= 80 || i3 + i2 >= 80)) {
            this.f50704x1.m26792k4(IOUtils.LINE_SEPARATOR_WINDOWS);
            this.f50703to = 0;
        }
        this.f50704x1.m26793k4(str, i, i2);
        int i4 = this.f50703to + i2;
        this.f50703to = i4;
        if (!z2 || i4 < 80) {
            return;
        }
        this.f50704x1.m26792k4(IOUtils.LINE_SEPARATOR_WINDOWS);
        this.f50703to = 0;
    }

    /* JADX INFO: renamed from: x1 */
    private void m74764x1(String str, String str2) {
        m74754k4("meta");
        m74760kk("http-equiv", str);
        m74760kk(FirebaseAnalytics.Param.CONTENT, str2);
        m74762x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m74756k4(String str, String str2) {
        m74754k4("meta");
        m74760kk("name", str);
        m74760kk(FirebaseAnalytics.Param.CONTENT, str2);
        m74762x1();
    }

    /* JADX INFO: renamed from: k4 */
    private void m74757k4(String str, boolean z, boolean z2) {
        m74755k4(str, 0, str.length(), z, z2);
    }
}
