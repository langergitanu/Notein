package com.aspose.slides.internal.p539z4;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.z4.ix */
/* JADX INFO: loaded from: classes5.dex */
public class C13382ix extends AbstractC13405sv {

    /* JADX INFO: renamed from: k4 */
    private long f44766k4;

    /* JADX INFO: renamed from: kk */
    private int f44767kk;

    /* JADX INFO: renamed from: x1 */
    private long f44768x1;

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
        return m62149k4((C13382ix) obj);
    }

    @Override // com.aspose.slides.internal.p539z4.AbstractC13373f9
    /* JADX INFO: renamed from: h4 */
    public int mo62023h4() {
        return 12;
    }

    public int hashCode() {
        return (((((int) m62146k4()) * 397) ^ ((int) m62151x1())) * 397) ^ m62150kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final long m62146k4() {
        return this.f44766k4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m62150kk() {
        return this.f44767kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m62151x1() {
        return this.f44768x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62147k4(int i) {
        this.f44767kk = i;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m62152x1(long j) {
        this.f44768x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m62148k4(long j) {
        this.f44766k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m62149k4(C13382ix c13382ix) {
        return m62146k4() == c13382ix.m62146k4() && m62151x1() == c13382ix.m62151x1() && m62150kk() == c13382ix.m62150kk();
    }
}
