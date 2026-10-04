package com.aspose.slides.internal.p202jd;

import com.aspose.slides.internal.p126fa.AbstractC3901jd;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p368qq.C9919h4;
import com.aspose.slides.internal.p368qq.InterfaceC9933up;
import com.aspose.slides.internal.p423to.C11068dy;
import com.aspose.slides.internal.p447up.C11532fa;
import com.aspose.slides.internal.p447up.C11537ks;

/* JADX INFO: renamed from: com.aspose.slides.internal.jd.j5 */
/* JADX INFO: loaded from: classes.dex */
public class C5296j5 extends AbstractC3901jd {

    /* JADX INFO: renamed from: k4 */
    private static final C11068dy<AbstractC5788h4> f14298k4;

    static {
        C11068dy<AbstractC5788h4> c11068dy = new C11068dy<>();
        f14298k4 = c11068dy;
        c11068dy.m53499k4("none", C5813x1.k4.f15898b3);
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd
    /* JADX INFO: renamed from: du */
    public C11068dy<AbstractC5788h4> mo15588du() {
        return f14298k4;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3901jd, com.aspose.slides.internal.p126fa.AbstractC3894c5, com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public AbstractC5788h4 mo15578k4(InterfaceC9933up interfaceC9933up, C6344m9 c6344m9) {
        AbstractC5788h4 c11532fa;
        C5796m9 c5796m9 = new C5796m9();
        while (interfaceC9933up != null) {
            short sMo48850k4 = interfaceC9933up.mo48850k4();
            if (sMo48850k4 == 12) {
                return C5813x1.k4.f16146k4;
            }
            if (sMo48850k4 == 13) {
                c11532fa = new C11532fa(interfaceC9933up.mo48834du(), (short) 1);
            } else {
                if (sMo48850k4 != 35) {
                    throw C9919h4.m48827k4(interfaceC9933up.mo48850k4());
                }
                if (mo15588du().m53498k4(interfaceC9933up.mo48784c5()) != null) {
                    return C5813x1.k4.f15898b3;
                }
                c11532fa = C11537ks.m54523kk(interfaceC9933up.mo48784c5());
            }
            c5796m9.m23683x1(c11532fa);
            interfaceC9933up = interfaceC9933up.mo48851kk();
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
        return 85;
    }

    @Override // com.aspose.slides.internal.p126fa.AbstractC3909u4
    /* JADX INFO: renamed from: k4 */
    public String mo15583k4() {
        return "counter-reset";
    }
}
