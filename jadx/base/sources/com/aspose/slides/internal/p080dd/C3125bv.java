package com.aspose.slides.internal.p080dd;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.ObjectDisposedException;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.InterfaceC14073kp;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.huawei.hms.network.embedded.C18293o1;

/* JADX INFO: renamed from: com.aspose.slides.internal.dd.bv */
/* JADX INFO: loaded from: classes3.dex */
public class C3125bv extends AbstractC3124b3 {

    /* JADX INFO: renamed from: du */
    private boolean f9270du;

    /* JADX INFO: renamed from: k4 */
    private C6765kp f9271k4;

    public C3125bv() {
        this(new C6765kp());
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: k4 */
    public void mo13302k4(char c) {
        if (this.f9270du) {
            throw new ObjectDisposedException("StringReader", "Cannot write to a closed StringWriter");
        }
        this.f9271k4.m26780k4(c);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: to */
    public void mo13309to() {
        mo13311x1(true);
        this.f9270du = true;
    }

    public String toString() {
        return this.f9271k4.toString();
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: x1 */
    public AbstractC6747ar mo13310x1() {
        return AbstractC6747ar.m26643rv();
    }

    public C3125bv(C6765kp c6765kp) {
        this(c6765kp, null);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: k4 */
    public void mo13304k4(String str) {
        if (this.f9270du) {
            throw new ObjectDisposedException("StringReader", "Cannot write to a closed StringWriter");
        }
        this.f9271k4.m26792k4(str);
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: x1 */
    public void mo13311x1(boolean z) {
        super.mo13311x1(z);
        this.f9270du = true;
    }

    public C3125bv(C6765kp c6765kp, InterfaceC14073kp interfaceC14073kp) {
        if (c6765kp == null) {
            throw new ArgumentNullException("sb");
        }
        this.f9271k4 = c6765kp;
        this.f9268kk = interfaceC14073kp;
    }

    @Override // com.aspose.slides.internal.p080dd.AbstractC3124b3
    /* JADX INFO: renamed from: k4 */
    public void mo13307k4(char[] cArr, int i, int i2) {
        if (this.f9270du) {
            throw new ObjectDisposedException("StringReader", "Cannot write to a closed StringWriter");
        }
        if (cArr == null) {
            throw new ArgumentNullException("buffer");
        }
        if (i < 0) {
            throw new ArgumentOutOfRangeException(FirebaseAnalytics.Param.INDEX, "< 0");
        }
        if (i2 < 0) {
            throw new ArgumentOutOfRangeException(C18293o1.f55803f, "< 0");
        }
        if (i > cArr.length - i2) {
            throw new ArgumentException("index + count > buffer.Length");
        }
        this.f9271k4.m26799k4(cArr, i, i2);
    }

    public C3125bv(InterfaceC14073kp interfaceC14073kp) {
        this(new C6765kp(), interfaceC14073kp);
    }
}
