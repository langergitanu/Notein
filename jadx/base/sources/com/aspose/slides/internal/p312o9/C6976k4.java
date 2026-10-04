package com.aspose.slides.internal.p312o9;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14065ig;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14081nv;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.o9.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6976k4 extends AbstractC7020m9<C6976k4> {

    /* JADX INFO: renamed from: k4 */
    private long f18982k4;

    /* JADX INFO: renamed from: kk */
    private int f18983kk;

    /* JADX INFO: renamed from: to */
    private long f18984to;

    /* JADX INFO: renamed from: x1 */
    private int f18985x1;

    public C6976k4() {
    }

    public Object clone() {
        return Clone();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: du, reason: merged with bridge method [inline-methods] */
    public C6976k4 Clone() {
        C6976k4 c6976k4 = new C6976k4();
        CloneTo(c6976k4);
        return c6976k4;
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C6976k4) {
            return m27285kk((C6976k4) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m27287k4() {
        return this.f18982k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m27291kk() {
        return this.f18983kk;
    }

    /* JADX INFO: renamed from: to */
    public final long m27292to() {
        return this.f18984to;
    }

    public String toString() {
        return C14113y2.m67402k4("{{{0}-{1}-{2}-{3}-{4}}}", C14114y9.m67460k4(m27287k4(), "X8"), C14081nv.m67066k4(m27293x1(), "X4"), C14081nv.m67066k4(m27291kk(), "X4"), C14081nv.m67066k4((int) ((m27292to() >> 12) & C18177fb.f54859s), "X4"), C14065ig.m66722k4(m27292to() & 281474976710655L, "X12"));
    }

    /* JADX INFO: renamed from: x1 */
    public final int m27293x1() {
        return this.f18985x1;
    }

    public C6976k4(long j, int i, int i2, long j2) {
        this();
        m27289k4(j);
        m27288k4(i);
        m27294x1(i2);
        m27295x1(j2);
    }

    /* JADX INFO: renamed from: kk */
    private boolean m27285kk(C6976k4 c6976k4) {
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27288k4(int i) {
        this.f18985x1 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27294x1(int i) {
        this.f18983kk = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m27289k4(long j) {
        this.f18982k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m27295x1(long j) {
        this.f18984to = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m27290k4(C6976k4 c6976k4) {
        return m27287k4() == c6976k4.m27287k4() && m27293x1() == c6976k4.m27293x1() && m27291kk() == c6976k4.m27291kk() && m27292to() == c6976k4.m27292to();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C6976k4 c6976k4) {
    }
}
