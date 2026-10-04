package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.huawei.hms.network.embedded.C18177fb;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.d3 */
/* JADX INFO: loaded from: classes3.dex */
public class C2041d3 extends AbstractC7020m9<C2041d3> {

    /* JADX INFO: renamed from: k4 */
    private int f7055k4;

    /* JADX INFO: renamed from: x1 */
    private int f7056x1;

    public Object clone() {
        return Clone();
    }

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (obj instanceof C2041d3) {
            return m10349x1((C2041d3) obj);
        }
        return false;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m10350k4() {
        return this.f7055k4;
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: kk, reason: merged with bridge method [inline-methods] */
    public C2041d3 Clone() {
        C2041d3 c2041d3 = new C2041d3();
        CloneTo(c2041d3);
        return c2041d3;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m10353x1() {
        return this.f7056x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C2041d3 m10346k4(long j) {
        C2041d3 c2041d3 = new C2041d3();
        c2041d3.m10348x1((int) (j & C18177fb.f54859s));
        c2041d3.m10347k4((int) (((j & 4294967295L) >> 16) & C18177fb.f54859s));
        return c2041d3;
    }

    /* JADX INFO: renamed from: x1 */
    private void m10348x1(int i) {
        this.f7056x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    private void m10347k4(int i) {
        this.f7055k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m10349x1(C2041d3 c2041d3) {
        return c2041d3.m10350k4() == m10350k4() && c2041d3.m10353x1() == m10353x1();
    }

    @Override // com.aspose.slides.p559ms.System.AbstractC14079na
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public void CloneTo(C2041d3 c2041d3) {
        c2041d3.m10347k4(m10350k4());
        c2041d3.m10348x1(m10353x1());
    }
}
