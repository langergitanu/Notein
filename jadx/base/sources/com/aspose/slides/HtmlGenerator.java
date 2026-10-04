package com.aspose.slides;

import com.aspose.slides.android.SizeF;
import com.aspose.slides.internal.p077d8.C3068ks;
import com.aspose.slides.internal.p080dd.AbstractC3124b3;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.mlkit.p567nl.translate.TranslateLanguage;
import com.orion.notein.domain.models.backup.BackupFile;

/* JADX INFO: loaded from: classes3.dex */
public final class HtmlGenerator implements IHtmlGenerator {

    /* JADX INFO: renamed from: c5 */
    private static final C3068ks f2448c5 = new C3068ks(BackupFile.EXTENSION_NOTEIN_FILE, "cm", "mm", TranslateLanguage.PORTUGUESE, "pc", "em", "ex", "px", "%");

    /* JADX INFO: renamed from: du */
    private int f2449du;

    /* JADX INFO: renamed from: dy */
    private int f2450dy;

    /* JADX INFO: renamed from: h4 */
    private int f2451h4;

    /* JADX INFO: renamed from: jd */
    private int[] f2452jd;

    /* JADX INFO: renamed from: k4 */
    private char[] f2453k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC3124b3 f2454kk;

    /* JADX INFO: renamed from: m9 */
    private int f2455m9;

    /* JADX INFO: renamed from: to */
    private final C12015qq f2456to;

    /* JADX INFO: renamed from: x1 */
    private int f2457x1;

    private HtmlGenerator() {
        this.f2453k4 = new char[1024];
        this.f2457x1 = 0;
        this.f2456to = new C12015qq();
        this.f2449du = 0;
        this.f2451h4 = -1;
        this.f2455m9 = -1;
        this.f2450dy = -1;
    }

