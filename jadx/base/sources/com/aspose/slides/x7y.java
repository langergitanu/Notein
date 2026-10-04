package com.aspose.slides;

import com.aspose.slides.internal.p104ec.C3662y9;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: loaded from: classes3.dex */
class x7y {
    /* JADX INFO: renamed from: k4 */
    public void m73177k4(C11791os c11791os, IPresentation iPresentation) {
        Presentation presentation = (Presentation) iPresentation;
        if (presentation.m2396x1() == null) {
            return;
        }
        c11791os.m55423k4(presentation.m2396x1().m14856k4());
    }

    /* JADX INFO: renamed from: k4 */
    public void m73178k4(byte[] bArr, IPresentation iPresentation) {
        if (bArr == null) {
            return;
        }
        Presentation presentation = (Presentation) iPresentation;
        presentation.m2368k4(new C3662y9(bArr));
        presentation.setVbaProject(new VbaProject(presentation.m2396x1()));
    }
}
