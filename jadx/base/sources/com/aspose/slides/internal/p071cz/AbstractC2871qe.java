package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.qe */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2871qe {

    /* JADX INFO: renamed from: k4 */
    private C2706dw f8725k4 = new C2706dw(0.0d, 0.0d);

    /* JADX INFO: renamed from: du */
    public static double m12488du() {
        return 127.0d;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12489k4(C2706dw c2706dw) {
        if (c2706dw == null) {
            throw new ArgumentNullException();
        }
        this.f8725k4 = c2706dw;
    }

    /* JADX INFO: renamed from: kk */
    public abstract C2867q6 mo12122kk();

    /* JADX INFO: renamed from: to */
    public final C2706dw m12490to() {
        return this.f8725k4;
    }
}
