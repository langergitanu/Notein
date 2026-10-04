package com.aspose.slides.internal.p183ij;

import com.aspose.slides.internal.p498xe.C12521uz;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ij.up */
/* JADX INFO: loaded from: classes.dex */
public class C5055up extends C5019ne {

    /* JADX INFO: renamed from: k4 */
    private C12521uz f13883k4;

    /* JADX INFO: renamed from: kk */
    private String f13884kk;

    /* JADX INFO: renamed from: x1 */
    private long f13885x1;

    public C5055up(C5019ne c5019ne) {
        super(c5019ne);
        m21310x1(c5019ne.m21309x1());
        m21308kk(c5019ne.m21307kk());
    }

    @Override // com.aspose.slides.internal.p183ij.C5019ne, com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
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
        return m21532k4((C5055up) obj);
    }

    @Override // com.aspose.slides.internal.p183ij.C5019ne, com.aspose.slides.internal.p183ij.C4996ix, com.aspose.slides.internal.p183ij.C5061vw
    public int hashCode() {
        int iHashCode = super.hashCode() * 397;
        C12521uz c12521uz = this.f13883k4;
        int iHashCode2 = (((iHashCode ^ (c12521uz != null ? c12521uz.hashCode() : 0)) * 397) ^ ((int) this.f13885x1)) * 397;
        String str = this.f13884kk;
        return iHashCode2 ^ (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: k4 */
    public final long m21528k4() {
        return this.f13885x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21529k4(long j) {
        this.f13885x1 = j;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21530k4(C12521uz c12521uz) {
        this.f13883k4 = c12521uz;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m21531k4(String str) {
        this.f13884kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m21532k4(C5055up c5055up) {
        return m21306k4((C5019ne) c5055up) && C14067j2.m66728k4(this.f13883k4, c5055up.f13883k4) && this.f13885x1 == c5055up.f13885x1 && C14113y2.m67363du(this.f13884kk, c5055up.f13884kk);
    }
}
