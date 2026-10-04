package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.ko */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2164ko extends C2236ov {

    /* JADX INFO: renamed from: k4 */
    protected float f7497k4;

    /* JADX INFO: renamed from: kk */
    protected C2137j0 f7498kk;

    /* JADX INFO: renamed from: x1 */
    protected C2373xp f7499x1;

    public AbstractC2164ko(C2377xv c2377xv, long j, long j2, long j3) {
        super(c2377xv, j, j2, j3);
    }

    /* JADX INFO: renamed from: k4 */
    public final C2373xp m10955k4() {
        return this.f7499x1;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo10375k4(int i, C2212n9 c2212n9);

    /* JADX INFO: renamed from: x1 */
    public final C2137j0 m10956x1() {
        return this.f7498kk;
    }

    @Override // com.aspose.slides.internal.p060ca.C2236ov
    /* JADX INFO: renamed from: k4 */
    public void mo10299k4(C2212n9 c2212n9) {
        c2212n9.m11159k4(m11222wy() & 4294967295L);
        try {
            this.f7497k4 = c2212n9.m11163to();
            int iM11151fa = c2212n9.m11151fa();
            int iM11151fa2 = c2212n9.m11151fa();
            int iM11151fa3 = c2212n9.m11151fa();
            this.f7499x1 = (C2373xp) AbstractC2282s0.m11353k4(new C2373xp(((m11222wy() & 4294967295L) + ((long) (iM11151fa & 65535))) & 4294967295L), c2212n9);
            this.f7498kk = (C2137j0) AbstractC2282s0.m11353k4(new C2137j0(((m11222wy() & 4294967295L) + ((long) (iM11151fa2 & 65535))) & 4294967295L), c2212n9);
            mo10375k4(iM11151fa3, c2212n9);
            super.mo10299k4(c2212n9);
        } catch (C2136iy | C2228oa unused) {
        } catch (RuntimeException e) {
            throw e;
        }
    }
}
