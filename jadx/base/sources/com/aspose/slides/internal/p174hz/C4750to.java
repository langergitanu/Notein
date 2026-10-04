package com.aspose.slides.internal.p174hz;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p118ex.C3814du;
import com.aspose.slides.internal.p118ex.C3818ix;
import com.aspose.slides.internal.p118ex.C3825qq;
import com.aspose.slides.internal.p118ex.C3829um;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12823fa;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hz.to */
/* JADX INFO: loaded from: classes.dex */
public class C4750to {

    /* JADX INFO: renamed from: kk */
    private static final C7017h4 f13260kk = new C7017h4("2.5.29.19", "2.5.29.37", "2.5.29.15", "2.5.29.14", "2.5.29.17", "2.16.840.1.113730.1.1");

    /* JADX INFO: renamed from: k4 */
    public C4763wp f13261k4;

    /* JADX INFO: renamed from: x1 */
    public byte[] f13262x1;

    public C4750to() {
    }

    /* JADX INFO: renamed from: c5 */
    public String m19726c5(boolean z) {
        byte[] bArr = this.f13262x1;
        if (bArr.length < 4 || C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 3 || C7019kk.m27462to(Byte.valueOf(this.f13262x1[1]), 6) != 2) {
            return "Information Not Available";
        }
        int iM27462to = (C7019kk.m27462to(Byte.valueOf(this.f13262x1[3]), 6) >> C7019kk.m27462to(Byte.valueOf(this.f13262x1[2]), 6)) << C7019kk.m27462to(Byte.valueOf(this.f13262x1[2]), 6);
        C6765kp c6765kp = new C6765kp();
        if ((iM27462to & 128) == 128) {
            c6765kp.m26792k4("SSL Client Authentication");
        }
        if ((iM27462to & 64) == 64) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("SSL Server Authentication");
        }
        if ((iM27462to & 32) == 32) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("SMIME");
        }
        if ((iM27462to & 16) == 16) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4(RequestParameters.SIGNATURE);
        }
        if ((iM27462to & 8) == 8) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Unknown cert type");
        }
        if ((iM27462to & 4) == 4) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("SSL CA");
        }
        if ((iM27462to & 2) == 2) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("SMIME CA");
        }
        if ((iM27462to & 1) == 1) {
            if (c6765kp.m26807x1() > 0) {
                c6765kp.m26792k4(", ");
            }
            c6765kp.m26792k4("Signature CA");
        }
        c6765kp.m26796k4(" ({0})", C14057f9.m66587k4(iM27462to, "x2"));
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: du */
    public String m19727du(boolean z) {
        try {
            return new C3818ix(this, false).mo15261x1(z);
        } catch (RuntimeException unused) {
            return C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: dy */
    public String m19728dy(boolean z) {
        String strM67402k4;
        String strM26681x1;
        String strM66570kk;
        byte[] bArr = this.f13262x1;
        if (bArr.length < 5) {
            return "Information Not Available";
        }
        try {
            C12842x1 c12842x1 = new C12842x1(bArr);
            C6765kp c6765kp = new C6765kp();
            for (int i = 0; i < c12842x1.m59709k4(); i++) {
                C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(i);
                byte bM59718x1 = c12842x1M59710k4.m59718x1();
                if (bM59718x1 == -127) {
                    strM67402k4 = "RFC822 Name=";
                    strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(c12842x1M59710k4.m59717to());
                } else if (bM59718x1 != -126) {
                    strM67402k4 = C14113y2.m67402k4("Unknown ({0})=", C7019kk.m27445k4(c12842x1M59710k4.m59718x1()));
                    strM26681x1 = C12823fa.m59617k4(c12842x1M59710k4.m59717to());
                } else {
                    strM67402k4 = "DNS Name=";
                    strM26681x1 = AbstractC6747ar.m26650yj().m26681x1(c12842x1M59710k4.m59717to());
                }
                c6765kp.m26792k4(strM67402k4);
                c6765kp.m26792k4(strM26681x1);
                if (z) {
                    strM66570kk = C14052dq.m66570kk();
                } else if (i < c12842x1.m59709k4() - 1) {
                    strM66570kk = ", ";
                }
                c6765kp.m26792k4(strM66570kk);
            }
            return c6765kp.toString();
        } catch (RuntimeException unused) {
            return C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: h4 */
    public String m19729h4(boolean z) {
        try {
            return new C3825qq(this, false).mo15261x1(z);
        } catch (RuntimeException unused) {
            return C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public C4763wp m19730k4() {
        return this.f13261k4;
    }

    /* JADX INFO: renamed from: kk */
    public String m19733kk(boolean z) {
        C6765kp c6765kp = new C6765kp();
        int i = 0;
        while (true) {
            byte[] bArr = this.f13262x1;
            if (i >= bArr.length) {
                return c6765kp.toString();
            }
            c6765kp.m26792k4(C14098up.m67320k4(bArr[i], "x2"));
            if (i != this.f13262x1.length - 1) {
                c6765kp.m26792k4(" ");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: m9 */
    public String m19734m9(boolean z) {
        try {
            return new C3829um(this, false).mo15261x1(z);
        } catch (RuntimeException unused) {
            return C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: to */
    public String m19735to(boolean z) {
        try {
            return new C3814du(this, false).mo15261x1(z);
        } catch (RuntimeException unused) {
            return C14113y2.f47374k4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public String mo15261x1(boolean z) {
        int iM27428k4 = f13260kk.m27428k4(this.f13261k4.m19795x1());
        return iM27428k4 != 0 ? iM27428k4 != 1 ? iM27428k4 != 2 ? iM27428k4 != 3 ? iM27428k4 != 4 ? iM27428k4 != 5 ? m19733kk(z) : m19726c5(z) : m19728dy(z) : m19734m9(z) : m19729h4(z) : m19727du(z) : m19735to(z);
    }

    public C4750to(C4763wp c4763wp, byte[] bArr) {
        m19731k4(c4763wp);
        m19732k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public String mo15344k4(boolean z) {
        return this.f13262x1 == null ? C14113y2.f47374k4 : this.f13261k4 == null ? m19733kk(z) : mo15261x1(z);
    }

    /* JADX INFO: renamed from: x1 */
    public byte[] m19736x1() {
        return this.f13262x1;
    }

    public C4750to(String str, byte[] bArr) {
        this.f13261k4 = new C4763wp(str);
        m19732k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public void mo15257k4(C4750to c4750to) {
        if (c4750to == null) {
            throw new ArgumentNullException("asnEncodedData");
        }
        m19731k4(c4750to.f13261k4 == null ? null : new C4763wp(c4750to.f13261k4));
        m19732k4(c4750to.f13262x1);
    }

    /* JADX INFO: renamed from: k4 */
    public void m19731k4(C4763wp c4763wp) {
        if (c4763wp == null) {
            this.f13261k4 = null;
        } else {
            this.f13261k4 = new C4763wp(c4763wp);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m19732k4(byte[] bArr) {
        if (bArr == null) {
            throw new ArgumentNullException("RawData");
        }
        this.f13262x1 = (byte[]) bArr.clone();
    }
}
