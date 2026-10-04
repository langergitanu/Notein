package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.EndOfStreamException;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.qw */
/* JADX INFO: loaded from: classes3.dex */
public class C2268qw extends AbstractC2177li {

    /* JADX INFO: renamed from: k4 */
    private C2286s7 f7789k4;

    /* JADX INFO: renamed from: x1 */
    private C2299sz f7790x1;

    @Override // com.aspose.slides.internal.p060ca.AbstractC2177li
    /* JADX INFO: renamed from: k4 */
    public AbstractC2313tw mo11021k4(C2033cj c2033cj) {
        try {
            this.f7790x1 = c2033cj.m10333kk()[0];
            this.f7789k4 = new C2286s7(c2033cj);
            m11313k4();
        } catch (EndOfStreamException e) {
            if (C2063e8.m10448k4().m10449kk() != 1) {
                throw new C2031ca("Unexpected font parsing exception", e);
            }
        } catch (C2096ga e2) {
            throw e2;
        } catch (RuntimeException e3) {
            throw new C2031ca("Unexpected font parsing exception", e3);
        }
        return this.f7789k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m11313k4() {
        C2165kp c2165kp = new C2165kp(this.f7790x1.m11428kk(), this.f7790x1.m11428kk().m10241du());
        try {
            this.f7789k4 = new C2139j5(c2165kp, this.f7789k4).m10806k4();
        } finally {
            c2165kp.dispose();
        }
    }
}
