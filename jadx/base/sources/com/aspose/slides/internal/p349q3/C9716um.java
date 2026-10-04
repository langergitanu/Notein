package com.aspose.slides.internal.p349q3;

import com.aspose.slides.internal.p488x0.C12331c5;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q3.um */
/* JADX INFO: loaded from: classes4.dex */
public class C9716um extends AbstractC9629ca {

    /* JADX INFO: renamed from: du */
    private long f35123du;

    /* JADX INFO: renamed from: h4 */
    private long f35124h4;

    /* JADX INFO: renamed from: k4 */
    private long f35125k4;

    /* JADX INFO: renamed from: kk */
    private long f35126kk;

    /* JADX INFO: renamed from: m9 */
    private C12331c5 f35127m9;

    /* JADX INFO: renamed from: to */
    private long f35128to;

    /* JADX INFO: renamed from: x1 */
    private long f35129x1;

    public C9716um(C9723vw c9723vw) {
        super(c9723vw);
    }

    /* JADX INFO: renamed from: du */
    public final void m47717du(long j) {
        this.f35123du = j;
    }

    /* JADX INFO: renamed from: dy */
    public final C12331c5 m47718dy() {
        return this.f35127m9;
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
        return m47724k4((C9716um) obj);
    }

    /* JADX INFO: renamed from: h4 */
    public final long m47719h4() {
        return this.f35123du;
    }

    @Override // com.aspose.slides.internal.p349q3.C9723vw
    public int hashCode() {
        int iHashCode = ((((((((((((super.hashCode() * 397) ^ ((int) this.f35125k4)) * 397) ^ ((int) this.f35129x1)) * 397) ^ ((int) this.f35126kk)) * 397) ^ ((int) this.f35128to)) * 397) ^ ((int) this.f35123du)) * 397) ^ ((int) this.f35124h4)) * 397;
        C12331c5 c12331c5 = this.f35127m9;
        return iHashCode ^ (c12331c5 != null ? c12331c5.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m47721k4() {
        return this.f35125k4;
    }

    /* JADX INFO: renamed from: kk */
    public final long m47725kk() {
        return this.f35126kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final long m47727m9() {
        return this.f35124h4;
    }

    /* JADX INFO: renamed from: to */
    public final long m47728to() {
        return this.f35128to;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m47730x1() {
        return this.f35129x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m47720h4(long j) {
        this.f35124h4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47722k4(long j) {
        this.f35125k4 = j;
    }

    /* JADX INFO: renamed from: kk */
    public final void m47726kk(long j) {
        this.f35126kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m47729to(long j) {
        this.f35128to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m47731x1(long j) {
        this.f35129x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m47723k4(C12331c5 c12331c5) {
        this.f35127m9 = c12331c5;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m47724k4(C9716um c9716um) {
        return m47765k4((C9723vw) c9716um) && this.f35125k4 == c9716um.f35125k4 && this.f35129x1 == c9716um.f35129x1 && this.f35126kk == c9716um.f35126kk && this.f35128to == c9716um.f35128to && this.f35123du == c9716um.f35123du && this.f35124h4 == c9716um.f35124h4 && C14067j2.m66728k4(this.f35127m9, c9716um.f35127m9);
    }
}
