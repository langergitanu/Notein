package com.aspose.slides.internal.p171hq;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hq.ix */
/* JADX INFO: loaded from: classes.dex */
public class C4632ix extends AbstractC4655sv {

    /* JADX INFO: renamed from: k4 */
    private long f12913k4;

    /* JADX INFO: renamed from: kk */
    private int f12914kk;

    /* JADX INFO: renamed from: x1 */
    private long f12915x1;

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
        return m19150k4((C4632ix) obj);
    }

    @Override // com.aspose.slides.internal.p171hq.AbstractC4623f9
    /* JADX INFO: renamed from: h4 */
    public int mo19017h4() {
        return 12;
    }

    public int hashCode() {
        return (((((int) m19147k4()) * 397) ^ ((int) m19152x1())) * 397) ^ m19151kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m19147k4() {
        return this.f12913k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m19151kk() {
        return this.f12914kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m19152x1() {
        return this.f12915x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19148k4(int i) {
        this.f12914kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m19153x1(long j) {
        this.f12915x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19149k4(long j) {
        this.f12913k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m19150k4(C4632ix c4632ix) {
        return m19147k4() == c4632ix.m19147k4() && m19152x1() == c4632ix.m19152x1() && m19151kk() == c4632ix.m19151kk();
    }
}
