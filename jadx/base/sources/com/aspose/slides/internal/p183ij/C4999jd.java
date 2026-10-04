package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.jd */
/* JADX INFO: loaded from: classes.dex */
public class C4999jd extends AbstractC4960bs {

    /* JADX INFO: renamed from: k4 */
    private long f13707k4;

    /* JADX INFO: renamed from: kk */
    private long f13708kk;

    /* JADX INFO: renamed from: to */
    private long f13709to;

    /* JADX INFO: renamed from: x1 */
    private long f13710x1;

    public C4999jd(C5061vw c5061vw) {
        super(c5061vw);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
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
        return m21166k4((C4999jd) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (((((((super.hashCode() * 397) ^ ((int) this.f13707k4)) * 397) ^ ((int) this.f13710x1)) * 397) ^ ((int) this.f13708kk)) * 397) ^ ((int) this.f13709to);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21164k4() {
        return this.f13707k4;
    }

    /* JADX INFO: renamed from: kk */
    public final void m21167kk(long j) {
        this.f13708kk = j;
    }

    /* JADX INFO: renamed from: to */
    public final void m21168to(long j) {
        this.f13709to = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21169x1(long j) {
        this.f13710x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21165k4(long j) {
        this.f13707k4 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21166k4(C4999jd c4999jd) {
        return m21559k4((C5061vw) c4999jd) && this.f13707k4 == c4999jd.f13707k4 && this.f13710x1 == c4999jd.f13710x1 && this.f13708kk == c4999jd.f13708kk && this.f13709to == c4999jd.f13709to;
    }
}
