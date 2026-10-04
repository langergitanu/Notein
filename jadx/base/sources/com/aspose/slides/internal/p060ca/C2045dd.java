package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.dd */
/* JADX INFO: loaded from: classes3.dex */
public class C2045dd extends C2347wg {

    /* JADX INFO: renamed from: k4 */
    private byte[] f7060k4;

    /* JADX INFO: renamed from: x1 */
    private k4[] f7061x1;

    /* JADX INFO: renamed from: com.aspose.slides.internal.ca.dd$k4 */
    public static class k4 {

        /* JADX INFO: renamed from: k4 */
        public long f7062k4;

        /* JADX INFO: renamed from: kk */
        public long f7063kk;

        /* JADX INFO: renamed from: x1 */
        public long f7064x1;

        private k4() {
        }
    }

    public C2045dd(int i, int i2, C2064eb c2064eb) {
        super(i, i2, c2064eb);
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public int mo10360k4(int i) {
        int i2 = 0;
        while (true) {
            k4[] k4VarArr = this.f7061x1;
            if (i2 >= k4VarArr.length) {
                break;
            }
            long j = i;
            k4 k4Var = k4VarArr[i2];
            long j2 = k4Var.f7062k4;
            if (j >= (j2 & 4294967295L) && j <= (k4Var.f7064x1 & 4294967295L)) {
                return (int) ((((k4Var.f7063kk & 4294967295L) + j) & 4294967295L) - (j2 & 4294967295L));
            }
            if (j < (k4Var.f7064x1 & 4294967295L) && j < (j2 & 4294967295L)) {
                break;
            }
            i2++;
        }
        return 0;
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10361k4(C2212n9 c2212n9) {
        c2212n9.m11164up();
        c2212n9.m11164up();
        this.f7060k4 = new byte[8192];
        int i = 0;
        while (true) {
            byte[] bArr = this.f7060k4;
            if (i >= bArr.length) {
                break;
            }
            bArr[i] = c2212n9.m11148ck();
            i++;
        }
        long jM11164up = c2212n9.m11164up();
        this.f7061x1 = new k4[(int) jM11164up];
        for (int i2 = 0; i2 < (4294967295L & jM11164up); i2++) {
            this.f7061x1[i2] = new k4();
            this.f7061x1[i2].f7062k4 = c2212n9.m11164up();
            this.f7061x1[i2].f7064x1 = c2212n9.m11164up();
            this.f7061x1[i2].f7063kk = c2212n9.m11164up();
        }
        super.mo10361k4(c2212n9);
    }
}
