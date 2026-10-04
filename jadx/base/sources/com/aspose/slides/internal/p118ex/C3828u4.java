package com.aspose.slides.internal.p118ex;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p174hz.C4750to;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ex.u4 */
/* JADX INFO: loaded from: classes.dex */
public class C3828u4 extends C4750to {

    /* JADX INFO: renamed from: kk */
    private boolean f10438kk;

    public C3828u4() {
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m15346h4() {
        return this.f10438kk;
    }

    /* JADX INFO: renamed from: jd */
    public void m15347jd(boolean z) {
        this.f10438kk = z;
    }

    @Override // com.aspose.slides.internal.p174hz.C4750to
    /* JADX INFO: renamed from: k4 */
    public void mo15257k4(C4750to c4750to) {
        if (c4750to == null) {
            throw new ArgumentNullException("encodedData");
        }
        C3828u4 c3828u4 = (C3828u4) C7019kk.m27452k4((Object) c4750to, C3828u4.class);
        if (c3828u4 == null) {
            throw new ArgumentException(C14113y2.m67402k4("Expected a X509Extension instance.", new Object[0]));
        }
        super.mo15257k4(c4750to);
        this.f10438kk = c3828u4.m15346h4();
    }

    /* JADX INFO: renamed from: kk */
    public String m15348kk(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return C14113y2.f47374k4;
        }
        C6765kp c6765kp = new C6765kp();
        for (byte b : bArr) {
            c6765kp.m26792k4(C14098up.m67320k4(b, "X2"));
        }
        return c6765kp.toString();
    }

    public C3828u4(String str, byte[] bArr, boolean z) {
        super(str, bArr);
        this.f10438kk = z;
    }
}
