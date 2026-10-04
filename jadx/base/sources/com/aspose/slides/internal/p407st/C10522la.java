package com.aspose.slides.internal.p407st;

import com.aspose.slides.IGenericCloneable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.Arrays;

/* JADX INFO: renamed from: com.aspose.slides.internal.st.la */
/* JADX INFO: loaded from: classes4.dex */
public class C10522la implements IGenericCloneable<C10522la>, Cloneable {

    /* JADX INFO: renamed from: k4 */
    private long f37174k4 = 0;

    /* JADX INFO: renamed from: x1 */
    private short f37177x1 = 0;

    /* JADX INFO: renamed from: kk */
    private short f37175kk = 0;

    /* JADX INFO: renamed from: to */
    private C10475i3 f37176to = null;

    /* JADX INFO: renamed from: du */
    private short[] f37172du = new short[5];

    /* JADX INFO: renamed from: h4 */
    private short[] f37173h4 = new short[5];

    /* JADX INFO: renamed from: kk */
    private int m51158kk(int i) {
        if (i < 0 || i > 4) {
            return 0;
        }
        return 128 << (i + 1);
    }

    /* JADX INFO: renamed from: x1 */
    private int m51160x1(int i) {
        if (i < 0 || i > 4) {
            return 0;
        }
        return 4 << (i + 1);
    }

    /* JADX INFO: renamed from: c5 */
    public final C14093tq<Short> m51162c5() {
        return m51159to(3);
    }

    /* JADX INFO: renamed from: ck */
    public final C14093tq<Short> m51163ck() {
        return m51159to(4);
    }

    /* JADX INFO: renamed from: du */
    public final C14093tq<Short> m51164du() {
        return m51159to(1);
    }

    /* JADX INFO: renamed from: dy */
    public final C14093tq<Short> m51165dy() {
        return m51154du(2);
    }

    /* JADX INFO: renamed from: fa */
    public final C14093tq<Short> m51166fa() {
        return m51154du(4);
    }

    /* JADX INFO: renamed from: h4 */
    public final C14093tq<Short> m51167h4() {
        return m51154du(1);
    }

    /* JADX INFO: renamed from: jd */
    public final C14093tq<Short> m51168jd() {
        return m51154du(3);
    }

    /* JADX INFO: renamed from: k4 */
    public final C10496jl m51169k4(int i) {
        if (i < 0 || i > 4) {
            throw new IndexOutOfRangeException(C14113y2.m67402k4("LevelIndex of textRuler level is out-of-range!!! [{0}]", Integer.valueOf(i)));
        }
        C10496jl c10496jl = new C10496jl();
        c10496jl.m51016k4(m51159to(i).Clone());
        c10496jl.m51018x1(m51154du(i).Clone());
        return c10496jl;
    }

