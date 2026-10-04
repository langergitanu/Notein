package com.aspose.slides;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3148wl;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p129fe.C3977ck;
import com.aspose.slides.internal.p193iv.C5133k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.ah */
/* JADX INFO: loaded from: classes3.dex */
class C0749ah {
    /* JADX INFO: renamed from: k4 */
    public static byte[] m3575k4(String str) {
        try {
            AbstractC3150x6 abstractC3150x6M21997k4 = C5133k4.m21997k4(str);
            try {
                C12009k4 c12009k4 = new C12009k4(abstractC3150x6M21997k4);
                try {
                    C3152yj c3152yj = new C3152yj();
                    try {
                        c12009k4.m56333k4(c3152yj, C3977ck.m15681jd());
                        return c3152yj.toArray();
                    } finally {
                        c3152yj.dispose();
                    }
                } finally {
                    c12009k4.dispose();
                }
            } finally {
                if (abstractC3150x6M21997k4 != null) {
                    abstractC3150x6M21997k4.dispose();
                }
            }
        } catch (RuntimeException e) {
            throw new yii(C14113y2.m67402k4("Error occured in read a bitmap resource embedded file. Details: {0}.", e.getMessage()), e);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static String m3576x1(String str) {
        try {
            AbstractC3150x6 abstractC3150x6M21997k4 = C5133k4.m21997k4(str);
            try {
                C3148wl c3148wl = new C3148wl(abstractC3150x6M21997k4);
                try {
                    return c3148wl.mo13427dy();
                } finally {
                    c3148wl.dispose();
                }
            } finally {
                if (abstractC3150x6M21997k4 != null) {
                    abstractC3150x6M21997k4.dispose();
                }
            }
        } catch (RuntimeException e) {
            throw new yii(C14113y2.m67402k4("Error occured in read a text resource embedded file. Details: {0}.", e.getMessage()), e);
        }
    }
}
