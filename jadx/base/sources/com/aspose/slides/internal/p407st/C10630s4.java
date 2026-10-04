package com.aspose.slides.internal.p407st;

import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.s4 */
/* JADX INFO: loaded from: classes4.dex */
public class C10630s4 extends C10481il {
    /* JADX INFO: renamed from: k4 */
    public final C14093tq<Short> m51666k4() {
        return m50942k4(8388608) ? new C14093tq<>(Short.valueOf(this.f37077rv)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C10405dn m51670kk() {
        if (m50942k4(16777216)) {
            return this.f37076ne;
        }
        return null;
    }

    @Override // com.aspose.slides.internal.p407st.C10481il
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26810x1("TextPFException9");
        c6765kp.m26792k4(super.toString());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m51671x1() {
        if (m50942k4(33554432)) {
            return this.f37083x6 ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51667k4(byte b) {
        this.f37083x6 = b == 1;
        m50936k4(33554432, b != -1);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51668k4(C10405dn c10405dn) {
        this.f37076ne = c10405dn;
        m50936k4(16777216, c10405dn != null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51669k4(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37077rv = c14093tq.m67297k4().shortValue();
        }
        m50936k4(8388608, c14093tq.m67302x1());
    }
}
