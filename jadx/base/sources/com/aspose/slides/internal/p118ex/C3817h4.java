package com.aspose.slides.internal.p118ex;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.internal.p080dd.C3130fa;
import com.aspose.slides.internal.p080dd.C3131h4;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p419tg.C10932c5;
import com.aspose.slides.internal.p419tg.C10936fa;
import com.aspose.slides.internal.p419tg.C10938jd;
import com.aspose.slides.internal.p419tg.C10939k4;
import com.aspose.slides.internal.p419tg.C10945x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C3817h4 {

    /* JADX INFO: renamed from: du */
    private byte[] f10396du;

    /* JADX INFO: renamed from: k4 */
    private String f10397k4;

    /* JADX INFO: renamed from: kk */
    private C10945x1 f10398kk;

    /* JADX INFO: renamed from: to */
    private boolean f10399to;

    /* JADX INFO: renamed from: x1 */
    private String f10400x1;

    public C3817h4() {
    }

    @Deprecated
    /* JADX INFO: renamed from: c5 */
    public String m15277c5() {
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 != null) {
            return c10945x1.m52844up();
        }
        throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
    }

    /* JADX INFO: renamed from: ck */
    public byte[] m15278ck() {
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 != null) {
            return c10945x1.m52823c5();
        }
        throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
    }

    /* JADX INFO: renamed from: du */
    public String m15279du() {
        return m15275k4(m15291to());
    }

    @Deprecated
    /* JADX INFO: renamed from: dy */
    public String m15280dy() {
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 != null) {
            return c10945x1.m52842to();
        }
        throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
    }

    public boolean equals(Object obj) {
        C3817h4 c3817h4 = obj instanceof C3817h4 ? (C3817h4) obj : null;
        return c3817h4 != null && m15288k4(c3817h4);
    }

    /* JADX INFO: renamed from: fa */
    public byte[] m15281fa() {
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 != null) {
            return c10945x1.m52830jd();
        }
        throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
    }

    /* JADX INFO: renamed from: h4 */
    public String m15282h4() {
        if (this.f10399to) {
            return null;
        }
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 != null) {
            return c10945x1.m52849yj().m67145ne().toString();
        }
        throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
    }

    public int hashCode() {
        if (this.f10398kk == null) {
            return 0;
        }
        if (this.f10396du == null) {
            m15291to();
        }
        byte[] bArr = this.f10396du;
        if (bArr == null || bArr.length < 4) {
            return 0;
        }
        return (bArr[3] & 255) | ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    /* JADX INFO: renamed from: jd */
    public byte[] m15283jd() {
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 != null) {
            return c10945x1.m52839m9();
        }
        throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
    }

    /* JADX INFO: renamed from: k4 */
    public String m15284k4() {
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 == null) {
            throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
        }
        if (this.f10397k4 == null) {
            this.f10397k4 = C10936fa.m52726k4(c10945x1.m52829ix(), true, ", ", true);
        }
        return this.f10397k4;
    }

    /* JADX INFO: renamed from: kk */
    public void mo15289kk() {
        this.f10398kk = null;
        this.f10397k4 = null;
        this.f10400x1 = null;
        this.f10399to = false;
        this.f10396du = null;
    }

    /* JADX INFO: renamed from: m9 */
    public String m15290m9() {
        if (this.f10399to) {
            return null;
        }
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 != null) {
            return c10945x1.m52838ks().m67145ne().toString();
        }
        throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
    }

    /* JADX INFO: renamed from: to */
    public byte[] m15291to() {
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 == null) {
            throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
        }
        if (this.f10396du == null && c10945x1 != null) {
            this.f10396du = AbstractC4739nv.m19710du().m19588x1(this.f10398kk.m52823c5());
        }
        return this.f10396du;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public String m15292x1() {
        C10945x1 c10945x1 = this.f10398kk;
        if (c10945x1 == null) {
            throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
        }
        if (this.f10400x1 == null) {
            this.f10400x1 = C10936fa.m52726k4(c10945x1.m52843u4(), true, ", ", true);
        }
        return this.f10400x1;
    }

    public C3817h4(C3817h4 c3817h4) {
        if (c3817h4 == null) {
            throw new ArgumentNullException("cert");
        }
        byte[] bArrM15278ck = c3817h4.m15278ck();
        if (bArrM15278ck != null) {
            this.f10398kk = new C10945x1(bArrM15278ck);
        }
        this.f10399to = false;
    }

    /* JADX INFO: renamed from: k4 */
    public String mo15285k4(boolean z) {
        if (!z || this.f10398kk == null) {
            return getClass().getName();
        }
        String str = C14052dq.f47188k4;
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26796k4("[Subject]{0}  {1}{0}{0}", str, m15292x1());
        c6765kp.m26796k4("[Issuer]{0}  {1}{0}{0}", str, m15284k4());
        c6765kp.m26796k4("[Not Before]{0}  {1}{0}{0}", str, m15282h4());
        c6765kp.m26796k4("[Not After]{0}  {1}{0}{0}", str, m15290m9());
        c6765kp.m26796k4("[Thumbprint]{0}  {1}{0}", str, m15279du());
        c6765kp.m26792k4(str);
        return c6765kp.toString();
    }

    public C3817h4(byte[] bArr) {
        this(bArr, true);
    }

    /* JADX INFO: renamed from: k4 */
    private String m15275k4(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        C6765kp c6765kp = new C6765kp();
        for (byte b : bArr) {
            c6765kp.m26792k4(C14098up.m67320k4(b, "X2"));
        }
        return c6765kp.toString();
    }

    public C3817h4(byte[] bArr, boolean z) {
        if (bArr != null) {
            mo15287k4(bArr, (String) null, 0);
            this.f10399to = !z;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void mo15286k4(String str, String str2, int i) {
        mo15287k4(m15276k4(str), str2, i);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo15287k4(byte[] bArr, String str, int i) {
        mo15289kk();
        if (str != null) {
            try {
                C10938jd c10938jd = new C10938jd(bArr, str);
                if (c10938jd.m52749kk().size() > 0) {
                    this.f10398kk = c10938jd.m52749kk().get_Item(0);
                    return;
                } else {
                    this.f10398kk = null;
                    return;
                }
            } catch (C10932c5 e) {
                throw new CryptographicException(e.getMessage(), e);
            } catch (Exception unused) {
                this.f10398kk = new C10945x1(bArr);
                return;
            }
        }
        try {
            try {
                try {
                    this.f10398kk = new C10945x1(bArr);
                } catch (Exception unused2) {
                    C10945x1[] c10945x1ArrM52765k4 = C10939k4.m52765k4(bArr);
                    this.f10398kk = c10945x1ArrM52765k4.length > 0 ? c10945x1ArrM52765k4[0] : null;
                }
            } catch (Exception unused3) {
                C10938jd c10938jd2 = new C10938jd(bArr);
                if (c10938jd2.m52749kk().size() > 0) {
                    this.f10398kk = c10938jd2.m52749kk().get_Item(0);
                } else {
                    this.f10398kk = null;
                }
            }
        } catch (Exception e2) {
            throw new CryptographicException(C14113y2.m67402k4("Unable to decode certificate.", new Object[0]), e2);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public boolean m15288k4(C3817h4 c3817h4) {
        if (c3817h4 == null) {
            return false;
        }
        C10945x1 c10945x1 = c3817h4.f10398kk;
        if (c10945x1 == null) {
            if (this.f10398kk == null) {
                return true;
            }
            throw new CryptographicException(C14113y2.m67402k4("Certificate instance is empty.", new Object[0]));
        }
        byte[] bArrM52823c5 = c10945x1.m52823c5();
        if (bArrM52823c5 == null) {
            C10945x1 c10945x12 = this.f10398kk;
            return c10945x12 == null || c10945x12.m52823c5() == null;
        }
        C10945x1 c10945x13 = this.f10398kk;
        if (c10945x13 != null && c10945x13.m52823c5() != null && bArrM52823c5.length == this.f10398kk.m52823c5().length) {
            for (int i = 0; i < bArrM52823c5.length; i++) {
                if (bArrM52823c5[i] != this.f10398kk.m52823c5()[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    private static byte[] m15276k4(String str) {
        C3130fa c3130faM13363to = C3131h4.m13363to(str);
        try {
            int length = (int) c3130faM13363to.getLength();
            byte[] bArr = new byte[length];
            c3130faM13363to.read(bArr, 0, length);
            c3130faM13363to.close();
            c3130faM13363to.dispose();
            return bArr;
        } catch (Throwable th) {
            if (c3130faM13363to != null) {
                c3130faM13363to.dispose();
            }
            throw th;
        }
    }
}
