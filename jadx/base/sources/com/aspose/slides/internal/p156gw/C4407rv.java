package com.aspose.slides.internal.p156gw;

import com.aspose.slides.internal.p156gw.InterfaceC4413v4;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.aspose.slides.internal.gw.rv */
/* JADX INFO: loaded from: classes.dex */
public class C4407rv implements InterfaceC4413v4 {

    /* JADX INFO: renamed from: c5 */
    int f12059c5;

    /* JADX INFO: renamed from: ck */
    int f12060ck;

    /* JADX INFO: renamed from: du */
    double f12061du;

    /* JADX INFO: renamed from: dy */
    double f12062dy;

    /* JADX INFO: renamed from: fa */
    int[] f12063fa;

    /* JADX INFO: renamed from: h4 */
    double f12064h4;

    /* JADX INFO: renamed from: jd */
    int f12065jd;

    /* JADX INFO: renamed from: k4 */
    InterfaceC4413v4 f12066k4;

    /* JADX INFO: renamed from: kk */
    int f12067kk;

    /* JADX INFO: renamed from: m9 */
    double f12068m9;

    /* JADX INFO: renamed from: to */
    double[] f12069to;

    /* JADX INFO: renamed from: up */
    int f12070up;

    /* JADX INFO: renamed from: x1 */
    double f12071x1;

    /* JADX INFO: renamed from: yj */
    boolean f12072yj;

