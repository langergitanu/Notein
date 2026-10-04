package com.aspose.slides;

import com.aspose.slides.internal.p129fe.C3977ck;

/* JADX INFO: loaded from: classes3.dex */
public class SlideImageFormat implements ISlideImageFormat {

    /* JADX INFO: renamed from: k4 */
    private int f3399k4;

    /* JADX INFO: renamed from: kk */
    private float f3400kk;

    /* JADX INFO: renamed from: to */
    private C3977ck f3401to;

    /* JADX INFO: renamed from: x1 */
    private SVGOptions f3402x1;

    public static SlideImageFormat bitmap(float f, String str) {
        SlideImageFormat slideImageFormat = new SlideImageFormat();
        slideImageFormat.f3399k4 = 1;
        slideImageFormat.f3400kk = f;
        slideImageFormat.f3401to = m2742k4(str);
        return slideImageFormat;
    }

    public static SlideImageFormat svg(SVGOptions sVGOptions) {
        SlideImageFormat slideImageFormat = new SlideImageFormat();
        slideImageFormat.f3399k4 = 0;
        slideImageFormat.f3402x1 = sVGOptions;
        return slideImageFormat;
    }

    /* JADX INFO: renamed from: k4 */
    public int m2743k4() {
        return this.f3399k4;
    }

    /* JADX INFO: renamed from: kk */
    public final SVGOptions m2744kk() {
        return this.f3402x1;
    }

    /* JADX INFO: renamed from: to */
    public final float m2745to() {
        return this.f3400kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final C3977ck m2746x1() {
        return this.f3401to;
    }

    /* JADX INFO: renamed from: k4 */
    private static C3977ck m2742k4(String str) {
        if (str.toUpperCase().equals("BMP")) {
            return C3977ck.m15682kk();
        }
        if (str.toUpperCase().equals("EMF")) {
            return C3977ck.m15684to();
        }
        if (str.toUpperCase().equals("EXIF")) {
            return C3977ck.m15677du();
        }
        if (str.toUpperCase().equals("GIF")) {
            return C3977ck.m15680h4();
        }
        if (str.toUpperCase().equals("ICON")) {
            return C3977ck.m15683m9();
        }
        if (!str.toUpperCase().equals("JPEG") && !str.toUpperCase().equals("JPG")) {
            return str.toUpperCase().equals("MEMORYBMP") ? C3977ck.m15675c5() : str.toUpperCase().equals("PNG") ? C3977ck.m15681jd() : str.toUpperCase().equals("TIFF") ? C3977ck.m15676ck() : str.toUpperCase().equals("WMF") ? C3977ck.m15679fa() : C3977ck.m15681jd();
        }
        return C3977ck.m15678dy();
    }
}
