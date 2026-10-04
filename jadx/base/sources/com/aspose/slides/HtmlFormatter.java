package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: loaded from: classes3.dex */
public final class HtmlFormatter implements IHtmlFormatter {

    /* JADX INFO: renamed from: k4 */
    private final IHtmlFormattingController f2447k4;

    private HtmlFormatter(IHtmlFormattingController iHtmlFormattingController) {
        this.f2447k4 = iHtmlFormattingController;
    }

    public static HtmlFormatter createCustomFormatter(IHtmlFormattingController iHtmlFormattingController) {
        if (iHtmlFormattingController != null) {
            return new HtmlFormatter(iHtmlFormattingController);
        }
        throw new ArgumentNullException("formattingController");
    }

    public static HtmlFormatter createDocumentFormatter(String str, boolean z) {
        return new HtmlFormatter(m1662k4(str, z));
    }

    public static HtmlFormatter createSlideShowFormatter(String str, boolean z) {
        return new HtmlFormatter(m1663x1(str, z));
    }

    /* JADX INFO: renamed from: x1 */
    public static o6a m1663x1(String str, boolean z) {
        return new o6a(str, z, "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\" charset=\"utf-8\">{0}\n<script type=\"text/javascript\">\nfunction showSlide(slideId)\n{{\nvar items = document.getElementsByName(\"slide\");\nfor(i = 0; i < items.length; i++)\nitems[i].style.display = items[i].id == slideId? \"block\" : \"none\";\n}}\n</script>\n</head>\n<body onload=\"showSlide('slideIface1')\">", "<div class=\"endShow\" name=\"slide\" id=\"slideEnd\" onclick=\"showSlide('{0}')\">\n<svg class=\"endShowImage\" xmlns=\"http://www.w3.org/2000/svg\" xmlns:xlink=\"http://www.w3.org/1999/xlink\" viewBox=\"0 0 720 540\"><defs></defs><g text-rendering=\"geometricPrecision\" xml:space=\"preserve\" transform=\"scale(0.125,0.125)\">\n<g transform=\"matrix(-0.2, 0, 0, 0.2, 1360, 1080)\">\n<path stroke=\"#000000\" stroke-width=\"40\" fill=\"#808080\" d=\"M3394,1741 C3138,1381,2638,1298,2279,1554 C1919,1810,1836,2310,2092,2669 C2348,3029,2848,3112,3207,2856 C3258,2820,3304,2777,3346,2730 L3768,3099 C3275,3665,2416,3724,1849,3230 C1283,2737,1224,1878,1718,1311 C2211,745,3070,686,3637,1180 C3717,1250,3789,1329,3850,1416 L3850,1416 L4127,1218 L3982,2083 L3117,1938 z \" />\n</g>\n</g>\n</svg>\n</div>\n</body>\n</html>", "\n<div class=\"slide\" name=\"slide\" id=\"{1}\" onclick=\"showSlide('{2}')\">{0}", "<div class=\"slideTitle\">{0}</div>");
    }

    /* JADX INFO: renamed from: k4 */
    public final IHtmlFormattingController m1664k4() {
        return this.f2447k4;
    }

    /* JADX INFO: renamed from: k4 */
    public static o6a m1662k4(String str, boolean z) {
        return new o6a(str, z, "<!DOCTYPE html>\n<html>\n<head>\n<meta http-equiv=\"X-UA-Compatible\" content=\"IE=9\" charset=\"utf-8\">{0}\n</head>\n<body>", "</body>\n</html>", "\n<div class=\"slide\" name=\"slide\" id=\"slide{1}\" {3}>{0}", "<div class=\"slideTitle\">{0}</div>");
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1667x1(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.f2447k4.writeDocumentEnd(iHtmlGenerator, iPresentation);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1665k4(IHtmlGenerator iHtmlGenerator, IPresentation iPresentation) {
        this.f2447k4.writeDocumentStart(iHtmlGenerator, iPresentation);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m1668x1(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.f2447k4.writeSlideEnd(iHtmlGenerator, iSlide);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m1666k4(IHtmlGenerator iHtmlGenerator, ISlide iSlide) {
        this.f2447k4.writeSlideStart(iHtmlGenerator, iSlide);
    }
}
