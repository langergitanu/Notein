package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.a0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C2652a0 implements IGenericCloneable<C2652a0> {

    /* JADX INFO: renamed from: k4 */
    private double f8492k4;

    /* JADX INFO: renamed from: kk */
    private double f8493kk;

    /* JADX INFO: renamed from: x1 */
    private double f8494x1;

    public C2652a0(double d, double d2, double d3) {
        this.f8494x1 = d;
        this.f8492k4 = d2;
        this.f8493kk = d3;
    }

    /* JADX INFO: renamed from: x1 */
    public static C2652a0 m12110x1() {
        return new C2652a0(0.0d, 0.0d, 0.0d);
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final C2652a0 cloneT() {
        return new C2652a0(this.f8494x1, this.f8492k4, this.f8493kk);
    }
}