    /* JADX INFO: renamed from: ks */
    public Object m51177ks() {
        try {
            C10522la c10522la = (C10522la) super.clone();
            c10522la.f37176to = this.f37176to.cloneT();
            short[] sArr = this.f37173h4;
            if (sArr != null) {
                c10522la.f37173h4 = Arrays.copyOf(sArr, sArr.length);
            }
            short[] sArr2 = this.f37172du;
            if (sArr2 != null) {
                c10522la.f37172du = Arrays.copyOf(sArr2, sArr2.length);
            }
            return c10522la;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: m9 */
    public final C14093tq<Short> m51178m9() {
        return m51159to(2);
    }

    /* JADX INFO: renamed from: to */
    public final C14093tq<Short> m51179to() {
        return m51154du(0);
    }

    /* JADX INFO: renamed from: up */
    public final int m51180up() {
        int iM50902k4 = m51155h4(2) ? 6 : 4;
        if (m51155h4(1)) {
            iM50902k4 += 2;
        }
        if (m51155h4(4)) {
            iM50902k4 += this.f37176to.m50902k4();
        }
        if (m51155h4(8)) {
            iM50902k4 += 2;
        }
        if (m51155h4(256)) {
            iM50902k4 += 2;
        }
        if (m51155h4(16)) {
            iM50902k4 += 2;
        }
        if (m51155h4(512)) {
            iM50902k4 += 2;
        }
        if (m51155h4(32)) {
            iM50902k4 += 2;
        }
        if (m51155h4(1024)) {
            iM50902k4 += 2;
        }
        if (m51155h4(64)) {
            iM50902k4 += 2;
        }
        if (m51155h4(2048)) {
            iM50902k4 += 2;
        }
        if (m51155h4(128)) {
            iM50902k4 += 2;
        }
        return m51155h4(4096) ? iM50902k4 + 2 : iM50902k4;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: yj, reason: merged with bridge method [inline-methods] */
    public final C10522la cloneT() {
        return (C10522la) m51177ks();
    }

    /* JADX INFO: renamed from: du */
    private C14093tq<Short> m51154du(int i) {
        return m51155h4(m51158kk(i)) ? new C14093tq<>(Short.valueOf(this.f37173h4[i])) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m51155h4(int i) {
        return ((this.f37174k4 & (((long) i) & 4294967295L)) & 4294967295L) != 0;
    }

    /* JADX INFO: renamed from: to */
    private C14093tq<Short> m51159to(int i) {
        return m51155h4(m51160x1(i)) ? new C14093tq<>(Short.valueOf(this.f37172du[i])) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: k4 */
    public final C14093tq<Short> m51170k4() {
        return m51155h4(1) ? new C14093tq<>(Short.valueOf(this.f37175kk)) : new C14093tq<>();
    }

    /* JADX INFO: renamed from: kk */
    public final C14093tq<Short> m51176kk() {
        return m51159to(0);
    }

    /* JADX INFO: renamed from: x1 */
    public final C10475i3 m51181x1() {
        if (m51155h4(4)) {
            return this.f37176to;
        }
        return null;
    }

    /* JADX INFO: renamed from: x1 */
    private void m51161x1(int i, C14093tq<Short> c14093tq) {
        int iM51158kk = m51158kk(i);
        if (iM51158kk == 0) {
            throw new ArgumentNullException();
        }
        if (c14093tq.m67302x1()) {
            this.f37173h4[i] = c14093tq.m67297k4().shortValue();
        }
        m51157k4(iM51158kk, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51171k4(int i, C10496jl c10496jl) {
        if (i < 0 || i > 4) {
            throw new IndexOutOfRangeException(C14113y2.m67402k4("LevelIndex of textRuler level is out-of-range!!! [{0}]", Integer.valueOf(i)));
        }
        m51156k4(i, c10496jl.m51015k4().Clone());
        m51161x1(i, c10496jl.m51017x1().Clone());
    }

    /* JADX INFO: renamed from: k4 */
    private void m51156k4(int i, C14093tq<Short> c14093tq) {
        int iM51160x1 = m51160x1(i);
        if (iM51160x1 == 0) {
            throw new ArgumentNullException();
        }
        if (c14093tq.m67302x1()) {
            this.f37172du[i] = c14093tq.m67297k4().shortValue();
        }
        m51157k4(iM51160x1, c14093tq.m67302x1());
    }

    /* JADX INFO: renamed from: k4 */
    private void m51157k4(int i, boolean z) {
        long j = ((long) i) & 4294967295L;
        long j2 = this.f37174k4 & (j ^ 4294967295L) & 4294967295L;
        this.f37174k4 = j2;
        if (z) {
            this.f37174k4 = (j2 | j) & 4294967295L;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51172k4(C3134k4 c3134k4) {
        this.f37174k4 = c3134k4.m13384uz();
        if (m51155h4(2)) {
            this.f37177x1 = c3134k4.m13381rv();
        }
        if (m51155h4(1)) {
            this.f37175kk = c3134k4.m13381rv();
        }
        if (m51155h4(4)) {
            this.f37176to = new C10475i3(c3134k4);
        }
        if (m51155h4(8)) {
            this.f37172du[0] = c3134k4.m13381rv();
        }
        if (m51155h4(256)) {
            this.f37173h4[0] = c3134k4.m13381rv();
        }
        if (m51155h4(16)) {
            this.f37172du[1] = c3134k4.m13381rv();
        }
        if (m51155h4(512)) {
            this.f37173h4[1] = c3134k4.m13381rv();
        }
        if (m51155h4(32)) {
            this.f37172du[2] = c3134k4.m13381rv();
        }
        if (m51155h4(1024)) {
            this.f37173h4[2] = c3134k4.m13381rv();
        }
        if (m51155h4(64)) {
            this.f37172du[3] = c3134k4.m13381rv();
        }
        if (m51155h4(2048)) {
            this.f37173h4[3] = c3134k4.m13381rv();
        }
        if (m51155h4(128)) {
            this.f37172du[4] = c3134k4.m13381rv();
        }
        if (m51155h4(4096)) {
            this.f37173h4[4] = c3134k4.m13381rv();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51173k4(C3149x1 c3149x1) {
        c3149x1.m13447k4(this.f37174k4);
        if (m51155h4(2)) {
            c3149x1.m13448k4(this.f37177x1);
        }
        if (m51155h4(1)) {
            c3149x1.m13448k4(this.f37175kk);
        }
        if (m51155h4(4)) {
            this.f37176to.m50905k4(c3149x1);
        }
        if (m51155h4(8)) {
            c3149x1.m13448k4(this.f37172du[0]);
        }
        if (m51155h4(256)) {
            c3149x1.m13448k4(this.f37173h4[0]);
        }
        if (m51155h4(16)) {
            c3149x1.m13448k4(this.f37172du[1]);
        }
        if (m51155h4(512)) {
            c3149x1.m13448k4(this.f37173h4[1]);
        }
        if (m51155h4(32)) {
            c3149x1.m13448k4(this.f37172du[2]);
        }
        if (m51155h4(1024)) {
            c3149x1.m13448k4(this.f37173h4[2]);
        }
        if (m51155h4(64)) {
            c3149x1.m13448k4(this.f37172du[3]);
        }
        if (m51155h4(2048)) {
            c3149x1.m13448k4(this.f37173h4[3]);
        }
        if (m51155h4(128)) {
            c3149x1.m13448k4(this.f37172du[4]);
        }
        if (m51155h4(4096)) {
            c3149x1.m13448k4(this.f37173h4[4]);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51174k4(C10475i3 c10475i3) {
        this.f37176to = c10475i3;
        m51157k4(4, c10475i3 != null);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m51175k4(C14093tq<Short> c14093tq) {
        if (c14093tq.m67302x1()) {
            this.f37175kk = c14093tq.m67297k4().shortValue();
        }
        m51157k4(1, c14093tq.m67302x1());
    }
}
