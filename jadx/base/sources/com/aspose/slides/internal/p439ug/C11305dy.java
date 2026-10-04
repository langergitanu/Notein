package com.aspose.slides.internal.p439ug;

import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.aspose.slides.internal.p550zi.C13590ak;
import com.aspose.slides.internal.p550zi.C13619x1;

/* JADX INFO: renamed from: com.aspose.slides.internal.ug.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C11305dy extends AbstractC11304du {

    /* JADX INFO: renamed from: du */
    private final byte[] f38881du;

    /* JADX INFO: renamed from: h4 */
    private final int f38882h4;

    /* JADX INFO: renamed from: m9 */
    private int f38883m9 = 8;

    /* JADX INFO: renamed from: to */
    private final InterfaceC6906k4 f38884to;

    public C11305dy(InterfaceC6906k4 interfaceC6906k4, int i) {
        this.f38884to = interfaceC6906k4;
        byte[] bArrM62865k4 = C13619x1.m62865k4(i);
        this.f38881du = bArrM62865k4;
        this.f38882h4 = bArrM62865k4.length;
    }

    /* JADX INFO: renamed from: h4 */
    private void m54298h4() {
        int i = this.f38880x1;
        if (i > 0) {
            this.f38884to.mo27041k4(this.f38881du, i);
            if (this.f38883m9 == 8) {
                byte[] bArr = this.f38881du;
                C10052k4.m49679k4(bArr, 0, bArr.length);
            } else {
                byte[] bArr2 = this.f38881du;
                bArr2[0] = bArr2[this.f38880x1];
                C10052k4.m49679k4(bArr2, 1, bArr2.length - 1);
            }
            this.f38880x1 = 0;
        }
    }

    /* JADX INFO: renamed from: du */
    public void m54299du() {
        m54298h4();
        this.f38884to.mo27037k4();
    }

    @Override // com.aspose.slides.internal.p439ug.AbstractC11304du
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ int mo54293k4() {
        return super.mo54293k4();
    }

    /* JADX INFO: renamed from: to */
    public void m54301to() {
        if (this.f38883m9 != 8) {
            this.f38880x1++;
            this.f38883m9 = 8;
        }
    }

    @Override // com.aspose.slides.internal.p439ug.AbstractC11304du
    /* JADX INFO: renamed from: x1 */
    public /* bridge */ /* synthetic */ int mo54296x1(int i) {
        return super.mo54296x1(i);
    }

    @Override // com.aspose.slides.internal.p439ug.AbstractC11304du
    /* JADX INFO: renamed from: k4 */
    public /* bridge */ /* synthetic */ void mo54294k4(int i) {
        super.mo54294k4(i);
    }

    @Override // com.aspose.slides.internal.p439ug.AbstractC11304du
    /* JADX INFO: renamed from: x1 */
    public /* bridge */ /* synthetic */ void mo54297x1() {
        super.mo54297x1();
    }

    /* JADX INFO: renamed from: k4 */
    public void m54300k4(C11311x1 c11311x1) {
        int i;
        byte[] bArr;
        int i2;
        int iM54337kk = c11311x1.m54337kk();
        int iM54339to = c11311x1.m54339to();
        while (true) {
            i = this.f38883m9;
            bArr = this.f38881du;
            i2 = this.f38880x1;
            if (iM54337kk <= i) {
                break;
            }
            bArr[i2] = (byte) ((bArr[i2] & 255) | (iM54339to >> (iM54337kk - i)));
            iM54337kk -= i;
            this.f38880x1 = i2 + 1;
            this.f38883m9 = 8;
        }
        bArr[i2] = (byte) ((((byte) ((iM54339to & C13590ak.f45145x1[iM54337kk]) << (i - iM54337kk))) & 255) | (bArr[i2] & 255));
        int i3 = i - iM54337kk;
        this.f38883m9 = i3;
        if (i3 == 0) {
            this.f38880x1 = i2 + 1;
            this.f38883m9 = 8;
        }
        if (this.f38880x1 + 3 > this.f38882h4) {
            m54298h4();
        }
    }
}
