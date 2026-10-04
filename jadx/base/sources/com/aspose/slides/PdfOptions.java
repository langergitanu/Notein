package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p416tb.C10920x6;
import com.aspose.slides.internal.p443ul.C11444k4;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class PdfOptions extends SaveOptions implements IPdfOptions {

    /* JADX INFO: renamed from: k4 */
    static final String[] f2988k4 = {"Arial", "Helvetica", "Times", "Times New Roman", "Courier", "Courier New", "Symbol", "Zapf Dingbats"};

    /* JADX INFO: renamed from: fa */
    private String[] f2993fa;

    /* JADX INFO: renamed from: ks */
    private boolean f2998ks;

    /* JADX INFO: renamed from: rv */
    private boolean f3001rv;

    /* JADX INFO: renamed from: to */
    private boolean f3002to;

    /* JADX INFO: renamed from: up */
    private String f3004up;

    /* JADX INFO: renamed from: uz */
    private ISlidesLayoutOptions f3005uz;

    /* JADX INFO: renamed from: x1 */
    private int f3007x1;

    /* JADX INFO: renamed from: ne */
    private C12003du f3000ne = C12003du.m56458up().Clone();

    /* JADX INFO: renamed from: ix */
    private boolean f2995ix = true;

    /* JADX INFO: renamed from: u4 */
    private boolean f3003u4 = false;

    /* JADX INFO: renamed from: x6 */
    private NotesCommentsLayoutingOptions f3008x6 = new NotesCommentsLayoutingOptions();

    /* JADX INFO: renamed from: wl */
    private InkOptions f3006wl = new InkOptions();

    /* JADX INFO: renamed from: kk */
    private int f2997kk = 1;

    /* JADX INFO: renamed from: du */
    private boolean f2991du = true;

    /* JADX INFO: renamed from: m9 */
    private boolean f2999m9 = false;

    /* JADX INFO: renamed from: h4 */
    private boolean f2994h4 = false;

    /* JADX INFO: renamed from: dy */
    private int f2992dy = 100;

    /* JADX INFO: renamed from: c5 */
    private boolean f2989c5 = false;

    /* JADX INFO: renamed from: jd */
    private int f2996jd = 2;

    /* JADX INFO: renamed from: ck */
    private boolean f2990ck = true;

    /* JADX INFO: renamed from: yj */
    private float f3009yj = 96.0f;

    public PdfOptions() {
        setAccessPermissions(0);
    }

    /* JADX INFO: renamed from: k4 */
    private static int m2225k4(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 3;
            case 5:
                return 6;
            case 6:
                return 5;
            case 7:
                return 8;
            case 8:
                return 7;
            case 9:
                return 9;
            case 10:
                return 10;
            default:
                throw new ArgumentOutOfRangeException("compliance", Integer.valueOf(i), null);
        }
    }

    @Override // com.aspose.slides.IPdfOptions
    public final int getAccessPermissions() {
        return this.f3007x1;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final String[] getAdditionalCommonFontFamilies() {
        String[] strArr = this.f2993fa;
        if (strArr == null) {
            return null;
        }
        return (String[]) strArr.clone();
    }

    @Override // com.aspose.slides.IPdfOptions
    public final boolean getApplyImageTransparent() {
        return this.f2995ix;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final boolean getBestImagesCompressionRatio() {
        return this.f3002to;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final int getCompliance() {
        return this.f2996jd;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final boolean getDrawSlidesFrame() {
        return this.f2998ks;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final boolean getEmbedFullFonts() {
        return this.f2999m9;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final boolean getEmbedTrueTypeFontsForASCII() {
        return this.f2991du;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final Integer getImageTransparentColor() {
        return (Integer) C12003du.m56473x1(m2226k4());
    }

    @Override // com.aspose.slides.IPdfOptions
    public final IInkOptions getInkOptions() {
        return this.f3006wl;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final byte getJpegQuality() {
        return (byte) this.f2992dy;
    }

    @Override // com.aspose.slides.IPdfOptions
    @Deprecated
    public final INotesCommentsLayoutingOptions getNotesCommentsLayouting() {
        return this.f3008x6;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final String getPassword() {
        return this.f3004up;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final boolean getRasterizeUnsupportedFontStyles() {
        return this.f2994h4;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final boolean getSaveMetafilesAsPng() {
        return this.f2990ck;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final boolean getShowHiddenSlides() {
        return this.f3001rv;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final ISlidesLayoutOptions getSlidesLayoutOptions() {
        return this.f3005uz;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final float getSufficientResolution() {
        return this.f3009yj;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final int getTextCompression() {
        return this.f2997kk;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setAccessPermissions(int i) {
        this.f3007x1 = i;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setAdditionalCommonFontFamilies(String[] strArr) {
        this.f2993fa = strArr == null ? null : (String[]) strArr.clone();
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setApplyImageTransparent(boolean z) {
        this.f2995ix = z;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setBestImagesCompressionRatio(boolean z) {
        this.f3002to = z;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setCompliance(int i) {
        this.f2996jd = i;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setDrawSlidesFrame(boolean z) {
        this.f2998ks = z;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setEmbedFullFonts(boolean z) {
        this.f2999m9 = z;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setEmbedTrueTypeFontsForASCII(boolean z) {
        this.f2991du = z;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setImageTransparentColor(Integer num) {
        m2227k4(C12003du.m56401k4(num));
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setJpegQuality(byte b) {
        int i = b & 255;
        if (i < 0 || i > 100) {
            throw new ArgumentOutOfRangeException("value", "JpegQuality value must be between 0 and 100.");
        }
        this.f2992dy = i;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setPassword(String str) {
        this.f3004up = str;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setRasterizeUnsupportedFontStyles(boolean z) {
        this.f2994h4 = z;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setSaveMetafilesAsPng(boolean z) {
        this.f2990ck = z;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setShowHiddenSlides(boolean z) {
        this.f3001rv = z;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setSlidesLayoutOptions(ISlidesLayoutOptions iSlidesLayoutOptions) {
        if (C7019kk.m27469x1(iSlidesLayoutOptions, NotesCommentsLayoutingOptions.class)) {
            this.f3008x6 = (NotesCommentsLayoutingOptions) iSlidesLayoutOptions;
        }
        this.f3005uz = iSlidesLayoutOptions;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setSufficientResolution(float f) {
        this.f3009yj = f;
    }

    @Override // com.aspose.slides.IPdfOptions
    public final void setTextCompression(int i) {
        this.f2997kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final C10920x6 m2228x1() {
        C10920x6 c10920x6 = new C10920x6();
        c10920x6.m52613k4(new udt(this));
        c10920x6.m52614k4(C5656k4.m23095k4(this.f3000ne.Clone()));
        c10920x6.m52632x1(this.f2995ix);
        int i = 0;
        c10920x6.m52612k4(getTextCompression() == 1 ? 3 : 0);
        c10920x6.m52617k4(getBestImagesCompressionRatio());
        c10920x6.m52631x1(getJpegQuality() & 255);
        c10920x6.m52619kk(m2225k4(getCompliance()));
        String str = this.f3004up;
        if (str != null && !"".equals(C14113y2.m67440x1(str))) {
            c10920x6.m52615k4(new C11444k4(this.f3004up, null, getAccessPermissions(), 1));
        }
        if (getCompliance() != 3) {
            c10920x6.m52626to(getEmbedFullFonts() ? 4 : 2);
            if (!getEmbedTrueTypeFontsForASCII()) {
                int i2 = getEmbedFullFonts() ? 5 : 1;
                int i3 = 0;
                while (true) {
                    String[] strArr = f2988k4;
                    if (i3 >= strArr.length) {
                        break;
                    }
                    c10920x6.m52609ix().m52595k4(strArr[i3], i2);
                    i3++;
                }
                if (this.f2993fa != null) {
                    while (true) {
                        String[] strArr2 = this.f2993fa;
                        if (i >= strArr2.length) {
                            break;
                        }
                        String str2 = strArr2[i];
                        if (str2 != null && !"".equals(str2)) {
                            c10920x6.m52609ix().m52595k4(this.f2993fa[i], i2);
                        }
                        i++;
                    }
                }
            }
        }
        c10920x6.m52609ix().m52598x1("Batang", 4);
        c10920x6.m52609ix().m52598x1("BatangChe", 4);
        c10920x6.m52609ix().m52598x1("GulimChe", 4);
        return c10920x6;
    }

    /* JADX INFO: renamed from: k4 */
    public C12003du m2226k4() {
        return this.f3000ne;
    }

    /* JADX INFO: renamed from: k4 */
    public void m2227k4(C12003du c12003du) {
        c12003du.CloneTo(this.f3000ne);
    }
}
