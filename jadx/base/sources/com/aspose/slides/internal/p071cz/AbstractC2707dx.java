package com.aspose.slides.internal.p071cz;

import com.aspose.slides.exceptions.ArgumentNullException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.dx */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2707dx extends AbstractC2770ix {

    /* JADX INFO: renamed from: k4 */
    private C2891s1 f8565k4 = new C2891s1();

    public AbstractC2707dx(C2891s1 c2891s1) {
        m12214k4(c2891s1);
    }

    /* JADX INFO: renamed from: h4 */
    public C2891s1 m12213h4() {
        return this.f8565k4;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12214k4(C2891s1 c2891s1) {
        if (this.f8565k4 != c2891s1) {
            if (c2891s1 == null) {
                throw new ArgumentNullException("value");
            }
            this.f8565k4 = c2891s1.cloneT();
            m12331kk();
        }
    }
}
