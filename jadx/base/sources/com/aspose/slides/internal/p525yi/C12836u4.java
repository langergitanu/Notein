package com.aspose.slides.internal.p525yi;

import com.aspose.slides.internal.p174hz.AbstractC4736my;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.u4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12836u4 {

    /* JADX INFO: renamed from: du */
    private int f42698du;

    /* JADX INFO: renamed from: k4 */
    private AbstractC4736my f42699k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f42700kk;

    /* JADX INFO: renamed from: to */
    private int f42701to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC4752ts f42702x1;

    public C12836u4(AbstractC4736my abstractC4736my) {
        this.f42699k4 = abstractC4736my;
        abstractC4736my.m19687kk(1);
        int iM19683dy = this.f42699k4.m19683dy() >> 3;
        this.f42701to = iM19683dy;
        this.f42699k4.mo19692to(new byte[iM19683dy]);
        this.f42700kk = new byte[this.f42701to];
    }

    /* JADX INFO: renamed from: k4 */
    public void m59680k4(byte[] bArr) {
        this.f42699k4.mo19688kk(bArr);
        if (this.f42702x1 == null) {
            this.f42702x1 = this.f42699k4.m19689ks();
        }
        AbstractC14092to.m67225k4(this.f42700kk, 0, this.f42701to);
        this.f42698du = 0;
    }

    /* JADX INFO: renamed from: k4 */
    public void m59681k4(byte[] bArr, int i, int i2) {
        int iMin = Math.min(this.f42701to - this.f42698du, i2);
        AbstractC14092to.m67226k4(bArr, i, this.f42700kk, this.f42698du, iMin);
        int i3 = this.f42698du + iMin;
        this.f42698du = i3;
        int i4 = this.f42701to;
        if (i3 == i4) {
            InterfaceC4752ts interfaceC4752ts = this.f42702x1;
            byte[] bArr2 = this.f42700kk;
            interfaceC4752ts.mo19562k4(bArr2, 0, i4, bArr2, 0);
            int i5 = (i2 - iMin) / this.f42701to;
            int i6 = iMin;
            int i7 = 0;
            while (i7 < i5) {
                byte[] bArr3 = bArr;
                this.f42702x1.mo19562k4(bArr3, i6, this.f42701to, this.f42700kk, 0);
                i6 += this.f42701to;
                i7++;
                bArr = bArr3;
            }
            byte[] bArr4 = bArr;
            int i8 = i2 - i6;
            this.f42698du = i8;
            if (i8 > 0) {
                AbstractC14092to.m67226k4(bArr4, i6, this.f42700kk, 0, i8);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m59682k4() {
        byte[] bArrMo19564k4 = (this.f42698du > 0 || !(this.f42699k4.m19694up() == 3 || this.f42699k4.m19694up() == 1)) ? this.f42702x1.mo19564k4(this.f42700kk, 0, this.f42698du) : (byte[]) this.f42700kk.clone();
        if (!this.f42702x1.ap_()) {
            this.f42702x1.dispose();
            this.f42702x1 = null;
        }
        return bArrMo19564k4;
    }
}
