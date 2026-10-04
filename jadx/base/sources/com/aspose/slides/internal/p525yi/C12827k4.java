package com.aspose.slides.internal.p525yi;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14094ts;

/* JADX INFO: renamed from: com.aspose.slides.internal.yi.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12827k4 extends AbstractC12818bv implements InterfaceC4752ts {

    /* JADX INFO: renamed from: fa */
    private byte f42674fa;

    /* JADX INFO: renamed from: k4 */
    private byte[] f42675k4;

    /* JADX INFO: renamed from: up */
    private byte f42676up;

    /* JADX INFO: renamed from: x1 */
    private byte[] f42677x1 = new byte[256];

    /* JADX INFO: renamed from: yj */
    private boolean f42678yj = false;

    /* JADX INFO: renamed from: x1 */
    private int m59646x1(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        for (int i4 = 0; i4 < i2; i4++) {
            byte bM27442k4 = C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(this.f42674fa), 6) + 1), 9);
            this.f42674fa = bM27442k4;
            this.f42676up = C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(this.f42676up), 6) + C7019kk.m27462to(Byte.valueOf(this.f42677x1[C7019kk.m27462to(Byte.valueOf(bM27442k4), 6)]), 6)), 9);
            byte b = this.f42677x1[C7019kk.m27462to(Byte.valueOf(this.f42674fa), 6)];
            this.f42677x1[C7019kk.m27462to(Byte.valueOf(this.f42674fa), 6)] = this.f42677x1[C7019kk.m27462to(Byte.valueOf(this.f42676up), 6)];
            this.f42677x1[C7019kk.m27462to(Byte.valueOf(this.f42676up), 6)] = b;
            byte bM27442k42 = C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(this.f42677x1[C7019kk.m27462to(Byte.valueOf(this.f42676up), 6)]), 6) + C7019kk.m27462to(Byte.valueOf(this.f42677x1[C7019kk.m27462to(Byte.valueOf(this.f42674fa), 6)]), 6)), 9);
            bArr2[i3 + i4] = C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(this.f42677x1[C7019kk.m27462to(Byte.valueOf(bM27442k42), 6)]), 6) ^ C7019kk.m27462to(Byte.valueOf(bArr[i + i4]), 6)), 9);
        }
        return i2;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public boolean ap_() {
        return false;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int aq_() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int ar_() {
        return 1;
    }

    public void finalize() throws Throwable {
        mo19686k4(true);
        super.finalize();
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public int mo19562k4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        m59647x1(bArr, i, i2);
        if (bArr2 == null) {
            throw new ArgumentNullException("outputBuffer");
        }
        if (i3 < 0) {
            throw new ArgumentOutOfRangeException("outputOffset", "< 0");
        }
        if (i3 <= bArr2.length - i2) {
            return m59646x1(bArr, i, i2, bArr2, i3);
        }
        throw new ArgumentException("outputBuffer", "Overflow");
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: kk */
    public void mo19688kk(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("Key");
        }
        byte[] bArr2 = (byte[]) bArr.clone();
        this.f42675k4 = bArr2;
        this.f13208h4 = bArr2;
        m59645k4(bArr2);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: to */
    public byte[] mo19693to() {
        if (this.f13208h4 == null) {
            mo19658k4();
        }
        return (byte[]) this.f13208h4.clone();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4752ts mo19657k4(byte[] bArr, byte[] bArr2) {
        mo19688kk(bArr);
        return this;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: kk */
    public boolean mo19566kk() {
        return true;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: x1 */
    public InterfaceC4752ts mo19659x1(byte[] bArr, byte[] bArr2) {
        mo19688kk(bArr);
        return m19689ks();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: k4 */
    public void mo19658k4() {
        this.f13208h4 = C12843x6.m59721k4(this.f13206du >> 3);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: x1 */
    public void mo19660x1() {
        mo19692to(new byte[0]);
    }

    /* JADX INFO: renamed from: x1 */
    private void m59647x1(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("inputBuffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("inputOffset", "< 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException("inputCount", "< 0");
        }
        if (i > bArr.length - i2) {
            throw new ArgumentException("inputBuffer", "Overflow");
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: k4 */
    public void mo19686k4(boolean z) {
        if (this.f42678yj) {
            return;
        }
        this.f42674fa = (byte) 0;
        this.f42676up = (byte) 0;
        byte[] bArr = this.f42675k4;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
            this.f42675k4 = null;
        }
        byte[] bArr2 = this.f42677x1;
        AbstractC14092to.m67225k4(bArr2, 0, bArr2.length);
        this.f42677x1 = null;
        C14094ts.m67303k4(this);
        this.f42678yj = true;
    }

    /* JADX INFO: renamed from: k4 */
    private void m59645k4(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.f42677x1[i] = C7019kk.m27442k4(Integer.valueOf(i), 9);
        }
        this.f42674fa = (byte) 0;
        this.f42676up = (byte) 0;
        byte bM27442k4 = 0;
        byte bM27442k42 = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            bM27442k42 = C7019kk.m27442k4(Integer.valueOf(C7019kk.m27462to(Byte.valueOf(bM27442k42), 6) + C7019kk.m27462to(Byte.valueOf(this.f42677x1[i2]), 6) + C7019kk.m27462to(Byte.valueOf(bArr[C7019kk.m27462to(Byte.valueOf(bM27442k4), 6)]), 6)), 9);
            byte[] bArr2 = this.f42677x1;
            byte b = bArr2[i2];
            bArr2[i2] = bArr2[C7019kk.m27462to(Byte.valueOf(bM27442k42), 6)];
            this.f42677x1[C7019kk.m27462to(Byte.valueOf(bM27442k42), 6)] = b;
            bM27442k4 = C7019kk.m27442k4(Integer.valueOf((C7019kk.m27462to(Byte.valueOf(bM27442k4), 6) + 1) % bArr.length), 9);
        }
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19564k4(byte[] bArr, int i, int i2) {
        m59647x1(bArr, i, i2);
        byte[] bArr2 = new byte[i2];
        m59646x1(bArr, i, i2, bArr2, 0);
        return bArr2;
    }
}
