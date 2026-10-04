package com.aspose.slides.internal.p183ij;

import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.qn */
/* JADX INFO: loaded from: classes.dex */
public class C5031qn extends AbstractC4960bs {

    /* JADX INFO: renamed from: k4 */
    private long f13816k4;

    /* JADX INFO: renamed from: x1 */
    private long f13817x1;

    public C5031qn(C5061vw c5061vw) {
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
        return m21392k4((C5031qn) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        return (super.hashCode() * 397) ^ ((int) this.f13816k4);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21390k4() {
        return this.f13816k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final long m21393x1() {
        return this.f13817x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21391k4(long j) {
        this.f13816k4 = j;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m21394x1(long j) {
        this.f13817x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21392k4(C5031qn c5031qn) {
        return m21559k4((C5061vw) c5031qn) && this.f13816k4 == c5031qn.f13816k4;
    }
}
