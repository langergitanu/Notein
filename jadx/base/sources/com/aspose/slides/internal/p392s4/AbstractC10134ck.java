package com.aspose.slides.internal.p392s4;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p299ni.InterfaceC6906k4;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.s4.ck */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10134ck extends AbstractC10133c5 {

    /* JADX INFO: renamed from: du */
    private int f36336du;

    /* JADX INFO: renamed from: dy */
    private final InterfaceC6906k4 f36337dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f36338h4;

    /* JADX INFO: renamed from: k4 */
    private int f36339k4;

    /* JADX INFO: renamed from: kk */
    private int f36340kk;

    /* JADX INFO: renamed from: m9 */
    private int f36341m9;

    /* JADX INFO: renamed from: to */
    private int[] f36342to;

    /* JADX INFO: renamed from: x1 */
    private int f36343x1;

    public AbstractC10134ck(InterfaceC6906k4 interfaceC6906k4, int i, int i2) {
        super(i, i2);
        this.f36339k4 = -1;
        if (interfaceC6906k4 == null) {
            throw new ArgumentNullException("bufferProcessor");
        }
        this.f36337dy = interfaceC6906k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m49793k4() {
        int[] iArr = this.f36342to;
        if (iArr == null) {
            this.f36342to = new int[this.f36340kk * 4095];
        } else {
            C10052k4.m49681k4(iArr, 0, iArr.length);
        }
        int i = 0;
        while (true) {
            int i2 = this.f36343x1;
            if (i >= i2) {
                this.f36339k4 = 0;
                this.f36336du = i2 * this.f36340kk;
                return;
            } else {
                this.f36342to[this.f36340kk * i] = i;
                i++;
            }
        }
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: c5 */
    public /* bridge */ /* synthetic */ int mo49781c5() {
        return super.mo49781c5();
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: dy */
    public /* bridge */ /* synthetic */ int mo49784dy() {
        return super.mo49784dy();
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: h4 */
    public /* bridge */ /* synthetic */ int mo49786h4() {
        return super.mo49786h4();
    }

    /* JADX INFO: renamed from: kk */
    public void m49796kk() {
        m49790to(mo49781c5() + 1);
        int iMo49781c5 = 1 << mo49781c5();
        this.f36343x1 = iMo49781c5;
        this.f36340kk = iMo49781c5 + 1;
        m49793k4();
        m49785fa();
        this.f36338h4 = false;
    }

    @Override // com.aspose.slides.internal.p392s4.AbstractC10133c5
    /* JADX INFO: renamed from: m9 */
    public /* bridge */ /* synthetic */ int mo49788m9() {
        return super.mo49788m9();
    }

    /* JADX INFO: renamed from: x1 */
    public InterfaceC6906k4 m49797x1() {
        return this.f36337dy;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo49798x1(int i);

    /* JADX INFO: renamed from: k4 */
    public void mo49794k4(int i) {
        mo49798x1(this.f36342to[this.f36341m9]);
    }

    /* JADX INFO: renamed from: k4 */
    public void m49795k4(byte[] bArr, int i) {
        if (bArr == null) {
            throw new ArgumentNullException(C18437z2.f56756j);
        }
        if (this.f36339k4 == -1) {
            throw new IllegalArgumentException("LzwCompressorException:StartEncoding method was not called first.");
        }
        if (i > 0) {
            int i2 = 0;
            if (!this.f36338h4) {
                mo49798x1(mo49788m9());
                this.f36341m9 = (bArr[0] & 255) * this.f36340kk;
                this.f36338h4 = true;
                i2 = 1;
            }
            while (i2 < i) {
                int i3 = bArr[i2] & 255;
                int i4 = this.f36341m9 + i3 + 1;
                int[] iArr = this.f36342to;
                int i5 = iArr[i4];
                if (i5 != 0) {
                    this.f36341m9 = i4 + i5;
                } else {
                    int i6 = this.f36336du;
                    iArr[i4] = i6 - i4;
                    int iMo49784dy = mo49784dy();
                    int i7 = this.f36339k4;
                    int i8 = i7 + 1;
                    this.f36339k4 = i8;
                    iArr[i6] = iMo49784dy + i7;
                    this.f36336du = (this.f36343x1 + i8) * this.f36340kk;
                    mo49798x1(this.f36342to[this.f36341m9]);
                    if (this.f36339k4 > m49782ck()) {
                        m49792yj();
                    }
                    if (m49787jd() == 12 && this.f36339k4 == m49782ck()) {
                        mo49798x1(mo49788m9());
                        m49791up();
                        m49793k4();
                    }
                    this.f36341m9 = i3 * this.f36340kk;
                }
                i2++;
            }
        }
    }
}