    public C4407rv(InterfaceC4413v4 interfaceC4413v4, double d) {
        this(interfaceC4413v4, d, 10);
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17817k4(double[] dArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("flattening iterator out of bounds");
        }
        int i = this.f12059c5;
        if (i != 4) {
            double[] dArr2 = this.f12069to;
            int i2 = this.f12060ck;
            dArr[0] = dArr2[i2];
            dArr[1] = dArr2[i2 + 1];
            if (i != 0) {
                return 1;
            }
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: kk */
    public void mo17820kk() {
        m17969k4(true);
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: x1 */
    public boolean mo17821x1() {
        return this.f12072yj;
    }

    public C4407rv(InterfaceC4413v4 interfaceC4413v4, double d, int i) {
        this.f12069to = new double[14];
        if (d < 0.0d) {
            throw new IllegalArgumentException("flatness must be >= 0");
        }
        if (i < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.f12066k4 = interfaceC4413v4;
        this.f12071x1 = d * d;
        this.f12067kk = i;
        this.f12063fa = new int[i + 1];
        m17969k4(false);
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public int mo17818k4(float[] fArr) {
        if (mo17821x1()) {
            throw new NoSuchElementException("flattening iterator out of bounds");
        }
        int i = this.f12059c5;
        if (i != 4) {
            double[] dArr = this.f12069to;
            int i2 = this.f12060ck;
            fArr[0] = (float) dArr[i2];
            fArr[1] = (float) dArr[i2 + 1];
            if (i != 0) {
                return 1;
            }
        }
        return i;
    }

    @Override // com.aspose.slides.internal.p156gw.InterfaceC4413v4
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4413v4.k4 mo17819k4() {
        return this.f12066k4.mo17819k4();
    }

    /* JADX INFO: renamed from: k4 */
    public void m17970k4(int i) {
        int i2 = this.f12060ck;
        if (i2 - i < 0) {
            double[] dArr = this.f12069to;
            int length = dArr.length - i2;
            double[] dArr2 = new double[dArr.length + 24];
            C4398ix.m17908k4(dArr, i2, dArr2, i2 + 24, length);
            this.f12069to = dArr2;
            this.f12060ck += 24;
            this.f12065jd += 24;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m17969k4(boolean z) {
        if (this.f12060ck >= this.f12065jd) {
            if (z) {
                this.f12066k4.mo17820kk();
            }
            if (this.f12066k4.mo17821x1()) {
                this.f12072yj = true;
                return;
            } else {
                this.f12059c5 = this.f12066k4.mo17817k4(this.f12069to);
                this.f12070up = 0;
                this.f12063fa[0] = 0;
            }
        }
        int i = this.f12059c5;
        if (i == 0 || i == 1) {
            double[] dArr = this.f12069to;
            double d = dArr[0];
            this.f12061du = d;
            double d2 = dArr[1];
            this.f12064h4 = d2;
            if (i == 0) {
                this.f12068m9 = d;
                this.f12062dy = d2;
            }
            this.f12060ck = 0;
            this.f12065jd = 0;
            return;
        }
        if (i == 2) {
            if (this.f12060ck >= this.f12065jd) {
                double[] dArr2 = this.f12069to;
                int length = dArr2.length;
                int i2 = length - 6;
                this.f12060ck = i2;
                this.f12065jd = dArr2.length - 2;
                dArr2[i2] = this.f12061du;
                dArr2[length - 5] = this.f12064h4;
                dArr2[length - 4] = dArr2[0];
                dArr2[length - 3] = dArr2[1];
                double d3 = dArr2[2];
                this.f12061du = d3;
                dArr2[length - 2] = d3;
                double d4 = dArr2[3];
                this.f12064h4 = d4;
                dArr2[length - 1] = d4;
            }
            int i3 = this.f12063fa[this.f12070up];
            while (i3 < this.f12067kk && AbstractC4403lr.m17949k4(this.f12069to, this.f12060ck) >= this.f12071x1) {
                m17970k4(4);
                double[] dArr3 = this.f12069to;
                int i4 = this.f12060ck;
                AbstractC4403lr.m17954k4(dArr3, i4, dArr3, i4 - 4, dArr3, i4);
                this.f12060ck -= 4;
                i3++;
                int[] iArr = this.f12063fa;
                int i5 = this.f12070up;
                iArr[i5] = i3;
                int i6 = i5 + 1;
                this.f12070up = i6;
                iArr[i6] = i3;
            }
            this.f12060ck += 4;
            this.f12070up--;
            return;
        }
        if (i != 3) {
            if (i != 4) {
                return;
            }
            this.f12061du = this.f12068m9;
            this.f12064h4 = this.f12062dy;
            this.f12060ck = 0;
            this.f12065jd = 0;
            return;
        }
        if (this.f12060ck >= this.f12065jd) {
            double[] dArr4 = this.f12069to;
            int length2 = dArr4.length;
            int i7 = length2 - 8;
            this.f12060ck = i7;
            this.f12065jd = dArr4.length - 2;
            dArr4[i7] = this.f12061du;
            dArr4[length2 - 7] = this.f12064h4;
            dArr4[length2 - 6] = dArr4[0];
            dArr4[length2 - 5] = dArr4[1];
            dArr4[length2 - 4] = dArr4[2];
            dArr4[length2 - 3] = dArr4[3];
            double d5 = dArr4[4];
            this.f12061du = d5;
            dArr4[length2 - 2] = d5;
            double d6 = dArr4[5];
            this.f12064h4 = d6;
            dArr4[length2 - 1] = d6;
        }
        int i8 = this.f12063fa[this.f12070up];
        while (i8 < this.f12067kk && AbstractC4392c5.m17847k4(this.f12069to, this.f12060ck) >= this.f12071x1) {
            m17970k4(6);
            double[] dArr5 = this.f12069to;
            int i9 = this.f12060ck;
            AbstractC4392c5.m17848k4(dArr5, i9, dArr5, i9 - 6, dArr5, i9);
            this.f12060ck -= 6;
            i8++;
            int[] iArr2 = this.f12063fa;
            int i10 = this.f12070up;
            iArr2[i10] = i8;
            int i11 = i10 + 1;
            this.f12070up = i11;
            iArr2[i11] = i8;
        }
        this.f12060ck += 6;
        this.f12070up--;
    }
}
