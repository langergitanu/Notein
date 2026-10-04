package com.aspose.slides;

import com.aspose.slides.ForEach;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3141rv;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
public class Convert {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f2066k4 = new C7017h4(".ppt", ".pdf", ".xps", ".pptx", ".ppsx", ".tiff", ".odp", ".pptm", ".potx", ".potm", ".html", ".swf", ".otp", ".pps", ".pot", ".fodp", ".gif");

    public interface GetOutPathCallback {
        String invoke(Slide slide, int i);
    }

    public static void autoByExtension(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        String strM13397du = C3141rv.m13397du(str2);
        switch (f2066k4.m27428k4(C14113y2.m67368h4(strM13397du))) {
            case 0:
                m1264k4(str, str2);
                return;
            case 1:
                toPdf(str, str2);
                return;
            case 2:
                m1272x1(str, str2);
                return;
            case 3:
                m1266kk(str, str2);
                return;
            case 4:
                m1270to(str, str2);
                return;
            case 5:
                m1259du(str, str2);
                return;
            case 6:
                m1262h4(str, str2);
                return;
            case 7:
                m1268m9(str, str2);
                return;
            case 8:
                m1260dy(str, str2);
                return;
            case 9:
                m1257c5(str, str2);
                return;
            case 10:
                m1263jd(str, str2);
                return;
            case 11:
                m1258ck(str, str2);
                return;
            case 12:
                m1261fa(str, str2);
                return;
            case 13:
                m1271up(str, str2);
                return;
            case 14:
                m1273yj(str, str2);
                return;
            case 15:
                m1267ks(str, str2);
                return;
            case 16:
                m1269rv(str, str2);
                return;
            default:
                throw new ArgumentOutOfRangeException(C14113y2.m67402k4("Unknown or unsupported format: {0}", strM13397du));
        }
    }

    /* JADX INFO: renamed from: c5 */
    private static void m1257c5(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 11);
    }

    /* JADX INFO: renamed from: ck */
    private static void m1258ck(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 15);
    }

    /* JADX INFO: renamed from: du */
    private static void m1259du(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 5);
    }

    /* JADX INFO: renamed from: dy */
    private static void m1260dy(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 10);
    }

    /* JADX INFO: renamed from: fa */
    private static void m1261fa(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 17);
    }

    /* JADX INFO: renamed from: h4 */
    private static void m1262h4(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 6);
    }

    /* JADX INFO: renamed from: jd */
    private static void m1263jd(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 13);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m1264k4(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 0);
    }

    /* JADX INFO: renamed from: kk */
    private static void m1266kk(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 3);
    }

    /* JADX INFO: renamed from: ks */
    private static void m1267ks(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 21);
    }

    /* JADX INFO: renamed from: m9 */
    private static void m1268m9(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 7);
    }

    /* JADX INFO: renamed from: rv */
    private static void m1269rv(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 22);
    }

    /* JADX INFO: renamed from: to */
    private static void m1270to(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 4);
    }

    public static void toPdf(Presentation presentation, String str) {
        agh.m3574k4(str, "outPath");
        toPdf(presentation, str, (IPdfOptions) null);
    }

    public static void toSvg(Presentation presentation, GetOutPathCallback getOutPathCallback) {
        agh.m3573k4(presentation, "pres");
        agh.m3573k4(getOutPathCallback, "getOutPath,");
        toSvg(presentation, getOutPathCallback, null);
    }

    /* JADX INFO: renamed from: up */
    private static void m1271up(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 19);
    }

    /* JADX INFO: renamed from: x1 */
    private static void m1272x1(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 2);
    }

    /* JADX INFO: renamed from: yj */
    private static void m1273yj(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        m1265k4(str, str2, 20);
    }

    /* JADX INFO: renamed from: k4 */
    private static void m1265k4(String str, String str2, int i) {
        Presentation presentation = new Presentation(str);
        try {
            presentation.save(str2, i);
        } finally {
            presentation.dispose();
        }
    }

    public static void toPdf(Presentation presentation, String str, IPdfOptions iPdfOptions) {
        agh.m3573k4(presentation, "pres,");
        agh.m3574k4(str, "outPath");
        presentation.save(str, 1, iPdfOptions);
    }

    public static void toSvg(final Presentation presentation, final GetOutPathCallback getOutPathCallback, final ISVGOptions iSVGOptions) {
        agh.m3573k4(presentation, "pres");
        agh.m3573k4(getOutPathCallback, "getOutPath,");
        if (getOutPathCallback != null) {
            ForEach.slide(presentation, new ForEach.ForEachSlideCallback() { // from class: com.aspose.slides.Convert.1
                @Override // com.aspose.slides.ForEach.ForEachSlideCallback
                public void invoke(Slide slide, int i) {
                    C3130fa c3130fa = new C3130fa(getOutPathCallback.invoke(slide, i), 2, 3);
                    try {
                        slide.m2704k4(c3130fa, iSVGOptions);
                    } finally {
                        c3130fa.dispose();
                    }
                }
            });
        } else {
            ForEach.slide(presentation, new ForEach.ForEachSlideCallback() { // from class: com.aspose.slides.Convert.2
                @Override // com.aspose.slides.ForEach.ForEachSlideCallback
                public void invoke(Slide slide, int i) {
                    C3130fa c3130fa = new C3130fa(C14113y2.m67402k4("{0}_{1}.svg", C3141rv.m13411x1(presentation.f3114x1), Integer.valueOf(i)), 2, 2);
                    try {
                        slide.m2704k4(c3130fa, iSVGOptions);
                    } finally {
                        c3130fa.dispose();
                    }
                }
            });
        }
    }

    public static void toPdf(String str, String str2) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        Presentation presentation = new Presentation(str);
        try {
            toPdf(presentation, str2);
        } finally {
            presentation.dispose();
        }
    }

    public static void toSvg(Presentation presentation, ISVGOptions iSVGOptions) {
        agh.m3573k4(presentation, "pres");
        toSvg(presentation, null, iSVGOptions);
    }

    public static void toPdf(String str, String str2, IPdfOptions iPdfOptions) {
        agh.m3574k4(str, "presPath");
        agh.m3574k4(str2, "outPath");
        agh.m3573k4(iPdfOptions, "options");
        Presentation presentation = new Presentation(str);
        try {
            toPdf(presentation, str2);
        } finally {
            presentation.dispose();
        }
    }

    public static void toSvg(String str) {
        agh.m3574k4(str, "presPath");
        Presentation presentation = new Presentation(str);
        try {
            toSvg(presentation, null, null);
        } finally {
            presentation.dispose();
        }
    }

    public static void toSvg(String str, GetOutPathCallback getOutPathCallback) {
        agh.m3574k4(str, "presPath");
        agh.m3573k4(getOutPathCallback, "getOutPath,");
        Presentation presentation = new Presentation(str);
        try {
            toSvg(presentation, getOutPathCallback);
        } finally {
            presentation.dispose();
        }
    }
}
