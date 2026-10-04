package com.aspose.slides.internal.p258lv;

import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p138fu.C4124fa;
import com.aspose.slides.internal.p138fu.C4129ks;
import com.aspose.slides.internal.p505xn.C12565ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.um */
/* JADX INFO: loaded from: classes4.dex */
public class C6252um {

    /* JADX INFO: renamed from: du */
    private static byte[] f17723du;

    /* JADX INFO: renamed from: k4 */
    private static byte[] f17725k4;

    /* JADX INFO: renamed from: kk */
    private static byte[] f17726kk;

    /* JADX INFO: renamed from: x1 */
    private static final Object f17728x1 = new Object();

    /* JADX INFO: renamed from: to */
    private static final Object f17727to = new Object();

    /* JADX INFO: renamed from: h4 */
    private static final Object f17724h4 = new Object();

    /* JADX INFO: renamed from: k4 */
    public static byte[] m25365k4() {
        if (f17725k4 == null) {
            synchronized (f17728x1) {
                if (f17725k4 == null) {
                    AbstractC3150x6 abstractC3150x6M16496k4 = C4124fa.m16496k4("/Aspose/Foundation/Resources/Viewer.swf");
                    try {
                        C3152yj c3152yj = new C3152yj();
                        try {
                            C3149x1 c3149x1 = new C3149x1(c3152yj);
                            try {
                                byte[] bArr = new byte[8];
                                abstractC3150x6M16496k4.read(bArr, 0, 8);
                                c3149x1.m13450k4(bArr);
                                c3149x1.m13450k4(C4129ks.m16569k4(C12565ks.m58623k4(abstractC3150x6M16496k4, (int) (abstractC3150x6M16496k4.getLength() - 8)), 0, 1));
                                c3149x1.m13442k4().setPosition(38L);
                                f17725k4 = C12565ks.m58623k4(c3152yj, (int) (c3152yj.getLength() - 42));
                                abstractC3150x6M16496k4.dispose();
                            } finally {
                                c3149x1.dispose();
                            }
                        } finally {
                            c3152yj.dispose();
                        }
                    } catch (Throwable th) {
                        if (abstractC3150x6M16496k4 != null) {
                            abstractC3150x6M16496k4.dispose();
                        }
                        throw th;
                    }
                }
            }
        }
        return f17725k4;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: kk */
    public static byte[] m25366kk() {
        if (f17723du == null) {
            synchronized (f17724h4) {
                try {
                    if (f17723du == null) {
                        AbstractC3150x6 abstractC3150x6M16496k4 = C4124fa.m16496k4("/Aspose/Foundation/Resources/DocumentDescriptorAbcData.bin");
                        try {
                            f17723du = C12565ks.m58632x1(abstractC3150x6M16496k4);
                            if (abstractC3150x6M16496k4 != null) {
                                abstractC3150x6M16496k4.dispose();
                            }
                        } catch (Throwable th) {
                            if (abstractC3150x6M16496k4 != null) {
                                abstractC3150x6M16496k4.dispose();
                            }
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        return f17723du;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX INFO: renamed from: x1 */
    public static byte[] m25367x1() {
        if (f17726kk == null) {
            synchronized (f17727to) {
                try {
                    if (f17726kk == null) {
                        AbstractC3150x6 abstractC3150x6M16496k4 = C4124fa.m16496k4("/Aspose/Foundation/Resources/PageAbcData.bin");
                        try {
                            f17726kk = C12565ks.m58632x1(abstractC3150x6M16496k4);
                            if (abstractC3150x6M16496k4 != null) {
                                abstractC3150x6M16496k4.dispose();
                            }
                        } catch (Throwable th) {
                            if (abstractC3150x6M16496k4 != null) {
                                abstractC3150x6M16496k4.dispose();
                            }
                            throw th;
                        }
                    }
                } finally {
                }
            }
        }
        return f17726kk;
    }
}
