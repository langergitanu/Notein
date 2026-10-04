package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p260ly.C6290x6;
import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.bz */
/* JADX INFO: loaded from: classes4.dex */
public class C9625bz extends AbstractC9629ca {

    /* JADX INFO: renamed from: du */
    private long f34794du;

    /* JADX INFO: renamed from: h4 */
    private C6290x6 f34795h4;

    /* JADX INFO: renamed from: k4 */
    private long f34796k4;

    /* JADX INFO: renamed from: kk */
    private long f34797kk;

    /* JADX INFO: renamed from: m9 */
    private C12331c5 f34798m9;

    /* JADX INFO: renamed from: to */
    private long f34799to;

    /* JADX INFO: renamed from: x1 */
    private long f34800x1;

    public C9625bz(C9723vw c9723vw) {
        super(c9723vw);
    }

    /* JADX INFO: renamed from: du */
    public final void m47000du(long j) {
        this.f34794du = j;
    }

    /* JADX INFO: renamed from: dy */
    public final C12331c5 m47001dy() {
        return this.f34798m9;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
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
        return m47007k4((C9625bz) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m47002h4() {
        return this.f34794du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((((((((super.hashCode() * 397) ^ ((int) this.f34796k4)) * 397) ^ ((int) this.f34800x1)) * 397) ^ ((int) this.f34797kk)) * 397) ^ ((int) this.f34799to)) * 397) ^ ((int) this.f34794du)) * 397;
        C6290x6 c6290x6 = this.f34795h4;
        int iHashCode2 = (iHashCode ^ (c6290x6 != null ? c6290x6.hashCode() : 0)) * 397;
        C12331c5 c12331c5 = this.f34798m9;
        return iHashCode2 ^ (c12331c5 != null ? c12331c5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47003k4() {
        return this.f34796k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47008kk() {
        return this.f34797kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final C6290x6 m47010m9() {
        return this.f34795h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m47011to() {
        return this.f34799to;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public String toString() {
        return C14113y2.m67402k4("{0}, IhPen: {1}, Elp: {2}, BitmapBuffer: {3}", super.toString(), Long.valueOf(m47003k4()), m47010m9(), m47001dy());
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47013x1() {
        return this.f34800x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47004k4(long j) {
        this.f34796k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47009kk(long j) {
        this.f34797kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m47012to(long j) {
        this.f34799to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47014x1(long j) {
        this.f34800x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47005k4(C6290x6 c6290x6) {
        this.f34795h4 = c6290x6;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47006k4(C12331c5 c12331c5) {
        this.f34798m9 = c12331c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47007k4(C9625bz c9625bz) {
        return m47765k4((C9723vw) c9625bz) && this.f34796k4 == c9625bz.f34796k4 && this.f34800x1 == c9625bz.f34800x1 && this.f34797kk == c9625bz.f34797kk && this.f34799to == c9625bz.f34799to && this.f34794du == c9625bz.f34794du && C14067j2.m66728k4(this.f34795h4, c9625bz.f34795h4) && C14067j2.m66728k4(this.f34798m9, c9625bz.f34798m9);
    }
}
