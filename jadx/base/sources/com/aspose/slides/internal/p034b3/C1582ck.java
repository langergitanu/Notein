package com.aspose.slides.internal.p034b3;

import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p513xw.C12687c5;
import com.aspose.slides.p559ms.System.C14093tq;

/* JADX INFO: renamed from: com.aspose.slides.internal.b3.ck */
/* JADX INFO: loaded from: classes3.dex */
public class C1582ck extends C1581c5 {

    /* JADX INFO: renamed from: fa */
    public C12687c5 f6117fa;

    /* JADX INFO: renamed from: ix */
    private C14093tq<C12007ix> f6118ix;

    /* JADX INFO: renamed from: ks */
    public int f6119ks;

    /* JADX INFO: renamed from: ne */
    private C1609yj f6120ne;

    /* JADX INFO: renamed from: rv */
    public int f6121rv;

    /* JADX INFO: renamed from: u4 */
    private int f6122u4;

    /* JADX INFO: renamed from: up */
    public int f6123up;

    /* JADX INFO: renamed from: x6 */
    private boolean f6124x6;

    /* JADX INFO: renamed from: yj */
    public int f6125yj;

    public C1582ck() {
        this(false, null);
    }

    /* JADX INFO: renamed from: bz */
    public final boolean m8515bz() {
        return this.f6117fa.m58882wy();
    }

    /* JADX INFO: renamed from: c6 */
    public final int m8516c6() {
        return this.f6122u4;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m8517e0() {
        return this.f6124x6;
    }

    /* JADX INFO: renamed from: fa */
    public final void m8518fa(int i) {
        this.f6122u4 = i;
    }

    @Override // com.aspose.slides.internal.p034b3.C1581c5, com.aspose.slides.internal.p034b3.C1606x1
    /* JADX INFO: renamed from: k4 */
    public C12023wl mo8505k4(boolean z) {
        C12023wl c12023wl = new C12023wl();
        if (m8511um().m10115du() != 9) {
            c12023wl = new C12023wl(m8678x1(), !z ? m8654du() : mo8658e_());
        } else {
            m8665k4(this.f6160ck, z).CloneTo(c12023wl);
        }
        if (z) {
            return c12023wl;
        }
        c12023wl.m56860k4(m8656dy() + c12023wl.m56865x1());
        c12023wl.m56860k4(m8653ck() + c12023wl.m56865x1());
        return c12023wl;
    }

    /* JADX INFO: renamed from: kk */
    public final void m8521kk(boolean z) {
        this.f6124x6 = z;
        if (z) {
            return;
        }
        this.f6118ix = new C14093tq<>();
    }

    /* JADX INFO: renamed from: qm */
    public final C12007ix m8522qm() {
        if (!this.f6124x6) {
            return C12007ix.f40519k4;
        }
        if (C14093tq.m67295k4(this.f6118ix, null)) {
            this.f6118ix = new C14093tq<>(new C12007ix(0.0f, 0.0f, m8677up() + m8660fa() + m8678x1(), m8653ck() + m8656dy() + mo8658e_()));
        }
        return this.f6118ix.m67297k4();
    }

    /* JADX INFO: renamed from: ts */
    public final C1609yj m8523ts() {
        return this.f6120ne;
    }

    public C1582ck(boolean z, C12687c5 c12687c5) {
        this.f6124x6 = false;
        this.f6118ix = new C14093tq<>();
        this.f6122u4 = 0;
        this.f6123up = 0;
        this.f6125yj = 0;
        this.f6119ks = 0;
        this.f6121rv = 0;
        ((C1581c5) this).f6110dy = z;
        this.f6117fa = c12687c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8519k4(C1609yj c1609yj) {
        this.f6120ne = c1609yj;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m8520k4(C12007ix c12007ix) {
        this.f6118ix = new C14093tq<>(c12007ix.Clone());
    }
}
