package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3904ks;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11537ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.k2 */
/* JADX INFO: loaded from: classes.dex */
public class C5303k2 extends AbstractC3904ks {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14304k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14304k4 = c11068dy;
        c11068dy.m53499k4("none", C5813x1.k4.f15898b3);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3905m9
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15596du() {
        return f14304k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3904ks, com.aspose.slides.internal.p126fa.AbstractC3905m9, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        short sMo48850k4 = interfaceC9933up.mo48850k4();
        if (sMo48850k4 == 12) {
            return C5813x1.k4.f16146k4;
        }
        if (sMo48850k4 == 35) {
            AbstractC5788h4 abstractC5788h4M53498k4 = mo15596du().m53498k4(interfaceC9933up.mo48784c5());
            if (abstractC5788h4M53498k4 != null) {
                return abstractC5788h4M53498k4;
            }
            throw m15601k4(interfaceC9933up.mo48784c5());
        }
        if (sMo48850k4 != 36) {
            throw m15602k4(interfaceC9933up.mo48850k4());
        }
        C5796m9 c5796m9 = new C5796m9();
        while (interfaceC9933up != null) {
            c5796m9.m23683x1(C11537ks.m54524x1(interfaceC9933up.mo48784c5()));
            interfaceC9933up = interfaceC9933up.mo48851kk();
            if (interfaceC9933up != null && interfaceC9933up.mo48850k4() != 36) {
                throw m15602k4(interfaceC9933up.mo48850k4());
            }
        }
        if (c5796m9.mo23681k4() % 2 != 1) {
            return c5796m9;
        }
        throw m15605x1(c5796m9.mo23682k4(c5796m9.mo23681k4() - 1).mo23414h4());
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: kk */
    public boolean mo15584kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: to */
    public AbstractC5788h4 mo15585to() {
        return C5813x1.k4.f15898b3;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: x1 */
    public int mo15586x1() {
        return 216;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "quotes";
    }
}
