package com.aspose.slides;

import com.aspose.slides.internal.p314oc.AbstractC7018k4;

/* JADX INFO: loaded from: classes3.dex */
public final class SketchFormat extends PVIObject implements ISketchFormat {

    /* JADX INFO: renamed from: k4 */
    final AbstractC7018k4<gu5> f3375k4;

    /* JADX INFO: renamed from: kk */
    private C0735a7 f3376kk;

    /* JADX INFO: renamed from: x1 */
    private gu5 f3377x1;

    public SketchFormat(InterfaceC14397rj interfaceC14397rj) {
        super(interfaceC14397rj);
        this.f3375k4 = new AbstractC7018k4<gu5>() { // from class: com.aspose.slides.SketchFormat.1
            {
                SketchFormat.this.f3377x1 = new gu5() { // from class: com.aspose.slides.SketchFormat.1.1
                    @Override // com.aspose.slides.gu5
                    /* JADX INFO: renamed from: k4 */
                    public void mo1906k4() {
                        for (gu5 gu5Var : ((AbstractC7018k4) C06201.this).f19081x1) {
                            if (gu5Var != null) {
                                gu5Var.mo1906k4();
                            }
                        }
                    }
                };
            }
        };
        this.f3376kk = new C0735a7();
    }

    @Override // com.aspose.slides.PVIObject
    /* JADX INFO: renamed from: M_ */
    public Object mo331M_() {
        return new xx9(this.f3376kk);
    }

    /* JADX INFO: renamed from: du */
    public final C0735a7 m2670du() {
        return m2138ix() ? m2679x1().m73626kk() : xx9.f50221k4;
    }

    /* JADX INFO: renamed from: dy */
    public final void m2671dy() {
        if (this.f3377x1 == null || this.f3375k4.m27430k4()) {
            return;
        }
        this.f3377x1.mo1906k4();
    }

    @Override // com.aspose.slides.ISketchFormat
    public final int getSketchType() {
        if (m2138ix()) {
            return m2679x1().m73620k4();
        }
        return -1;
    }

    @Override // com.aspose.slides.PVIObject, com.aspose.slides.InterfaceC14376r6
    public long getVersion() {
        if (m2138ix()) {
            return m2679x1().m73618du();
        }
        return 1L;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m2672h4() {
        if (m2138ix()) {
            return m2679x1().m73619h4();
        }
        return true;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m2677m9() {
        m2145uz();
        m2679x1().m73627to();
    }

    @Override // com.aspose.slides.ISketchFormat
    public final void setSketchType(int i) {
        m2141k4((Integer) (-1), Integer.valueOf(i));
        if (!m2138ix() || m2679x1().m73620k4() == i) {
            return;
        }
        m2679x1().m73621k4(i);
        m2671dy();
    }

    /* JADX INFO: renamed from: to */
    public final long m2678to() {
        if (m2138ix()) {
            return m2679x1().m73628x1();
        }
        return 1219033472L;
    }

    /* JADX INFO: renamed from: x1 */
    public final xx9 m2679x1() {
        return (xx9) m2144u4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2673k4(long j) {
        m2141k4((Long) 1219033472L, Long.valueOf(j));
        if (m2138ix()) {
            m2679x1().m73622k4(j);
            m2671dy();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2674k4(ISketchFormat iSketchFormat) {
        m2145uz();
        m2679x1().m73624k4((SketchFormat) iSketchFormat);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2675k4(ISketchFormatEffectiveData iSketchFormatEffectiveData) {
        m2145uz();
        m2679x1().m73623k4(iSketchFormatEffectiveData);
        m2671dy();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2676k4(C0735a7 c0735a7) {
        m2141k4(xx9.f50221k4, c0735a7);
        if (m2138ix()) {
            m2679x1().m73625k4(c0735a7);
        }
    }
}