    /* JADX INFO: renamed from: h4 */
    private void m1669h4() {
        this.f2457x1 = 0;
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final void addAttributeValue(String str) {
        String str2;
        m1671k4("\"");
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = i;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if ('\"' == cCharAt) {
                    if (i2 < i) {
                        m1672k4(str, i2, i - i2);
                    }
                    str2 = "&quot;";
                } else if ('&' == cCharAt) {
                    if (i2 < i) {
                        m1672k4(str, i2, i - i2);
                    }
                    str2 = "&amp;";
                } else if ('<' == cCharAt) {
                    if (i2 < i) {
                        m1672k4(str, i2, i - i2);
                    }
                    str2 = "&lt;";
                } else if ('>' == cCharAt) {
                    if (i2 < i) {
                        m1672k4(str, i2, i - i2);
                    }
                    str2 = "&gt;";
                } else if (160 >= cCharAt || 256 < cCharAt) {
                    i++;
                } else {
                    if (i2 < i) {
                        m1672k4(str, i2, i - i2);
                    }
                    m1671k4("&");
                    m1671k4(C14057f9.m66586k4((int) cCharAt, (InterfaceC14073kp) C11697x1.m55250kk()));
                    str2 = ";";
                }
                m1671k4(str2);
                i++;
            }
            m1671k4("\"");
            return;
        }
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final void addHtml(String str) {
        m1672k4(str, 0, str.length());
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final void addText(String str) {
        String str2;
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = i;
            while (i < length) {
                char cCharAt = str.charAt(i);
                if ('&' == cCharAt) {
                    if (i2 < i) {
                        m1672k4(str, i2, i - i2);
                    }
                    str2 = "&amp;";
                } else if ('<' == cCharAt) {
                    if (i2 < i) {
                        m1672k4(str, i2, i - i2);
                    }
                    str2 = "&lt;";
                } else if ('>' == cCharAt) {
                    if (i2 < i) {
                        m1672k4(str, i2, i - i2);
                    }
                    str2 = "&gt;";
                } else if (160 >= cCharAt || 256 < cCharAt) {
                    i++;
                } else {
                    if (i2 < i) {
                        m1672k4(str, i2, i - i2);
                    }
                    m1671k4("&");
                    m1671k4(C14057f9.m66586k4((int) cCharAt, (InterfaceC14073kp) C11697x1.m55250kk()));
                    str2 = ";";
                }
                m1671k4(str2);
                i++;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: du */
    public final int[] m1674du() {
        return this.f2452jd;
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final int getNextSlideIndex() {
        return this.f2450dy;
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final int getPreviousSlideIndex() {
        return this.f2451h4;
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final SizeF getSlideImageSize() {
        return (SizeF) C12015qq.m56690k4(m1678to());
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final int getSlideImageSizeUnit() {
        return this.f2449du;
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final String getSlideImageSizeUnitCode() {
        return f2448c5.m12964k4(this.f2449du);
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final int getSlideIndex() {
        return this.f2455m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1675k4() {
        this.f2454kk.mo13307k4(this.f2453k4, 0, this.f2457x1);
        this.f2454kk.mo13308kk();
        m1669h4();
    }

    /* JADX INFO: renamed from: kk */
    public final AbstractC3124b3 m1677kk() {
        return this.f2454kk;
    }

    /* JADX INFO: renamed from: to */
    public C12015qq m1678to() {
        return this.f2456to;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m1679x1() {
        return this.f2457x1 > 0;
    }

    public HtmlGenerator(AbstractC3124b3 abstractC3124b3, C12015qq c12015qq, int i, int[] iArr) {
        this.f2453k4 = new char[1024];
        this.f2457x1 = 0;
        C12015qq c12015qq2 = new C12015qq();
        this.f2456to = c12015qq2;
        this.f2449du = 0;
        this.f2451h4 = -1;
        this.f2455m9 = -1;
        this.f2450dy = -1;
        this.f2454kk = abstractC3124b3;
        c12015qq.CloneTo(c12015qq2);
        this.f2449du = i;
        this.f2452jd = iArr;
    }

    /* JADX INFO: renamed from: k4 */
    private void m1670k4(int i) {
        char[] cArr = this.f2453k4;
        if (i <= cArr.length) {
            return;
        }
        int i2 = i % 512;
        if (i2 > 0) {
            i += 512 - i2;
        }
        char[] cArr2 = new char[i];
        AbstractC14092to.m67220k4(AbstractC14092to.m67208k4((Object) cArr), AbstractC14092to.m67208k4((Object) cArr2), this.f2457x1);
        this.f2453k4 = cArr2;
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final void addAttributeValue(char[] cArr) {
        addAttributeValue(cArr, 0, cArr.length);
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final void addHtml(char[] cArr) {
        m1673k4(cArr, 0, cArr.length);
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final void addText(char[] cArr) {
        addText(cArr, 0, cArr.length);
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final void addAttributeValue(char[] cArr, int i, int i2) {
        String str;
        m1671k4("\"");
        while (true) {
            int i3 = i;
            while (i < i2) {
                char c = cArr[i];
                if ('\"' == c) {
                    if (i3 < i) {
                        m1673k4(cArr, i3, i - i3);
                    }
                    str = "&quot;";
                } else if ('&' == c) {
                    if (i3 < i) {
                        m1673k4(cArr, i3, i - i3);
                    }
                    str = "&amp;";
                } else if ('<' == c) {
                    if (i3 < i) {
                        m1673k4(cArr, i3, i - i3);
                    }
                    str = "&lt;";
                } else if ('>' == c) {
                    if (i3 < i) {
                        m1673k4(cArr, i3, i - i3);
                    }
                    str = "&gt;";
                } else if (160 >= c || 256 < c) {
                    i++;
                } else {
                    if (i3 < i) {
                        m1673k4(cArr, i3, i - i3);
                    }
                    m1671k4("&");
                    m1671k4(C14057f9.m66586k4((int) c, (InterfaceC14073kp) C11697x1.m55250kk()));
                    str = ";";
                }
                m1671k4(str);
                i++;
            }
            m1671k4("\"");
            return;
        }
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final void addHtml(char[] cArr, int i, int i2) {
        m1673k4(cArr, i, i2);
    }

    @Override // com.aspose.slides.IHtmlGenerator
    public final void addText(char[] cArr, int i, int i2) {
        String str;
        while (true) {
            int i3 = i;
            while (i < i2) {
                char c = cArr[i];
                if ('&' == c) {
                    if (i3 < i) {
                        m1673k4(cArr, i3, i - i3);
                    }
                    str = "&amp;";
                } else if ('<' == c) {
                    if (i3 < i) {
                        m1673k4(cArr, i3, i - i3);
                    }
                    str = "&lt;";
                } else if ('>' == c) {
                    if (i3 < i) {
                        m1673k4(cArr, i3, i - i3);
                    }
                    str = "&gt;";
                } else if (160 >= c || 256 < c) {
                    i++;
                } else {
                    if (i3 < i) {
                        m1673k4(cArr, i3, i - i3);
                    }
                    m1671k4("&");
                    m1671k4(C14057f9.m66586k4((int) c, (InterfaceC14073kp) C11697x1.m55250kk()));
                    str = ";";
                }
                m1671k4(str);
                i++;
            }
            return;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1676k4(int i, int i2, int i3) {
        this.f2451h4 = i;
        this.f2455m9 = i2;
        this.f2450dy = i3;
    }

    /* JADX INFO: renamed from: k4 */
    private void m1671k4(String str) {
        m1672k4(str, 0, str.length());
    }

    /* JADX INFO: renamed from: k4 */
    private void m1672k4(String str, int i, int i2) {
        m1670k4(this.f2457x1 + i2);
        C14113y2.m67409k4(str, i, this.f2453k4, this.f2457x1, i2);
        this.f2457x1 = str.length() + this.f2457x1;
    }

    /* JADX INFO: renamed from: k4 */
    private void m1673k4(char[] cArr, int i, int i2) {
        m1670k4(this.f2457x1 + i2);
        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4((Object) cArr), i, AbstractC14092to.m67208k4((Object) this.f2453k4), this.f2457x1, i2);
        this.f2457x1 += cArr.length;
    }
}
