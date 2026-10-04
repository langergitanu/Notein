package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.vm */
/* JADX INFO: loaded from: classes3.dex */
public class C2339vm extends C2347wg {

    /* JADX INFO: renamed from: k4 */
    private int f8113k4;

    /* JADX INFO: renamed from: kk */
    private int[] f8114kk;

    /* JADX INFO: renamed from: x1 */
    private int f8115x1;

    public C2339vm(int i, int i2, C2064eb c2064eb) {
        super(i, i2, c2064eb);
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public int mo10360k4(int i) {
        int i2 = this.f8113k4;
        if (i < (i2 & 65535) || i >= (i2 & 65535) + (this.f8115x1 & 65535)) {
            return 0;
        }
        return this.f8114kk[i - (i2 & 65535)] & 65535;
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10361k4(C2212n9 c2212n9) {
        c2212n9.m11151fa();
        c2212n9.m11151fa();
        this.f8113k4 = c2212n9.m11151fa();
        int iM11151fa = c2212n9.m11151fa();
        this.f8115x1 = iM11151fa;
        this.f8114kk = new int[iM11151fa & 65535];
        for (int i = 0; i < (this.f8115x1 & 65535); i++) {
            this.f8114kk[i] = c2212n9.m11151fa();
        }
        super.mo10361k4(c2212n9);
    }
}
