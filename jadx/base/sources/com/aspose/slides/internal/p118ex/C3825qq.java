package com.aspose.slides.internal.p118ex;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p174hz.C4750to;
import com.aspose.slides.internal.p174hz.C4763wp;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.qq */
/* JADX INFO: loaded from: classes.dex */
public final class C3825qq extends C3828u4 {

    /* JADX INFO: renamed from: kk */
    private int f10432kk;

    /* JADX INFO: renamed from: to */
    private int f10433to;

    public C3825qq() {
        this.f13261k4 = new C4763wp("2.5.29.15", "Key Usage");
    }

    /* JADX INFO: renamed from: k4 */
    public int m15329k4(int i) {
        if ((33023 & i) != i) {
            return 0;
        }
        return i;
    }

    /* JADX INFO: renamed from: kk */
    public int m15330kk() {
        int i = this.f10433to;
        if (i == 0 || i == 4) {
            return this.f10432kk;
        }
        throw new CryptographicException("Badly encoded extension.");
    }

    /* JADX INFO: renamed from: x1 */
    public int m15331x1(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            if (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 3) {
                return 2;
            }
            if (bArr.length < 3) {
                return 3;
            }
            if (bArr.length < 4) {
                return 4;
            }
            try {
                C12842x1 c12842x1 = new C12842x1(bArr);
                int iM27462to = 0;
                for (int i = 1; i < c12842x1.m59717to().length; i++) {
                    iM27462to = (iM27462to << 8) + C7019kk.m27462to(Byte.valueOf(c12842x1.m59717to()[i]), 6);
                }
                this.f10432kk = m15329k4(iM27462to);
                return 0;
            } catch (RuntimeException unused) {
            }
        }
        return 1;
    }

    public C3825qq(C4750to c4750to, boolean z) {
        if (c4750to == null) {
            throw new NullReferenceException();
        }
        this.f13261k4 = new C4763wp("2.5.29.15", "Key Usage");
        this.f13262x1 = c4750to.m19736x1();
        super.m15347jd(z);
        this.f10433to = m15331x1(m19736x1());
    }

    @Override // com.aspose.slides.internal.p118ex.C3828u4, com.aspose.slides.internal.p174hz.C4750to
    /* JADX INFO: renamed from: k4 */
    public void mo15257k4(C4750to c4750to) {
        if (c4750to == null) {
            throw new ArgumentNullException("encodedData");
        }
        C3828u4 c3828u4 = (C3828u4) C7019kk.m27452k4((Object) c4750to, C3828u4.class);
        if (c3828u4 == null) {
            throw new ArgumentException(C14113y2.m67402k4("Wrong type.", new Object[0]), "encodedData");
        }
        this.f13261k4 = c3828u4.f13261k4 == null ? new C4763wp("2.5.29.15", "Key Usage") : new C4763wp(c3828u4.f13261k4);
        m19732k4(c3828u4.m19736x1());
        super.m15347jd(c3828u4.m15346h4());
        this.f10433to = m15331x1(m19736x1());
    }

    @Override // com.aspose.slides.internal.p174hz.C4750to
    /* JADX INFO: renamed from: x1 */
    public String mo15261x1(boolean z) {
        int i = this.f10433to;
        if (i == 1) {
            return C14113y2.f47374k4;
        }
        if (i == 2 || i == 3) {
            return m15348kk(this.f13262x1);
        }
        if (i == 4) {
            return "Information Not Available";
        }
        if (!"2.5.29.15".equals(this.f13261k4.m19795x1())) {
            return C14113y2.m67402k4("Unknown Key Usage ({0})", this.f13261k4.m19795x1());
        }
        if (this.f10432kk == 0) {
            return "Information Not Available";
        }
        C6765kp c6765kp = new C6765kp();
        if ((this.f10432kk & 128) != 0) {
            c6765kp.m26792k4("Digital Signature");
        }
        if ((this.f10432kk & 64) != 0) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Non-Repudiation");
        }
        if ((this.f10432kk & 32) != 0) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Key Encipherment");
        }
        if ((this.f10432kk & 16) != 0) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Data Encipherment");
        }
        if ((this.f10432kk & 8) != 0) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Key Agreement");
        }
        if ((this.f10432kk & 4) != 0) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Certificate Signing");
        }
        if ((2 & this.f10432kk) != 0) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Off-line CRL Signing, CRL Signing");
        }
        if ((1 & this.f10432kk) != 0) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Encipher Only");
        }
        if ((this.f10432kk & 32768) != 0) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Decipher Only");
        }
        int i2 = this.f10432kk;
        c6765kp.m26792k4(" (");
        c6765kp.m26792k4(C14098up.m67320k4(C7019kk.m27442k4(Integer.valueOf(i2), 9), "x2"));
        if (i2 > 255) {
            c6765kp.m26792k4(" ");
            c6765kp.m26792k4(C14098up.m67320k4(C7019kk.m27442k4(Integer.valueOf(i2 >> 8), 9), "x2"));
        }
        c6765kp.m26792k4(")");
        if (z) {
            c6765kp.m26792k4(C14052dq.m66570kk());
        }
        return c6765kp.toString();
    }
}
