package com.aspose.slides.internal.p071cz;

import com.aspose.slides.IGenericCloneable;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.ae */
/* JADX INFO: loaded from: classes3.dex */
public final class C2654ae implements IGenericCloneable<C2654ae> {

    /* JADX INFO: renamed from: k4 */
    private final double f8495k4;

    /* JADX INFO: renamed from: kk */
    private final double f8496kk;

    /* JADX INFO: renamed from: to */
    private final double f8497to;

    /* JADX INFO: renamed from: x1 */
    private final double f8498x1;

    public C2654ae() {
        this.f8495k4 = 0.0d;
        this.f8498x1 = 0.0d;
        this.f8496kk = 0.0d;
        this.f8497to = 0.0d;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C2654ae cloneT() {
        return new C2654ae(m12118x1(), m12117to(), m12116kk(), m12115k4());
    }

    /* JADX INFO: renamed from: k4 */
    public double m12115k4() {
        return this.f8495k4;
    }

    /* JADX INFO: renamed from: kk */
    public double m12116kk() {
        return this.f8496kk;
    }

    /* JADX INFO: renamed from: to */
    public double m12117to() {
        return this.f8497to;
    }

    /* JADX INFO: renamed from: x1 */
    public double m12118x1() {
        return this.f8498x1;
    }

    public C2654ae(double d, double d2, double d3, double d4) {
        this.f8498x1 = d;
        this.f8497to = d2;
        this.f8496kk = d3;
        this.f8495k4 = d4;
    }
}
