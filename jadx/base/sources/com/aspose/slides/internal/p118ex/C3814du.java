package com.aspose.slides.internal.p118ex;

import com.aspose.slides.Collections.Specialized.OooO00o;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p174hz.C4750to;
import com.aspose.slides.internal.p174hz.C4763wp;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.du */
/* JADX INFO: loaded from: classes.dex */
public final class C3814du extends C3828u4 {

    /* JADX INFO: renamed from: du */
    private int f10387du;

    /* JADX INFO: renamed from: h4 */
    private int f10388h4;

    /* JADX INFO: renamed from: kk */
    private boolean f10389kk;

    /* JADX INFO: renamed from: to */
    private boolean f10390to;

    public C3814du() {
        this.f13261k4 = new C4763wp("2.5.29.19", "Basic Constraints");
    }

    /* JADX INFO: renamed from: du */
    public int m15256du() {
        int i = this.f10388h4;
        if (i == 0 || i == 4) {
            return this.f10387du;
        }
        throw new CryptographicException("Badly encoded extension.");
    }

    @Override // com.aspose.slides.internal.p118ex.C3828u4, com.aspose.slides.internal.p174hz.C4750to
    /* JADX INFO: renamed from: k4 */
    public void mo15257k4(C4750to c4750to) {
        if (c4750to == null) {
            throw new ArgumentNullException("asnEncodedData");
        }
        C3828u4 c3828u4 = (C3828u4) C7019kk.m27452k4((Object) c4750to, C3828u4.class);
        if (c3828u4 == null) {
            throw new ArgumentException(C14113y2.m67402k4("Wrong type.", new Object[0]), "asnEncodedData");
        }
        this.f13261k4 = c3828u4.f13261k4 == null ? new C4763wp("2.5.29.19", "Basic Constraints") : new C4763wp(c3828u4.f13261k4);
        m19732k4(c3828u4.m19736x1());
        super.m15347jd(c3828u4.m15346h4());
        this.f10388h4 = m15260x1(m19736x1());
    }

    /* JADX INFO: renamed from: kk */
    public boolean m15258kk() {
        int i = this.f10388h4;
        if (i == 0 || i == 4) {
            return this.f10389kk;
        }
        throw new CryptographicException("Badly encoded extension.");
    }

    /* JADX INFO: renamed from: to */
    public boolean m15259to() {
        int i = this.f10388h4;
        if (i == 0 || i == 4) {
            return this.f10390to;
        }
        throw new CryptographicException("Badly encoded extension.");
    }

    /* JADX INFO: renamed from: x1 */
    public int m15260x1(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            if (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 48) {
                return 2;
            }
            if (bArr.length < 3 && (bArr.length != 2 || C7019kk.m27462to(Byte.valueOf(bArr[1]), 6) != 0)) {
                return 3;
            }
            try {
                C12842x1 c12842x1 = new C12842x1(bArr);
                C12842x1 c12842x1M59710k4 = c12842x1.m59710k4(0);
                if (c12842x1M59710k4 != null && C7019kk.m27462to(Byte.valueOf(c12842x1M59710k4.m59718x1()), 6) == 1) {
                    this.f10389kk = C7019kk.m27462to(Byte.valueOf(c12842x1M59710k4.m59717to()[0]), 6) == 255;
                    c12842x1M59710k4 = c12842x1.m59710k4(1);
                }
                if (c12842x1M59710k4 != null && C7019kk.m27462to(Byte.valueOf(c12842x1M59710k4.m59718x1()), 6) == 2) {
                    this.f10390to = true;
                    this.f10387du = C12828kk.m59648k4(c12842x1M59710k4);
                }
                return 0;
            } catch (RuntimeException unused) {
            }
        }
        return 1;
    }

    public C3814du(C4750to c4750to, boolean z) {
        if (c4750to == null) {
            throw new NullReferenceException();
        }
        this.f13261k4 = new C4763wp("2.5.29.19", "Basic Constraints");
        this.f13262x1 = c4750to.m19736x1();
        super.m15347jd(z);
        this.f10388h4 = m15260x1(m19736x1());
    }

    @Override // com.aspose.slides.internal.p174hz.C4750to
    /* JADX INFO: renamed from: x1 */
    public String mo15261x1(boolean z) {
        int i = this.f10388h4;
        if (i == 1) {
            return C14113y2.f47374k4;
        }
        if (i == 2 || i == 3) {
            return m15348kk(this.f13262x1);
        }
        if (i == 4) {
            return "Information Not Available";
        }
        if (!"2.5.29.19".equals(this.f13261k4.m19795x1())) {
            return C14113y2.m67402k4("Unknown Key Usage ({0})", this.f13261k4.m19795x1());
        }
        C6765kp c6765kpOooO00o = OooO00o.OooO00o("Subject Type=");
        c6765kpOooO00o.m26792k4(this.f10389kk ? "CA" : "End Entity");
        c6765kpOooO00o.m26792k4(z ? C14052dq.m66570kk() : ", ");
        c6765kpOooO00o.m26792k4("Path Length Constraint=");
        if (this.f10390to) {
            c6765kpOooO00o.m26805kk(this.f10387du);
        } else {
            c6765kpOooO00o.m26792k4("None");
        }
        if (z) {
            c6765kpOooO00o.m26792k4(C14052dq.m66570kk());
        }
        return c6765kpOooO00o.toString();
    }
}
