package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.n5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2830n5 implements IGenericCloneable<C2830n5> {

    /* JADX INFO: renamed from: k4 */
    private C2808m2 f8686k4;

    /* JADX INFO: renamed from: x1 */
    private double f8687x1;

    public C2830n5(C2808m2 c2808m2, double d) {
        m12416k4(c2808m2);
        m12415k4(d);
    }

    /* JADX INFO: renamed from: k4 */
    public C2808m2 m12414k4() {
        return this.f8686k4;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C2830n5 cloneT() {
        return new C2830n5(m12414k4().cloneT(), m12418x1());
    }

    /* JADX INFO: renamed from: x1 */
    public double m12418x1() {
        return this.f8687x1;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12415k4(double d) {
        if (!C2821mr.m12407k4(d)) {
            throw new ArgumentOutOfRangeException("value");
        }
        this.f8687x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12416k4(C2808m2 c2808m2) {
        if (c2808m2 == null) {
            throw new ArgumentNullException("value");
        }
        this.f8686k4 = c2808m2;
    }
}
