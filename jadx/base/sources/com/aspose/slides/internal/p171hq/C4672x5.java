package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.x5 */
/* JADX INFO: loaded from: classes.dex */
public class C4672x5 extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private int f13050k4;

    /* JADX INFO: renamed from: x1 */
    private int f13051x1;

    public boolean equals(Object obj) {
        if (C14067j2.m66729x1(null, obj)) {
            return false;
        }
        if (C14067j2.m66729x1(this, obj)) {
            return true;
        }
        if (C14067j2.m66727k4(obj) != C14067j2.m66727k4(this)) {
            return false;
        }
        return m19461k4((C4672x5) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 8;
    }

    public int hashCode() {
        return (m19459k4() * 397) ^ m19462x1();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m19459k4() {
        return this.f13050k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m19462x1() {
        return this.f13051x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19460k4(int i) {
        this.f13050k4 = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19463x1(int i) {
        this.f13051x1 = i;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19461k4(C4672x5 c4672x5) {
        return m19459k4() == c4672x5.m19459k4() && m19462x1() == c4672x5.m19462x1();
    }
}
