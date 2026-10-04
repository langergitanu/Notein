package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3894c5;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.fh */
/* JADX INFO: loaded from: classes.dex */
public class C5273fh extends AbstractC3894c5 {
    @Override // com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 abstractC5788h4Mo15578k4;
        C5796m9 c5796m9 = new C5796m9();
        int i = 0;
        InterfaceC9933up interfaceC9933upMo48851kk = interfaceC9933up;
        while (interfaceC9933upMo48851kk != null) {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        if (35 == interfaceC9933upMo48851kk.mo48850k4()) {
                        }
                    } else if (i != 3) {
                        throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
                    }
                    abstractC5788h4Mo15578k4 = c6344m9.m26001m9(72).mo15578k4(interfaceC9933upMo48851kk, c6344m9);
                }
                c5796m9.m23683x1(abstractC5788h4Mo15578k4);
                interfaceC9933upMo48851kk = interfaceC9933upMo48851kk.mo48851kk();
                i++;
            } else if (35 == interfaceC9933upMo48851kk.mo48850k4()) {
                if (!C14113y2.m67432to("none", interfaceC9933upMo48851kk.mo48784c5(), (short) 3)) {
                    throw m15601k4(interfaceC9933up.mo48784c5());
                }
                c5796m9.m23683x1(C5813x1.k4.f15898b3);
                return c5796m9;
            }
            abstractC5788h4Mo15578k4 = super.mo15578k4(interfaceC9933upMo48851kk, c6344m9);
            c5796m9.m23683x1(abstractC5788h4Mo15578k4);
            interfaceC9933upMo48851kk = interfaceC9933upMo48851kk.mo48851kk();
            i++;
        }
        return c5796m9;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return false;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return new C5796m9(C5813x1.k4.f15898b3);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return StyleIdentifier.COLORFUL_LIST_ACCENT_6;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "text-shadow";
    }
}
