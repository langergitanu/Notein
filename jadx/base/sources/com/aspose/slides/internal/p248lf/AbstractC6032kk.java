package com.aspose.slides.internal.p248lf;

import com.aspose.slides.internal.p535yz.AbstractC13340dy;
import com.aspose.slides.internal.p535yz.C13341h4;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.lf.kk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6032kk implements InterfaceC6031k4 {

    /* JADX INFO: renamed from: k4 */
    private final C6035x1 f17112k4;

    /* JADX INFO: renamed from: x1 */
    private final C6029du f17113x1;

    public AbstractC6032kk(C6035x1 c6035x1, C6029du c6029du) {
        this.f17112k4 = c6035x1;
        this.f17113x1 = c6029du;
    }

    /* JADX INFO: renamed from: k4 */
    public final float m24357k4() {
        return this.f17113x1.f17083du / this.f17112k4.m24367k4().m62013ts();
    }

    /* JADX INFO: renamed from: x1 */
    public final C13341h4 m24358x1(char c) {
        C13341h4 c13341h4M24366k4 = this.f17112k4.m24366k4(C14117yj.m67537ne(c));
        return c13341h4M24366k4 == null ? this.f17112k4.m24371x1() : c13341h4M24366k4;
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public final float mo24354k4(char c) {
        C13341h4 c13341h4M24358x1 = m24358x1(c);
        if (!c13341h4M24358x1.m62004xk()) {
            return this.f17113x1.f17083du;
        }
        return m24357k4() * c13341h4M24358x1.m62002dq();
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public final float mo24355k4(char c, char c2) {
        AbstractC13340dy abstractC13340dyM24365k4 = this.f17112k4.m24365k4(m24358x1(c), m24358x1(c2));
        if (abstractC13340dyM24365k4 == null) {
            return 0.0f;
        }
        return m24357k4() * abstractC13340dyM24365k4.m61997ak();
    }

    @Override // com.aspose.slides.internal.p248lf.InterfaceC6031k4
    /* JADX INFO: renamed from: k4 */
    public final float mo24356k4(String str) {
        float f = 0.0f;
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            float fMo24354k4 = mo24354k4(cCharAt) + f;
            if (i > 0) {
                fMo24354k4 -= mo24355k4(str.charAt(i - 1), cCharAt);
            }
            f = fMo24354k4;
        }
        return f;
    }
}
