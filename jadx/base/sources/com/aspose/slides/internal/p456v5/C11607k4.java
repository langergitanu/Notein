package com.aspose.slides.internal.p456v5;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p174hz.AbstractC4736my;
import com.aspose.slides.internal.p174hz.C4711e0;
import com.aspose.slides.internal.p174hz.C4743qw;
import com.aspose.slides.internal.p174hz.InterfaceC4752ts;

/* JADX INFO: renamed from: com.aspose.slides.internal.v5.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11607k4 extends AbstractC4736my {

    /* JADX INFO: renamed from: k4 */
    private static final C4711e0[] f39179k4 = {new C4711e0(128, 128, 0)};

    /* JADX INFO: renamed from: x1 */
    private static final C4711e0[] f39180x1 = {new C4711e0(128, 256, 64)};

    public C11607k4() {
        C4711e0[] c4711e0Arr = f39179k4;
        this.f13212m9 = c4711e0Arr;
        this.f13207dy = f39180x1;
        this.f13211kk = c4711e0Arr[0].m19599k4();
        this.f13206du = this.f13207dy[0].m19599k4();
        this.f13204c5 = 8;
        this.f13209jd = 1;
        this.f13205ck = 2;
        mo19658k4();
        mo19660x1();
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: k4 */
    public InterfaceC4752ts mo19657k4(byte[] bArr, byte[] bArr2) {
        m54675k4(bArr);
        m54676x1(bArr2);
        return new C11608kk(bArr, bArr2, m19684fa(), m19694up(), true);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: x1 */
    public InterfaceC4752ts mo19659x1(byte[] bArr, byte[] bArr2) {
        m54675k4(bArr);
        m54676x1(bArr2);
        return new C11608kk(bArr, bArr2, m19684fa(), m19694up(), false);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: k4 */
    public void mo19658k4() {
        this.f13208h4 = new byte[mo19608h4() / 8];
        new C4743qw().mo19624k4(this.f13208h4);
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4736my
    /* JADX INFO: renamed from: x1 */
    public void mo19660x1() {
        this.f13213to = new byte[m19683dy() / 8];
        new C4743qw().mo19624k4(this.f13213to);
    }

    /* JADX INFO: renamed from: k4 */
    private void m54675k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("rgbKey", "The value cannot be undefined.");
        }
        if (!m19682du(bArr.length * 8)) {
            throw new ArgumentException("The key has an invalid size for this algorithm.", "rgbKey");
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m54676x1(byte[] bArr) {
        if (m19684fa() == 2) {
            return;
        }
        if (bArr == null) {
            throw new CryptographicException("The specified encryption mode requires the use of an initialization vector (IV).");
        }
        if (bArr.length * 8 != 128) {
            throw new ArgumentException("The specified initialization vector (IV) does not match the block size for this algorithm.", "rgbIV");
        }
    }
}
