package com.aspose.slides.internal.p118ex;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p174hz.C4747ss;
import com.aspose.slides.internal.p174hz.C4750to;
import com.aspose.slides.internal.p174hz.C4763wp;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12828kk;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.ix */
/* JADX INFO: loaded from: classes.dex */
public final class C3818ix extends C3828u4 {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f10401du = new C7017h4("1.3.6.1.5.5.7.3.1");

    /* JADX INFO: renamed from: kk */
    private C4747ss f10402kk;

    /* JADX INFO: renamed from: to */
    private int f10403to;

    public C3818ix() {
        this.f13261k4 = new C4763wp("2.5.29.37", "Enhanced Key Usage");
    }

    @Override // com.aspose.slides.internal.p118ex.C3828u4, com.aspose.slides.internal.p174hz.C4750to
    /* JADX INFO: renamed from: k4 */
    public void mo15257k4(C4750to c4750to) {
        if (c4750to == null) {
            throw new ArgumentNullException("encodedData");
        }
        C3828u4 c3828u4 = (C3828u4) C7019kk.m27452k4((Object) c4750to, C3828u4.class);
        if (c3828u4 == null) {
            throw new ArgumentException(C14113y2.m67402k4("Wrong type.", new Object[0]), "asnEncodedData");
        }
        this.f13261k4 = c3828u4.f13261k4 == null ? new C4763wp("2.5.29.37", "Enhanced Key Usage") : new C4763wp(c3828u4.f13261k4);
        m19732k4(c3828u4.m19736x1());
        super.m15347jd(c3828u4.m15346h4());
        this.f10403to = m15293x1(m19736x1());
    }

    /* JADX INFO: renamed from: x1 */
    public int m15293x1(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            if (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 48) {
                return 2;
            }
            if (this.f10402kk == null) {
                this.f10402kk = new C4747ss();
            }
            try {
                C12842x1 c12842x1 = new C12842x1(bArr);
                if (C7019kk.m27462to(Byte.valueOf(c12842x1.m59718x1()), 6) != 48) {
                    throw new CryptographicException(C14113y2.m67402k4("Invalid ASN.1 Tag", new Object[0]));
                }
                for (int i = 0; i < c12842x1.m59709k4(); i++) {
                    this.f10402kk.m19720k4(new C4763wp(C12828kk.m59652x1(c12842x1.m59710k4(i))));
                }
                return 0;
            } catch (RuntimeException unused) {
            }
        }
        return 1;
    }

    public C3818ix(C4750to c4750to, boolean z) {
        if (c4750to == null) {
            throw new NullReferenceException();
        }
        this.f13261k4 = new C4763wp("2.5.29.37", "Enhanced Key Usage");
        this.f13262x1 = c4750to.m19736x1();
        super.m15347jd(z);
        this.f10403to = m15293x1(m19736x1());
    }

    @Override // com.aspose.slides.internal.p174hz.C4750to
    /* JADX INFO: renamed from: x1 */
    public String mo15261x1(boolean z) {
        String strM66570kk;
        int i = this.f10403to;
        if (i == 1) {
            return C14113y2.f47374k4;
        }
        if (i == 2 || i == 3) {
            return m15348kk(this.f13262x1);
        }
        if (i == 4) {
            return "Information Not Available";
        }
        if (!"2.5.29.37".equals(this.f13261k4.m19795x1())) {
            return C14113y2.m67402k4("Unknown Key Usage ({0})", this.f13261k4.m19795x1());
        }
        if (this.f10402kk.size() == 0) {
            return "Information Not Available";
        }
        C6765kp c6765kp = new C6765kp();
        for (int i2 = 0; i2 < this.f10402kk.size(); i2++) {
            C4763wp c4763wpM19722k4 = this.f10402kk.m19722k4(i2);
            c6765kp.m26792k4(f10401du.m27428k4(c4763wpM19722k4.m19795x1()) != 0 ? "Unknown Key Usage (" : "Server Authentication (");
            c6765kp.m26792k4(c4763wpM19722k4.m19795x1());
            c6765kp.m26792k4(")");
            if (z) {
                strM66570kk = C14052dq.m66570kk();
            } else if (i2 != this.f10402kk.size() - 1) {
                strM66570kk = ", ";
            }
            c6765kp.m26792k4(strM66570kk);
        }
        return c6765kp.toString();
    }
}
