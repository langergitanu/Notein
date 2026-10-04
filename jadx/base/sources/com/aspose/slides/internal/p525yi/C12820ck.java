package com.aspose.slides.internal.p525yi;

import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.ck */
/* JADX INFO: loaded from: classes5.dex */
public class C12820ck {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC4752ts f42649k4;

    /* JADX INFO: renamed from: kk */
    private int f42650kk;

    /* JADX INFO: renamed from: to */
    private int f42651to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f42652x1;

    public C12820ck(InterfaceC4752ts interfaceC4752ts, int i) {
        this.f42649k4 = interfaceC4752ts;
        this.f42650kk = i;
        this.f42652x1 = new byte[i];
    }

    /* JADX INFO: renamed from: k4 */
    public void m59611k4() {
        AbstractC14092to.m67225k4(this.f42652x1, 0, this.f42650kk);
        this.f42651to = 0;
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m59614x1() {
        return this.f42649k4.mo19564k4(this.f42652x1, 0, this.f42651to);
    }

    /* JADX INFO: renamed from: k4 */
    public void m59612k4(byte[] bArr) {
        m59613k4(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: k4 */
    public void m59613k4(byte[] bArr, int i, int i2) {
        int iMin = Math.min(this.f42650kk - this.f42651to, i2);
        C14058fa.m66596k4(bArr, i, this.f42652x1, this.f42651to, iMin);
        int i3 = this.f42651to + iMin;
        this.f42651to = i3;
        int i4 = this.f42650kk;
        if (i3 == i4) {
            InterfaceC4752ts interfaceC4752ts = this.f42649k4;
            byte[] bArr2 = this.f42652x1;
            interfaceC4752ts.mo19562k4(bArr2, 0, i4, bArr2, 0);
            int i5 = (i2 - iMin) / this.f42650kk;
            int i6 = 0;
            while (i6 < i5) {
                byte[] bArr3 = bArr;
                this.f42649k4.mo19562k4(bArr3, iMin + i, this.f42650kk, this.f42652x1, 0);
                iMin += this.f42650kk;
                i6++;
                bArr = bArr3;
            }
            byte[] bArr4 = bArr;
            int i7 = i2 - iMin;
            this.f42651to = i7;
            if (i7 > 0) {
                C14058fa.m66596k4(bArr4, iMin + i, this.f42652x1, 0, i7);
            }
        }
    }
}
