package com.aspose.slides.internal.p407st;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.c3 */
/* JADX INFO: loaded from: classes4.dex */
public class C10382c3 extends C10507ke implements IGenericCloneable<C10382c3>, Cloneable {
    /* JADX INFO: renamed from: du */
    public final long[] m50520du() {
        if (m51105k4(512)) {
            return this.f37147m9;
        }
        return null;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: h4, reason: merged with bridge method [inline-methods] */
    public final C10382c3 cloneT() {
        return (C10382c3) m50527m9();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14093tq<Integer> m50522k4() {
        return m51105k4(2) ? new C14093tq<>(Integer.valueOf(this.f37149x1)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: kk */
    public final byte m50526kk() {
        if (m51105k4(64)) {
            return this.f37148to ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    /* JADX INFO: renamed from: m9 */
    public Object m50527m9() {
        try {
            C10382c3 c10382c3 = (C10382c3) super.clone();
            C10390cl c10390cl = this.f37145k4;
            if (c10390cl == null) {
                return c10382c3;
            }
            c10382c3.f37145k4 = c10390cl.cloneT();
            return c10382c3;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: to */
    public final byte m50528to() {
        if (m51105k4(32)) {
            return this.f37144h4 ? (byte) 1 : (byte) 0;
        }
        return (byte) -1;
    }

    @Override // com.aspose.slides.internal.p407st.C10507ke
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26810x1("TextSIException");
        c6765kp.m26792k4(super.toString());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: x1 */
    public final C14093tq<Integer> m50529x1() {
        return m51105k4(4) ? new C14093tq<>(Integer.valueOf(this.f37146kk)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50523k4(byte b) {
        if (b != -1) {
            this.f37148to = b == 1;
        }
        m51102k4(64, this.f37148to);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m50530x1(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37146kk = c14093tq.m67297k4().intValue();
        }
        m51102k4(4, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50524k4(C10390cl c10390cl) {
        this.f37145k4 = c10390cl;
        m51102k4(1, c10390cl != null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m50525k4(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37149x1 = c14093tq.m67297k4().intValue();
        }
        m51102k4(2, c14093tq.m67302x1());
    }
}
