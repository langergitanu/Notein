package com.aspose.slides.internal.p407st;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.mr */
/* JADX INFO: loaded from: classes4.dex */
public class C10546mr extends C10481il implements IGenericCloneable<C10546mr> {

    /* JADX INFO: renamed from: qq */
    private short f37227qq;

    /* JADX INFO: renamed from: u4 */
    private short f37228u4;

    /* JADX INFO: renamed from: uz */
    private short f37229uz;

    /* JADX INFO: renamed from: wl */
    private short f37230wl;

    public C10546mr() {
        m51319k4((short) -1);
        m51341x1((short) -1);
        m51323kk((short) -1);
        m51333to((short) -1);
    }

    /* JADX INFO: renamed from: c5 */
    public final C14093tq<Integer> m51297c5() {
        return m50942k4(2048) ? new C14093tq<>(Integer.valueOf(this.f37066du)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: ck */
    public final C14093tq<Short> m51299ck() {
        return m50942k4(8192) ? new C14093tq<>(Short.valueOf(this.f37075m9)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: du */
    public final C14093tq<Short> m51301du() {
        return m50942k4(128) ? new C14093tq<>(Short.valueOf(this.f37072k4)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: dy */
    public final C10661u4 m51304dy() {
        if (m50942k4(32)) {
            return this.f37078to;
        }
        return null;
    }

    /* JADX INFO: renamed from: fa */
    public final C14093tq<Short> m51306fa() {
        return m50942k4(16384) ? new C14093tq<>(Short.valueOf(this.f37067dy)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: h4 */
    public final C14093tq<Integer> m51308h4() {
        return m50942k4(16) ? new C14093tq<>(Integer.valueOf(this.f37082x1)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: ix */
    public final byte m51311ix() {
        return m50943kk(2);
    }

    /* JADX INFO: renamed from: jd */
    public final C14093tq<Short> m51312jd() {
        return m50942k4(4096) ? new C14093tq<>(Short.valueOf(this.f37069h4)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m51314k4() {
        return m50947x1(1);
    }

    /* JADX INFO: renamed from: kk */
    public final byte m51320kk() {
        return m50947x1(4);
    }

    /* JADX INFO: renamed from: ks */
    public final C14093tq<Short> m51324ks() {
        return m50942k4(32768) ? new C14093tq<>(Short.valueOf(this.f37065ck)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: m9 */
    public final C14093tq<Short> m51325m9() {
        return m50942k4(64) ? new C14093tq<>(Short.valueOf(this.f37073kk)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: ne */
    public final byte m51328ne() {
        return m50943kk(1);
    }

    /* JADX INFO: renamed from: rv */
    public final C10475i3 m51329rv() {
        if (m50942k4(1048576)) {
            return this.f37068fa;
        }
        return null;
    }

    /* JADX INFO: renamed from: to */
    public final byte m51330to() {
        return m50947x1(8);
    }

    @Override // com.aspose.slides.internal.p407st.C10481il
    public String toString() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26810x1("TextPFException");
        c6765kp.m26792k4(super.toString());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: u4 */
    public final byte m51334u4() {
        return m50943kk(4);
    }

    /* JADX INFO: renamed from: up */
    public final C14093tq<Short> m51335up() {
        return m50942k4(256) ? new C14093tq<>(Short.valueOf(this.f37064c5)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: uz */
    public final C14093tq<Integer> m51336uz() {
        return m50942k4(2097152) ? new C14093tq<>(Integer.valueOf(this.f37074ks)) : new C14093tq<>();
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: wl, reason: merged with bridge method [inline-methods] */
    public final C10546mr cloneT() {
        C10546mr c10546mr = new C10546mr();
        c10546mr.m50949x1(this);
        return c10546mr;
    }

    /* JADX INFO: renamed from: x1 */
    public final byte m51338x1() {
        return m50947x1(2);
    }

    /* JADX INFO: renamed from: x6 */
    public final C14093tq<Integer> m51342x6() {
        return m50942k4(65536) ? new C14093tq<>(Integer.valueOf(this.f37080up)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: yj */
    public final C14093tq<Short> m51343yj() {
        return m50942k4(1024) ? new C14093tq<>(Short.valueOf(this.f37071jd)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: c5 */
    public final void m51298c5(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37071jd = c14093tq.m67297k4().shortValue();
        }
        m50936k4(1024, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: ck */
    public final void m51300ck(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37080up = c14093tq.m67297k4().intValue();
        }
        m50936k4(65536, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: du */
    public final void m51302du(byte b) {
        m50948x1(1, b);
    }

    /* JADX INFO: renamed from: dy */
    public final void m51305dy(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37064c5 = c14093tq.m67297k4().shortValue();
        }
        m50936k4(256, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: fa */
    public final void m51307fa(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37074ks = c14093tq.m67297k4().intValue();
        }
        m50936k4(2097152, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: h4 */
    public final void m51309h4(byte b) {
        m50948x1(2, b);
    }

    /* JADX INFO: renamed from: jd */
    public final void m51313jd(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37065ck = c14093tq.m67297k4().shortValue();
        }
        m50936k4(32768, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51315k4(byte b) {
        m50935k4(1, b);
    }

    /* JADX INFO: renamed from: kk */
    public final void m51321kk(byte b) {
        m50935k4(4, b);
    }

    /* JADX INFO: renamed from: m9 */
    public final void m51326m9(byte b) {
        m50948x1(4, b);
    }

    /* JADX INFO: renamed from: to */
    public final void m51331to(byte b) {
        m50935k4(8, b);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51339x1(byte b) {
        m50935k4(2, b);
    }

    /* JADX INFO: renamed from: du */
    public final void m51303du(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37069h4 = c14093tq.m67297k4().shortValue();
        }
        m50936k4(4096, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: h4 */
    public final void m51310h4(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37075m9 = c14093tq.m67297k4().shortValue();
        }
        m50936k4(8192, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51316k4(C10475i3 c10475i3) {
        this.f37068fa = c10475i3;
        m50936k4(1048576, c10475i3 != null);
    }

    /* JADX INFO: renamed from: kk */
    public final void m51322kk(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37073kk = c14093tq.m67297k4().shortValue();
        }
        m50936k4(64, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: m9 */
    public final void m51327m9(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37067dy = c14093tq.m67297k4().shortValue();
        }
        m50936k4(16384, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: to */
    public final void m51332to(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37066du = c14093tq.m67297k4().intValue();
        }
        m50936k4(2048, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m51340x1(C14093tq<Integer> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37082x1 = c14093tq.m67297k4().intValue();
        }
        m50936k4(16, c14093tq.m67302x1());
    }

    @Override // com.aspose.slides.internal.p407st.C10481il
    /* JADX INFO: renamed from: k4 */
    public void mo50940k4(C10481il c10481il) {
        super.mo50940k4(c10481il);
        if (C7019kk.m27469x1(c10481il, C10546mr.class)) {
            C10546mr c10546mr = (C10546mr) c10481il;
            if (m51314k4() == 0 && c10546mr.m51314k4() == 0) {
                m51315k4((byte) -1);
            }
            if (m51338x1() == 0 && c10546mr.m51338x1() == 0) {
                m51339x1((byte) -1);
            }
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: kk */
    public final void m51323kk(short s) {
        this.f37230wl = s;
    }

    @Deprecated
    /* JADX INFO: renamed from: to */
    public final void m51333to(short s) {
        this.f37227qq = s;
    }

    @Deprecated
    /* JADX INFO: renamed from: x1 */
    public final void m51341x1(short s) {
        this.f37229uz = s;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51317k4(C10661u4 c10661u4) {
        this.f37078to = c10661u4;
        m50936k4(32, c10661u4 != null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51318k4(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37072k4 = c14093tq.m67297k4().shortValue();
        }
        m50936k4(128, c14093tq.m67302x1());
    }

    @Deprecated
    /* JADX INFO: renamed from: k4 */
    public final void m51319k4(short s) {
        this.f37228u4 = s;
    }
}
