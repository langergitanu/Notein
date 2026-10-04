package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.mu */
/* JADX INFO: loaded from: classes3.dex */
public final class C2824mu implements IGenericCloneable<C2824mu> {

    /* JADX INFO: renamed from: k4 */
    private int f8683k4;

    /* JADX INFO: renamed from: x1 */
    private double f8684x1;

    public C2824mu(int i, double d) {
        m12410k4(i);
        m12409k4(d);
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public C2824mu cloneT() {
        return new C2824mu(this.f8683k4, this.f8684x1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m12409k4(double d) {
        this.f8684x1 = d;
    }

    /* JADX INFO: renamed from: k4 */
    public void m12410k4(int i) {
        this.f8683k4 = i;
    }
}
