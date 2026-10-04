package com.aspose.slides.internal.p118ex;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.CryptographicException;
import com.aspose.slides.exceptions.NullReferenceException;
import com.aspose.slides.internal.p174hz.C4750to;
import com.aspose.slides.internal.p174hz.C4763wp;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p525yi.C12823fa;
import com.aspose.slides.internal.p525yi.C12842x1;
import com.aspose.slides.p559ms.System.C14052dq;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.um */
/* JADX INFO: loaded from: classes.dex */
public final class C3829um extends C3828u4 {

    /* JADX INFO: renamed from: du */
    private int f10439du;

    /* JADX INFO: renamed from: kk */
    private byte[] f10440kk;

    /* JADX INFO: renamed from: to */
    private String f10441to;

    public C3829um() {
        this.f13261k4 = new C4763wp("2.5.29.14", "Subject Key Identifier");
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
        this.f13261k4 = c3828u4.f13261k4 == null ? new C4763wp("2.5.29.14", "Subject Key Identifier") : new C4763wp(c3828u4.f13261k4);
        m19732k4(c3828u4.m19736x1());
        super.m15347jd(c3828u4.m15346h4());
        this.f10439du = m15350x1(m19736x1());
    }

    /* JADX INFO: renamed from: kk */
    public String m15349kk() {
        int i = this.f10439du;
        if (i != 0 && i != 4) {
            throw new CryptographicException("Badly encoded extension.");
        }
        byte[] bArr = this.f10440kk;
        if (bArr != null) {
            this.f10441to = C12823fa.m59617k4(bArr);
        }
        return this.f10441to;
    }

    /* JADX INFO: renamed from: x1 */
    public int m15350x1(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            this.f10441to = C14113y2.f47374k4;
            if (C7019kk.m27462to(Byte.valueOf(bArr[0]), 6) != 4) {
                return 2;
            }
            if (bArr.length == 2) {
                return 4;
            }
            if (bArr.length < 3) {
                return 3;
            }
            try {
                this.f10440kk = new C12842x1(bArr).m59717to();
                return 0;
            } catch (RuntimeException unused) {
            }
        }
        return 1;
    }

    public C3829um(C4750to c4750to, boolean z) {
        if (c4750to == null) {
            throw new NullReferenceException();
        }
        this.f13261k4 = new C4763wp("2.5.29.14", "Subject Key Identifier");
        this.f13262x1 = c4750to.m19736x1();
        super.m15347jd(z);
        this.f10439du = m15350x1(m19736x1());
    }

    @Override // com.aspose.slides.internal.p174hz.C4750to
    /* JADX INFO: renamed from: x1 */
    public String mo15261x1(boolean z) {
        int i = this.f10439du;
        if (i == 1) {
            return C14113y2.f47374k4;
        }
        if (i == 2 || i == 3) {
            return m15348kk(this.f13262x1);
        }
        if (i == 4) {
            return "Information Not Available";
        }
        if (!"2.5.29.14".equals(this.f13261k4.m19795x1())) {
            return C14113y2.m67402k4("Unknown Key Usage ({0})", this.f13261k4.m19795x1());
        }
        C6765kp c6765kp = new C6765kp();
        int i2 = 0;
        while (true) {
            byte[] bArr = this.f10440kk;
            if (i2 >= bArr.length) {
                break;
            }
            c6765kp.m26792k4(C14098up.m67320k4(bArr[i2], "x2"));
            if (i2 != this.f10440kk.length - 1) {
                c6765kp.m26792k4(" ");
            }
            i2++;
        }
        if (z) {
            c6765kp.m26792k4(C14052dq.m66570kk());
        }
        return c6765kp.toString();
    }
}
