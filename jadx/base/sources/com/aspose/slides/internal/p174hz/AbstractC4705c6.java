package com.aspose.slides.internal.p174hz;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14094ts;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.c6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4705c6 implements InterfaceC4752ts {

    /* JADX INFO: renamed from: k4 */
    private boolean f13125k4 = false;

    /* JADX INFO: renamed from: kk */
    protected int f13126kk;

    /* JADX INFO: renamed from: to */
    protected int f13127to;

    /* JADX INFO: renamed from: x1 */
    byte[] f13128x1;

    /* JADX INFO: renamed from: kk */
    public static AbstractC4705c6 m19582kk(String str) {
        return (AbstractC4705c6) C4756up.m19759k4(str);
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public boolean ap_() {
        return true;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int aq_() {
        return 1;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    public int ar_() {
        return 1;
    }

    /* JADX INFO: renamed from: c5 */
    public abstract void mo18846c5();

    /* JADX INFO: renamed from: ck */
    public void m19583ck() {
        mo19576k4(true);
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        mo19576k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: dy */
    public abstract byte[] mo18847dy();

    /* JADX INFO: renamed from: fa */
    public byte[] m19584fa() {
        byte[] bArr = this.f13128x1;
        if (bArr != null) {
            return bArr;
        }
        throw new CryptographicUnexpectedOperationException(C12825ix.m59623k4("No hash value computed."));
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public int mo19562k4(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr == null) {
            throw new ArgumentNullException("inputBuffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("inputOffset", "< 0");
        }
        if (i2 < 0) {
            throw new ArgumentException("inputCount");
        }
        if (i < 0 || i > bArr.length - i2) {
            throw new ArgumentException("inputBuffer");
        }
        if (bArr2 != null) {
            if (i3 < 0) {
                throw new ArgumentOutOfRangeException("outputOffset", "< 0");
            }
            if (i3 > bArr2.length - i2) {
                throw new ArgumentException("outputOffset + inputCount", C12825ix.m59623k4("Overflow"));
            }
        }
        mo18849x1(bArr, i, i2);
        if (bArr2 != null) {
            C14058fa.m66596k4(bArr, i, bArr2, i3, i2);
        }
        return i2;
    }

    public String toString() {
        return OooO00o.OooO00o("System.Security.Cryptography.", C14067j2.m66727k4(this).mo48540du().substring(C14067j2.m66727k4(this).mo48540du().lastIndexOf(46) + 1));
    }

    /* JADX INFO: renamed from: up */
    public int m19587up() {
        return this.f13126kk;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo18849x1(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: x1 */
    public byte[] m19588x1(byte[] bArr) {
        if (bArr != null) {
            return m19586kk(bArr, 0, bArr.length);
        }
        throw new ArgumentNullException("buffer");
    }

    /* JADX INFO: renamed from: k4 */
    public void mo19576k4(boolean z) {
        this.f13125k4 = true;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: kk */
    public boolean mo19566kk() {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m19585k4(AbstractC3150x6 abstractC3150x6) {
        if (this.f13125k4) {
            throw new ObjectDisposedException("HashAlgorithm");
        }
        byte[] bArr = new byte[4096];
        while (true) {
            int i = abstractC3150x6.read(bArr, 0, 4096);
            if (i <= 0) {
                this.f13128x1 = mo18847dy();
                mo18846c5();
                return this.f13128x1;
            }
            mo18849x1(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: kk */
    public byte[] m19586kk(byte[] bArr, int i, int i2) {
        if (this.f13125k4) {
            throw new ObjectDisposedException("HashAlgorithm");
        }
        if (bArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException("offset", "< 0");
        }
        if (i2 < 0) {
            throw new ArgumentException(C18293o1.f55803f, "< 0");
        }
        if (i > bArr.length - i2) {
            throw new ArgumentException("offset + count", C12825ix.m59623k4("Overflow"));
        }
        mo18849x1(bArr, i, i2);
        this.f13128x1 = mo18847dy();
        mo18846c5();
        return this.f13128x1;
    }

    @Override // com.aspose.slides.internal.p174hz.InterfaceC4752ts
    /* JADX INFO: renamed from: k4 */
    public byte[] mo19564k4(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new ArgumentNullException("inputBuffer");
        }
        if (i2 < 0) {
            throw new ArgumentException("inputCount");
        }
        if (i > bArr.length - i2) {
            throw new ArgumentException("inputOffset + inputCount", C12825ix.m59623k4("Overflow"));
        }
        byte[] bArr2 = new byte[i2];
        C14058fa.m66596k4(bArr, i, bArr2, 0, i2);
        mo18849x1(bArr, i, i2);
        this.f13128x1 = mo18847dy();
        mo18846c5();
        return bArr2;
    }
}
