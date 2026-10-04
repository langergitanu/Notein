package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.w8 */
/* JADX INFO: loaded from: classes3.dex */
public class C2346w8 extends C2347wg {

    /* JADX INFO: renamed from: k4 */
    private int[] f8149k4;

    /* JADX INFO: renamed from: kk */
    private long f8150kk;

    /* JADX INFO: renamed from: x1 */
    private long f8151x1;

    public C2346w8(int i, int i2, C2064eb c2064eb) {
        super(i, i2, c2064eb);
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public int mo10360k4(int i) {
        long j = i;
        long j2 = this.f8151x1;
        if (j < (j2 & 4294967295L) || j >= (((j2 & 4294967295L) + (this.f8150kk & 4294967295L)) & 4294967295L)) {
            return 0;
        }
        return this.f8149k4[(int) ((j - (j2 & 4294967295L)) & 4294967295L)] & 65535;
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10361k4(C2212n9 c2212n9) {
        c2212n9.m11164up();
        c2212n9.m11164up();
        this.f8151x1 = c2212n9.m11164up();
        long jM11164up = c2212n9.m11164up();
        this.f8150kk = jM11164up;
        this.f8149k4 = new int[(int) jM11164up];
        for (int i = 0; i < (this.f8150kk & 4294967295L); i++) {
            this.f8149k4[i] = c2212n9.m11151fa();
        }
        super.mo10361k4(c2212n9);
    }
}
