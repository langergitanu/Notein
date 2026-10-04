package com.aspose.slides.internal.p522yc;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14065ig;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.yc.k4 */
/* JADX INFO: loaded from: classes5.dex */
public class C12805k4 extends AbstractC7020m9<C12805k4> {

    /* JADX INFO: renamed from: k4 */
    private long f42565k4;

    /* JADX INFO: renamed from: kk */
    private int f42566kk;

    /* JADX INFO: renamed from: to */
    private long f42567to;

    /* JADX INFO: renamed from: x1 */
    private int f42568x1;

    public C12805k4() {
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C12805k4 Clone() {
        C12805k4 c12805k4 = new C12805k4();
        CloneTo(c12805k4);
        return c12805k4;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C12805k4) {
            return m59509kk((C12805k4) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m59511k4() {
        return this.f42565k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m59515kk() {
        return this.f42566kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m59516to() {
        return this.f42567to;
    }

    public String toString() {
        return C14113y2.m67402k4("{{{0}-{1}-{2}-{3}-{4}}}", C14114y9.m67460k4(m59511k4(), "X8"), C14081nv.m67066k4(m59517x1(), "X4"), C14081nv.m67066k4(m59515kk(), "X4"), C14081nv.m67066k4((int) ((m59516to() >> 12) & C18177fb.f54859s), "X4"), C14065ig.m66722k4(m59516to() & 281474976710655L, "X12"));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m59517x1() {
        return this.f42568x1;
    }

    public C12805k4(long j, int i, int i2, long j2) {
        this();
        m59513k4(j);
        m59512k4(i);
        m59518x1(i2);
        m59519x1(j2);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m59509kk(C12805k4 c12805k4) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59512k4(int i) {
        this.f42568x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59518x1(int i) {
        this.f42566kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m59513k4(long j) {
        this.f42565k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m59519x1(long j) {
        this.f42567to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m59514k4(C12805k4 c12805k4) {
        return m59511k4() == c12805k4.m59511k4() && m59517x1() == c12805k4.m59517x1() && m59515kk() == c12805k4.m59515kk() && m59516to() == c12805k4.m59516to();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C12805k4 c12805k4) {
    }
}
