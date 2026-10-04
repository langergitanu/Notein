package com.aspose.slides.internal.p550zi;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.fa */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC13599fa extends C13614up {

    /* JADX INFO: renamed from: k4 */
    private C13618wy f45159k4;

    /* JADX INFO: renamed from: k4 */
    public C13618wy m62727k4() {
        return this.f45159k4;
    }

    /* JADX INFO: renamed from: kk */
    public abstract void mo10011kk();

    @Override // com.aspose.slides.internal.p550zi.C13614up
    /* JADX INFO: renamed from: to */
    public void mo24306to() {
        C13618wy c13618wy = this.f45159k4;
        if (c13618wy != null) {
            c13618wy.dispose();
            this.f45159k4 = null;
        }
        super.mo24306to();
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo10013x1(AbstractC3150x6 abstractC3150x6);

    /* JADX INFO: renamed from: x1 */
    public void m62730x1(C13618wy c13618wy) {
    }

    /* JADX INFO: renamed from: x1 */
    public abstract boolean mo10014x1();

    /* JADX INFO: renamed from: k4 */
    public void m62728k4(AbstractC3150x6 abstractC3150x6) {
        m62823m9();
        C13618wy c13618wy = this.f45159k4;
        if (c13618wy != null && abstractC3150x6 == c13618wy.m62861x1() && !mo10014x1()) {
            long position = abstractC3150x6.getPosition();
            mo10011kk();
            abstractC3150x6.setPosition(position);
        }
        mo10013x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public void m62729k4(C13618wy c13618wy) {
        if (c13618wy == null) {
            throw new ArgumentNullException("value");
        }
        try {
            m62730x1(c13618wy);
        } finally {
            this.f45159k4 = c13618wy;
        }
    }
}
