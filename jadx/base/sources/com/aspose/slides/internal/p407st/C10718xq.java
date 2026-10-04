package com.aspose.slides.internal.p407st;

import androidx.core.view.InputDeviceCompat;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.p559ms.System.C14047bz;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.xq */
/* JADX INFO: loaded from: classes4.dex */
public final class C10718xq {

    /* JADX INFO: renamed from: c5 */
    private String f37508c5;

    /* JADX INFO: renamed from: ck */
    private long f37509ck;

    /* JADX INFO: renamed from: du */
    private C10598q1 f37510du;

    /* JADX INFO: renamed from: fa */
    private long f37512fa;

    /* JADX INFO: renamed from: h4 */
    private C10598q1 f37513h4;

    /* JADX INFO: renamed from: jd */
    private long f37514jd;

    /* JADX INFO: renamed from: k4 */
    private int f37515k4;

    /* JADX INFO: renamed from: kk */
    private int f37516kk;

    /* JADX INFO: renamed from: to */
    private C10598q1 f37518to;

    /* JADX INFO: renamed from: up */
    private int f37519up;

    /* JADX INFO: renamed from: x1 */
    private int f37520x1 = InputDeviceCompat.SOURCE_HDMI;

    /* JADX INFO: renamed from: m9 */
    private int f37517m9 = -1;

    /* JADX INFO: renamed from: dy */
    private C14047bz f37511dy = new C14047bz();

    public C10718xq() {
    }

    /* JADX INFO: renamed from: c5 */
    public final C10598q1 m51986c5() {
        return this.f37513h4;
    }

    /* JADX INFO: renamed from: ck */
    public final C14047bz m51987ck() {
        return this.f37511dy;
    }

    /* JADX INFO: renamed from: du */
    public final C10598q1 m51988du() {
        return this.f37518to;
    }

