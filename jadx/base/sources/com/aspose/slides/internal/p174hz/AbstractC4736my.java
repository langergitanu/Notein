package com.aspose.slides.internal.p174hz;

import com.alibaba.sdk.android.oss.internal.OooO00o;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p525yi.C12825ix;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.AbstractC14106wy;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14094ts;
import com.aspose.slides.p559ms.System.IDisposable;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.my */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4736my implements IDisposable {

    /* JADX INFO: renamed from: c5 */
    protected int f13204c5;

    /* JADX INFO: renamed from: du */
    protected int f13206du;

    /* JADX INFO: renamed from: dy */
    protected C4711e0[] f13207dy;

    /* JADX INFO: renamed from: h4 */
    protected byte[] f13208h4;

    /* JADX INFO: renamed from: kk */
    protected int f13211kk;

    /* JADX INFO: renamed from: m9 */
    protected C4711e0[] f13212m9;

    /* JADX INFO: renamed from: to */
    protected byte[] f13213to;

    /* JADX INFO: renamed from: jd */
    protected int f13209jd = 1;

    /* JADX INFO: renamed from: ck */
    protected int f13205ck = 2;

    /* JADX INFO: renamed from: k4 */
    private boolean f13210k4 = false;

    /* JADX INFO: renamed from: rv */
    public static AbstractC4736my m19678rv() {
        return m19679x1(C4734m4.class.getName());
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC4736my m19679x1(String str) {
        return (AbstractC4736my) C4756up.m19759k4(str);
    }

    /* JADX INFO: renamed from: c5 */
    public int m19680c5() {
        return this.f13204c5;
    }

    /* JADX INFO: renamed from: ck */
    public C4711e0[] m19681ck() {
        return this.f13207dy;
    }

    @Override // com.aspose.slides.p559ms.System.IDisposable
    public void dispose() {
        mo19686k4(true);
        C14094ts.m67303k4(this);
    }

    /* JADX INFO: renamed from: du */
    public boolean m19682du(int i) {
        return C4711e0.m19598k4(this.f13207dy, i);
    }

    /* JADX INFO: renamed from: dy */
    public int m19683dy() {
        return this.f13211kk;
    }

    /* JADX INFO: renamed from: fa */
    public int m19684fa() {
        return this.f13209jd;
    }

    /* JADX INFO: renamed from: h4 */
    public int mo19608h4() {
        return this.f13206du;
    }

    /* JADX INFO: renamed from: jd */
    public byte[] mo19685jd() {
        if (this.f13213to == null) {
            mo19660x1();
        }
        return (byte[]) this.f13213to.clone();
    }

    /* JADX INFO: renamed from: k4 */
    public abstract InterfaceC4752ts mo19657k4(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: k4 */
    public abstract void mo19658k4();

    /* JADX INFO: renamed from: k4 */
    public void mo19609k4(int i) {
        if (!C4711e0.m19598k4(this.f13207dy, i)) {
            throw new CryptographicException(C12825ix.m59623k4("Key size not supported by algorithm"));
        }
        this.f13206du = i;
        this.f13208h4 = null;
    }

    /* JADX INFO: renamed from: kk */
    public void m19687kk(int i) {
        if (!AbstractC14106wy.isDefined((Class<?>) C4707ck.class, i)) {
            throw new CryptographicException(C12825ix.m59623k4("Cipher mode not available"));
        }
        this.f13209jd = i;
    }

    /* JADX INFO: renamed from: ks */
    public InterfaceC4752ts m19689ks() {
        return mo19657k4(mo19693to(), mo19685jd());
    }

    /* JADX INFO: renamed from: m9 */
    public void m19690m9() {
        mo19686k4(true);
    }

    /* JADX INFO: renamed from: to */
    public void m19691to(int i) {
        if (!AbstractC14106wy.isDefined((Class<?>) C4717gi.class, i)) {
            throw new CryptographicException(C12825ix.m59623k4("Padding mode not available"));
        }
        this.f13205ck = i;
    }

    public String toString() {
        return OooO00o.OooO00o("System.Security.Cryptography.", C14067j2.m66727k4(this).mo48540du().substring(C14067j2.m66727k4(this).mo48540du().lastIndexOf(46) + 1));
    }

    /* JADX INFO: renamed from: up */
    public int m19694up() {
        return this.f13205ck;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract InterfaceC4752ts mo19659x1(byte[] bArr, byte[] bArr2);

    /* JADX INFO: renamed from: x1 */
    public abstract void mo19660x1();

    /* JADX INFO: renamed from: yj */
    public InterfaceC4752ts m19696yj() {
        return mo19659x1(mo19693to(), mo19685jd());
    }

    /* JADX INFO: renamed from: k4 */
    public void mo19686k4(boolean z) {
        if (this.f13210k4) {
            return;
        }
        byte[] bArr = this.f13208h4;
        if (bArr != null) {
            AbstractC14092to.m67225k4(bArr, 0, bArr.length);
            this.f13208h4 = null;
        }
        this.f13210k4 = true;
    }

    /* JADX INFO: renamed from: kk */
    public void mo19688kk(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("value");
        }
        int length = bArr.length << 3;
        if (!C4711e0.m19598k4(this.f13207dy, length)) {
            throw new CryptographicException(C12825ix.m59623k4("Key size not supported by algorithm"));
        }
        this.f13206du = length;
        this.f13208h4 = (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: to */
    public void mo19692to(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("value");
        }
        if ((bArr.length << 3) != this.f13211kk) {
            throw new CryptographicException(C12825ix.m59623k4("IV length is different than block size"));
        }
        this.f13213to = (byte[]) bArr.clone();
    }

    /* JADX INFO: renamed from: x1 */
    public void m19695x1(int i) {
        if (!C4711e0.m19598k4(this.f13212m9, i)) {
            throw new CryptographicException(C12825ix.m59623k4("block size not supported by algorithm"));
        }
        if (this.f13211kk != i) {
            this.f13211kk = i;
            this.f13213to = null;
        }
    }

    /* JADX INFO: renamed from: to */
    public byte[] mo19693to() {
        if (this.f13208h4 == null) {
            mo19658k4();
        }
        return (byte[]) this.f13208h4.clone();
    }
}
