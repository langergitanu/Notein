package com.aspose.slides.internal.p060ca;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.wh */
/* JADX INFO: loaded from: classes3.dex */
public class C2348wh extends C2347wg {

    /* JADX INFO: renamed from: k4 */
    private byte[] f8155k4;

    public C2348wh(int i, int i2, C2064eb c2064eb) {
        super(i, i2, c2064eb);
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public int mo10360k4(int i) {
        return ((i < 0 || i > 255) ? (byte) 0 : this.f8155k4[i]) & 255;
    }

    @Override // com.aspose.slides.internal.p060ca.C2347wg
    /* JADX INFO: renamed from: k4 */
    public void mo10361k4(C2212n9 c2212n9) {
        c2212n9.m11151fa();
        c2212n9.m11151fa();
        this.f8155k4 = new byte[256];
        int i = 0;
        while (true) {
            byte[] bArr = this.f8155k4;
            if (i >= bArr.length) {
                super.mo10361k4(c2212n9);
                return;
            } else {
                bArr[i] = c2212n9.m11148ck();
                i++;
            }
        }
    }
}