    /* JADX INFO: renamed from: dy */
    public final long m51989dy() {
        C10598q1 c10598q1 = this.f37513h4;
        if (c10598q1 != null) {
            return c10598q1.m51546kk();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: fa */
    public final String m51990fa() {
        return this.f37508c5;
    }

    /* JADX INFO: renamed from: h4 */
    public final long m51991h4() {
        C10598q1 c10598q1 = this.f37510du;
        if (c10598q1 != null) {
            return c10598q1.m51546kk();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: jd */
    public final int m51992jd() {
        return this.f37517m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m51993k4() {
        return this.f37520x1;
    }

    /* JADX INFO: renamed from: kk */
    public final int m52001kk() {
        return this.f37516kk;
    }

    /* JADX INFO: renamed from: ks */
    public final long m52003ks() {
        return this.f37512fa;
    }

    /* JADX INFO: renamed from: m9 */
    public final C10598q1 m52004m9() {
        return this.f37510du;
    }

    /* JADX INFO: renamed from: to */
    public final long m52005to() {
        C10598q1 c10598q1 = this.f37518to;
        if (c10598q1 != null) {
            return c10598q1.m51546kk();
        }
        return 0L;
    }

    /* JADX INFO: renamed from: up */
    public final long m52006up() {
        return this.f37514jd;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m52007x1() {
        return this.f37515k4;
    }

    /* JADX INFO: renamed from: yj */
    public final long m52011yj() {
        return this.f37509ck;
    }

    public C10718xq(C3134k4 c3134k4) {
        m51996k4(c3134k4);
    }

    /* JADX INFO: renamed from: x1 */
    private C10598q1 m51985x1(C3134k4 c3134k4) {
        C14047bz c14047bz = new C14047bz(c3134k4.m13372dy(16));
        return new C10598q1(new C10490j6(c14047bz.Clone(), c3134k4.m13372dy((int) ((c3134k4.m13371ck().getLength() - c3134k4.m13371ck().getPosition()) - 52))));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51994k4(int i) {
        this.f37515k4 = i;
    }

    /* JADX INFO: renamed from: kk */
    public final void m52002kk(long j) {
        this.f37512fa = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51995k4(long j) {
        this.f37514jd = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52008x1(int i) {
        this.f37516kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51996k4(C3134k4 c3134k4) {
        if (c3134k4.m13386x6() != 33554433) {
            throw new C10563nm("Wrong Version field value in OLEStream.");
        }
        m51994k4(c3134k4.m13386x6());
        m52008x1(c3134k4.m13386x6());
        if (c3134k4.m13386x6() != 0) {
            throw new C10563nm("Wrong Reserved1 field value in OLEStream.");
        }
        if ((c3134k4.m13384uz() & 4294967295L) != 0) {
            this.f37518to = new C10598q1(c3134k4);
        }
        if (m52007x1() == 0) {
            return;
        }
        long jM13384uz = c3134k4.m13384uz();
        if ((jM13384uz & 4294967295L) != 0) {
            this.f37510du = new C10598q1(c3134k4);
        }
        long jM13384uz2 = c3134k4.m13384uz();
        if ((jM13384uz2 & 4294967295L) != 0) {
            this.f37513h4 = m51984k4(c3134k4, jM13384uz, jM13384uz2) ? m51985x1(c3134k4) : new C10598q1(c3134k4);
        }
        if (c3134k4.m13386x6() != -1) {
            throw new C10563nm("Wrong ClsidIndicator field value in OLEStream.");
        }
        m51999k4(new C14047bz(c3134k4.m13372dy(16)));
        int iM13386x6 = c3134k4.m13386x6();
        if (iM13386x6 != 0) {
            m52000k4(AbstractC6747ar.m26643rv().m26681x1(c3134k4.m13372dy(iM13386x6 * 2)));
        }
        this.f37519up = c3134k4.m13386x6();
        m51995k4(c3134k4.m13385wl());
        m52009x1(c3134k4.m13385wl());
        m52002kk(c3134k4.m13385wl());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52009x1(long j) {
        this.f37509ck = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51997k4(C3149x1 c3149x1) {
        c3149x1.m13455x1(m51993k4());
        c3149x1.m13455x1(m52007x1());
        c3149x1.m13455x1(m52001kk());
        c3149x1.m13455x1(0);
        c3149x1.m13447k4(m52005to());
        if ((m52005to() & 4294967295L) != 0) {
            m51988du().m51545k4(c3149x1);
        }
        if (m52007x1() == 0) {
            return;
        }
        c3149x1.m13447k4(m51991h4());
        if ((m51991h4() & 4294967295L) != 0) {
            m52004m9().m51545k4(c3149x1);
        }
        c3149x1.m13447k4(m51989dy());
        m51986c5().m51545k4(c3149x1);
        c3149x1.m13455x1(m51992jd());
        c3149x1.m13450k4(m51987ck().m66539k4());
        if (m51990fa() != null) {
            c3149x1.m13455x1(m51990fa().length());
            c3149x1.m13450k4(AbstractC6747ar.m26643rv().mo26677to(m51990fa()));
        } else {
            c3149x1.m13455x1(0);
        }
        c3149x1.m13455x1(this.f37519up);
        c3149x1.m13453kk(m52006up());
        c3149x1.m13453kk(m52011yj());
        c3149x1.m13453kk(m52003ks());
    }

    /* JADX INFO: renamed from: x1 */
    public final void m52010x1(C10598q1 c10598q1) {
        this.f37513h4 = c10598q1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51998k4(C10598q1 c10598q1) {
        this.f37510du = c10598q1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51999k4(C14047bz c14047bz) {
        c14047bz.CloneTo(this.f37511dy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m52000k4(String str) {
        this.f37508c5 = str;
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m51984k4(C3134k4 c3134k4, long j, long j2) {
        if ((j & 4294967295L) == 0) {
            return false;
        }
        C14047bz c14047bz = new C14047bz(c3134k4.m13372dy(16));
        c3134k4.m13371ck().seek(-16L, 1);
        if (C10517kw.m51144k4(c14047bz.Clone())) {
            return (j2 & 4294967295L) >= c3134k4.m13371ck().getLength() && m52007x1() == 9;
        }
        return true;
    }
}
