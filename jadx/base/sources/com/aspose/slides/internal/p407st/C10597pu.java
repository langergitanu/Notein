package com.aspose.slides.internal.p407st;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.pu */
/* JADX INFO: loaded from: classes4.dex */
public class C10597pu extends C10441fk implements IGenericCloneable<C10597pu> {
    /* JADX INFO: renamed from: c5 */
    public final C14093tq<Integer> m51510c5() {
        return m50795k4(65536) ? new C14093tq<>(Integer.valueOf(this.f36999kk)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: ck */
    public final C14093tq<Integer> m51511ck() {
        return m50795k4(4194304) ? new C14093tq<>(Integer.valueOf(this.f36994du)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: du */
    public final byte m51512du() {
        return m50798x1(32);
    }

    /* JADX INFO: renamed from: dy */
    public final C14093tq<Byte> m51515dy() {
        return m50795k4(15360) ? new C14093tq<>(Byte.valueOf((byte) (((((long) (15360 & this.f37002x1)) & 4294967295L) >> 10) & 4294967295L))) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: fa */
    public final C14093tq<Integer> m51516fa() {
        return m50795k4(8388608) ? new C14093tq<>(Integer.valueOf(this.f36996h4)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: h4 */
    public final byte m51517h4() {
        return m50798x1(128);
    }

    /* JADX INFO: renamed from: jd */
    public final C14093tq<Integer> m51520jd() {
        return m50795k4(2097152) ? new C14093tq<>(Integer.valueOf(this.f37001to)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m51521k4() {
        return m50798x1(1);
    }

    /* JADX INFO: renamed from: kk */
    public final byte m51526kk() {
        return m50798x1(4);
    }

    /* JADX INFO: renamed from: ks */
    public final C14093tq<Short> m51529ks() {
        return m50795k4(524288) ? new C14093tq<>(Short.valueOf(this.f36992c5)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: m9 */
    public final byte m51530m9() {
        return m50798x1(512);
    }

    /* JADX INFO: renamed from: rv */
    public final boolean m51533rv() {
        return m50795k4(49480);
    }

    /* JADX INFO: renamed from: to */
    public final byte m51534to() {
        return m50798x1(16);
    }

    @Override // com.aspose.slides.internal.p407st.C10441fk
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26810x1("TextCFException");
        c6765kp.m26792k4(super.toString());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: up */
    public final C14093tq<Short> m51537up() {
        return m50795k4(131072) ? new C14093tq<>(Short.valueOf(this.f37000m9)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m51538x1() {
        return m50798x1(2);
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: x6, reason: merged with bridge method [inline-methods] */
    public final C10597pu cloneT() {
        C10597pu c10597pu = new C10597pu();
        c10597pu.m50799x1(this);
        return c10597pu;
    }

    /* JADX INFO: renamed from: yj */
    public final C10661u4 m51542yj() {
        if (m50795k4(262144)) {
            return this.f36995dy;
        }
        return null;
    }

    /* JADX INFO: renamed from: du */
    public final void m51513du(byte b) {
        m50789k4(32, b);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m51518h4(byte b) {
        m50789k4(128, b);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51522k4(byte b) {
        m50789k4(1, b);
    }

    /* JADX INFO: renamed from: kk */
    public final void m51527kk(byte b) {
        m50789k4(4, b);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m51531m9(byte b) {
        m50789k4(512, b);
    }

    /* JADX INFO: renamed from: to */
    public final void m51535to(byte b) {
        m50789k4(16, b);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51539x1(byte b) {
        m50789k4(2, b);
    }

    /* JADX INFO: renamed from: du */
    public final void m51514du(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f36996h4 = c14093tq.m67297k4().intValue();
        }
        m50790k4(8388608, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: h4 */
    public final void m51519h4(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37000m9 = c14093tq.m67297k4().shortValue();
        }
        m50790k4(131072, c14093tq.m67302x1());
    }

    @Override // com.aspose.slides.internal.p407st.C10441fk
    /* JADX INFO: renamed from: k4 */
    public void mo50793k4(C10441fk c10441fk) {
        super.mo50793k4(c10441fk);
        if (C7019kk.m27469x1(c10441fk, C10597pu.class)) {
            C10597pu c10597pu = (C10597pu) c10441fk;
            if (m51521k4() == 0 && c10597pu.m51521k4() != 1) {
                m51522k4((byte) -1);
            }
            if (m51538x1() != 0 || c10597pu.m51538x1() == 1) {
                return;
            }
            m51539x1((byte) -1);
        }
    }

    /* JADX INFO: renamed from: kk */
    public final void m51528kk(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37001to = c14093tq.m67297k4().intValue();
        }
        m50790k4(2097152, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: m9 */
    public final void m51532m9(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f36992c5 = c14093tq.m67297k4().shortValue();
        }
        m50790k4(524288, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: to */
    public final void m51536to(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f36994du = c14093tq.m67297k4().intValue();
        }
        m50790k4(4194304, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51540x1(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f36999kk = c14093tq.m67297k4().intValue();
        }
        m50790k4(65536, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51523k4(C10661u4 c10661u4) {
        this.f36995dy = c10661u4;
        m50790k4(262144, c10661u4 != null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51524k4(C14093tq<Byte> c14093tq) {
        if (c14093tq.m67302x1()) {
            int i = (this.f37002x1 | 15360) ^ 15360;
            this.f37002x1 = i;
            this.f37002x1 = i | ((int) ((((long) (c14093tq.m67297k4().byteValue() & 15)) & 4294967295L) << 10));
        }
        m50790k4(15360, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51525k4(boolean z) {
        m50790k4(49480, z);
    }
}
